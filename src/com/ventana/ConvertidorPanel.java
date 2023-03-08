/**
 * Esta clase es la parte gráfica de la aplicación.
 */
package com.ventana;

import javax.swing.*;
import java.awt.*;

public class ConvertidorPanel extends JPanel {
   String s [] = {"Dolar","Euro","Peso","Libra","Real"};
   JLabel label1;
   JLabel resultado;
   public ConvertidorPanel(JComboBox a, JComboBox b, JButton buton1, JTextField txt) {
      setLayout(new FlowLayout());
      a.setModel(new DefaultComboBoxModel(s));
      b.setModel(new DefaultComboBoxModel(s));
      label1 = new JLabel("a");
      resultado = new JLabel();
      txt.setColumns(4);
      this.add(a);
      this.add(label1);
      this.add(b);
      this.add(txt);
      this.add(buton1);
      this.add(resultado);
   }

   public void setResultado(String resultado) {
      this.resultado.setText(resultado);
   }
}
