public class Book {

    private boolean readLocked; //read lock
    private boolean writeLocked; // write lock
    private int readLockCount; //how many Workers have it locked for reading
    private boolean noReading;

    public Book(){
        readLocked = false;
        writeLocked = false;
        readLockCount = 0;
        noReading = false;
    }

    public synchronized void getReadLock() throws InterruptedException{
        while(writeLocked){//you cannot read if someone else is writing.
            wait();
        }
        if (noReading == false){
            readLocked = true;
            readLockCount++;
        }
        else{
            System.out.println("Cannot read, locked thread");
        }
    }

    public synchronized void getWriteLock() throws InterruptedException{
        noReading = true;
        while(readLocked || writeLocked){//you cannot write if someone is reading or writing
            wait();
        }
        writeLocked = true;
    }

    public synchronized void releaseReadLock(){
        if(readLocked){
            readLockCount--;
            if (readLockCount == 0){//if no more locks, make it false
                readLocked = false;//writes now available
            }
            notifyAll();
        }
    }

    public synchronized void releaseWriteLock(){
        if(writeLocked){
            writeLocked = false;
        }
        noReading = false;
        notifyAll();
    }
}