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
public class EngEduLit implements EduLit{
    String level;
    String discipline;
    String author;
    String university;
    public EngEduLit( String discipline, String author, String university, String level){
        this.discipline = discipline;
        this.author = author;
        this.university = university;
        this.level = level;
}
     public String getDiscipline(){
        return discipline;
    }
    public String getAuthor(){
        return author;
    }
    public String getUniversity(){
        return university;
    }
     public String getLevel(){
        return level;
    }
     public String getFullName(){
         return "Дисциплина:" + getDiscipline() + ".Автор:" + getAuthor() + ".Университет:" + getUniversity() + ".Уровень:" + getLevel();
     }
   
}
