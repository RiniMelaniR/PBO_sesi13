/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi13;

/**
 *
 * @author Rini Melani R
 */
import javax.swing.*;
import java.awt.*;

public class permainan_matematika extends JFrame {
    JTextField form1;
    JTextField form2;
    JTextField hasilform;
    JTextField checkform;
    JLabel samadengan;
    
    permainan_matematika(){
        super("Game_Math");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.cyan);
        setLocationRelativeTo(null);
        
        JTextField form1 = new JTextField();
        JTextField form2 = new JTextField();
        JTextField hasilform = new JTextField();
        //JTextField checkform;
        JLabel samadengan = new JLabel("=");
        
        form1.setBounds(25, 50, 100, 50);
        form2.setBounds(135, 50, 100, 50);
        hasilform.setBounds(300, 50, 80, 50);
        samadengan.setBounds(255, 50, 10, 50);
        
        add(form1);
        add(form2);
        add(hasilform);
        //add(checkform);
        add(samadengan);
        
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        permainan_matematika form = new permainan_matematika();
    }
}
