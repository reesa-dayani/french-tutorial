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
public class PresentTense_Frame extends JFrame implements ActionListener {
        DecimalFormat x = new DecimalFormat("###.##");

    /**
     * @param args the command line arguments
     */
 
        // TODO code application logic here
    
// Establishing variables for application.
JLabel lblTitle;
JLabel lblIntro;
JLabel lblUsage;
JLabel lblConstruction;
JTextArea txtConstruction;
JTextArea txtIntro;
JTextArea txtUsage;
JButton btnBack;
JScrollPane scroller;
//Creating Application name + basic setup
public PresentTense_Frame() {
super( "French Basics 101" );    
setLayout(null); 
getContentPane().setBackground(Color.WHITE);


JScrollPane scroller = new JScrollPane();
this.getContentPane().add(scroller, BorderLayout.CENTER);

//Establishing Title label
lblTitle= new JLabel();
lblTitle.setLocation(220, 50);
lblTitle.setSize(500, 60);
lblTitle.setForeground(Color.MAGENTA);
lblTitle.setText("The Present Tense");
lblTitle.setFont(new Font ("Arial", Font.BOLD, 25));
add(lblTitle);

//Establishing Name Value label
lblIntro= new JLabel();
lblIntro.setLocation(10, 110);
lblIntro.setSize(250, 60);
lblIntro.setForeground(Color.CYAN);
lblIntro.setText("Introduction:");
lblIntro.setFont(new Font ("Arial", Font.BOLD, 30));
add(lblIntro);

txtIntro = new JTextArea();
txtIntro.setLocation(10, 180);
txtIntro.setSize(1300, 60);
txtIntro.setForeground(Color.BLACK);
txtIntro.setFont(new Font ("Arial", Font.PLAIN, 16));
txtIntro.setEditable(false);
txtIntro.setText("The présent corresponds to the present tense in English. \nWe mostly use this tense to speak about the present. \nIn this lesson we will be learning how to form and use present tense.");
    add(txtIntro);
    
lblUsage = new JLabel();
lblUsage.setLocation(10, 210);
lblUsage.setSize(250, 100);
lblUsage.setForeground(Color.CYAN);
lblUsage.setText("Usage:");
lblUsage.setFont(new Font ("Arial", Font.BOLD, 25));
add(lblUsage);

txtUsage = new JTextArea();
txtUsage.setLocation(10, 275);
txtUsage.setSize(900, 250);
txtUsage.setForeground(Color.BLUE);
txtUsage.setFont(new Font ("Arial", Font.ITALIC, 16));
txtUsage.setEditable(false);
txtUsage.setText("The present tense is used to express: \n**fact or condition in the present**\n" +
"Example:\t" +
"Le garçon s'appelle Félix.\n\n" +
"**action that takes place in the present once, multiple times, or never:**\n" +
"Example:\t" +
"Tous les mardis, il va à l'entraînement de football.\n\n" +
"**action that expresses how long something has been going on for:**\n" +
"Example:\t" +
"Il joue au football depuis cinq ans.\n\n" +
"**action in the future that is already planned or agreed upon (requires a specific mention of a future time):**\n" +
"Example:\t" +
"Mardi prochain à 14 heures, son équipe a un match important.");
 add(txtUsage);

 lblConstruction = new JLabel();
lblConstruction.setLocation(10, 460);
lblConstruction.setSize(250, 180);
lblConstruction.setForeground(Color.CYAN);
lblConstruction.setText("Construction:");
lblConstruction.setFont(new Font ("Arial", Font.BOLD, 25));
add(lblConstruction);

 txtConstruction = new JTextArea();
txtConstruction.setLocation(10, 580);
txtConstruction.setSize(900, 250);
txtConstruction.setForeground(Color.BLACK);
txtConstruction.setFont(new Font ("Arial", Font.ITALIC, 16));
txtConstruction.setEditable(false);
txtConstruction.setText("To form the present tense, remove the infinitive ending and add the following endings, depending on verb group:\n"
+"\t\tER verbs\tIR verbs\t\tRE verbs\n\n1st person singular	j’aime	je finis	\tje vends\n" +
"2nd person singular	tu aimes	  tu finis	        \ttu vends\n" +
"3rd person singular	il/elle/on aime	  il/elle/on finit      \til/elle/on vend\n" +
"1st person plural	nous aimons	  nous finissons        \tnous vendons\n" +
"2nd person plural	vous aimez	  vous finissez	        \tvous vendez\n" +
"3rd person plural	ils/elles aiment  ils/elles finissent	ils/elles vendent");
 add(txtConstruction);

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
  
            if(e.getActionCommand().equals("Back")){
      Lesson_Frame f1 = new Lesson_Frame();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 800, 1000 ); // set frame size
           f1.setVisible( true ); // display frame
           this.dispose();//closed the current working JFrame 
        }
        
        }
}
}

