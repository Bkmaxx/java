class MyException extends Exception{
    private int detail;
    MyException(int d){
        detail=d;
    }
    public String toString(){
        return "MyException : ["+detail+"]";
    }
}
public class NewException {
    static void demo(int a) throws MyException{
        if(a<5){
            System.out.println("Too Small  ");
            throw new MyException(a);
        }
       
            System.out.println("Done No Exception thrown");
        
    }
    public static void main(String[] args) {
        try{
            demo(10);
            demo(2);
    }
    catch(MyException e){
        System.out.println(e);
    }
}
}
