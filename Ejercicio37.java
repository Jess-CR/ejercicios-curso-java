import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio37 extends JFrame implements ActionListener{
  private JMenuBar menubar;
  private JMenu menu1, menu2, menu3;
  private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4;

  public Ejercicio37(){
    setLayout(null);
    menubar = new JMenuBar();
    setJMenuBar (menubar);

    menu1 = new JMenu("Opciones");
    menubar.add(menu1);

    menu2 = new JMenu("Tamaño de la ventana");
    menu1.add(menu2);

    menu3 = new JMenu("Color de fondo");
    menu1.add(menu3);

    menuitem1 = new JMenuItem("300*200");
    menuitem1.addActionListener(this);
    menu2.add(menuitem1);

    menuitem2 = new JMenuItem("640*480");
    menuitem2.addActionListener(this);
    menu2.add(menuitem2);

    menuitem3 = new JMenuItem("Rojo");
    menuitem3.addActionListener(this);
    menu3.add(menuitem3);

    menuitem4 = new JMenuItem("Verde");
    menuitem4.addActionListener(this);
    menu3.add(menuitem4);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == menuitem1){
      setSize(300,200);
    }
    if(e.getSource() == menuitem2){
      setSize(640,480); 
    }
    if(e.getSource() == menuitem3){
      getContentPane().setBackground(new Color (255,0,0));
    }
    if(e.getSource() == menuitem4){
      getContentPane().setBackground (new Color (0,255,0));
    }
  }

  public static void main (String args[]){
    Ejercicio37 formulario = new Ejercicio37();
    formulario.setBounds (0,0,300,200);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
}
}