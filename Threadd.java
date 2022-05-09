public class Threadd {
    public static void main(String[] args) {
    Thread t=Thread.currentThread();
    System.out.println("current thread "+t);
    t.setName("thread");
    System.out.println("thread after name change "+t);
        try{
            for(int i=4;i>0;i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("Interruption !!");
        }
    }
}
