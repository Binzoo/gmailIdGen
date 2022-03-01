/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gmailgenerator;

import java.util.Random;

/**
 *
 * @author binamrathapa
 */
public class main {
        
     public static String emailRandomLetter(){
        Random r = new Random();

        String alphabet = "127eruherujkfndsqoersdlkfncvdnvoisjkjpdo324903xyz";
        String store = "";
        
        for (int i = 0; i < 8; i++) {
            store += alphabet.charAt(r.nextInt(alphabet.length()));
        }
        return store;
    }
     
     
    public static void main(String[] args) {
        
        for(int i = 0; i < 1000; i++){
            System.out.println(emailRandomLetter() + "@gmail.com");
        
        }
    }
    
}
