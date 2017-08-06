import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

//<applet code="tictac" width=500 height=500></applet>
public class tictac extends Applet implements ActionListener{
    /**
	 * ID = 118014015;
	 */
	private static final long serialVersionUID = 1L;
	int s;
	int a=0;
	String s1,s2,s3,s4,s5,s6,s7,s8,s9;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    public void init()
    {
    	setLayout(null);
    	b1 = new Button();
		b2 = new Button();
		b3 = new Button();
		b4 = new Button();
		b5 = new Button();
		b6 = new Button();
		b7 = new Button();
		b8 = new Button();
		b9 = new Button();
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		b1.setBounds(10, 10, 100, 100);
		b2.setBounds(110, 10, 100, 100);
		b3.setBounds(210, 10, 100, 100);
		b4.setBounds(10, 110, 100, 100);
		b5.setBounds(110, 110, 100, 100);
		b6.setBounds(210, 110, 100, 100);
		b7.setBounds(10, 210, 100, 100);
		b8.setBounds(110, 210, 100, 100);
		b9.setBounds(210, 210, 100, 100);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1)
			s=1;
		if(ae.getSource()==b2)
			s=2;
		if(ae.getSource()==b3)
			s=3;
		if(ae.getSource()==b4)
			s=4;
		if(ae.getSource()==b5)
			s=5;
		if(ae.getSource()==b6)
			s=6;
		if(ae.getSource()==b7)
			s=7;
		if(ae.getSource()==b8)
			s=8;
		if(ae.getSource()==b9)
			s=9;
		a++;
		repaint();
	}
	public void paint(Graphics g){
		s1=b1.getLabel();
		s2=b2.getLabel();
		s3=b3.getLabel();
		s4=b4.getLabel();
		s5=b5.getLabel();
		s6=b6.getLabel();
		s7=b7.getLabel();
		s8=b8.getLabel();
		s9=b9.getLabel();
		if(a<=9){
			if(a%2!=0){
				if(s==1){
					b1.setLabel("X");
					if("X".equals(s2)&& "X".equals(s3)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("CH WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
						}else if("X".equals(s4)&& "X".equals(s7)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("CH WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}else if("X".equals(s5)&& "X".equals(s9)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("CH WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}
						
					}
				if(s==2){
					b2.setLabel("X");
				   if("X".equals(s1)&& "X".equals(s3)){
					b1.setLabel("");
					b2.setLabel("");
					b3.setLabel("");
					b4.setLabel("");
					b5.setLabel("CH WON");
					b6.setLabel("");
					b7.setLabel("");
					b8.setLabel("");
					b9.setLabel("");
					}else if("X".equals(s5)&& "X".equals(s8)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("CH WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
					}
				}
				if(s==3){
					b3.setLabel("X");
				if("X".equals(s2)&& "X".equals(s1)){
					b1.setLabel("");
					b2.setLabel("");
					b3.setLabel("");
					b4.setLabel("");
					b5.setLabel("CH WON");
					b6.setLabel("");
					b7.setLabel("");
					b8.setLabel("");
					b9.setLabel("");
					}else if("X".equals(s6)&& "X".equals(s9)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("CH WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
					}else if("X".equals(s5)&& "X".equals(s7)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("CH WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
					}
			}
				if(s==4){
					b4.setLabel("X");
					if("X".equals(s1)&& "X".equals(s7)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("CH WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
						}else if("X".equals(s5)&& "X".equals(s6)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("CH WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}
				}
				if(s==5){
					b5.setLabel("X");
					if("X".equals(s4)&& "X".equals(s6)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("CH WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
						}else if("X".equals(s3)&& "X".equals(s7)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("CH WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}else if("X".equals(s1)&& "X".equals(s9)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("CH WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}else if("X".equals(s2)&& "X".equals(s8)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("CH WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
							}
				}
				if(s==6){
					b6.setLabel("X");
					if("X".equals(s3)&& "X".equals(s9)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("CH WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
						}else if("X".equals(s4)&& "X".equals(s5)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("CH WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}
				}
				if(s==7){
					b7.setLabel("X");
					if("X".equals(s5)&& "X".equals(s3)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("CH WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
						}else if("X".equals(s4)&& "X".equals(s1)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("CH WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}else if("X".equals(s8)&& "X".equals(s9)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("CH WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}
				}
				if(s==8){
					b8.setLabel("X");
					if("X".equals(s7)&& "X".equals(s9)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("CH WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
						}else if("X".equals(s5)&& "X".equals(s2)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("CH WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}
				}
				if(s==9){
					b9.setLabel("X");
					if("X".equals(s6)&& "X".equals(s3)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("CH WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
						}else if("X".equals(s8)&& "X".equals(s7)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("CH WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}else if("X".equals(s5)&& "X".equals(s1)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("CH WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}
				}
			}
			if(a%2==0){
				if(s==1){
					b1.setLabel("O");
					if("O".equals(s2)&& "O".equals(s3)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("DE WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
						}else if("O".equals(s4)&& "O".equals(s7)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("DE WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}else if("O".equals(s5)&& "O".equals(s9)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("DE WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}
				}
				if(s==2){
					b2.setLabel("O");
					if("O".equals(s1)&& "O".equals(s3)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("DE WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
						}else if("O".equals(s5)&& "O".equals(s8)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("DE WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}
				}
				if(s==3){
					b3.setLabel("O");
					if("O".equals(s2)&& "O".equals(s1)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("DE WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
						}else if("O".equals(s5)&& "O".equals(s7)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("DE WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}else if("O".equals(s6)&& "O".equals(s9)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("DE WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}
				}
				if(s==4){
					b4.setLabel("O");
					if("O".equals(s5)&& "O".equals(s6)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("DE WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
						}else if("O".equals(s1)&& "O".equals(s7)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("DE WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}
				}
				if(s==5){
					b5.setLabel("O");
					if("O".equals(s4)&& "O".equals(s6)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("DE WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
						}else if("O".equals(s2)&& "O".equals(s8)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("DE WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}else if("O".equals(s1)&& "O".equals(s9)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("DE WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}else if("O".equals(s7)&& "O".equals(s3)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("DE WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
							}
				}
				if(s==6){
					b6.setLabel("O");
					if("O".equals(s9)&& "O".equals(s3)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("DE WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
						}else if("O".equals(s4)&& "O".equals(s5)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("DE WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}
				}
				if(s==7){
					b7.setLabel("O");
					if("O".equals(s5)&& "O".equals(s3)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("DE WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
						}else if("O".equals(s4)&& "O".equals(s1)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("DE WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}else if("O".equals(s8)&& "O".equals(s9)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("DE WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}
				}
				if(s==8){
					b8.setLabel("O");
					if("O".equals(s2)&& "O".equals(s5)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("DE WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
						}else if("O".equals(s9)&& "O".equals(s7)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("DE WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}
				}
				if(s==9){
					b9.setLabel("O");
					if("O".equals(s6)&& "O".equals(s3)){
						b1.setLabel("");
						b2.setLabel("");
						b3.setLabel("");
						b4.setLabel("");
						b5.setLabel("DE WON");
						b6.setLabel("");
						b7.setLabel("");
						b8.setLabel("");
						b9.setLabel("");
						}else if("O".equals(s8)&& "O".equals(s7)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("DE WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}else if("O".equals(s5)&& "O".equals(s1)){
							b1.setLabel("");
							b2.setLabel("");
							b3.setLabel("");
							b4.setLabel("");
							b5.setLabel("DE WON");
							b6.setLabel("");
							b7.setLabel("");
							b8.setLabel("");
							b9.setLabel("");
						}
				}
			}
		}
		}

}
