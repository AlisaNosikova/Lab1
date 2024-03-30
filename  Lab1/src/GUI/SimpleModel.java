/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Library.Library;
import Library.Users;
import People.Bibliotekar;
import People.Person;
import java.util.HashSet;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author User
 */
public class SimpleModel implements TreeModel {
    Library lib = new Library();
    Users users = new Users();
    Bibliotekar worker = new Bibliotekar(lib,users);
     
    private Node root;

 public SimpleModel() {
    worker.run();
    root = new Node("Корневая запись");
        
    Node studentsNode = new Node("Студенты");
    Node teachersNode = new Node("Преподаватели");

    for (int i=0; i<worker.getListStudents().size(); i++){
        Person student = worker.getListStudents().get(i);
        Node nodeStudent = new Node(student.getTotalName());
        studentsNode.addChild(nodeStudent);
        HashSet<String> set = student.getAb().getListBooks();
        for (String element : set) {
            nodeStudent.addChild(new Node(element));
            
        }     
    }

    for (int i=0; i<worker.getListTeachers().size(); i++){
        Person teacher = worker.getListTeachers().get(i);
        Node nodeTeacher = new Node(teacher.getTotalName());
        teachersNode.addChild(nodeTeacher); // Добавляем узел преподавателей к узлу "Преподаватели"
        
        HashSet<String> set = teacher.getAb().getListBooks();
        for (String element : set) {
            nodeTeacher.addChild(new Node(element));
        }     
    }

    root.addChild(studentsNode);
    root.addChild(teachersNode); // Добавляем узел "Преподаватели" к корневой записи
}
    @Override
    public Object getRoot() {
        return root;
    }

    @Override
    public int getChildCount(Object parent) {
        Node node = (Node) parent;
        return node.getChildren().size();
    }

    @Override
    public Object getChild(Object parent, int index) {
        Node node = (Node) parent;
        return node.getChildren().get(index);
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        Node node = (Node) parent;
        return node.getChildren().indexOf(child);
    }

    @Override
    public boolean isLeaf(Object node) {
        return ((Node) node).getChildren().isEmpty();
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
    }
}
