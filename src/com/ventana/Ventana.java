/**
 * Ventana.java
 * Esta ventana es la que se encarga de mostrar la interfaz gráfica de usuario
 * Y nos mostrara dos JComboBox y un boton para hacer un cambio de divisas
 */
package com.ventana;

import javax.swing.*;
import java.awt.event.*;
//Importa la clase convertidorPanel

public class Ventana extends JFrame {

   public static void main(String[] args) {
      Ventana v = new Ventana();
      JComboBox comboBox1 = new JComboBox();
      JComboBox comboBox2 = new JComboBox();
      JButton button = new JButton("convertir");
      JTextField txt = new JTextField();
      ConvertidorPanel panelMain = new ConvertidorPanel(comboBox1,comboBox2,button,txt);

      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent actionEvent) {
            String seleccionA=  comboBox1.getSelectedItem().toString();
            String seleccionB=  comboBox2.getSelectedItem().toString();
            Double txt1 = Double.valueOf(txt.getText());
            double resultado = Controlador.dolarApeso(txt1);
            System.out.println(resultado);
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
