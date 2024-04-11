/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import Reader.Reader;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class InfoFictBooks {
    private Reader reader = new Reader();
    private ArrayList<String> namesFictRus = new ArrayList<>();
    private ArrayList<String> authorsFictRus = new ArrayList<>();
    private ArrayList<String> prodFictRus = new ArrayList<>();
    private ArrayList<String> namesFictEng = new ArrayList<>();
    private ArrayList<String> authorsFictEng = new ArrayList<>();
    private ArrayList<String> prodFictEng = new ArrayList<>();
    private ArrayList<String> years = new ArrayList<>();
     public void run(){
        String name = "C:\\Users\\User\\Downloads\\FictLit.csv";
        ArrayList<String[]> data = reader.run(name);
        this.namesFictRus  = reader.addToList(data, namesFictRus, 0);
        this.authorsFictRus = reader.addToList(data, authorsFictRus, 1);
        this.prodFictRus = reader.addToList(data,prodFictRus, 2);
        this.namesFictEng = reader.addToList(data,namesFictEng, 3);
        this.authorsFictEng = reader.addToList(data,authorsFictEng, 4);
        this.prodFictEng = reader.addToList(data,prodFictEng, 5);
        this.years = reader.addToList(data,years, 6);
    
}

    public ArrayList<String> getNamesFictRus(){
        return namesFictRus;
    }
     public ArrayList<String> getAuthorsFictRus(){
        return authorsFictRus;
    }
    public ArrayList<String> getProdFictRus(){
        return prodFictRus;
    }
    public ArrayList<String> getNamesFictEng(){
        return namesFictEng;
    }
    public ArrayList<String> getAuthorsFictEng(){
        return authorsFictEng;
    }
    public ArrayList<String> getProdFictEng(){
        return prodFictEng;
    }
    public ArrayList<String> getYears(){
        return years;
    }
          
      
}
