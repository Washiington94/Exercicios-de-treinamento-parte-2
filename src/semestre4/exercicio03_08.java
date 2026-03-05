package semestre4;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class exercicio03_08 extends Frame {
	
	
	Label L1,L2,L3,L4,L5,L6,L7;
	TextField Tx1,Tx2,Tx3;
	Button B1;
	
	String cadastro[] = new String[100];
	{
		
	}
	
	public exercicio03_08() {
		
		
		setTitle("Incluir");
		setResizable(false);
		setSize(600,500);
		setLocation(400,250);
		setBackground(new Color(100,149,237));
		setLayout(null);
		
		B1 = new Button("SAIR");
		B1.setLocation(370,400);
		B1.setSize(130,50);
		B1.setBackground(new Color(0,255,255));
		
		L1 = new Label("AS PRAIAS MAIS PROXIMAS");
		L1.setLocation(200,70);
		L1.setSize(250,30);
		
		L2 = new Label("Nome da Praia:");
		L2.setLocation(50,110);
		L2.setSize(120,30);

		L3 = new Label("Distância do Hotel:");
		L3.setLocation(50,150);
		L3.setSize(120,30);
		
		L4 = new Label("Avaliação da Praia:");
		L4.setLocation(50,190);
		L4.setSize(120,30);
		
		L5 = new Label("XXX");
		L5.setLocation(200,110);
		L5.setSize(140,30);
		
		L6 = new Label("XXX");
		L6.setLocation(200,150);
		L6.setSize(140,30);
		
		L7 = new Label("XXX");
		L7.setLocation(200,190);
		L7.setSize(140,30);
		

		
		add(L1);
		add(L2);
		add(L3);
		add(L4);
		add(L5);
		add(L6);
		add(L7);
		add(B1);
	

		
		
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
				
			}}}			
				