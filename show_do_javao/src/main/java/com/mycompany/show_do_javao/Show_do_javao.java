/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.show_do_javao;
import com.mycompany.show_do_javao.dao.UserDao;
import java.sql.Connection;
import com.mycompany.show_do_javao.database.connection;
import  com.mycompany.show_do_javao.logic.questionBox;

/**
 *
 * @author NATHALIAMINOSSIOLIVE
 */
public class Show_do_javao {
    
     public static void main(String[] args) {
       UserDao.createTableUser( connection.conectar());
         
    }

   
}
