/**
 * Ventana.java
 * Esta clase de java es un programa para calcular el cambio de divisas.
 */
package com.ventana;

import javax.swing.*;
import java.awt.event.*;
import java.util.Locale;

public class Ventana extends JFrame {

   public static void main(String[] args) {
      Ventana v = new Ventana();
      JComboBox comboBox1 = new JComboBox();
      JComboBox comboBox2 = new JComboBox();
      JButton button = new JButton("convertir");
      JTextField txt = new JTextField();
      ConvertidorPanel panelMain = new ConvertidorPanel(comboBox2,comboBox1,button,txt);

      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent actionEvent) {
            String seleccionA=  comboBox1.getSelectedItem().toString().toUpperCase();
            String seleccionB=  comboBox2.getSelectedItem().toString().toUpperCase();
            Double txt1 = Double.valueOf(txt.getText());
            Double resultado = DivisasControl.convierte(DivisasControl.Divisas.valueOf(seleccionA),DivisasControl.Divisas.valueOf(seleccionB),txt1);
            panelMain.setResultado(String.valueOf(resultado));
            System.out.format("De: %s, a: %s", seleccionA, seleccionB);
         }
      });

      v.setContentPane(panelMain);
      v.setTitle("Conversor de divisas");
      v.setSize(400,300);
      v.setVisible(true);
      v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

}
