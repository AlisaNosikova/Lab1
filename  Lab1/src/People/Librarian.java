/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;


import BooksFactories.*;
import Library.*;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author User
 */
public class Librarian {
    private ArrayList<FictLit> FictList = new ArrayList<>();
    private ArrayList<EduLit> EduList = new ArrayList<>();
    private ArrayList<Person> students = new ArrayList<>();
    private ArrayList<Person> teachers = new ArrayList<>();
    public Librarian(Library library,Users users){
       library.run();
       users.run();
       this.FictList = library.getFictList();
       this.EduList = library.getEduList();
       this.students = users.getStudents();
       this.teachers = users.getTeachers();
}
    public void run(){
       giveBooks(students);
       giveBooks(teachers);
    }
    public void giveBooks(ArrayList<Person> people){
        for(Person person: people){
       Random random = new Random();
        int randomNumber = random.nextInt(8) + 3;
        for (int i=0; i <randomNumber; i++){
            int randomNum = random.nextInt(2);
            switch(randomNum){
                case(0):
                      int randomNum1 = random.nextInt(FictList.size());
                      person.getAb().addFictBook(FictList.get(randomNum1));
                      break;
                case(1):
                      int randomNum2 = random.nextInt(EduList.size());
                      person.getAb().addEduBook(EduList.get(randomNum2));
                      break;
            }
        }
       }  
    }
      public ArrayList<FictLit> getFictListBooks(){
            return FictList;
        }
         public ArrayList<EduLit> getEduListBooks(){
            return EduList;
        }
      
      public ArrayList<Person> getListStudents(){
            return students;
        }
        public ArrayList<Person> getListTeachers(){
            return teachers;
        }
}
