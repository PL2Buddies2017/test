/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl2.task;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author EXTRA_EG
 */
public class PL2Task extends AddFriend {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
       System.out.println("Enter 1: Add New Friend:\n"
               + "Enter 2: Read a File : ");
      Scanner scan = new Scanner(System.in);
       int choice = scan.nextInt();
       switch(choice){
           case 1 : System.out.print("Add new Friend : ");
           String name = scan.next(); 
           if(name.matches("[A-Za-z ,]+"))
          {
           AddFriend friend= new AddFriend();
           AddFriend.Write(name);
              System.out.println("added to the file");
          }  
       else
          {
              System.out.println("not a Valid name");
          }
           
      
       
    }
    }
}
    
