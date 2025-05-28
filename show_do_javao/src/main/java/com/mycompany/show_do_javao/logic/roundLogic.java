/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.show_do_javao.logic;
import com.mycompany.show_do_javao.logic.questionBox;
import  javax.swing.*;




/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class roundLogic {
    
    
    
    
    public static String start(JLabel labelReference, JButton field1, JButton field2, JButton field3, JButton field4) {
        questionBox box = new questionBox();
        labelReference.setText(JOptionPane.showInputDialog("digite a pergunta da rodada:"));
        
        String response = JOptionPane.showInputDialog("Digite a resposta certa: ");
        String[] questionToArray = new String[4];
        
        for (int i = 0; i  <4; i++) {
            questionToArray[i] = JOptionPane.showInputDialog("digite a alternativa: " + i);
        }
        
        box.createQuestionBox(response, questionToArray, field1, field2, field3, field4);  
        
        return response;
    }
    
    
    public static boolean checkResponse(String responseCorrect,  String response) {
        if(responseCorrect.toLowerCase().equals(response.toLowerCase())){
            return true;
        }
        
        return  false;
    }
    
}
