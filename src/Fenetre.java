import javax.swing.JFrame;
 
public class Fenetre extends JFrame {
  public Fenetre(){                
    this.setTitle("Ma première fenêtre Java");
    this.setSize(1000, 1000);
    this.setLocationRelativeTo(null);               
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(new Panneau());

    this.setVisible(true);
  }     
}