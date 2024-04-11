/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import People.*;
import java.util.ArrayList;
import java.util.Random;
import lab1.*;

/**
 *
 * @author User
 */
public class Users {
    private ArrayList <Person> students  = new ArrayList<>();
    private ArrayList <Person> teachers  = new ArrayList<>();
    private InfoPerson peopleInf = new InfoPerson();
    public Users(){
         peopleInf.run();
    }
    public void run(){
       for (int i=0; i<30; i++){
        Random random = new Random();
        int randNum1 = random.nextInt(peopleInf.getNamesMale().size()-1);
        int randNum2 = random.nextInt(peopleInf.getSurnamesStudentMale().size()-1);
        int randNum3 = random.nextInt(peopleInf.getNamesFemale().size()-1);
      int randNum4 = random.nextInt(peopleInf.getSurnamesStudentFemale().size()-1);
        students.add((PeopleFactory.createPerson(peopleInf.getNamesMale().get(randNum1), peopleInf.getSurnamesStudentMale().get(randNum2))));
        students.add((PeopleFactory.createPerson(peopleInf.getNamesFemale().get(randNum3), peopleInf.getSurnamesStudentFemale().get(randNum4))));
       }
       for (int i=0; i<60;i++){
        Random random = new Random();
       int randNum1 = random.nextInt(peopleInf.getNamesMale().size()-1);
        int randNum2 = random.nextInt(peopleInf.getSurnamesTeacherMale().size()-1);
        int randNum3 = random.nextInt(peopleInf.getNamesFemale().size()-1);
        int randNum4 = random.nextInt(peopleInf.getSurnamesTeacherFemale().size()-1);
        int randNum5 = random.nextInt(peopleInf.getPatronymicsMale().size()-1);
        int randNum6 = random.nextInt(peopleInf.getPatronymicsFemale().size()-1);
        teachers.add((PeopleFactory.createPerson(peopleInf.getNamesMale().get(randNum1), peopleInf.getSurnamesTeacherMale().get(randNum2), peopleInf.getPatronymicsMale().get(randNum5))));
        teachers.add((PeopleFactory.createPerson(peopleInf.getNamesFemale().get(randNum3), peopleInf.getSurnamesTeacherFemale().get(randNum4), peopleInf.getPatronymicsFemale().get(randNum6))));
        
       }
    }
    public ArrayList <Person> getStudents(){
        return students;
    }
     public ArrayList <Person> getTeachers(){
        return teachers;
    }
}
