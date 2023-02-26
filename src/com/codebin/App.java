package com.codebin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
   private JButton button1;
   private JPanel panelMain;
   private JTextField a;
   private JTextField b;

   public App(){
      button1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent actionEvent) {
            Integer aI = Integer.valueOf(a.getText());
            Integer bI = Integer.valueOf(b.getText());
            JOptionPane.showMessageDialog(null,aI*bI);
         }
      });
   }

   public static void main(String[] args) {
      App h = new App();
      h.setContentPane(h.panelMain);
      h.setTitle("hola");
      h.setSize(400,300);
      h.setVisible(true);
      h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
