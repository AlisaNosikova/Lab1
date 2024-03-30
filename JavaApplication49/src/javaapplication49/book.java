/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication49;

/**
 *
 * @author User
 */
public class book {
    String name;
    String author;
    public book(String name, String author){
        this.name = name;
        this.author = author;
    }
    public void setName(String n){
        name = n;
    }
        public void setAuthor(String n){
        author = n;
    }
         public String getName(){
       return  name;
    }
        public String getAuthor(){
        return author;
    }
}
