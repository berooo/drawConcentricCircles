import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Circlestest {

	public static void main(String[] args) {

		
		String input=JOptionPane.showInputDialog("你想画板有多宽？");	//获取用户想要的画板宽
		int Sizex=Integer.parseInt(input);		//将输入转换为整型
		
		input=JOptionPane.showInputDialog("你想画板有多高？");	//获取用户想要的画板高
		int Sizey=Integer.parseInt(input);		//将输入转换为整型
		
		input=JOptionPane.showInputDialog("你想画几个同心圆？");	//获取用户想要的同心圆个数
		int Cnum=Integer.parseInt(input);		//将输入转换为整型
		
		Circles panel=new Circles(Cnum);	//实例化一个Circles对象
		
		panel.setPlace(Sizex, Sizey);	//调用setPlace函数
		
		JFrame application=new JFrame();	//创建一个窗口
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		application.add(panel);		//为窗口添加画板
		application.setSize(Sizex, Sizey);	//设置需要的尺寸
		application.setVisible(true);	//显示frame
		
	}	//结束main

}	//结束Circletest类
