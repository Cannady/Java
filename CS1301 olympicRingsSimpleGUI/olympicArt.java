//This program draws the Olympic Symbol.
//Author: Adam Adkins
//Created: 9/11/2014
import javax.swing.JApplet;
import java.awt.*;

public class olympicArt extends JApplet
{
  
  public void paint (Graphics page)
  {
    page.setColor (Color.blue);
    page.fillOval (90,105,80,80);
    page.setColor (Color.white);
    page.fillOval (95,110,70,70);
    
    page.setColor (Color.yellow);
    page.fillOval (120,130,80,80);
    page.setColor (Color.white);
    page.fillOval (125,135,70,70);
    
    page.setColor (Color.black);
    page.fillOval (150,105,80,80);
    page.setColor (Color.white);
    page.fillOval (155,110,70,70);
    
    page.setColor (Color.green);
    page.fillOval (190,130,80,80);
    page.setColor (Color.white);
    page.fillOval (195,135,70,70);
    
    page.setColor (Color.red);
    page.fillOval (210,105,80,80);
    page.setColor (Color.white);
    page.fillOval (215,110,70,70);
    
    
  }
}
