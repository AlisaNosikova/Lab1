/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import BooksFactories.*;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Library {
    LitFactory EngFactory = new EngFactory();
    LitFactory RusFactory = new RusFactory();
    ArrayList<String> LitList = new ArrayList<>();
   
    public void run(){
        for (int i=0; i<20; i++){
        LitList.add(EngFactory.createEduLit().getFullName());
        LitList.add(EngFactory.ñreateFictLit().getFullName());
        LitList.add(RusFactory.createEduLit().getFullName());
        LitList.add(RusFactory.ñreateFictLit().getFullName());
       
    }
    }
        public ArrayList<String> getListBooks(){
            return LitList;
        }
}
