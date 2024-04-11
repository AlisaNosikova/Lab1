/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
    import javax.swing.*;

/**
 *
 * @author User
 */
public class Frame extends JFrame {
    private JTree tree;
    
    public Frame() {
        super("Библиотека");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel contents = new JPanel();
        JButton add = new JButton("Открыть библиотеку");
        add.setPreferredSize(new Dimension(200, 100));
        
        contents.setLayout(new FlowLayout(FlowLayout.CENTER));
        contents.add(add);
        add.addActionListener((ActionEvent e) -> { 
                tree = new JTree(new TreeModel1());
                JScrollPane scrollPane = new JScrollPane(tree, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                contents.removeAll(); // Удалить все существующие компоненты
                contents.setLayout(new BorderLayout());
                contents.add(scrollPane, BorderLayout.CENTER);
                revalidate(); // Перерисовываем содержимое панели
            
        });
     
        setContentPane(contents);
        
        setSize(600, 300);
        setVisible(true);
    }
}