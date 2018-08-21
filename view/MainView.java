/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Rolo
 */
public class MainView extends JFrame{
    
    //10 JButtons
    JButton button1 = new JButton("button1");
    JButton button2 = new JButton("button2");
    JButton button3 = new JButton("button3");
    JButton button4 = new JButton("button4");
    JButton button5 = new JButton("button5");
    JButton button6 = new JButton("button6");
    JButton button7 = new JButton("button7");
    JButton button8 = new JButton("button8");
    JButton button9 = new JButton("button9");
    JButton button10 = new JButton("button10");
    
    JPanel mainPanel = new JPanel();
    JPanel leftSide = new JPanel();
    JPanel rightSide = new JPanel();
    
    
    public void initialize(){
        
        //mainPanel.setSize(1000, 600);
        //mainPanel.setBackground(Color.blue);
        mainPanel.setLayout(new BorderLayout());
        this.add(mainPanel);
        this.setSize(1000, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        
//        leftSide.setLayout(new FlowLayout());
//        rightSide.setLayout(new FlowLayout());
//        leftSide.setBackground(Color.blue);
//        rightSide.setBackground(Color.blue);
        
       
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("HUMAN");
        listModel.addElement("HUMAN");
        listModel.addElement("COW");
        listModel.addElement("LION");
        listModel.addElement("GRAIN");
  
        //create the list
        JList countryList = new JList<>(listModel);
        mainPanel.add(countryList, BorderLayout.LINE_START);
        
//        mainPanel.add(leftSide, BorderLayout.LINE_START);
//        mainPanel.add(rightSide, BorderLayout.LINE_END);
    }
    
    public MainView(){
        super("Automat MP");
    }
      
    
}

