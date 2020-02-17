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
public class FP_frame extends JFrame implements ActionListener {
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
public FP_frame() {
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
lblTitle.setText("The Futur Proche Tense:");
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
txtIntro.setText("The French near future—futur proche—is a verb construction \nthat is used to express something that is going to happen soon, \nan upcoming event that will occur in the near future. \nIn this lesson we will be learning how to form and use the imparfait tense.");
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
txtUsage.setText("The futur proche, or near future, is formed by combining the present of aller, \nwhich means \"to go,\" with the infinitive of the action verb, \na single word that is the basic, unconjugated form of the verb.\n\n"
+"Example: \tJe vais voir Luc. > I'm going to see Luc.\n" +
"Example: \tIl va arriver. > He's going to arrive.\n" +
"Example: \tNous allons manger. > We're going to eat.\n" +
"Example: \tJe vais étudier. > I am going to study.\n" +
"Example: \tVas-tu nous aider? > Are you going to help us?\n" +
"Example: \tNous allons partir dans cinq minutes. > We're going to leave in five minutes.");
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
txtConstruction.setText("To form the present tense, write the subject + conjugated present tense of aller + uncojugated (infinitive verb)\n\n"
+ "Je\tvais\tmanger\nTu\tvas\tmanger\nIl/Elle\tva\tmanger\nNous\tallons\tmanger\nVous\tallez\tmanger\nIls/Elles\tvont\tmanger.");
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

