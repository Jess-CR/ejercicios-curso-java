import javax.swing.*;
import java.awt.event.*;

public class Ejercicio32 extends JFrame implements ActionListener{
  
  private JTextField textfield1;
  private JTextArea textarea1;
  private JScrollPane scrollpane1;
  private JButton button1;
 
  String texto = "";

  public Ejercicio32(){
    setLayout(null);
    textfield1 = new JTextField();
    textfield1.setBounds(10,10,200,30);
    add(textfield1);  
 
    button1 = new JButton("Agregar");
    button1.setBounds(250,10,100,30);
    add(button1);
    button1.addActionListener(this);

    textarea1 = new JTextArea();
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(10,50,400,300);
    add(scrollpane1);
  } 

  public void actionPerformed(ActionEvent e){
   if(e.getSource()==button1){
    texto += textfield1.getText() + "\n";
    textarea1.setText(texto);
    textfield1.setText("");
  }
 }
 public static void main(String args[]){
  Ejercicio32 formulario = new Ejercicio32();
  formulario.setBounds(0,0,540,400);
  formulario.setResizable(false);
  formulario.setVisible(true);
  formulario.setLocationRelativeTo(null);

 }
}