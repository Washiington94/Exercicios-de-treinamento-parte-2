package semestre4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class exercicio03_05 extends Frame implements ActionListener
{
	MenuBar bMenu;
	Menu menu1,menu2,menu3;
	MenuItem m1,m2,m3,m4,m5,m6,m7,m8,m9,m10;
	
	public exercicio03_05 ()
	{
		setTitle("Sistema Atendimento aos Hospedes");
		setResizable(false);
		setSize(600,500);
		setLocation(400,250);
		setBackground(new Color(100,149,237));
		setLayout(null);
		
	
	menu1 = new Menu("CADASTRAR");
    m1 = new MenuItem("Incluir");
    m1.addActionListener(this);
    m2 = new MenuItem("Alterar");
    m2.addActionListener(this);
    m3 = new MenuItem("Excluir");
    m3.addActionListener(this);
    
    menu1.add(m1);
    menu1.add(m2);
    menu1.add(m3);
    
    menu2 = new Menu("PESQUISAR");
    m4 = new MenuItem("A Praia Mais Proximas");
    m4.addActionListener(this);
    m5 = new MenuItem("A Praia Mais Distante");
    m5.addActionListener(this);
    m6 = new MenuItem("A Praia Melhor Avaliada");
    m6.addActionListener(this);
    m7 = new MenuItem("As Praias Por Distância");
    m7.addActionListener(this);
    m8 = new MenuItem("As Praias Por Avaliação");
    m8.addActionListener(this);
    m9 = new MenuItem("Outros");
    m9.addActionListener(this);
    
    menu2.add(m4);
    menu2.add(m5);
    menu2.add(m6);
    menu2.addSeparator();
    menu2.add(m7);
    menu2.add(m8);
    menu2.add(m9);
    
    menu3 = new Menu("SAIR");
    m10 = new MenuItem("SAIR");
    m10.addActionListener(this);
   
    menu3.add(m10);
   
bMenu = new MenuBar();
bMenu.add(menu1);
bMenu.add(menu2);
bMenu.add(menu3);


setMenuBar(bMenu);
	}


public static void main(String[] args) 
{
	new exercicio03_05().setVisible(true);
}

public boolean handleEvent(Event e)
{
    if (e.id == Event.WINDOW_DESTROY) 
    	dispose();          
    return (super.handleEvent(e));    
                                      
 }
public void actionPerformed(ActionEvent e) {
	
	int Num;
	String evento="";
	
	if (e.getActionCommand() == "SAIR")
		dispose();
	
	else
           {
           if( e.getSource() == m1 )
           {
               evento = "Incluir";
               new exercicio03_05().setVisible(true);
               }
           else if( e.getSource() == m3 )
           {   
        	   evento = "Excluir";
           }
           else if (e.getSource() == m4 )
           {
        	   evento = "A Praia Mais Proximas";
        	   new exercicio03_05().setVisible(true);
           }
           
           else if( e.getSource() == m7 ) 
           {
               evento = "As Praias Mais Proximas";
           new exercicio03_05().setVisible(true);
           }
           else if( e.getSource() == m9 )
           {   
        	   evento = "Outros";
       
           }
}}}