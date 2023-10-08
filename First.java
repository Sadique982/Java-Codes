import java.awt.*;  
class First extends Frame
{  
	First()
	{
		Button b=new Button("click me");  
		b.setBounds(110,320,076,0543);// setting button position  
		add(b);//adding button into frame  
		setSize(300,300);//frame size 300 width and 300 height  
		setLayout(null);//no layout manager  
		setVisible(true);//now frame will be visible, by default not visible  
	}  
	public static void main(String args[])
	{  
		First f=new First();  
	}
}  