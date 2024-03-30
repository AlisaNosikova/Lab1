/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BooksFactories;

import Books.classes.EngEduLit;
import Books.classes.EngFictLit;
import java.util.Random;
import lab1.*;

/**
 *
 * @author User
 */
public class EngFactory  implements LitFactory{
    InfoEduBooks registryEdu = new InfoEduBooks();
    InfoFictBooks registryFict = new InfoFictBooks();
   public EngFactory() {
        this.registryEdu = new InfoEduBooks();
        this.registryFict = new InfoFictBooks();
        registryEdu.run();
        registryFict.run();
    }
    
    @Override
    public FictLit ñreateFictLit() {
       
        Random random = new Random();
        int randNum1 = random.nextInt(registryFict.getNamesFictEng().size()-1);
        int randNum2 = random.nextInt(registryFict.getAuthorsFictEng().size()-1);
        int randNum3 = random.nextInt(registryFict.getProdFictEng().size()-1);
        int randNum4 = random.nextInt(registryFict. getYears().size()-1);
        EngFictLit engFictLit = new EngFictLit(registryFict.getNamesFictEng().get(randNum1), 
                registryFict.getAuthorsFictEng().get(randNum2),
                registryFict.getProdFictEng().get(randNum3),registryFict. getYears().get(randNum4));
        return engFictLit;
        
    }
 @Override
    public EduLit createEduLit() {
       
           Random random = new Random();
           int randNum1 = random.nextInt(registryEdu.getDisciplinesEng().size());
           int randNum2 = random.nextInt(registryEdu.getAuthorsEduEng().size());
           int randNum3 = random.nextInt(registryEdu.getUniversities().size());
           int randNum4 = random.nextInt(registryEdu.getLevels().size());
           EngEduLit engEduLit = new EngEduLit(registryEdu.getDisciplinesEng().get(randNum1),registryEdu.getAuthorsEduEng().get(randNum2),registryEdu.getUniversities().get( randNum3),registryEdu.getLevels().get(randNum4));
           return engEduLit;

    }

  

    
    
    
    
    
    
  


}
