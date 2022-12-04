import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;

public class test3 extends JFrame{
	private JTextField answer = new JTextField(10);
	private JTextArea result = new JTextArea(5,1);
	int question [] = new int[5];
	int num = 1;
	int count = 0;
	JLabel l = new JLabel();
	Random random =new Random();
	public test3() {
		
		setTitle("quiz");
		setLocation(600,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
 
		JButton send = new JButton("제출");

		l.setText("<html>" + "z" + "<br>" + "aaa" + "<br>" + "bb" + "<br>" + "cc" + "</html>");
		c.add(l);
		l.setBounds(100,-20,450,200);					//문제
		l.setFont(new Font("폰트", Font.BOLD, 20));
		c.add(send);									
		send.setBounds(250,200,100,50);					//버튼
		c.add(answer);
		answer.setBounds(100,150,200,25);				//답란
		
		
		
		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=(random.nextInt(4))+1;
				if(e.getSource() == send) {
					if(num == 1) {
						if(answer.getText().equals("정답1")) {
							an();
							count++;
						}
						else {System.out.println("a");}
						
						num=(random.nextInt(4))+1;
						
						
					}
					else if(num == 2) {
							if(answer.getText().equals("정답2")) {
								l.setText("ㅎㅇ2");
								
								count++;
							}
							else {System.out.println("b");}
							num++;
							
						}
					else if(num == 3) {
							if(answer.getText().equals("정답3")) {
								l.setText("ㅎㅇ3");
								count++;
							}
							else {System.out.println("c");}
							num++;
							
						}
					else if(num == 4) {
							if(answer.getText().equals("정답4")) {
								l.setText("ㅎㅇ4");
								count++;
							}
							else {System.out.println("d");}
							num++;
							
						}
					
					else if(num == 5) {
							if(answer.getText().equals("정답5")) {
								count++;
							}
							else {System.out.println("e");}
							num++;
							
						}
					}	
				
			}
		});
		

		setSize(600,400);
		setVisible(true);
		
	}
	
	public void an(){
		l.setText("ㅎㅇ");
	}
	
	public static void main(String[] args) {
		new test3();
	}
	
}
