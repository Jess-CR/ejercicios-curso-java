import javax.swing.*;
import java.awt.event.*;
public class Ejercicio29 extends JFrame implements ActionListener{

  private JButton boton1;
  private JLabel label1;
  private JTextField campo1;

  public Ejercicio29(){
   setLayout(null);
   
   boton1 = new JButton("Aceptar");
   boton1.setBounds(10,80,100,30);
   add(boton1);
   boton1.addActionListener(this);

   label1 = new JLabel("Usuario:");
   label1.setBounds(10,10,100,30);
   add(label1);
   j
   campo1 = new JTextField();
   campo1.setBounds(120,17,150,20);
   add(campo1);
 }

  public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
   String texto = campo1.getText();
   setTitle(texto);
  }
 }

  public static void main(String args[]){
   Ejercicio29 formulario = new Ejercicio29 ();
   formulario.setBounds(0,0,300, 150);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
   
 }
}