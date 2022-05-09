public class tryingtocatch {
    public static void main(String [] args){
        int x=0;
        
        try{
            int compute=12/x;
           System.out.println(compute);
           //throw new Exception("compute");
           
        }
        
        catch(Exception e){
            System.out.println("Can not divide by zero\n"+e);
        }
        finally{
            System.out.println("all done");
        }
        System.out.println("end");
        
    }
    
}
