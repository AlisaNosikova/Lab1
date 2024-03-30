/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;

/**
 *
 * @author User
 */
public class Student extends Person{

    public Student(String name, String surname) {
        super(name, surname);
    }
    @Override
    public String getTotalName() {
        return "Студент " + getSurname() + " " + getName();
    }
    
}
