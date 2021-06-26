/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowlevelPkg;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author SaiF El-deen
 */
public class MainClass {
    public static void main(String[] args){
        
        char[] charray = {'a','b','c','d'};
        try{
            //Write to file
            FileWriter fw = new FileWriter("C:\\Users\\SaiF El-deen\\Desktop\\JavaITI\\File Handling\\Test.txt");
            fw.write(charray);
            fw.close();
            
            //Read from file
            FileReader fr = new FileReader("C:\\Users\\SaiF El-deen\\Desktop\\JavaITI\\File Handling\\Test.txt");
            charray = new char[4];
            fr.read(charray);
            for(char c:charray){System.out.println(c);} 
            fr.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
}
}
