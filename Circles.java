import java.awt.Graphics;
import javax.swing.JPanel;

public class Circles extends JPanel 
{
	
	private int num,x,y;
	public Circles(int userNum)		//构造函数
	{
		num=userNum;		
	}
	public void setPlace(int placex,int placey)		//计算圆的位置
	{
		x=placex/2;		
		y=placey/2;
	}
	
	public void paintComponent(Graphics g)
	{	
		for(int i=1;i<=num;i++)			//画同心圆		
		g.drawOval(x-10*i, y-10*i, 20*i, 20*i);
	}
}
