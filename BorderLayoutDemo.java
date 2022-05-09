
import java.awt.*;
import java.awt.event.*;
public class BorderLayoutDemo extends Frame{
    public BorderLayoutDemo(){
        add(new Button("This is accross the top "),BorderLayout.NORTH);
        add(new Label("The footer message "),BorderLayout.NORTH);
        add(new Button("Right"),BorderLayout.EAST);
        add(new Button("Left"),BorderLayout.WEST);
        String S="Time is Running Fast";
        add(new TextArea(S+S+S+S),BorderLayout.CENTER);
        addWindowListener(new WindowAdapter(){
            public void WindowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        BorderLayoutDemo appwin=new BorderLayoutDemo();
        appwin.setSize(new Dimension(300,220));
        appwin.setTitle("BorderLayoutDemo");
    appwin.setVisible(true);
    }

   
}
