import java.util.Random;

public class Worker implements Runnable{

    private String name;
    private Book book;
    private static double writeProbability = 0.5;
    private Random rand;
    private boolean hasReadLock;
    private boolean hasWriteLock;

    public Worker(String n, Book b){
        name = n;
        book = b;
        rand = new Random();
        hasReadLock = false; // used mainly for the 'finally{}' block to ...
        hasWriteLock= true ; // ... check for locks, and unlock them before exiting
    }

    public void run(){
        startMessage();
        try{
            while(!Thread.interrupted()){
                float rand_num = rand.nextFloat();
                //System.out.println( rand_num);
                if(rand_num < writeProbability){
                    System.out.println( "Thread "+ name +" is writing");
                    book.getWriteLock();//lock the book
                    hasWriteLock = true;
                    waitingMessage();
                    Thread.sleep(1000); //sleep for up to 2 seconds
                    book.releaseWriteLock();//unlock book
                    hasWriteLock = false;
                    releaseMessage();
                }
                else{
                    System.out.println( "Thread "+ name +" is reading");
                    book.getReadLock();
                    hasReadLock = true;
                    waitingMessage();
                    Thread.sleep(1000); //sleep for up to 2 seconds
                    book.releaseReadLock();
                    hasReadLock = false;
                    releaseMessage();
                }
            }
        }
        catch(InterruptedException e){
            //when the thread is waiting, or sleeping, and it receives a signal from the OS to do something.
        }
        finally{//if the thread is interrupted early, the thread must unlock all locks
            if(hasReadLock == true){
                book.releaseReadLock();
            }
            if(hasWriteLock){
                book.releaseWriteLock();
            }
        }
    }

    public void startMessage(){
        System.out.println("Thread "+ name +" with WriteLock: "+ hasWriteLock +"\n\t Probability"+ writeProbability);
    }

    public void waitingMessage(){
        if( hasWriteLock){
            System.out.println( "Thread "+ name + " is waiting to WRITE");
        } else {
            System.out.println("Thread "+ name + " is waiting to READ"); 
        }
    }

    public void releaseMessage(){
        if( hasWriteLock){
            System.out.println( "Thread "+ name + " has finished WRITING");
        } else {
            System.out.println("Thread "+ name + " has finished READING"); 
        }
    }
}
