import javax.swing.*;

 public class Formulario26 extends JFrame{

  private JLabel etiqueta1;
  private JLabel etiqueta2;

  public Formulario26(){
    setLayout(null);
    etiqueta1= new JLabel("Interfaz gráfica");
    etiqueta1.setBounds(10,20,300,30);
    add(etiqueta1);
    etiqueta2 = new JLabel("Versión 1.0");
    etiqueta2.setBounds(10,100,100,30);
    add(etiqueta2);
 }
  public static void main (String args[]){ 
   Formulario26 formulario1 = new Formulario26();
   formulario1.setBounds(0,0,300,200);
   formulario1.setResizable(true);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
 }
}