/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication49;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author User
 */
public class JavaApplication49 {
     

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
     ArrayList<String> namesMale = new ArrayList<>();
    ArrayList<String> namesFemale = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> surnames = new ArrayList<>();
     ArrayList<String> lastnames = new ArrayList<>();
    InputStream stream = new FileInputStream("C:\\Users\\User\\n.csv");
    int length = stream.available();
    byte[] data = new byte[length];
    stream.read(data);
    String text = new String(data, "windows-1251");
    String[] dataArray = text.split("\n");
    ArrayList<String[]> dishComponents = new ArrayList<>();
     for (int i=0; i<dataArray.length; i++){
              String[] components = dataArray[i].split(";");
             for (String comp: components){
                 System.out.println(comp);
             }
              dishComponents.add(components);
              
     }
      addToListMalePerson(dishComponents, namesMale, 0);
     namesFemale = reader.addToListMalePerson(data, namesFemale, 0);
}
 public ArrayList<String>  addToList(ArrayList<String[]> allList, ArrayList<String> list, int columnIndex){

         for (String[] row : allList) {
            if (columnIndex >= 0 && columnIndex < row.length && row[columnIndex].isEmpty()==false) {
                list.add(row[columnIndex]);
            }
        }
       
     
        return list;
}
  public Integer getIndexFemale(ArrayList<String[]> allList, int columnIndex ){
      int index = 0;
         for (String[] row : allList) {
            if (columnIndex >= 0 && columnIndex < row.length && row[columnIndex].equals("Женские")) {
                index = allList.indexOf(row);
            }
        }
         return index;
      
  }
 public ArrayList<String> addToListFemalePerson(ArrayList<String[]> allList, ArrayList<String> list, int columnIndex){
        int index = getIndexFemale(allList, columnIndex);
         for (String[] row : allList) {
            if (columnIndex >= 0 && columnIndex < row.length && row[columnIndex].isEmpty()==false && allList.indexOf(row)> index) {
                list.add(row[columnIndex]);
            }
        }
        return list;
}   
 public static ArrayList<String> addToListMalePerson(ArrayList<String[]> allList, ArrayList<String> list, int columnIndex){
        index = getIndexFemale(allList, columnIndex);
         for (String[] row : allList) {
            if (columnIndex >= 0 && columnIndex < row.length && row[columnIndex].isEmpty()==false && allList.indexOf(row)< index) {
                list.add(row[columnIndex]);
            }
        }
        return list;
}   
       
    
}



