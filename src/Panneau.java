import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
  public void paintComponent(Graphics g){
    try {
      Image img1 = ImageIO.read(new File("chemin_vertical.png"));

      for (int pos=0 ; pos <=5 ; pos ++){
        g.drawImage(img1, pos*70, 70, this);
      }
      int h =0;
      Image img2 = ImageIO.read(new File("fraise_face.png"));
      g.drawImage(img2, 0, h, this);
      g.drawImage(img2, 0, 100, this);
      //Pour une image de fond
      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    } catch (IOException e) {
      e.printStackTrace();
    }                
  }               
}
