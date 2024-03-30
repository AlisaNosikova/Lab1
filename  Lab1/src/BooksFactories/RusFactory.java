/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BooksFactories;

import Books.classes.*;
import java.util.Random;
import lab1.InfoEduBooks;
import lab1.InfoFictBooks;

/**
 *
 * @author User
 */
public class RusFactory implements LitFactory{
    InfoEduBooks registryEdu = new InfoEduBooks();
    InfoFictBooks registryFict = new InfoFictBooks();
     public RusFactory() {
        this.registryEdu = new InfoEduBooks();
        this.registryFict = new InfoFictBooks();
        registryEdu.run();
        registryFict.run();
    }
    @Override
    public FictLit ñreateFictLit() {
        registryFict.run();
        Random random = new Random();
        int randNum1 = random.nextInt(registryFict.getNamesFictRus().size()-1);
        int randNum2 = random.nextInt(registryFict. getAuthorsFictRus().size()-1);
        int randNum3 = random.nextInt(registryFict. getProdFictRus().size()-1);
        int randNum4 = random.nextInt(registryFict. getYears().size()-1);
        RusFictLit rusFictLit = new RusFictLit(registryFict.getNamesFictRus().get(randNum1), 
                registryFict.getAuthorsFictRus().get(randNum2),
                registryFict.getProdFictRus().get(randNum3),registryFict. getYears().get(randNum4));
        return rusFictLit;
        
    }

    @Override
    public EduLit createEduLit() {
      registryEdu.run();
           Random random = new Random();
           int randNum1 = random.nextInt(registryEdu.getTypes().size()-1);
           int randNum2 = random.nextInt(registryEdu.getDisciplinesRus().size()-1);
           RusEduLit rusEduLit = new RusEduLit(registryEdu.getTypes().get(randNum1), registryEdu.getDisciplinesRus().get(randNum2));
           return rusEduLit;
      
    }



  
  
    
}
