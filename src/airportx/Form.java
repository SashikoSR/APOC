package airportx;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

import java.awt.event.*;


	public class Form extends JFrame{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JButton jbtn_button;
		private JTextField jtxt_text;
		private JLabel jlbl_label;
		
		public Form () {
		
			super("APOC Interface");
			super.setSize(600,600);
			super.setBounds(10,10,300,200);
			super.setVisible(true);
			super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window();			
		}
		
	    
	    public void window() {
	    super.setLayout(new FlowLayout());
	    jbtn_button = new JButton("Update");
	    jtxt_text = new JTextField(20);
	    jlbl_label = new JLabel();
	    super.add (jtxt_text);
	    super.add(jbtn_button);
	    super.add(jlbl_label);
	    jbtn_button.addActionListener(new ActionListener()
	    		{
	    	@Override
	    	public void actionPerformed(ActionEvent event) {
	        try {
	    	int message = Integer.parseInt(jtxt_text.getText());
	    	Environment e = new Environment(); 
	        String messages [] = e.start(message);
	        String m = "<html>";
	        for(int i=0;i<message;i++){  
	       
	         if (!m.equals("<html>") )
	        
	          m = m + "<br>";
              m = m + messages[i];
             
	               } 
	        m = m + "</html>";
	        jlbl_label.setText(m); 
	        }
	        catch(Exception ex) {System.out.println("Only numbers");
	        jlbl_label.setText("Only numbers"); 
	        }
	        
	    		}
	    		
	    		});
	    
	    
	    
	    }
}