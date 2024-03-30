/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Books.classes;

import BooksFactories.EduLit;

/**
 *
 * @author User
 */
public class RusEduLit implements EduLit{
    String type;
    String discipline;
    public RusEduLit(String type, String discipline){
        this.type = type;
        this.discipline = discipline;
}
    public String getDiscipline(){
        return discipline;
    }
    public String getType(){
        return type;
    }
    @Override
     public String getFullName(){
         return getType() + " по дисциплине: " + getDiscipline();
     }
    
}
