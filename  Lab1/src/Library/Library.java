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
    private ArrayList<FictLit> FictList = new ArrayList<>();
    private ArrayList<EduLit> EduList = new ArrayList<>();
   
    public void run(){
        for (int i=0; i<20; i++){
        EduList.add( EngFactory.createEduLit());
        FictList.add(EngFactory.ñreateFictLit());
        EduList.add( RusFactory.createEduLit());
        FictList.add(RusFactory.ñreateFictLit());
       
    }
    }
        public ArrayList<FictLit> getFictList(){
            return FictList;
        }
         public ArrayList<EduLit> getEduList(){
            return EduList;
        }
}
