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
public class Menu_Frame extends JFrame implements ActionListener {
        DecimalFormat x = new DecimalFormat("###.##");

    /**
     * @param args the command line arguments
     */
 
        // TODO code application logic here
    
// Establishing variables for application.
JLabel lblTitle;
JLabel lblIntro; 
JLabel lblImage;
JButton btnLesson;
JButton btnPractice;
ImageIcon icon = new ImageIcon("thumbsup.jpg");//adding images
//Creating Application name + basic setup
public Menu_Frame() {
super( "French Basics 101" );    
setLayout(null); 
getContentPane().setBackground(Color.WHITE);
  
//Establishing Title label
lblTitle= new JLabel();
lblTitle.setLocation(190, 50);
lblTitle.setSize(500, 60);
lblTitle.setForeground(Color.MAGENTA);
lblTitle.setText("pls END MEEEEEEEEE ");
lblTitle.setFont(new Font ("Arial", Font.BOLD, 40));
add(lblTitle);


lblIntro= new JLabel();
lblIntro.setLocation(120, 100);
lblIntro.setSize(900, 120);
lblIntro.setForeground(Color.BLACK);
lblIntro.setText("gimme my credit k pls thx >:,( ");
lblIntro.setFont(new Font ("Arial", Font.BOLD, 24));
add(lblIntro);

lblImage= new JLabel();
lblImage.setLocation(260, 10);
lblImage.setSize(400, 900);
lblImage.setForeground(Color.BLACK);
lblImage.setIcon(icon);
lblImage.setFont(new Font ("Arial", Font.BOLD, 24));
add(lblImage); 
   
btnLesson = new JButton();
btnLesson.setText("Lesson");
btnLesson.setFont(new Font ("Arial", Font.PLAIN, 30));
btnLesson.setSize(220, 190);
btnLesson.setLocation(10, 320);
btnLesson.setActionCommand("Lesson");
btnLesson.addActionListener(this);
add(btnLesson);

btnPractice = new JButton();
btnPractice.setText("Practice!/Quiz");
btnPractice.setFont(new Font ("Arial", Font.PLAIN, 30));
btnPractice.setSize(220, 190);
btnPractice.setLocation(550, 320);
btnPractice.setActionCommand("Practice/Quiz!");
btnPractice.addActionListener(this);
add(btnPractice);


}
// button setup (response/action invoked)
public void actionPerformed (ActionEvent e) {  
        if(e.getActionCommand().equals("Lesson")){
            Lesson_Frame f1 = new Lesson_Frame();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 800, 1000 ); // set frame size
           f1.setVisible( true ); // display frame
           this.dispose();//closed the current working JFrame
        }
        
      
        if(e.getActionCommand().equals("Practice/Quiz!")){
            Practice_frame f1 = new Practice_frame();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 1500, 1000 ); // set frame size
           f1.setVisible( true ); // display frame
           this.dispose();//closed the current working JFrame
}
}
}
