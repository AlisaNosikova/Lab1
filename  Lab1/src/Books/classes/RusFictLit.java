/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Books.classes;

import BooksFactories.FictLit;

/**
 *
 * @author User
 */
public class RusFictLit  implements FictLit{
    String name;
    String author;
    String year;
    String production;
    public RusFictLit(String name, String author, String production,  String year){
        this.name = name;
        this.author = author;
        this.year = year;
        this.production = production;
}
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public String getYear(){
        return year;
    }
     public String getProd(){
        return production;
    }
    @Override
     public String getFullName(){
         return "Название:" + getName() + ".Автор:" + getAuthor() + ".Издательство:" + getProd() + ".Год написания:" + getYear();
     }
}
