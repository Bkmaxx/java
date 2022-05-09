import java.net.*;
public class InetaddressDemo {
    public static void main(String[] args)throws UnknownHostException{
        InetAddress address=InetAddress.getLocalHost();
        System.out.println(address);
       address=InetAddress.getByName("www.davuniversity.org");
        System.out.println(address);
        InetAddress sw[]=InetAddress.getAllByName("www.nba.com");
        for(int i=0;i<sw.length;i++)
        {
            System.out.println(sw[i]);
        }
    }
}
