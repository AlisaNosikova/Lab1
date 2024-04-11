/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;


import BooksFactories.EduLit;
import BooksFactories.FictLit;
import Library.Library;
import Library.Users;
import People.Librarian;
import People.Person;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author User
 */
public class TreeModel1 implements TreeModel {
    private Library lib = new Library();
    private Users users = new Users();
    private Librarian worker = new Librarian(lib,users);
    private Node root;

 public TreeModel1() {
    worker.run();
    root = new Node("Корневая запись");
        
    Node studentsNode = new Node("Студенты");
    Node teachersNode = new Node("Преподаватели");
    addNode(worker.getListStudents(),studentsNode);
    addNode(worker.getListTeachers(),teachersNode);

    root.addChild(studentsNode);
    root.addChild(teachersNode); // Добавляем узел "Преподаватели" к корневой записи
}
 public void addNode(ArrayList<Person> list, Node node ){
      for (Person student: list){
       // Person student = worker.getListStudents().get(i);
        Node node1 = new Node(student.getTotalName());
        node.addChild(node1);
        HashSet<FictLit> setFict = student.getAb().getFictSet();
        HashSet<EduLit> setEdu = student.getAb().getEduSet();
        for (FictLit element : setFict) {
            node1.addChild(new Node(element.getFullName()));   
        }     
          for (EduLit element : setEdu) {
            node1.addChild(new Node(element.getFullName()));   
        }     
    }

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
