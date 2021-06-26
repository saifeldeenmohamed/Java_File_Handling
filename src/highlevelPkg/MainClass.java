/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highlevelPkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author SaiF El-deen
 */
public class MainClass {
    public static void main(String[] args){
        
        try{
            //Write to file
            FileWriter writer = new FileWriter("C:\\Users\\SaiF El-deen\\Desktop\\JavaITI\\File Handling\\TestHighLevel.txt");
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write("Welcome to java.\n");
            buffer.write("Welcome to AI.");
            buffer.close();
            
            //Read from file
            FileReader fr = new FileReader("C:\\Users\\SaiF El-deen\\Desktop\\JavaITI\\File Handling\\TestHighLevel.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            do{
                line = br.readLine();
                if (line != null){
                    System.out.println(line);
                }
            } while (line != null);
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
}
}