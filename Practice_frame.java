/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package culminatingrdayani;
import java.awt.BorderLayout;
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
public class Practice_frame extends JFrame implements ActionListener {
        DecimalFormat x = new DecimalFormat("###.##");

    /**
     * @param args the command line arguments
     */
 
        // TODO code application logic here
    
// Establishing variables for application.
JLabel lblTitle;
JLabel lblIntro;
JLabel lblPC;
JLabel lblPres;
JLabel lblFP;
JLabel lblImp;
JTextArea txtPC;
JTextArea txtPres;
JTextArea txtImp;
JTextArea txtFP;
JTextField txtPC2;
JTextField txtPres2;
JTextField txtImp2;
JTextField txtFP2;
JButton btnBack;
JButton btnSolutions;
JButton btnEnter;



String strPC = ("ont écrit, a regardé, a fini, ai fermé, s’est levé");
String strPres = ("mange, voyagez, habitent, apprends, comprends");
String  strImp = ("habitais, jouions, finissais, rendait, alliez");
String  strFP = ("allons partir, vais écrire, vont arriver, vas rendre, allez prendre ");


public Practice_frame() {
super( "French Basics 101" );    
setLayout(null); 
getContentPane().setBackground(Color.WHITE);



//Establishing Title label
lblTitle= new JLabel();
lblTitle.setLocation(650, 30);
lblTitle.setSize(550, 40);
lblTitle.setForeground(Color.MAGENTA);
lblTitle.setText("Quiz!");
lblTitle.setFont(new Font ("Arial", Font.BOLD, 35));
add(lblTitle);

//Establishing Name Value label
lblIntro= new JLabel();
lblIntro.setLocation(550, 60);
lblIntro.setSize(500, 50);
lblIntro.setForeground(Color.RED);
lblIntro.setText("Fill in the blanks!");
lblIntro.setFont(new Font ("Arial", Font.BOLD, 20));
add(lblIntro);

lblPC= new JLabel();
lblPC.setLocation(10, 100);
lblPC.setSize(250, 40);
lblPC.setForeground(Color.CYAN);
lblPC.setText("Passe Composee: Practice");
lblPC.setFont(new Font ("Arial", Font.BOLD, 18));
add(lblPC);

lblPres= new JLabel();
lblPres.setLocation(400, 100);
lblPres.setSize(250, 60);
lblPres.setForeground(Color.CYAN);
lblPres.setText("Present Tense: Practice");
lblPres.setFont(new Font ("Arial", Font.BOLD, 18));
add(lblPres);

lblImp= new JLabel();
lblImp.setLocation(850, 100);
lblImp.setSize(250, 60);
lblImp.setForeground(Color.CYAN);
lblImp.setText("Imparfait: Practice");
lblImp.setFont(new Font ("Arial", Font.BOLD, 18));
add(lblImp);

lblFP= new JLabel();
lblFP.setLocation(1150, 100);
lblFP.setSize(250, 60);
lblFP.setForeground(Color.CYAN);
lblFP.setText("Futur Proche: Practice");
lblFP.setFont(new Font ("Arial", Font.BOLD, 18));
add(lblFP);



txtPC = new JTextArea();
txtPC.setLocation(10, 150);
txtPC.setSize(300, 400);
txtPC.setForeground(Color.BLACK);
txtPC.setFont(new Font ("Arial", Font.ITALIC, 16));
txtPC.setEditable(false);
txtPC.setText("1. Ils (écrire) _________" +
" un livre.\n\n\n" +
"2. Juliette (regarder) ________" +
" un film.\n\n\n" +
"3. Est-ce que Pierre (finir) _______" +
" à \n16 heures?\n\n\n" +
"4. J’(fermer) __________" +
" la fenêtre.\n\n\n" +
"5. François (se lever) _____________" +
" à \n8 heures.\n\nFill in the answers (correspondingly)\n in the box below.\nUse commas+space to seperate your answer.");
 add(txtPC);

txtPres = new JTextArea();
txtPres.setLocation(380, 150);
txtPres.setSize(300, 400);
txtPres.setForeground(Color.BLACK);
txtPres.setFont(new Font ("Arial", Font.ITALIC, 16));
txtPres.setEditable(false);
txtPres.setText("1. Claire (manger) ________" +
" un bonbon.\n\n\n"  +
"2. Vous (voyager) ________" +
" en train.\n\n\n" +
"3. Ils n'(habiter) _______" +
" pas ici.\n\n\n" +
"4. Est-ce que tu (apprendre) _______\n" +
" le français?\n\n\n" +
"5. Je ne (comprendre) ________" +
" pas.\n\nFill in the answers (correspondingly)\n in the box below.\nUse commas+space to seperate your answer.");
 add(txtPres);

txtImp = new JTextArea();
txtImp.setLocation(780, 150);
txtImp.setSize(300, 400);
txtImp.setForeground(Color.BLACK);
txtImp.setFont(new Font ("Arial", Font.ITALIC, 16));
txtImp.setEditable(false);
txtImp.setText("1. En 1994, j’(habiter) _______" +
" à Toulouse.\n\n\n" +
"2. Pendant notre enfance, nous (jouer) _______\n" +
" au tennis.\n\n\n" +
"3. Est-ce que tu (finir) ______" +
" toujours à \n18 heures?\n\n\n" +
"4. Tous les jours, elle lui (rendre) ________\n" +
" visite.\n\n\n" +
"5. Vous (aller) ______" +
" souvent au cinéma.\n\nFill in the answers (correspondingly)\n in the box below.\nUse commas+space to seperate your answer.");
 add(txtImp);

txtFP = new JTextArea();
txtFP.setLocation(1150, 150);
txtFP.setSize(500, 400);
txtFP.setForeground(Color.BLACK);
txtFP.setFont(new Font ("Arial", Font.ITALIC, 16));
txtFP.setEditable(false);
txtFP.setText("1. Nous (partir) ______ \n" +
" en vacances demain.\n\n\n" +
"2. Je (écrire) _______ " +
" un mail tout \nde suite.\n\n\n" +
"3. Ils (arriver) _______ " +
" dans \ndeux minutes.\n\n\n" +
"4. Est-ce que tu (rendre)_______ \n" +
" visite à Julie aujourd'hui ?\n\n\n" +
"5. Vous (prendre) ________ " +
" le train.\n\nFill in the answers (correspondingly)\n in the box below.\nUse commas+space to seperate your answer.");
 add(txtFP); 

txtPC2 = new JTextField();
txtPC2.setLocation(10, 550);
txtPC2.setSize(300, 30);
txtPC2.setForeground(Color.BLUE);
txtPC2.setFont(new Font ("Arial", Font.ITALIC, 12));
txtPC2.setText("write answers here");
 add(txtPC2);
 
txtPres2 = new JTextField();
txtPres2.setLocation(380, 550);
txtPres2.setSize(300, 30);
txtPres2.setForeground(Color.BLUE);
txtPres2.setFont(new Font ("Arial", Font.ITALIC, 12));
txtPres2.setText("write answers here");
 add(txtPres2);
 
txtImp2 = new JTextField();
txtImp2.setLocation(800, 550);
txtImp2.setSize(300, 30);
txtImp2.setForeground(Color.BLUE);
txtImp2.setFont(new Font ("Arial", Font.ITALIC, 12));
txtImp2.setText("write answers here");
 add(txtImp2);
 
txtFP2 = new JTextField();
txtFP2.setLocation(1150, 550);
txtFP2.setSize(300, 30);
txtFP2.setForeground(Color.BLUE);
txtFP2.setFont(new Font ("Arial", Font.ITALIC, 12));
txtFP2.setText("write answers here");
 add(txtFP2);

 btnEnter = new JButton();
btnEnter.setText("Enter");
btnEnter.setFont(new Font ("Arial", Font.ITALIC, 12));
btnEnter.setForeground(Color.BLUE);
btnEnter.setSize(60, 55);
btnEnter.setLocation(1000, 50);
btnEnter.setActionCommand("Enter");
btnEnter.addActionListener(this);
add(btnEnter);

btnSolutions = new JButton();
btnSolutions.setText("Solutions");
btnSolutions.setFont(new Font ("Arial", Font.ITALIC, 14));
btnSolutions.setForeground(Color.BLUE);
btnSolutions.setSize(80, 50);
btnSolutions.setLocation(1100, 50);
btnSolutions.setActionCommand("Solutions");
btnSolutions.addActionListener(this);
add(btnSolutions);


btnBack = new JButton();
btnBack.setText("Back");
btnBack.setFont(new Font ("Arial", Font.ITALIC, 14));
btnBack.setForeground(Color.BLUE);
btnBack.setSize(80, 50);
btnBack.setLocation(10, 50);
btnBack.setActionCommand("Back");
btnBack.addActionListener(this);
add(btnBack);
 
 
 
}
// button setup (response/action invoked)
public void actionPerformed (ActionEvent e) {  
        if(e.getActionCommand().equals("Back")){
 
      Menu_Frame f1 = new Menu_Frame();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 800, 1000 ); // set frame size
           f1.setVisible( true ); // display frame
           this.dispose();//closed the current working JFrame 
             
        }
        if(e.getActionCommand().equals("Solutions")){  
      Solutions_Frame f1 = new Solutions_Frame();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 800, 1000 ); // set frame size
           f1.setVisible( true ); // display frame
           this.dispose();//closed the current working JFrame 
           
        }
        
 if(e.getActionCommand().equals("Enter")){   
    String strPC2 = txtPC2.getText();
    String strPres2 = txtPres2.getText();
    String strImp2 = txtImp2.getText();
    String strFP2 = txtFP2.getText();
    
    
    if (strPC.equals(strPC2)){
        this.lblIntro.setText("Correct!");
  
    }
    else{
        this.lblIntro.setText("One or more answers are incorrect (Passe Composee). Try Again!");
        
    }
    
   if (strPres2.equals(strPres)){
        this.lblIntro.setText("Correct!");
  
    }
    else{
        this.lblIntro.setText("One or more answers are incorrect (Present Tense). Try Again!");
        
    }    
 if (strImp2.equals(strImp)){
        this.lblIntro.setText("Correct!");
  
    }
    else{
        this.lblIntro.setText("One or more answers are incorrect. (Imparfait) Try Again!");
        
    }
 if (strFP2.equals(strFP)){
        this.lblIntro.setText("Correct!");
  
    }
    else{
        this.lblIntro.setText("One or more answers are incorrect. (Futur Proche) Try Again!");
        
    }
    
  

        
    }
    
 
    
    
 }
    
}

       
        
    
 
 
     
 
        
 
  
  





