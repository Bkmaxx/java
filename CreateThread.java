
class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t=new Thread(this,"NewThread");
        System.out.println("child thread "+t);
    t.start();
    }
    public void run(){
            try{
                for(int i=5;i>0;i--){
                    System.out.println(i);
                    Thread.sleep(1000);
                }
            }
            catch(Exception e){
                System.out.println("child thread Interrupted");
            }
            System.out.println("child thread exiting");
    }
}
public class CreateThread {
    public static void main(String[] args) {
        new NewThread();
        try{
            for(int i=5;i>0;i--){
                System.out.println(i);
                Thread.sleep(500);
            }
        }
        catch(Exception e){
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting");
        
    }
}
