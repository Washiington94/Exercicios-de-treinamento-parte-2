package semestre4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class exercicio03_07 extends Frame {
	
	Label L1,L2,L3,L4;
	Button B1;
	List Li1,Li2,Li3;
	
	 String cadastro[] = new String[100];
	 {
		 
	 }
	public exercicio03_07() {
		
		
		setTitle("Incluir");
		setResizable(false);
		setSize(600,500);
		setLocation(400,250);
		setBackground(new Color(100,149,237));
		setLayout(null);
		
		
		Li1 = new List(5,false);
		Li1.setLocation(70,150);
		Li1.setSize(130,230);
		
		Li2 = new List(5,false);
		Li2.setLocation(220,150);
		Li2.setSize(120,230);
		
		Li3 = new List(5,false);
		Li3.setLocation(350,150);
		Li3.setSize(120,230);
		

		B1 = new Button("SAIR");
		B1.setLocation(400,400);
		B1.setSize(130,50);
		B1.setBackground(new Color(0,255,255));
		
		L1 = new Label("AS PRAIAS POR DISTÂNCIA");
		L1.setLocation(200,50);
		L1.setSize(280,30);
		
		L2 = new Label("Nome da praia");
		L2.setLocation(70,110);
		L2.setSize(110,30);

		L3 = new Label("Distância");
		L3.setLocation(225,110);
		L3.setSize(90,30);
		
		L4 = new Label("Avaliação");
		L4.setLocation(360,110);
		L4.setSize(90,30);

		
		add(L1);
		add(L2);
		add(L3);
		add(L4);
		add(B1);
		add(Li1);
		add(Li2);
		add(Li3);
		
		 ButtonHandler handler = new
		 ButtonHandler();
		 B1.addActionListener(handler);

				}



	 public boolean handleEvent(Event e)
	    {
	       if (e.id == Event.WINDOW_DESTROY) 
	    	   dispose();           
	       return (super.handleEvent(e));    
	                                         
	    }
	 public class ButtonHandler implements ActionListener
	 {
			public void actionPerformed(ActionEvent e) {
				
				int Num;
				
				if (e.getActionCommand() == "SAIR")
					dispose();
	 
			
			
				Li1.addItem(cadastro.toString());
				Li2.addItem(cadastro.toString());
				Li3.addItem(cadastro.toString());
			
			}
		}}