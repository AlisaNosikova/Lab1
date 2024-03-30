/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Reader {
     ArrayList<String[]> componentsList = new ArrayList<String[]>();
    public ArrayList<String[]> run(String name){
      try{
          InputStream stream = new FileInputStream(name);
          int length = stream.available();
          byte [] data = new byte [length];
          stream.read(data);      
          String text = new String(data, "windows-1251"); 
          String[] dataArray = text.split("\\r\\n");
          
           for (int i=0; i<dataArray.length ; i++){
              String[] components = dataArray[i].split(";");
               
              componentsList.add(components);
          }
       
            }catch(IOException e){
}
        return  componentsList;
       
 
     }

public ArrayList<String> addToList(ArrayList<String[]> allList, ArrayList<String> list, int columnIndex){

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
public ArrayList<String> addToListMalePerson(ArrayList<String[]> allList, ArrayList<String> list, int columnIndex) {
    int index = getIndexFemale(allList, columnIndex);
    
    for (String[] row : allList) {
        if (columnIndex >= 0 && columnIndex < row.length && row[columnIndex].isEmpty()==false  && allList.indexOf(row) < index) {
            list.add(row[columnIndex]);
        }
       
    }
    return list;
}

}

