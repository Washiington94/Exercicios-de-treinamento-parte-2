package semestre4;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class exercicio03_01 extends Frame implements ActionListener
{
	MenuBar bMenu;
	Menu menu1,menu2,menu3,menu4;
	MenuItem m1,m2,m3,m4,m5,m6,m7;
	
	public exercicio03_01()
	{
		setTitle("Exercicio com utilização de Menu");
		setResizable(false);
		setSize(600,500);
		setLocation(400,250);
		setBackground(Color.yellow);
		setLayout(null);
	
	menu1 = new Menu("Cadastrar");
    m1 = new MenuItem("Incluir");
    m1.addActionListener(this);
    m2 = new MenuItem("Outros");
    m2.addActionListener(this);

    menu1.add(m1);
    menu1.add(m2);


    menu2 = new Menu("Locação");
    m3 = new MenuItem("Incluir");
    m3.addActionListener(this);
    m4 = new MenuItem("Outros");
    m4.addActionListener(this);
    
    menu2.add(m3);
    menu2.add(m4);
    
    menu3 = new Menu("Consultar");
    m5 = new MenuItem("Carros Locados");
    m5.addActionListener(this);
    m6 = new MenuItem("Outros");
    m6.addActionListener(this);
    
    menu3.add(m5);
    menu3.add(m6);
    
    menu4 = new Menu("SAIR");
    m7 = new MenuItem("SAIR");
    m7.addActionListener(this);
    menu4.add(m7);
    
bMenu = new MenuBar();
bMenu.add(menu1);
bMenu.add(menu2);
bMenu.add(menu3);
bMenu.add(menu4);

setMenuBar(bMenu);


}
public static void main(String[] args) 
{
	new exercicio03_01().setVisible(true);
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
		System.exit(0);
	
	else
           {
           if( e.getSource() == m1 )
           {
               evento = "Incluir";
               new Exercicio03_02().setVisible(true);
               
           }
           else if( e.getSource() == m2 )
           {     evento = "Outros";
           JOptionPane.showMessageDialog(null,"");}
           
           else if( e.getSource() == m3 ) {
               evento = "Sistema de Locação de Carros";
           new Exercicio03_03().setVisible(true);
           }
           else if( e.getSource() == m4 )
           {  evento = "Outtros";
           
           JOptionPane.showMessageDialog(null,"");
           }
           else if( e.getSource() == m5 ) {
               evento = "Carros Locados";
           new Exercicio03_04().setVisible(true);
           }
           else if( e.getSource() == m6 )
           {   evento = "Outros";
           
           JOptionPane.showMessageDialog(null,"");
           }
}}}
	

