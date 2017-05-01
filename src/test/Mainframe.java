package test;

import java.awt.*;

import java.awt.event.*;

public class Mainframe extends Frame {
	private String x = " ";
	 private Label lb1 = new Label("");
	 private Button btn1[] = new Button[16];
	 private Panel panl = new Panel (new GridLayout( 4,4,2,2)); 
	 private Font ft = new Font (null,Font.PLAIN,20);
	 private String btnlabel[]={"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
  public Mainframe (){
    this.setResizable(false);
	init();
	
	}
  private void init(){
	  this.setBounds(100,200,400,300);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		}); 
	this.setLayout(new BorderLayout(5,5));
	this.add(lb1,BorderLayout.NORTH);
	lb1.setAlignment(Label.RIGHT);
	lb1.setBackground(Color.GRAY);
	lb1.setFont(ft);
	
	

	for(int i=0;i<16;i++){
		btn1[i]= new Button(btnlabel[i]);
		panl.add( btn1[i]);
		btn1[i].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				Button tmpbtn = (Button)e.getSource();
             lb1.setText(lb1.getText()+tmpbtn.getLabel());				
			}
		});
		
	}
	this.add(panl,BorderLayout.CENTER);
	
		 
		
	  
  }
}
