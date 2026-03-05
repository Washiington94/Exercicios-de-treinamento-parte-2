package semestre4;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;



public class Exercicio03_03 extends Frame {
	
	Label L1,L2,L3,L4;
	TextField Tx1,Tx2,Tx3;
	Button B1,B2,B3;
	
	
	public Exercicio03_03(){
		
		
		setTitle("Incluir");
		setResizable(false);
		setSize(600,500);
		setLocation(400,250);
		setBackground(Color.yellow);
		setLayout(null);
		
		B1 = new Button("INSERIR");
		B1.setLocation(70,400);
		B1.setSize(130,50);
		B1.setBackground(Color.green);
		
		B2 = new Button("LIMPAR");
		B2.setLocation(220,400);
		B2.setSize(130,50);
		B2.setBackground(Color.green);
		
		B3 = new Button("SAIR");
		B3.setLocation(370,400);
		B3.setSize(130,50);
		B3.setBackground(Color.green);
		
		Tx1 = new TextField("");
		Tx1.setLocation(170,110);
		Tx1.setSize(140,30);
		
		Tx2 = new TextField("");
		Tx2.setLocation(170,150);
		Tx2.setSize(140,30);
		
		Tx3 = new TextField("");
		Tx3.setLocation(170,190);
		Tx3.setSize(140,30);
		
		
		L1 = new Label("CADASTRAMENTO DA LOCAÇÃO");
		L1.setLocation(200,50);
		L1.setSize(250,30);
		
		L2 = new Label("Cliente:");
		L2.setLocation(50,110);
		L2.setSize(50,30);

		L3 = new Label("Placa Do Veiculo:");
		L3.setLocation(50,150);
		L3.setSize(100,30);
		
		L4 = new Label("Dias de Locação:");
		L4.setLocation(50,190);
		L4.setSize(100,30);

		
		add(L1);
		add(L2);
		add(L3);
		add(L4);
		add(B1);
		add(B2);
		add(B3);
		add(Tx1);
		add(Tx2);
		add(Tx3);
	
		
		 ButtonHandler handler = new
		 ButtonHandler();
		 B1.addActionListener(handler);
		 B2.addActionListener(handler);
		 B3.addActionListener(handler);
		 
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
	 }
			}


}