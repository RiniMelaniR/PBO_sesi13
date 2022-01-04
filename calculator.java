/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rini Melani R
 */
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class calculator {
    
    
    public static void main(String[] args) {
        JFrame Calculator = new JFrame();
        Calculator.setSize(400,450);
        Calculator.setLocationRelativeTo(null);
        Calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Calculator.getContentPane().setBackground(Color.blue);
        
        JTextField teks1 = new JTextField();
        JTextField teks2 = new JTextField();
        JLabel hasil = new JLabel("= Hasil");
        JButton Plus = new JButton("+");
        JButton Min = new JButton("-");
        JButton Kali = new JButton("*");
        JButton Bagi = new JButton("/");
        JButton Modulus = new JButton("Modulus");
        
        teks1.setBounds(50, 50, 100, 50);
        teks2.setBounds(160, 50, 100, 50);
        hasil.setBounds(300, 50, 80, 50);
        Plus.setBounds(125, 120, 150, 50);
        Min.setBounds(125, 180, 150, 50);
        Kali.setBounds(125, 240, 150, 50);
        Bagi.setBounds(125, 300, 150, 50);
        Modulus.setBounds(125, 360, 150, 50);
        
        Calculator.add(teks1);
        Calculator.add(teks2);
        Calculator.add(hasil);
        Calculator.add(Plus);
        Calculator.add(Min);
        Calculator.add(Kali);
        Calculator.add(Bagi);
        Calculator.add(Modulus);
        
        Calculator.setLayout(null);
        Calculator.setVisible(true);
    }
}
