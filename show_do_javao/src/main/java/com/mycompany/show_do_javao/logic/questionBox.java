/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.show_do_javao.logic;

import java.util.Arrays;
import java.util.Collections;
import  javax.swing.*;
import java.util.List;
/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class questionBox {
    
    
    private  String[] randomArray(String[] questions) {
        List<String> list = Arrays.asList(questions);
        
       Collections.shuffle(list);
       
       
       return list.toArray(new String[0]);
    }
    
    
    
    public void createQuestionBox(String rigthAnswer, String[] questions, JButton field1, JButton field2, JButton field3, JButton field4) {
     
        
        String[] alterArray = this.randomArray(questions);
        
      
        field1.setText(alterArray[0]);
        field2.setText(alterArray[1]);
        field3.setText(alterArray[2]);
        field4.setText(alterArray[3]);
         
            
        
        
        
    }
}
