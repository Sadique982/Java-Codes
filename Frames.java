import java.awt.*;
import javax.swing.*;
class Frames
{
    public static void main(String arg[])throws Exception{
        Frame f=new Frame();
        Button b=new Button("Hello Grapical World");
        b.setBounds(250,300,100,45);
        f.add(b);
        f.setSize(500,400);
        f.setLayout(new GridLayout(13,14));
        f.setVisible(true);
    }
}