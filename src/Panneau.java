import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
  public void paintComponent(Graphics g){
    try {
      int posX, posY,Xmaison=-1,Ymaison=-1 ;
      // 0 : herbe , 2 chemin vert, 1: chemin hor, 3: virage bas gacuhe, 4 virage bas droite, 5 , virage haut gauche , 6 virage haut droite
      int tab[][] = { {0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {1,1,1,1,1,1,3,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,2,0,0,0,0,0,9,0},
                      {0,0,10,0,0,0,2,0,11,0,9,0,8,0},
                      {0,0,0,0,0,0,2,0,0,0,8,0,0,0},
                      {0,0,0,0,0,0,2,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,6,1,1,1,1,1,3,0},
                      {0,7,0,0,0,0,0,0,0,0,0,0,2,0},
                      {0,0,0,0,0,0,0,0,4,1,1,1,5,0},
                      {0,0,0,0,0,0,0,0,2,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,2,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,2,0,0,0,0,0},};


      Image chemin_vert = ImageIO.read(new File("chemin_verticale.png"));
      Image chemin_hor = ImageIO.read(new File("chemin_horizontale.png"));
      Image virage_bas_gauche = ImageIO.read(new File("virage_bas_gauche.png"));
      Image virage_bas_droite = ImageIO.read(new File("virage_bas_droite.png"));
      Image virage_haut_gauche = ImageIO.read(new File("virage_haut_gauche.png"));
      Image virage_haut_droite = ImageIO.read(new File("virage_haut_droite.png"));
      Image herbe = ImageIO.read(new File("herbe.png"));
      Image maison = ImageIO.read(new File("maison.png"));
      Image arbreH = ImageIO.read(new File("arbre_haut.png"));
      Image arbreB = ImageIO.read(new File("arbre_bas.png"));
      Image fraise = ImageIO.read(new File("fraise_face.png"));
      Image shiso = ImageIO.read(new File("shiso_face.png"));

      for (int y=0 ; y <=13 ; y ++){
        posX = y*70;
        for (int x=0 ; x <=11 ; x ++) {
          posY = x*70;
          if( tab[x][y] == 1 ) {
            g.drawImage(chemin_hor, posX , posY, this);
          }
          else if( tab[x][y] ==2 ) {
            g.drawImage(chemin_vert, posX , posY, this);
          }
          else if( tab[x][y] == 3){
            g.drawImage(virage_bas_gauche, posX , posY, this);
          }
          else if( tab[x][y] ==4 ) {
            g.drawImage(virage_bas_droite, posX , posY, this);
          }
          else if( tab[x][y] == 5){
            g.drawImage(virage_haut_gauche, posX , posY, this);
          }
          else if( tab[x][y] == 6){
            g.drawImage(virage_haut_droite, posX , posY, this);
          }
          else if (tab[x][y] == 0){
            g.drawImage(herbe, posX , posY, this);
          }
          else if (tab[x][y] == 7){
            g.drawImage(herbe, posX , posY, this);
            Xmaison = posX;
            Ymaison = posY;
          }
          else if (tab[x][y] == 8){
            g.drawImage(herbe, posX , posY, this);
            g.drawImage(arbreB, posX , posY, this);
          }
          else if (tab[x][y] == 9){
            g.drawImage(herbe, posX , posY, this);
            g.drawImage(arbreH, posX , posY, this);
          }
          else if (tab[x][y] == 10){
            g.drawImage(herbe, posX , posY, this);
            g.drawImage(fraise, posX , posY, this);
          }
          else if (tab[x][y] == 11){
            g.drawImage(herbe, posX , posY, this);
            g.drawImage(shiso, posX , posY, this);
          }

        }
      }
      if ( (Xmaison != -1) && (Ymaison != -1) ) {
          g.drawImage(maison, Xmaison , Ymaison, this);
        }

      //Pour une image de fond
      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    } catch (IOException e) {
      e.printStackTrace();
    }                
  }               
}
