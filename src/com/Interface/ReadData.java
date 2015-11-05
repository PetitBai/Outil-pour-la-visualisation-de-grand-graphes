package com.Interface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadData {
	ArrayList<Integer> longitude = new ArrayList<Integer>();
    ArrayList<Integer> latitude = new ArrayList<Integer>();
    
    public void read(String filename){
    	try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
           reader.readLine();
            String line = null;
            while((line=reader.readLine())!=null){
                String item[] = line.split(",");
               
               // String longitude = item[item.length-2];
                //String latitude = item[item.length-1];
                //int value = Integer.parseInt(last);
                int dLongitude = Integer.parseInt(item[item.length-2]);
                int dLatitude = Integer.parseInt(item[item.length-1]);
                
               longitude.add(dLongitude);
               latitude.add(dLatitude); 
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    
	


