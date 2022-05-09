public class tryrunable implements Runnable{

    
    public void run() {
    System.out.print("Thread is Running..");        
    }
    public static void main(String [] args) {
        tryrunable r1 =new tryrunable();
        Thread t1=new Thread(r1);
        t1.start();
    }

}