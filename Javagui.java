/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javagui;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author uyser
 */
public class Javagui {

    Javagui(){
    
    Frame f=new Frame();
    Panel ps=new Panel();   
    Panel pc=new Panel();
    Panel pe=new Panel();
    Panel pw=new Panel();
    Panel pn=new Panel();
Label LABEL=new Label("EXAMPLE JAVA AWT LAYOUT");
pn.add(LABEL);
    LABEL.setForeground(Color.white);
    Label ul = new Label("Username: ");
        TextField t1 = new TextField(20);
        Label pl = new Label("Password: ");
        TextField t2 = new TextField(20);
        Button bt = new Button("Login");
   
   
MenuBar mb=new MenuBar();
Menu m1=new Menu("Pages");
Menu m2=new Menu("Edit");
Menu m3=new Menu("Help");

MenuItem i1=new MenuItem("Login");
MenuItem i2=new MenuItem("student");     
     
f.add(pc);
f.add(pe);
//f.add(pn);
f.add(pw);
f.add(pw);
f.setMenuBar(mb);

mb.add(m1);
mb.add(m2);
mb.add(m3);

m1.add(i2);
m1.add(i1);
pc.setLayout(new GridLayout(3, 2));
//ul.setBounds(60, 60, 20, 20);
//pl.setBounds(60, 140, 20, 20);
//t1.setBounds(140, 60, 80, 20);
//t2.setBounds(140, 140, 80, 20);
//bt.setBounds(0, 60, 80, 20);
        ul.setPreferredSize(new Dimension(50, 20)); // Set preferred size to make the button smaller
        
        pl.setPreferredSize(new Dimension(50, 50)); // Set preferred size to make the button smaller
       
        t1.setPreferredSize(new Dimension(50, 10)); // Set preferred size to make the button smaller
        
        t2.setPreferredSize(new Dimension(50, 50)); // Set preferred size to make the button smaller

        bt.setPreferredSize(new Dimension(50, 50)); // Set preferred size to make the button smaller

 
        pc.add(ul);
        pc.add(t1);
        pc.add(pl);
        pc.add(t2);
pc.add(bt);

f.setMenuBar(mb);


        ps.setBackground(Color.BLUE);
        ps.setPreferredSize(new Dimension(800, 30)); // Setting the preferred size of the panel
        
        pc.setBackground(Color.WHITE);
        
        pe.setBackground(Color.LIGHT_GRAY);
        pe.setPreferredSize(new Dimension(100, 400)); // Setting the preferred size of the panel
        
        pw.setBackground(Color.LIGHT_GRAY);
        pw.setPreferredSize(new Dimension(100, 400)); // Setting the preferred size of the panel
       
       pn.setBackground(Color.BLUE);
        pn.setPreferredSize(new Dimension(800, 50)); // Setting the preferred size of the panel
        


 f.setLayout(new BorderLayout());
 f.add(ps,BorderLayout.SOUTH);
 f.add(pc,BorderLayout.CENTER);
 f.add(pe,BorderLayout.EAST);
 f.add(pw,BorderLayout.WEST);
f.add(pn,BorderLayout.NORTH);
f.setSize(500, 400);
   f.setVisible(true);
   f.addWindowListener(new WindowAdapter(){
    
    public void windowClosing(WindowEvent x){
        System.exit(0);
    }
    
   });}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Javagui();
    }
    
}
