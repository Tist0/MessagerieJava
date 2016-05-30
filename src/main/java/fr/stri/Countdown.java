/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.stri;

import java.awt.BorderLayout;
import java.util.Timer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author Firtorios
 */
public class Countdown extends JFrame {
 
  // Countdown mit 42 Sekunden
  public static int counterValue = 42;
  public static Timer timer;
  public static JLabel label;
 
  public Countdown() {
    initGUI();
  }

private void initGUI(){
    BorderLayout thisLayout = new BorderLayout();
    this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    this.getContentPane().setLayout(thisLayout);
    label = new JLabel();
    label.setText(String.valueOf(counterValue));
    this.getContentPane().add(label, BorderLayout.CENTER);
    this.setTitle("Countdown Example");
      this.pack();
      this.setVisible(true);
  }
}
