/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.show_do_javao.Controller;
import  com.mycompany.show_do_javao.dao.UserDao;
import com.mycompany.show_do_javao.model.User;
import  javax.swing.JOptionPane;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class UserController {
    
    public  static void register(String name) {
        if(UserDao.createUser(new User(name))) {
            JOptionPane.showMessageDialog(null, "Usuario criado com sucesso");
        }
    }
    
    
    
    
    public  static User findUser(String name) {
        return UserDao.findUser(new User(name));
    }
    
    public  static  void addPoint(User user) {
       UserDao.addScore(user);
    }
    
    
}
