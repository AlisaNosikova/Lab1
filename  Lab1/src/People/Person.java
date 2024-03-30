/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author User
 */
public abstract class Person {
    String name;
    String surname;
    
    Abonement ab = new Abonement();
    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
     public Abonement getAb(){
        return ab;
    }
    public abstract String getTotalName();
    public void goToAbonement(ArrayList<String> listBooks){
        
    }
    
}
