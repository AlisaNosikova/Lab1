package lab1;


import Reader.Reader;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class InfoEduBooks {
    private Reader reader = new Reader();
    private ArrayList<String> disciplinesRus = new ArrayList<>();
    private ArrayList<String> disciplinesEng = new ArrayList<>();
    private ArrayList<String> authorsEduEng = new ArrayList<>();
    private ArrayList<String> universities = new ArrayList<>();
    private ArrayList<String> levels = new ArrayList<>(Arrays.asList("��� ������������","��� ������������"));
    private ArrayList<String> types = new ArrayList<>(Arrays.asList("�������","�������", "��������"));
    public void run(){
        String name = "C:\\Users\\User\\Downloads\\EduLit.csv";
        ArrayList<String[]> data = reader.run(name);
        this.disciplinesRus = reader.addToList(data, disciplinesRus, 0);
        this.disciplinesEng = reader.addToList(data, disciplinesEng, 1);
        this.authorsEduEng = reader.addToList(data,authorsEduEng, 2);
        this.universities = reader.addToList(data,universities, 3);
       
}

    public ArrayList<String> getLevels(){
        return levels;
    }
    public ArrayList<String> getTypes(){
        return types;
    }
    public ArrayList<String> getDisciplinesRus(){
        return disciplinesRus;
    }
     public ArrayList<String> getDisciplinesEng(){
        return disciplinesEng;
    }
      public ArrayList<String> getAuthorsEduEng(){
        return authorsEduEng;
    }
       public ArrayList<String> getUniversities(){
        return universities;
    }
      
      
   
    
}
  