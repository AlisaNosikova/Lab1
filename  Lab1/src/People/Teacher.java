/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;

/**
 *
 * @author User
 */
public class Teacher extends Person{
    String patronymic;
    public Teacher(String name, String surname,String patronymic) {
        super(name, surname);
        this.patronymic = patronymic;
    }

    public String getPatronymic(){
        return patronymic;
    }

    @Override
    public String getTotalName() {
        return "������������� "  + getSurname() + " " + getName() + " " + getPatronymic();
    }
}
