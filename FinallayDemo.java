

public class FinallayDemo {
    static void proc(int a){
        try{
            System.out.println("try in proc()");
            throw new RuntimeException("RuntimeException");
        }
        finally{
            System.out.println("finally in proc()");
        }
    }
public static void main(String[] args) {
    try{
        proc(3);
        proc(0);
    }
    catch(Exception e){
        System.out.println(e);
    }
    
}    
}
