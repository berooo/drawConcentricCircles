import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Circlestest {

	public static void main(String[] args) {

		
		String input=JOptionPane.showInputDialog("���뻭���ж��");	//��ȡ�û���Ҫ�Ļ����
		int Sizex=Integer.parseInt(input);		//������ת��Ϊ����
		
		input=JOptionPane.showInputDialog("���뻭���ж�ߣ�");	//��ȡ�û���Ҫ�Ļ����
		int Sizey=Integer.parseInt(input);		//������ת��Ϊ����
		
		input=JOptionPane.showInputDialog("���뻭����ͬ��Բ��");	//��ȡ�û���Ҫ��ͬ��Բ����
		int Cnum=Integer.parseInt(input);		//������ת��Ϊ����
		
		Circles panel=new Circles(Cnum);	//ʵ����һ��Circles����
		
		panel.setPlace(Sizex, Sizey);	//����setPlace����
		
		JFrame application=new JFrame();	//����һ������
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		application.add(panel);		//Ϊ������ӻ���
		application.setSize(Sizex, Sizey);	//������Ҫ�ĳߴ�
		application.setVisible(true);	//��ʾframe
		
	}	//����main

}	//����Circletest��
