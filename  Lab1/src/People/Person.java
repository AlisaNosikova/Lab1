/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;


/**
 *
 * @author User
 */
public abstract class Person {
    private String name;
    private String surname;
    private Abonement ab = new Abonement();
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
    
}
