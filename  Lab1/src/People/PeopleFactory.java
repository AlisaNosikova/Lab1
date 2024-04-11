package People;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class PeopleFactory {
    public static Person createPerson(String name, String surname){
        return new Student(name,surname);
    }
    public static Person createPerson(String name, String surname, String patronymic){
        return new Teacher(name,surname, patronymic);
    }
}
