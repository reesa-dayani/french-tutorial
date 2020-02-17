/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package culminatingrdayani;
import java.awt.Color;
import java.awt.FlowLayout; // specifies how components are arranged
import java.awt.Font;
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images
import javax.swing.*;
import java.awt.event.*;
import java.text.*;
import java.util.ArrayList;

/**
 *
 * @author reesadayani
 */
public class Lesson_Frame extends JFrame implements ActionListener {
        DecimalFormat x = new DecimalFormat("###.##");

    /**
     * @param args the command line arguments
     */
 
        // TODO code application logic here
    
// Establishing variables for application.
JLabel lblTitle;
JLabel lblIntro; 
JButton btnPC;
JButton btnImp;
JButton btnPres;
JButton btnFP;
JLabel lblImage;
JButton btnBack;
ImageIcon icon = new ImageIcon("thumbsup.jpg");//adding images
//Creating Application name + basic setup
public Lesson_Frame() {
super( "French Basics 101" );    
setLayout(null); 
getContentPane().setBackground(Color.LIGHT_GRAY.brighter());
  
//Establishing Title label
lblTitle= new JLabel();
lblTitle.setLocation(100, 10);
lblTitle.setSize(900, 120);
lblTitle.setForeground(Color.MAGENTA);
lblTitle.setText("French Verb Tense 101: \nLesson");
lblTitle.setFont(new Font ("Arial", Font.BOLD, 40));
add(lblTitle);

//Establishing Name Value label
lblIntro= new JLabel();
lblIntro.setLocation(50, 130);
lblIntro.setSize(1000, 40);
lblIntro.setForeground(Color.BLACK);
lblIntro.setText("Click on the verb tense you would like to learn more about! ");
lblIntro.setFont(new Font ("Arial", Font.BOLD, 25));
add(lblIntro);

lblImage= new JLabel();
lblImage.setLocation(260, 10);
lblImage.setSize(400, 900);
lblImage.setForeground(Color.BLACK);
lblImage.setIcon(icon);
lblImage.setFont(new Font ("Arial", Font.BOLD, 24));
add(lblImage); 

//Establishing Calculate Button.   
btnPC = new JButton();
btnPC.setText("Passé" + "\nComposée!");
btnPC.setFont(new Font ("Arial", Font.PLAIN, 20));
btnPC.setSize(220, 190);
btnPC.setLocation(10, 320);
btnPC.setActionCommand("Passé Composée!");
btnPC.addActionListener(this);
add(btnPC);

btnImp = new JButton();
btnImp.setText("Imparfait!");
btnImp.setFont(new Font ("Arial", Font.PLAIN, 30));
btnImp.setSize(220, 190);
btnImp.setLocation(470, 590);
btnImp.setActionCommand("Imparfait!");
btnImp.addActionListener(this);
add(btnImp);

btnPres = new JButton();
btnPres.setText("Present Tense!");
btnPres.setFont(new Font ("Arial", Font.PLAIN, 30));
btnPres.setSize(220, 190);
btnPres.setLocation(160, 590);
btnPres.setActionCommand("Present Tense!");
btnPres.addActionListener(this);
add(btnPres);

btnFP = new JButton();
btnFP.setText("Futur Proche!");
btnFP.setFont(new Font ("Arial", Font.PLAIN, 30));
btnFP.setSize(220, 190);
btnFP.setLocation(570, 320);
btnFP.setActionCommand("Futur Proche!");
btnFP.addActionListener(this);
add(btnFP);

btnBack = new JButton();
btnBack.setText("Back");
btnBack.setFont(new Font ("Arial", Font.ITALIC, 14));
btnBack.setForeground(Color.BLUE);
btnBack.setSize(60, 55);
btnBack.setLocation(10, 50);
btnBack.setActionCommand("Back");
btnBack.addActionListener(this);
add(btnBack);


}
// button setup (response/action invoked)
public void actionPerformed (ActionEvent e) {  
        if(e.getActionCommand().equals("Passé Composée!")){
            PasseComposee_Frame f1 = new PasseComposee_Frame();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 1300, 1000 ); // set frame size
           f1.setVisible( true ); // display frame
           this.dispose();//closed the current working JFrame   
           
        }
        
 if(e.getActionCommand().equals("Back")){
      Menu_Frame f1 = new Menu_Frame();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 800, 1000 ); // set frame size
           f1.setVisible( true ); // display frame
           this.dispose();//closed the current working JFrame   
     
        }
if(e.getActionCommand().equals("Imparfait!")){
  Imparfait_Frame f1 = new Imparfait_Frame();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 800, 1000 ); // set frame size
           f1.setVisible( true ); // display frame
           this.dispose();//closed the current working JFrame     
}

if(e.getActionCommand().equals("Present Tense!")){
PresentTense_Frame f1 = new PresentTense_Frame();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 800, 1000 ); // set frame size
           f1.setVisible( true ); // display frame
           this.dispose();//closed the current working JFrame   

}

if(e.getActionCommand().equals("Futur Proche!")){
           FP_frame f1 = new FP_frame();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 800, 1000 ); // set frame size
           f1.setVisible( true ); // display frame
           this.dispose();//closed the current working JFrame        
}
}
}


