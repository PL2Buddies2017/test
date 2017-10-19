/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl2.task;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author EXTRA_EG
 */
import java.io.*;
public class AddFriend { 
 
  public static void Write(String Name){
       FileWriter output = null;
       File file = new File ("text.txt");
        try {
        output = new FileWriter("text.txt" , true);
        output.write(Name);
            output.close();
        } catch (IOException ex){
        System.out.printf("Error : %s \n" ,ex);
        } 

}    
  }

    



