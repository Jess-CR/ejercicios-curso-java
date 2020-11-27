import javax.swing.*;
import java.awt.event.*;

public class Ejercicio34 extends JFrame implements ItemListener{

  private JComboBox combobox1;
  
  public Ejercicio34(){
   setLayout(null);
   combobox1 = new JComboBox();
   combobox1.setBounds(10,10,80,20);
   add(combobox1);

   combobox1.addItem("rojo");
   combobox1.addItem("verde");
   combobox1.addItem("azul");
   combobox1.addItem("amarillo");
   combobox1.addItem("negro");
   combobox1.addItemListener(this);
 }  

  public void itemStateChanged(ItemEvent e){
  if(e.getSource() == combobox1){
   String seleccion = combobox1.getSelectedItem().toString();
   setTitle(seleccion);   
 }
} 
  public static void main(String args []){
  Ejercicio34 formulario1 = new Ejercicio34();
  formulario1.setBounds(0,0,500,150);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
}
}