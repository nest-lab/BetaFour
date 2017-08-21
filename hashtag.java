/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestlab;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author TeamBeta
 */
public class hashtag {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String counter = "";
        System.out.println("Enter your comment");
        String comment = input.nextLine();
         int count=0;
         for(String cmtCount: comment.split("")){
             if(cmtCount.contains("#")){
                 count+=1;
             }
         }
        for(String cmtText: comment.split(" ")){
            if(cmtText.contains("#")){
                System.out.print(cmtText+", ");  
            }
        }
           System.out.println("The occurence(s) of the "+count+" hashtags in the user comment are printed above");
   
         }
         
    }
   
    

