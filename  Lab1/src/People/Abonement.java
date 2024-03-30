/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;

import java.util.HashSet;

/**
 *
 * @author User
 */
public class Abonement {
    HashSet<String> books = new HashSet<>();
    public void checkBook(String listBooks){
        books.add(listBooks);
    }
    public HashSet<String> getListBooks(){
        return books;
    }
   
}
