// Panels & Such for workLoadCounter
// Author: Adam Adkins
// Created: 5/25/2015

// Password , Printer, Labtop, Other
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.text.*;
import java.io.*;
//import java.io.Writer.*;

public class theInsides extends JPanel
{
  private JPanel bigPanel, topSpacer, nameHolderBox, midSpacer, passwordHolderBox;
  private JPanel printerHolderBox, laptopHolderBox, otherHolderBox, anotherSpacer;
  private JPanel passwordCounterBox, printerCounterBox, laptopCounterBox, otherCounterBox;
  private JPanel smallSpacer1, smallSpacer2, smallSpacer3;
  private JTextField nameBox;
  private JLabel nameInstructions, passwordCountLabel, printerCountLabel, laptopCountLabel, otherCountLabel;
  public JLabel nameLabel;
  int nameSize, passwordCount, printerCount, laptopCount, otherCount;
  String nameString ="";
  private JButton passwordButton, printerButton, laptopButton, otherButton;
  int fluxLength = nameSize+200;
  FileWriter file = new FileWriter("workerCounter.txt");
  //BufferedWriter out = new BufferedWriter(file);
  
  PrintWriter out = new PrintWriter(file);
  /*   
        out.println("Breeder: "+stringList);
        out.println("Gecko Name: "+stringList2);
        out.println("Born: "+stringList6+","+stringList7+" "+stringList8);
        out.println("Acquired :"+stringList9+","+stringList10+" "+stringList11);
        out.println("Died: "+stringList12+","+stringList13+" "+stringList14);
        out.println("Sire Name: "+stringList3);
        out.println("Dam Name: "+stringList4);
        out.println("Gender: "+stringList5);
        */
    private class liz implements ActionListener 
  {
    public void actionPerformed(ActionEvent e)
    {
     // Object source = e.getSource();
      nameString = nameBox.getText();
      nameSize = (nameString.length())*2;
      nameBox.setText("");
      nameLabel.setText(nameString);
      nameLabel.setPreferredSize(new Dimension(fluxLength,30));
      nameHolderBox.setVisible(false);
      System.out.println("Name: "+nameString);
      
      out.print((new String()).getBytes());
      out.println("Name: "+nameString);
      out.flush();
      repaint();
    }
  }
    
    private class liz2 implements ActionListener
  {   
    public void actionPerformed(ActionEvent e)
    {
      passwordCount+=1;
      passwordCountLabel.setText(Integer.toString(passwordCount));
      System.out.println("Name: "+nameString);
      System.out.println("Password Count: "+Integer.toString(passwordCount));
      out.println("Password Count: "+Integer.toString(passwordCount));
      out.flush();
      passwordCountLabel.repaint();
    }
  }
        private class liz3 implements ActionListener
  {   
    public void actionPerformed(ActionEvent e)
    {
      printerCount+=1;
      printerCountLabel.setText(Integer.toString(printerCount));
      printerCountLabel.repaint();
    }
  }
        
        private class liz4 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      laptopCount+=1;
      laptopCountLabel.setText(Integer.toString(laptopCount));
      laptopCountLabel.repaint();
    }
  } 
        private class liz5 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      otherCount+=1;
      otherCountLabel.setText(Integer.toString(otherCount));
      otherCountLabel.repaint();
    }
  }      
 
  public theInsides() throws IOException 
  {
    setOpaque(false);
 // Text Field
    nameBox = new JTextField(25);
    liz listeny = new liz();
    nameBox.addActionListener(listeny);
    
 // Labels
    nameInstructions = new JLabel("Enter your name: ");
    nameInstructions.setPreferredSize(new Dimension(120,50));
    nameInstructions.setForeground(Color.white);
    nameInstructions.setFont(new Font("Sans Serif",Font.PLAIN,15));
    
    passwordCountLabel = new JLabel("0");
    passwordCountLabel.setPreferredSize(new Dimension(120,50));
    passwordCountLabel.setForeground(Color.white);
    passwordCountLabel.setBackground(new Color(1,56,147,255));
    passwordCountLabel.setFont(new Font("San Serif",Font.PLAIN,36));
    
    printerCountLabel = new JLabel("0");
    printerCountLabel.setPreferredSize(new Dimension(120,50));
    printerCountLabel.setForeground(Color.white);
    printerCountLabel.setFont(new Font("San Serif",Font.PLAIN,36));
    
    laptopCountLabel = new JLabel("0");
    laptopCountLabel.setPreferredSize(new Dimension(120,50));
    laptopCountLabel.setForeground(Color.white);
    laptopCountLabel.setFont(new Font("San Serif",Font.PLAIN,36));
    
    otherCountLabel = new JLabel("0");
    otherCountLabel.setPreferredSize(new Dimension(120,50));
    otherCountLabel.setForeground(Color.white);
    otherCountLabel.setFont(new Font("San Serif",Font.PLAIN,36));
    
    nameLabel = new JLabel("              Welcome " );
    nameLabel.setPreferredSize(new Dimension(fluxLength,30));
    nameLabel.setForeground(Color.white);
    nameLabel.setFont(new Font("San Serif",Font.PLAIN,22));
    
    
 // Buttons
    passwordButton = new JButton("Password");
    passwordButton.setPreferredSize(new Dimension(80,30));
    passwordButton.setBackground(new Color(239,194,79));
    //passwordButton.setBorder(BorderFactory.createLineBorder(Color.black,2,true));
    passwordButton.setFont(new Font("Sans Serif",Font.PLAIN,15));
    passwordButton.setForeground(Color.black);
    
    liz2 listenie = new liz2();
    passwordButton.addActionListener(listenie);
    
    printerButton = new JButton("Printer");
    printerButton.setPreferredSize(new Dimension(80,30));
    printerButton.setBackground(new Color(239,194,79));
    //printerButton.setBorder(BorderFactory.createLineBorder(Color.black,2,true));
    printerButton.setFont(new Font("Sans Serif",Font.PLAIN,15));
    printerButton.setForeground(Color.black);
    
    liz3 listenie2 = new liz3();
    printerButton.addActionListener(listenie2);
    
    laptopButton = new JButton("Laptop");
    laptopButton.setPreferredSize(new Dimension(80,30));
    laptopButton.setBackground(new Color(239,194,79));
   // laptopButton.setBorder(BorderFactory.createLineBorder(Color.black,2,true));
    laptopButton.setFont(new Font("Sans Serif",Font.PLAIN,15));
    laptopButton.setForeground(Color.black);
    
    liz4 listenie3 = new liz4();
    laptopButton.addActionListener(listenie3);
    
    otherButton = new JButton("Other");
    otherButton.setPreferredSize(new Dimension(80,30));
    otherButton.setBackground(new Color(239,194,79));
    //otherButton.setBorder(BorderFactory.createLineBorder(Color.black,2,true));
    otherButton.setFont(new Font("Sans Serif",Font.PLAIN,15));
    otherButton.setForeground(Color.black);
    
    liz5 listenie4 = new liz5();
    otherButton.addActionListener(listenie4);
    
 // Panels     
    topSpacer = new JPanel();
    topSpacer.setPreferredSize(new Dimension(670,150));
    topSpacer.setBackground(new Color(60,20,10,0));
    
    smallSpacer1 = new JPanel();
    smallSpacer1.setPreferredSize(new Dimension(40,30));
    smallSpacer1.setBackground(new Color(0,0,0,0));
    
    smallSpacer2 = new JPanel();
    smallSpacer2.setPreferredSize(new Dimension(40,30));
    smallSpacer2.setBackground(new Color(0,0,0,0));
    
    smallSpacer3 = new JPanel();
    smallSpacer3.setPreferredSize(new Dimension(40,30));
    smallSpacer3.setBackground(new Color(0,0,0,0));
    
    midSpacer = new JPanel();
    midSpacer.setPreferredSize(new Dimension(670,60));
    midSpacer.setBackground(new Color(1,56,147,255));
    
    anotherSpacer = new JPanel();
    anotherSpacer.setPreferredSize(new Dimension(670,10));
    anotherSpacer.setBackground(new Color(12,123,23,0));
    
    nameHolderBox = new JPanel();
    nameHolderBox.setPreferredSize(new Dimension(670,50));
    nameHolderBox.setOpaque(false);
    
    passwordHolderBox = new JPanel();
    passwordHolderBox.setPreferredSize(new Dimension(100,100));
    passwordHolderBox.setBackground(new Color(1,56,147,255));
    
    printerHolderBox = new JPanel();
    printerHolderBox.setPreferredSize(new Dimension(100,100));
    printerHolderBox.setBackground(new Color(123,12,32,0));
    
    laptopHolderBox = new JPanel();
    laptopHolderBox.setPreferredSize(new Dimension(100,100));
    laptopHolderBox.setBackground(new Color(123,12,32,0));
    
    otherHolderBox = new JPanel();
    otherHolderBox.setPreferredSize(new Dimension(100,100));
    otherHolderBox.setBackground(new Color(123,12,32,0));
    
    passwordCounterBox = new JPanel();
    passwordCounterBox.setPreferredSize(new Dimension(140,100));
    passwordCounterBox.setBackground(new Color(1,56,147,255));
    //passwordCounterBox.setBorder(BorderFactory.createLineBorder(Color.white,6,true));
    
    printerCounterBox = new JPanel();
    printerCounterBox.setPreferredSize(new Dimension(140,100));
    printerCounterBox.setBackground(new Color(1,56,147,255));
    //printerCounterBox.setBorder(BorderFactory.createLineBorder(Color.white,6,true));
    
    laptopCounterBox = new JPanel();
    laptopCounterBox.setPreferredSize(new Dimension(140,100));
    laptopCounterBox.setBackground(new Color(1,56,147,255));
    //laptopCounterBox.setBorder(BorderFactory.createLineBorder(Color.white,6,true));
    
    otherCounterBox = new JPanel();
    otherCounterBox.setPreferredSize(new Dimension(140,100));
    otherCounterBox.setBackground(new Color(1,56,147,255));
   // otherCounterBox.setBorder(BorderFactory.createLineBorder(Color.white,6,true));
    
    bigPanel = new JPanel();
    bigPanel.setPreferredSize(new Dimension(700,570));
    bigPanel.setOpaque(false);
   
    
    
    bigPanel.add(topSpacer);
    nameHolderBox.add(nameInstructions);
    nameHolderBox.add(nameBox);
    bigPanel.add(nameHolderBox);
    bigPanel.add(midSpacer);
    midSpacer.add(nameLabel);
    bigPanel.add(passwordHolderBox);
    passwordHolderBox.add(passwordButton);
    bigPanel.add(smallSpacer1);
    bigPanel.add(printerHolderBox);
    printerHolderBox.add(printerButton);
    bigPanel.add(smallSpacer2);
    bigPanel.add(laptopHolderBox);
    laptopHolderBox.add(laptopButton);
    bigPanel.add(smallSpacer3);
    bigPanel.add(otherHolderBox);
    otherHolderBox.add(otherButton);
    bigPanel.add(anotherSpacer);
    bigPanel.add(passwordCounterBox);
    passwordCounterBox.add(passwordCountLabel);
    bigPanel.add(printerCounterBox);
    printerCounterBox.add(printerCountLabel);
    bigPanel.add(laptopCounterBox);
    laptopCounterBox.add(laptopCountLabel);
    bigPanel.add(otherCounterBox);
    otherCounterBox.add(otherCountLabel);
    
    add(bigPanel);
    
    
  }
  

}