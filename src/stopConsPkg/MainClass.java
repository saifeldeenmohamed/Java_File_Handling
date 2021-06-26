/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stopConsPkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SaiF El-deen
 */
public class MainClass {
    public static void main(String[] args){
     try{
        FileWriter writer = new FileWriter("C:\\Users\\SaiF El-deen\\Desktop\\JavaITI\\File Handling\\StopExample.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String name= "";
        while(!name.equals("stop")){
            try{
                System.out.println("Enter your data: ");
                name = br.readLine();
                System.out.println("your data: "+name);
                buffer.write(name+"\n");
                
            }catch (IOException ex){
                System.out.println("An error occurred");
                Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE,null,ex);
//                ex.printStackTrace();
            }
        }
        buffer.close();
        br.close();
        r.close();
    }catch(IOException ex){
          System.out.println("An error occurred");
          Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE,null,ex);
//          ex.printStackTrace();

    }
    }
        
    }

