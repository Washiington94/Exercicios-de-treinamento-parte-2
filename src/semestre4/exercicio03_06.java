package semestre4;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class exercicio03_06 extends Frame {
	
	
	Label L1,L2,L3,L4;
	TextField Tx1,Tx2,Tx3;
	Button B1,B2,B3;
	
	String cadastro[] = new String[100];
	{
		
	}
	
	public exercicio03_06() {
		
		
		setTitle("Incluir");
		setResizable(false);
		setSize(600,500);
		setLocation(400,250);
		setBackground(new Color(100,149,237));
		setLayout(null);
		
		B1 = new Button("CADASTRO");
		B1.setLocation(70,400);
		B1.setSize(130,50);
		B1.setBackground(new Color(0,255,255));
		
		B2 = new Button("LIMPAR");
		B2.setLocation(220,400);
		B2.setSize(130,50);
		B2.setBackground(new Color(0,255,255));
		
		B3 = new Button("SAIR");
		B3.setLocation(370,400);
		B3.setSize(130,50);
		B3.setBackground(new Color(0,255,255));
		
		Tx1 = new TextField("");
		Tx1.setLocation(200,110);
		Tx1.setSize(140,30);
		
		Tx2 = new TextField("");
		Tx2.setLocation(200,150);
		Tx2.setSize(140,30);
		
		Tx3 = new TextField("");
		Tx3.setLocation(200,190);
		Tx3.setSize(140,30);
		
		
		L1 = new Label("CADASTRAMENTO DAS PRAIAS");
		L1.setLocation(200,50);
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
				 String praia,distancia,avaliacao;
				
				
				
				if (e.getActionCommand() == "SAIR")
					dispose(); 
	 
			
			if(e.getActionCommand() == "INCLUIR") {
			
				
					praia = (Tx1.getText());
					distancia = (Tx2.getText());
					avaliacao = (Tx3.getText());

				
					for(int i=0;i<=50;i++) {
				
				 cadastro[i] = praia + "" + distancia + "" + avaliacao;
				 i++;
				}
					}
			}
			}
	 }