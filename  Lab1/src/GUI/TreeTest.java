/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;
import javax.swing.JFrame;
    import javax.swing.*;

/**
 *
 * @author User
 */
public class TreeTest extends JFrame 
{
    public TreeTest() {
        super("Пример использования JTree");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        JTree tree4 = new JTree(new SimpleModel());
        // Размещение деревьев в панели содержимого
        JPanel contents = new JPanel();
        JScrollPane scrollPane = new JScrollPane(tree4, 
                                        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                                        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        contents.add(scrollPane);
        setContentPane(contents);
        // Вывод окна на экран
        setSize(400, 300);
        setVisible(true);
    }  
}
   
