import java.awt.*;
import java.awt.event.*;

public class GraphicsDemo extends Frame{
    public GraphicsDemo(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
           
        });
    }
    public void paint(Graphics g){
        g.drawLine(20,40,100,90);
        g.drawLine(20, 100, 90, 40);
        g.drawLine(40, 45, 250, 80);

        g.drawRect(20, 150, 60, 50);
        g.fillRect(110, 150, 60, 50);
        g.drawRoundRect(200, 150, 60, 50, 5, 15);
        g.fillRoundRect(290, 150, 60, 50, 30, 40);

        int Xpoints[] = {20,200,20,200,20};
        int Ypoints[] = {450,650,650,450};
        int num = 5;
        g.drawPolygon(Xpoints,Ypoints,num);
    }
    public static void main(String[] args) {
        GraphicsDemo appwin = new GraphicsDemo();
        appwin.setSize(new Dimension(370,700));
        appwin.setTitle("Graphics Demo");
        appwin.setVisible(true);
    }
    }
