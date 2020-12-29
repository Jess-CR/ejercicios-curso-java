import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Ejercicio39 extends JFrame implements ActionListener, ChangeListener{
  
  private JLabel label1;
  private JCheckBox check1;
  private JButton button1;

  public Ejercicio39(){
    setLayout(null);
    label1 = new JLabel("Aceptar terminos y condiciones");
    label1.setBounds(10,10,400,30);
    add(label1);

    check1 = new JCheckBox("Acepto");
    check1.setBounds(10,50,100,30);
    check1.addChangeListener(this);
    add(check1);
    
    button1 = new JButton("Continuar");
    button1.setBounds(10,100,100,30);
    add(button1);
    button1.addActionListener(this);
    button1.setEnabled(false);
  }

  public void stateChanged(ChangeEvent e){
    if(check1.isSelected() == true){
       button1.setEnabled(true);
     } else{
       button1.setEnabled(false);
     } 	
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == button1){
      System.exit(0);
    }
  }

public static void main (String args[]){
    Ejercicio39 formulario = new Ejercicio39();
    formulario.setBounds(0,0,400,250);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);  


  }

}