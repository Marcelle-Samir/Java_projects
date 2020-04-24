import java.applet.Applet;
import java.awt.Graphics;

public class app extends Applet {
String str=new String();
    public void init() {
 str=getParameter("msg");  

    }

    public void paint(Graphics g)
    {
        g.drawString("hello", 100, 100);
g.drawString(str,50, 50);    }
    
}
