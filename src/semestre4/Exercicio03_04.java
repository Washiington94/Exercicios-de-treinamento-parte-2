package semestre4;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Exercicio03_04 extends Frame {
	
	Label L1,L2,L3,L4,L5;
	Button B1,B2;
	List Li;
	
	static String cadastro[] = new String[100];
	{
		 
	 }
		public Exercicio03_04(){
		
		
		setTitle("Incluir");
		setResizable(false);
		setSize(600,500);
		setLocation(400,250);
		setBackground(Color.yellow);
		setLayout(null);
		
		
		Li = new List(5,false);
		Li.setLocation(70,150);
		Li.setSize(460,200);
		
		B1 = new Button("CONSULTAR");
		B1.setLocation(70,400);
		B1.setSize(130,50);
		B1.setBackground(Color.green);
		
		B2 = new Button("SAIR");
		B2.setLocation(400,400);
		B2.setSize(130,50);
		B2.setBackground(Color.green);
		

		
		
		
		L1 = new Label("CONSULTA - CARROS LOCADOS");
		L1.setLocation(200,50);
		L1.setSize(250,30);
		
		L2 = new Label("Clientes");
		L2.setLocation(70,110);
		L2.setSize(50,30);

		L3 = new Label("Placas");
		L3.setLocation(170,110);
		L3.setSize(50,30);
		
		L4 = new Label("Dias");
		L4.setLocation(270,110);
		L4.setSize(50,30);

		L5 = new Label("Valor:");
		L5.setLocation(370,110);
		L5.setSize(50,30);
		
		add(L1);
		add(L2);
		add(L3);
		add(L4);
		add(L5);
		add(B1);
		add(B2);
		add(Li);
		
		 ButtonHandler handler = new
		 ButtonHandler();
		 B1.addActionListener(handler);
		 B2.addActionListener(handler);

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
	 
			
			if (e.getActionCommand() == "CONSULTAR") 
			{
				
			
				
				Li.addItem(cadastro.toString());
				
			
			}
			}}}
