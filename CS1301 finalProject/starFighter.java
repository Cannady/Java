// This draws the Space Ship. Also contains the Mouse Listener.
// Author: Adam Adkins
// Created: 11/15/2014

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class starFighter extends JPanel
{
  
//main body
  private int[] ref = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
  private int[] xLine= {150,150,145,130,120,55,65,150};
  private int[] yLine={60,55,50,45,35,35,60,60};
  
//tail end
  private int[] ref2 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
  private int[] xLine2 = {65,55,50,40,25,30,65};
  private int[] yLine2 = {60,35,15,15,10,60,60};
  
//front window
  private int[] ref3 = {0,0,0,0,0,0,0,0,0,0};
  private int[] xLine3 = {130,115,115,120,130};
  private int[] yLine3 = {45,45,40,35,45};
  
//far right small window
  private int[] ref4 = {0,0,0,0,0,0,0,0};
  private int[] xLine4 = {105,100,100,105};
  private int[] yLine4 = {45,45,40,40};
  
// middle small window
  private int[] ref5 = {0,0,0,0,0,0,0,0};
  private int[] xLine5 = {90,85,85,90};
  private int[] yLine5 = {45,45,40,40};
  
//far left small window
  private int[] ref6 = {0,0,0,0,0,0,0,0};
  private int[] xLine6 = {75,70,70,75};
  private int[] yLine6 = {45,45,40,40};
  
//door 
  private int[] ref7 = {0,0,0,0,0,0,0,0};
  private int[] xLine7 = {115,115,110,110};
  private int[] yLine7 = {60,50,50,60};
  
//V Logo on tail end (Part 1)
  private int[] ref8 = {0,0,0,0,0,0};
  private int[] xLine8 = {40,50,45};
  private int[] yLine8 = {45,25,25};
  
//V Logo on tail end (Part 2)
  private int[] ref9 = {0,0,0,0,0,0};
  private int[] xLine9 = {40,30,35};
  private int[] yLine9 = {45,25,25};
  
//rocket part on end
  private int[] ref10 = {0,0,0,0,0,0,0,0};
  private int[] xLine10 = {30,30,25,25};
  private int[] yLine10 = {55,40,40,55};
  
 //lines on rocket(Part 1)
  private int[] ref11 = {0,0,0,0};
  private int[] xLine11 = {30,25};
  private int[] yLine11 = {50,50};
  
//lines on rocket(Part 2)
  private int[] ref12 = {0,0,0,0};
  private int[] xLine12 = {30,25};
  private int[] yLine12 = {45,45};
  
//rocket flame(Part 1)
  private int[] ref14 = {0,0,0,0,0,0};
  private int[] xLine14 = {25,5,25};
  private int[] yLine14 = {50,47,45};
  
//rocket flame(Part 2)
  private int[] ref13 = {0,0,0,0,0,0};
  private int[] xLine13 = {25,5,25};
  private int[] yLine13 = {40,47,55};
  
//Number 2 on tail end
  private int[] ref15 = {0,0,0,0,0,0,0,0,0,0};
  private int[] xLine15 = {55,45,55,50,45};
  private int[] yLine15 = {55,55,45,40,45};
  
//front wheel axle
  private int[] ref16 = {0,0,0,0};
  private int[] xLine16 = {135,135};
  private int[] yLine16 = {60,65};
  
//front wheel
  private int[] ref17 = {0,0,0,0,0,0,0,0,0,0};
  private int[] xLine17 = {135,140,135,130,135};
  private int[] yLine17 = {65,70,75,70,65};

//back wheel axle
  private int[] ref18 = {0,0,0,0};
  private int[] xLine18 = {80,80};
  private int[] yLine18 = {60,65};

//back wheel
  private int[] ref19 = {0,0,0,0,0,0,0,0,0,0};
  private int[] xLine19 = {80,85,80,75,80};
  private int[] yLine19 = {65,70,75,70,65};
//******************************************************************************************************  
  // Set Position that gets read at the begining of drawing the paintComponent. 
   public void setPos (){
// main body
     xLine[0] = ref[0] + 150;
     yLine[0] = ref[1] + 60;
     xLine[1] = ref[2] + 150;
     yLine[1] = ref[3] + 55;
     xLine[2] = ref[4] + 145;
     yLine[2] = ref[5] + 50;
     xLine[3] = ref[6] + 130;
     yLine[3] = ref[7] + 45;
     xLine[4] = ref[8] + 120;
     yLine[4] = ref[9] + 35;
     xLine[5] = ref[10] + 55;
     yLine[5] = ref[11] + 35;
     xLine[6] = ref[12] + 65;
     yLine[6] = ref[13] + 60;
     xLine[7] = ref[14] + 150;
     yLine[7] = ref[15] + 60;
// tail end
    xLine2[0] = ref2[0] + 65;
    yLine2[0] = ref2[1] + 60;
    xLine2[1] = ref2[2] + 55;
    yLine2[1] = ref2[3] + 35;
    xLine2[2] = ref2[4] + 50;
    yLine2[2] = ref2[5] + 15;
    xLine2[3] = ref2[6] + 40;
    yLine2[3] = ref2[7] + 15;
    xLine2[4] = ref2[8] + 25;
    yLine2[4] = ref2[9] + 10;
    xLine2[5] = ref2[10] + 30;
    yLine2[5] = ref2[11] + 60;
    xLine2[6] = ref2[12] + 65;
    yLine2[6] = ref2[13] + 60;
// front window
    xLine3[0] = ref3[0] + 130;
    yLine3[0] = ref3[1] + 45;
    xLine3[1] = ref3[2] + 115;
    yLine3[1] = ref3[3] + 45;
    xLine3[2] = ref3[4] + 115;
    yLine3[2] = ref3[5] + 40;
    xLine3[3] = ref3[6] + 120;
    yLine3[3] = ref3[7] + 35;
    xLine3[4] = ref3[8] + 130;
    yLine3[4] = ref3[9] + 45;
// far right small window
    xLine4[0] = ref4[0] + 105;
    yLine4[0] = ref4[1] + 45;
    xLine4[1] = ref4[2] + 100;
    yLine4[1] = ref4[3] + 45;
    xLine4[2] = ref4[4] + 100;
    yLine4[2] = ref4[5] + 40;
    xLine4[3] = ref4[6] + 105;
    yLine4[3] = ref4[7] + 40;
// middle small window
    xLine5[0] = ref5[0] + 90;
    yLine5[0] = ref5[1] + 45;
    xLine5[1] = ref5[2] + 85;
    yLine5[1] = ref5[3] + 45;
    xLine5[2] = ref5[4] + 85;
    yLine5[2] = ref5[5] + 40;
    xLine5[3] = ref5[6] + 90;
    yLine5[3] = ref5[7] + 40;
// far left small window
    xLine6[0] = ref6[0] + 75;
    yLine6[0] = ref6[1] + 45;
    xLine6[1] = ref6[2] + 70;
    yLine6[1] = ref6[3] + 45;
    xLine6[2] = ref6[4] + 70;
    yLine6[2] = ref6[5] + 40;
    xLine6[3] = ref6[6] + 75;
    yLine6[3] = ref6[7] + 40;
// door
    xLine7[0] = ref7[0] + 115;
    yLine7[0] = ref7[1] + 60;
    xLine7[1] = ref7[2] + 115;
    yLine7[1] = ref7[3] + 50;
    xLine7[2] = ref7[4] + 110;
    yLine7[2] = ref7[5] + 50;
    xLine7[3] = ref7[6] + 110;
    yLine7[3] = ref7[7] + 60;
// V Logo on tail end (Part 1)
    xLine8[0] = ref8[0] + 40;
    yLine8[0] = ref8[1] + 45;
    xLine8[1] = ref8[2] + 50;
    yLine8[1] = ref8[3] + 25;
    xLine8[2] = ref8[4] + 45;
    yLine8[2] = ref8[5] + 25;
// V Logo on tail end (Part 2)
    xLine9[0] = ref9[0] + 40;
    yLine9[0] = ref9[1] + 45;
    xLine9[1] = ref9[2] + 30;
    yLine9[1] = ref9[3] + 25;
    xLine9[2] = ref9[4] + 35;
    yLine9[2] = ref9[5] + 25;
// rocket part on end
    xLine10[0] = ref10[0] + 30;
    yLine10[0] = ref10[1] + 55;
    xLine10[1] = ref10[2] + 30;
    yLine10[1] = ref10[3] + 40;
    xLine10[2] = ref10[4] + 35;
    yLine10[2] = ref10[5] + 40;
    xLine10[3] = ref10[6] + 25;
    yLine10[3] = ref10[7] + 55;
// lines on rocket(Part 1)
    xLine11[0] = ref11[0] + 30;
    yLine11[0] = ref11[1] + 50;
    xLine11[1] = ref11[2] + 25;
    yLine11[1] = ref11[3] + 50;
// lines on rocket(Part 2)
    xLine12[0] = ref12[0] + 30;
    yLine12[0] = ref12[1] + 45;
    xLine12[1] = ref12[2] + 25;
    yLine12[1] = ref12[3] + 45;
// rocket flame(Part 1)
    xLine14[0] = ref14[0] + 25;
    yLine14[0] = ref14[1] + 50;
    xLine14[1] = ref14[2] + 5;
    yLine14[1] = ref14[3] + 47;
    xLine14[2] = ref14[4] + 25;
    yLine14[2] = ref14[5] + 45;
// rocket flame(Part 2)
    xLine13[0] = ref13[0] + 25;
    yLine13[0] = ref13[1] + 40;
    xLine13[1] = ref13[2] + 5;
    yLine13[1] = ref13[3] + 47;
    xLine13[2] = ref13[4] + 25;
    yLine13[2] = ref13[5] + 55;
// Number 2 on tail end
    xLine15[0] = ref15[0] + 55;
    yLine15[0] = ref15[1] + 55;
    xLine15[1] = ref15[2] + 45;
    yLine15[1] = ref15[3] + 55;
    xLine15[2] = ref15[4] + 55;
    yLine15[2] = ref15[5] + 45;
    xLine15[3] = ref15[6] + 50;
    yLine15[3] = ref15[7] + 40;
    xLine15[4] = ref15[8] + 45;
    yLine15[4] = ref15[9] + 45;
// front wheel axle
    xLine16[0] = ref16[0] + 135;
    yLine16[0] = ref16[1] + 60;
    xLine16[1] = ref16[2] + 135;
    yLine16[1] = ref16[3] + 65;
 // front wheel
    xLine17[0] = ref17[0] + 135;
    yLine17[0] = ref17[1] + 65;
    xLine17[1] = ref17[2] + 140;
    yLine17[1] = ref17[3] + 70;
    xLine17[2] = ref17[4] + 135;
    yLine17[2] = ref17[5] + 75;
    xLine17[3] = ref17[6] + 130;
    yLine17[3] = ref17[7] + 70;
    xLine17[4] = ref17[8] + 135;
    yLine17[4] = ref17[9] + 65;
// back wheel axle
    xLine18[0] = ref[0] + 80;
    yLine18[0] = ref[1] + 60;
    xLine18[1] = ref[2] + 80;
    yLine18[1] = ref[3] + 65;
// back wheel
    xLine19[0] = ref[0] + 80;
    yLine19[0] = ref[1] + 65;
    xLine19[1] = ref[2] + 85;
    yLine19[1] = ref[3] + 70;
    xLine19[2] = ref[4] + 80;
    yLine19[2] = ref[5] + 75;
    xLine19[3] = ref[6] + 75;
    yLine19[3] = ref[7] + 70;
    xLine19[4] = ref[8] + 80;
    yLine19[4] = ref[9] + 65;
  }
//*************************************************************************************************************
  public starFighter(){ 
  setBackground(Color.black);
  setOpaque(false);
  setPreferredSize(new Dimension(1000, 600));
  }
  
  public void paintComponent(Graphics o){
    setPos();
    super.paintComponent(o);
  //main body
    o.setColor(Color.lightGray);
    o.fillPolygon(xLine, yLine, xLine.length);
  //tail end
    o.setColor(Color.blue);
    o.fillPolygon(xLine2, yLine2, xLine2.length);
  //front window
    o.setColor(Color.black);
    o.fillPolygon(xLine3, yLine3, xLine3.length);
  //far right small window
    o.setColor(Color.black);
    o.fillPolygon(xLine4, yLine4, xLine4.length);
  //middle small window
    o.setColor(Color.black);
    o.fillPolygon(xLine5, yLine5, xLine5.length);
  //far left small window
    o.setColor(Color.black);
    o.fillPolygon(xLine6, yLine6, xLine6.length);
  //door
    o.setColor(Color.black);
    o.drawPolyline(xLine7, yLine7, xLine7.length);
  //VLogo
    o.setColor(Color.black);
    o.fillPolygon(xLine8, yLine8, xLine8.length);
    o.setColor(Color.black);
    o.fillPolygon(xLine9, yLine9, xLine9.length);
  //rocket
    o.setColor(Color.yellow);
    o.fillPolygon(xLine10, yLine10, xLine10.length);
  //rocket lines
    o.setColor(Color.black);
    o.drawPolyline(xLine11,yLine11, xLine11.length);
    o.setColor(Color.black);
    o.drawPolyline(xLine12, yLine12, xLine12.length);
  //rocket flame
    o.setColor(Color.orange);
    o.fillPolygon(xLine13, yLine13, xLine13.length);
    o.setColor(Color.red);
    o.fillPolygon(xLine14, yLine14, xLine14.length);
  //2 on tail end
    o.setColor(Color.black);
    o.drawPolyline(xLine15, yLine15, xLine15.length);
     
// Wheels  \/\/\/\/\/\/      
  //front wheel axle
    o.setColor(Color.white);
    o.drawPolyline(xLine16, yLine16, xLine16.length);
  //front wheel
    o.setColor(Color.black);
    o.fillPolygon(xLine17, yLine17, xLine17.length);
  //back wheel axle
    o.setColor(Color.white);
    o.drawPolyline(xLine18, yLine18, xLine18.length);
  //back wheel
    o.setColor(Color.black);
    o.fillPolygon(xLine19, yLine19, xLine19.length);
//  Wheels /\/\/\/\/\/\/\ 
   
    
     this.addMouseListener (new SpaceListener());
     this.addMouseMotionListener (new SpaceListener2());

  }
  private class SpaceListener2 implements MouseMotionListener
  {
    public void mouseDragged (MouseEvent event2) {}
    public void mouseMoved (MouseEvent event2)
    {
    int x2 = event2.getX();
    int y2 = event2.getY();
    System.out.println(event2.getX() + " " + event2.getY());
    ref[0] = x2;
    ref[1] = y2;
    ref[2] = x2;
    ref[3] = y2;
    ref[4] = x2;
    ref[5] = y2;
    ref[6] = x2;
    ref[7] = y2;
    ref[8] = x2;
    ref[9] = y2;
    ref[10] = x2;
    ref[11] = y2;
    ref[12] = x2;
    ref[13] = y2;
    ref[14] = x2;
    ref[15] = y2;
    
    ref2[0] = x2;
    ref2[1] = y2;
    ref2[2] = x2;
    ref2[3] = y2;
    ref2[4] = x2;
    ref2[5] = y2;
    ref2[6] = x2;
    ref2[7] = y2;
    ref2[8] = x2;
    ref2[9] = y2;
    ref2[10] = x2;
    ref2[11] = y2;
    ref2[12] = x2;
    ref2[13] = y2;
    
    ref3[0] = x2;
    ref3[1] = y2;
    ref3[2] = x2;
    ref3[3] = y2;
    ref3[4] = x2;
    ref3[5] = y2;
    ref3[6] = x2;
    ref3[7] = y2;
    ref3[8] = x2;
    ref3[9] = y2;
    
    ref4[0] = x2;
    ref4[1] = y2;
    ref4[2] = x2;
    ref4[3] = y2;
    ref4[4] = x2;
    ref4[5] = y2;
    ref4[6] = x2;
    ref4[7] = y2;
    
    ref5[0] = x2;
    ref5[1] = y2;
    ref5[2] = x2;
    ref5[3] = y2;
    ref5[4] = x2;
    ref5[5] = y2;
    ref5[6] = x2;
    ref5[7] = y2;
    
    ref6[0] = x2;
    ref6[1] = y2;
    ref6[2] = x2;
    ref6[3] = y2;
    ref6[4] = x2;
    ref6[5] = y2;
    ref6[6] = x2;
    ref6[7] = y2;
    
    ref7[0] = x2;
    ref7[1] = y2;
    ref7[2] = x2;
    ref7[3] = y2;
    ref7[4] = x2;
    ref7[5] = y2;
    ref7[6] = x2;
    ref7[7] = y2;
    
    ref8[0] = x2;
    ref8[1] = y2;
    ref8[2] = x2;
    ref8[3] = y2;
    ref8[4] = x2;
    ref8[5] = y2;
    
    ref9[0] = x2;
    ref9[1] = y2;
    ref9[2] = x2;
    ref9[3] = y2;
    ref9[4] = x2;
    ref9[5] = y2;
    
    ref10[0] = x2;
    ref10[1] = y2;
    ref10[2] = x2;
    ref10[3] = y2;
    ref10[4] = x2;
    ref10[5] = y2;
    ref10[6] = x2;
    ref10[7] = y2;
    
    ref11[0] = x2;
    ref11[1] = y2;
    ref11[2] = x2;
    ref11[3] = y2;
    
    ref12[0] = x2;
    ref12[1] = y2;
    ref12[2] = x2;
    ref12[3] = y2;
    
    ref14[0] = x2;
    ref14[1] = y2;
    ref14[2] = x2;
    ref14[3] = y2;
    ref14[4] = x2;
    ref14[5] = y2;
    
    ref13[0] = x2;
    ref13[1] = y2;
    ref13[2] = x2;
    ref13[3] = y2;
    ref13[4] = x2;
    ref13[5] = y2;
    
    ref15[0] = x2;
    ref15[1] = y2;
    ref15[2] = x2;
    ref15[3] = y2;
    ref15[4] = x2;
    ref15[5] = y2;
    ref15[6] = x2;
    ref15[7] = y2;
    ref15[8] = x2;
    ref15[9] = y2;
// Wheels  \/\/\/\/\/\/    
    ref16[0] = x2;
    ref16[1] = y2;
    ref16[2] = x2;
    ref16[3] = y2;
    
    ref17[0] = x2;
    ref17[1] = y2;
    ref17[2] = x2;
    ref17[3] = y2;
    ref17[4] = x2;
    ref17[5] = y2;
    ref17[6] = x2;
    ref17[7] = y2;
    ref17[8] = x2;
    ref17[9] = y2;
    
    ref18[0] = x2;
    ref18[1] = y2;
    ref18[2] = x2;
    ref18[3] = y2;
    
    ref19[0] = x2;
    ref19[1] = y2;
    ref19[2] = x2;
    ref19[3] = y2;
    ref19[4] = x2;
    ref19[5] = y2;
    ref19[6] = x2;
    ref19[7] = y2;
    ref19[8] = x2;
    ref19[9] = y2;
//  Wheels /\/\/\/\/\/\/\      
    
    repaint();
    }
  }
  
      
    
 private class SpaceListener extends MouseAdapter implements MouseListener
  {
    public void mousePressed (MouseEvent event)
    {
    }
    public void mouseClicked (MouseEvent event) {}
    public void mouseReleased (MouseEvent event) {}
    public void mouseEntered (MouseEvent event) 
    {
    int x = event.getX();
    int y = event.getY();
    System.out.println(event.getX() + " " + event.getY());
    ref[0] = x;
    ref[1] = y;
    ref[2] = x;
    ref[3] = y;
    ref[4] = x;
    ref[5] = y;
    ref[6] = x;
    ref[7] = y;
    ref[8] = x;
    ref[9] = y;
    ref[10] = x;
    ref[11] = y;
    ref[12] = x;
    ref[13] = y;
    ref[14] = x;
    ref[15] = y;
    
    ref2[0] = x;
    ref2[1] = y;
    ref2[2] = x;
    ref2[3] = y;
    ref2[4] = x;
    ref2[5] = y;
    ref2[6] = x;
    ref2[7] = y;
    ref2[8] = x;
    ref2[9] = y;
    ref2[10] = x;
    ref2[11] = y;
    ref2[12] = x;
    ref2[13] = y;
    
    ref3[0] = x;
    ref3[1] = y;
    ref3[2] = x;
    ref3[3] = y;
    ref3[4] = x;
    ref3[5] = y;
    ref3[6] = x;
    ref3[7] = y;
    ref3[8] = x;
    ref3[9] = y;
    
    ref4[0] = x;
    ref4[1] = y;
    ref4[2] = x;
    ref4[3] = y;
    ref4[4] = x;
    ref4[5] = y;
    ref4[6] = x;
    ref4[7] = y;
    
    ref5[0] = x;
    ref5[1] = y;
    ref5[2] = x;
    ref5[3] = y;
    ref5[4] = x;
    ref5[5] = y;
    ref5[6] = x;
    ref5[7] = y;
    
    ref6[0] = x;
    ref6[1] = y;
    ref6[2] = x;
    ref6[3] = y;
    ref6[4] = x;
    ref6[5] = y;
    ref6[6] = x;
    ref6[7] = y;
    
    ref7[0] = x;
    ref7[1] = y;
    ref7[2] = x;
    ref7[3] = y;
    ref7[4] = x;
    ref7[5] = y;
    ref7[6] = x;
    ref7[7] = y;
    
    ref8[0] = x;
    ref8[1] = y;
    ref8[2] = x;
    ref8[3] = y;
    ref8[4] = x;
    ref8[5] = y;
    
    ref9[0] = x;
    ref9[1] = y;
    ref9[2] = x;
    ref9[3] = y;
    ref9[4] = x;
    ref9[5] = y;
    
    ref10[0] = x;
    ref10[1] = y;
    ref10[2] = x;
    ref10[3] = y;
    ref10[4] = x;
    ref10[5] = y;
    ref10[6] = x;
    ref10[7] = y;
    
    ref11[0] = x;
    ref11[1] = y;
    ref11[2] = x;
    ref11[3] = y;
    
    ref12[0] = x;
    ref12[1] = y;
    ref12[2] = x;
    ref12[3] = y;
    
    ref14[0] = x;
    ref14[1] = y;
    ref14[2] = x;
    ref14[3] = y;
    ref14[4] = x;
    ref14[5] = y;
    
    ref13[0] = x;
    ref13[1] = y;
    ref13[2] = x;
    ref13[3] = y;
    ref13[4] = x;
    ref13[5] = y;
    
    ref15[0] = x;
    ref15[1] = y;
    ref15[2] = x;
    ref15[3] = y;
    ref15[4] = x;
    ref15[5] = y;
    ref15[6] = x;
    ref15[7] = y;
    ref15[8] = x;
    ref15[9] = y;
// Wheels  \/\/\/\/\/\/
    ref16[0] = x;
    ref16[1] = y;
    ref16[2] = x;
    ref16[3] = y;
    
    ref17[0] = x;
    ref17[1] = y;
    ref17[2] = x;
    ref17[3] = y;
    ref17[4] = x;
    ref17[5] = y;
    ref17[6] = x;
    ref17[7] = y;
    ref17[8] = x;
    ref17[9] = y;
    
    ref18[0] = x;
    ref18[1] = y;
    ref18[2] = x;
    ref18[3] = y;
    
    ref19[0] = x;
    ref19[1] = y;
    ref19[2] = x;
    ref19[3] = y;
    ref19[4] = x;
    ref19[5] = y;
    ref19[6] = x;
    ref19[7] = y;
    ref19[8] = x;
    ref19[9] = y;
//  Wheels /\/\/\/\/\/\/\    
    repaint();
    }
    public void mouseExited (MouseEvent event) {}
  } 
}

