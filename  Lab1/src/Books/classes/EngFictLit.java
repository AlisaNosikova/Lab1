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
public class EngFictLit implements FictLit{
    String name;
    String author;
    String production;
    public EngFictLit(String name, String author, String production){
        this.name = name;
        this.author = author;
        
        this.production = production;
}
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
     public String getProd(){
        return production;
    }
    @Override
     public String getFullName(){
         return "Название:" + getName() + ".Автор:" + getAuthor() + ".Издательство:" + getProd();
     }
   
}
