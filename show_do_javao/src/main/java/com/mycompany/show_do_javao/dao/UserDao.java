/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.show_do_javao.dao;

import com.mycompany.show_do_javao.database.connection;
import com.mycompany.show_do_javao.model.User;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class UserDao {
    
    
      public static void createTableUser(Connection connection) {
        String sql = "CREATE TABLE IF NOT EXISTS users (" +
             "id INTEGER PRIMARY KEY, " +
             "name TEXT NOT NULL UNIQUE, " +
             "user_score INTEGER DEFAULT 0" +
             ");";
        
          try(Statement s = connection.createStatement()) {
              s.execute(sql);
              
          } catch (Exception e) {
              System.out.println("Erro aqui");
              e.printStackTrace();
          }
        
    }
      
      public static User findUser(User user) {
          String sql = "SELECT * from users where name = ?";
          
          try(PreparedStatement pstmt = connection.conectar().prepareStatement(sql)) {
              pstmt.setString(1, user.getName());
              
              
             ResultSet result =  pstmt.executeQuery();
             
             if(result.next()) {
                 User findedUser = new User(result.getString("name"));
                 findedUser.setId(result.getInt("id"));
                 findedUser.setUser_score(result.getInt("user_score"));
                 return findedUser;
                         
             }
              
          } catch (Exception e) {
              e.printStackTrace();
              return  null;
          }
          return null;
          
      }
      
      
      public static boolean  createUser(User user) {
          String sql = "INSERT INTO users (name, user_score) values (?,?)";
          try(PreparedStatement pstmt = connection.conectar().prepareStatement(sql)) {
              pstmt.setString(1, user.getName());
              pstmt.setInt(2, 0);
              pstmt.executeUpdate();
              return true; 
                
          } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e.getMessage());
              return false;
              
          }
      }
      
      public static void addScore(User user) {
          String sql = "UPDATE users set user_score = ? where id = ?";
            try(PreparedStatement pstmt = connection.conectar().prepareStatement(sql)) {
              pstmt.setInt(1, user.getUser_score());
              pstmt.setInt(2, user.getId());
              pstmt.executeUpdate();
                
          } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e.getMessage());
          }
          
      }
      
      
      
      
      
}
