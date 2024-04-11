/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import Reader.Reader;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class InfoPerson {
        Reader reader = new Reader();
        ArrayList<String> namesMale = new ArrayList<>();
        ArrayList<String> namesFemale = new ArrayList<>();
        ArrayList<String> surnamesStudentMale = new ArrayList<>();
        ArrayList<String> surnamesStudentFemale = new ArrayList<>();
        ArrayList<String> surnamesTeacherMale = new ArrayList<>();
        ArrayList<String> surnamesTeacherFemale = new ArrayList<>();
        ArrayList<String> patronymicsMale = new ArrayList<>();
        ArrayList<String> patronymicsFemale = new ArrayList<>();
        public void run(){
        String name = "C:\\Users\\User\\Downloads\\n.csv";
        ArrayList<String[]> data = reader.run(name);
        this.namesMale = reader.addToListMalePerson(data, namesMale, 0);
       this.namesFemale = reader.addToListFemalePerson(data, namesFemale, 0);
       this.surnamesStudentMale = reader.addToListMalePerson(data, surnamesStudentMale, 1);
       this.surnamesStudentFemale = reader.addToListFemalePerson(data, surnamesStudentFemale, 1); 
       this.surnamesTeacherMale = reader.addToListMalePerson(data, surnamesTeacherMale, 2);
       this.surnamesTeacherFemale = reader.addToListFemalePerson(data, surnamesTeacherFemale, 2); 
       this.patronymicsMale = reader.addToListMalePerson(data, patronymicsMale, 3);
        this.patronymicsFemale = reader.addToListFemalePerson(data, patronymicsFemale, 3); 
        
        
}
        
   public ArrayList<String> getNamesMale(){

        return namesMale;
   }
     public ArrayList<String> getNamesFemale(){
        return namesFemale;
    }
    public ArrayList<String> getSurnamesStudentMale(){
        return surnamesStudentMale;
    }
    public ArrayList<String> getSurnamesStudentFemale(){
        return surnamesStudentFemale;
    }
    public ArrayList<String> getSurnamesTeacherMale(){
        return surnamesTeacherMale;
    }
    public ArrayList<String> getSurnamesTeacherFemale(){
        return surnamesTeacherFemale;
    }
    public ArrayList<String> getPatronymicsMale(){
        return patronymicsMale;
    }
    public ArrayList<String> getPatronymicsFemale(){
        return patronymicsFemale;
    }
}
