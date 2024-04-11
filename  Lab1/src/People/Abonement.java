/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;


import BooksFactories.*;
import java.util.HashSet;

/**
 *
 * @author User
 */
public class Abonement {
    private HashSet<FictLit> FictBooks = new HashSet<>();
    private HashSet<EduLit> EduBooks = new HashSet<>();
    public void addFictBook(FictLit book){
        FictBooks.add(book);
    }
    public void addEduBook(EduLit book){
        EduBooks.add(book);
    }
    public HashSet<FictLit> getFictSet(){
        return FictBooks;
    }
     public HashSet<EduLit> getEduSet(){
        return EduBooks;
    }
   
}
