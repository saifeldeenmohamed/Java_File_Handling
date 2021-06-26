/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filePkg;

import java.io.File;

/**
 *
 * @author SaiF El-deen
 */
public class MainClass {
    
    public static void main(String[] args){
    File file = new File("C:\\Users\\SaiF El-deen\\Desktop\\JavaITI");
     
    String[] fileList = file.list();
    
    System.out.println("________________The List of Files / Folders Started_________________");
    
    for(String name : fileList){
        System.out.println( name +" ");
        if(new File(file,name).isFile()){
            System.out.println(" File");
        }else{
            System.out.println(" Folder");
        }
}
    System.out.println("________________The List of Files / Folders Ended_________________");
}
}
