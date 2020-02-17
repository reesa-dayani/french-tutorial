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
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;

/**
 *
 * @author reesadayani
 */
public class Solutions_Frame extends JFrame implements ActionListener {
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
String [] strPC = {"ont écrit,", "a regardé", " a fini,", "ai fermé,", " s’est levé,"};
String [] strPres = {"mange,", "voyagez,", "habitent,", "apprends,", "comprends"};
String [] strImp = {"habitais,", "jouions,", "finissais", "rendait,", "alliez,"};
String [] strFP = {"allons partir, ", "vais écrire, ", "vont arriver, ", "vas rendre, ", "allez prendre, "};

//Creating Application name + basic setup
public Solutions_Frame() {
super( "French Basics 101" );    
setLayout(null); 
getContentPane().setBackground(Color.WHITE);



//Establishing Title label
lblTitle= new JLabel();
lblTitle.setLocation(650, 30);
lblTitle.setSize(550, 40);
lblTitle.setForeground(Color.MAGENTA);
lblTitle.setText("Practice Solutions!");
lblTitle.setFont(new Font ("Arial", Font.BOLD, 35));
add(lblTitle);

//Establishing Name Value label
lblIntro= new JLabel();
lblIntro.setLocation(600, 60);
lblIntro.setSize(350, 50);
lblIntro.setForeground(Color.ORANGE);
lblIntro.setText("Fill in the blanks");
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
txtPC.setText("1. Ils ont écrit" +
" un livre.\n\n\n" +
"2. Juliette a regardé" +
" un film.\n\n\n" +
"3. Est-ce que Pierre a fini" +
" à \n16 heures?\n\n\n" +
"4. J'ai fermé" +
" la fenêtre.\n\n\n" +
"5. François s’est levé" +
" à \n8 heures.");
 add(txtPC);

txtPres = new JTextArea();
txtPres.setLocation(380, 150);
txtPres.setSize(300, 400);
txtPres.setForeground(Color.BLACK);
txtPres.setFont(new Font ("Arial", Font.ITALIC, 16));
txtPres.setEditable(false);
txtPres.setText("1. Claire mange" +
" un bonbon.\n\n\n"  +
"2. Vous voyagez" +
" en train.\n\n\n" +
"3. Ils n'habitent" +
" pas ici.\n\n\n" +
"4. Est-ce que tu apprends\n" +
" le français?\n\n\n" +
"5. Je ne comprends" +
" pas.");
 add(txtPres);

txtImp = new JTextArea();
txtImp.setLocation(780, 150);
txtImp.setSize(300, 400);
txtImp.setForeground(Color.BLACK);
txtImp.setFont(new Font ("Arial", Font.ITALIC, 16));
txtImp.setEditable(false);
txtImp.setText("1. En 1994, j’habitais" +
" à Toulouse.\n\n\n" +
"2. Pendant notre enfance, nous jouions\n" +
" au tennis.\n\n\n" +
"3. Est-ce que tu finissais" +
" toujours à \n18 heures?\n\n\n" +
"4. Tous les jours, elle lui rendait\n" +
" visite.\n\n\n" +
"5. Vous alliez" +
" souvent au cinéma.");
 add(txtImp);

txtFP = new JTextArea();
txtFP.setLocation(1150, 150);
txtFP.setSize(500, 400);
txtFP.setForeground(Color.BLACK);
txtFP.setFont(new Font ("Arial", Font.ITALIC, 16));
txtFP.setEditable(false);
txtFP.setText("1. Nous allons partir\n" +
" en vacances demain.\n\n\n" +
"2. Je vais écrire " +
" un mail tout \nde suite.\n\n\n" +
"3. Ils vont arriver " +
" dans \ndeux minutes.\n\n\n" +
"4. Est-ce que tu vas rendre \n" +
" visite à Julie aujourd'hui ?\n\n\n" +
"5. Vous allez prendre" +
" le train.\n\n");
 add(txtFP); 




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
        if(e.getActionCommand().equals("Back")){
 
      Practice_frame f1 = new Practice_frame();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 800, 1000 ); // set frame size
           f1.setVisible( true ); // display frame
           this.dispose();//closed the current working JFrame 
           
        }
}
}


