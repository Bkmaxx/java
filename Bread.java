import java.io.*;

public class Bread{
    public static void main(String[] args) throws IOException  {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter f to quit : ");
        do{
            c = (char)br.read();
            System.out.println(c);
        }while(c!='f');
    }
}
