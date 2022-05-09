class ThreadDemo{
    public static void main(String [] args) {
        Thread T=Thread.currentThread();
        System.out.println("current thread "+T);
        T.setName("My Thread");
        System.out.println("After change");
        try{
            for(int i=5;i>0;i--){
                System.out.println(i);
                Thread.sleep(1000);

            }
        }
            catch (InterruptedException e){
                System.out.println("Main Thread Interrupted" +e);
            }
        
    }
}