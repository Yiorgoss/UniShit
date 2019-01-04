public class main {

    public static void main(String[] args){
        Book book = new Book();

        Thread t0 = new Thread(new Worker("0", book));
        Thread t1 = new Thread(new Worker("1", book));
        Thread t2 = new Thread(new Worker("2", book));
        Thread t3 = new Thread(new Worker("3", book));

        t0.start();
        t1.start();
        t2.start();
        t3.start();

        try{
            Thread.sleep(1000000);
        }
        catch(InterruptedException e){

        }

        t0.interrupt();
        t1.interrupt();
        t2.interrupt();
        t3.interrupt();
    }
}
