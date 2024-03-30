/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;

import Library.*;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author User
 */
public class Bibliotekar {
    ArrayList<String> listBooks = new ArrayList<>();
    ArrayList<Person> students = new ArrayList<>();
    ArrayList<Person> teachers = new ArrayList<>();
    public Bibliotekar(Library library,Users users){
       library.run();
       users.run();
       this.listBooks = library.getListBooks();
       this.students = users.getStudents();
       this.teachers = users.getTeachers();
}
    public void run(){
       for(Person student: students){
       Random random = new Random();
        int randomNumber = random.nextInt(8) + 3;
        for (int i=0; i <randomNumber; i++){
            int randomNum1 = random.nextInt(listBooks.size());
            student.getAb().checkBook(listBooks.get(randomNum1));
        }
        for(String book: student.getAb().getListBooks()){
            System.out.println(student.getTotalName() + " has" + book);
        }
       }
       for(Person teacher: teachers){
       Random random = new Random();
        int randomNumber = random.nextInt(8) + 3;
        for (int i=0; i <randomNumber; i++){
            int randomNum1 = random.nextInt(listBooks.size());
            teacher.getAb().checkBook(listBooks.get(randomNum1));
        }
        for(String book:teacher.getAb().getListBooks()){
            System.out.println(teacher.getTotalName() + " has" + book);
        }
       }  
}
      public ArrayList<String> getListBooks(){
            return listBooks;
        }
      
      public ArrayList<Person> getListStudents(){
            return students;
        }
        public ArrayList<Person> getListTeachers(){
            return teachers;
        }
}
