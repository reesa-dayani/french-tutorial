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
public class PasseComposee_Frame extends JFrame implements ActionListener {
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
public PasseComposee_Frame() {
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
lblTitle.setText("The Passe Composee:");
lblTitle.setFont(new Font ("Arial", Font.BOLD, 30));
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
txtIntro.setSize(1300, 130);
txtIntro.setForeground(Color.GREEN.darker());
txtIntro.setFont(new Font ("Arial", Font.PLAIN, 14));
txtIntro.setEditable(false);
txtIntro.setText("The passé composé is known is the 'simple past' tense English. \nWe use it to indicate that an action in the past has been completed. \nWe use this form in particular to emphasise the results or consequences of the action done.\n" +
"\n" +
"In everyday language, the passé composé is also often used instead of the passé simple. \t\tIrregular Verbs: 'DR. MRS VANDERTRAMP' (Devenir Revenir (DR.), Mourir, Rentrer, Sortir (MRS), \nIn this lesson, we will be learning about the regular and irregular conjugations of the passe composee.\tVenir, Arreter, Naitre, Descendre, Entrer, Retourner, Tomber, Rester, Aller, Monter Partir");
    add(txtIntro);
    
lblUsage = new JLabel();
lblUsage.setLocation(10, 280);
lblUsage.setSize(250, 100);
lblUsage.setForeground(Color.CYAN);
lblUsage.setText("Usage:");
lblUsage.setFont(new Font ("Arial", Font.BOLD, 25));
add(lblUsage);

txtUsage = new JTextArea();
txtUsage.setLocation(10, 350);
txtUsage.setSize(900, 180);
txtUsage.setForeground(Color.BLUE);
txtUsage.setFont(new Font ("Arial", Font.ITALIC, 16));
txtUsage.setEditable(false);
txtUsage.setText(
"The Passe Composee tense is used for a single, completed action in the past, "
        + "\nwith the emphasis on the result or consequences of the action. "
        + "\n\nExample: \nHier, Michel a rangé son bureau \nResult: "
        + "'The office is clean now.' \n\nIl a décidé de ranger son bureau chaque semaine. "
        + "\nResult: He doesn’t want to be so untidy anymore");
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
txtConstruction.setText("The Regular Conjugation (used in most verbs) and irregular conjugation consist of a basic structure: \n"
        + "Subject + Present Participle of Avoir/Etre + Past Participle.\n\n "
        + "The subject\tThe Participle\tExample\n\n j'/je\tai/suis\t\t--- j'ai/je suis mangé(e), \ntu\tas/es\t\t--- tu as/es mangé(e)(s)\nil/elle\ta/est\t\t ---il/elle a/ est mangé(e)\n"
+ "nous\tavons/sommes\t---nous avons/sommes mangé(s)\nvous\tavez/etes\t\t---vous avez/etes mangé(e)(s)\nils/elles\tont/sont\t\t---ils/elles ont/sont mangé(e)(s)");
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

