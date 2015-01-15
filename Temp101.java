import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Temp101 extends JFrame 
{
    JLabel l;
    JTextField tf;
    int t = 0;
    String s1;
    
    Temp101(String s)
    {
	s1 = new String();
	f = new JFrame(s);
	l = new JLabel();
	tf = new JTextField();
	tf.setBounds(50, 50, 400, 200);
	l.setBounds(50, 250, 400, 200);
	
	add(tf);
	add(l);
	tf.addKeyListener(new KeyHandler());
	setLayout(null);
    }
    private class KeyHandler extends KeyAdapter{
    public void keyTyped(KeyEvent e)
    {
	  s1 = new String();
	 if(e.getKeyChar() != '<' && t == 1)
	    {
		s1 = tf.getText();
		s1 = s1 + " </html>";
		l.setText(s1);
	    }
	else
	    {
		if(e.getKeyChar() == '>')
		    {
			t = 1;
		    }
		else
		    {
			t = 0;
		    }
	    }
   }
 }
   
}
