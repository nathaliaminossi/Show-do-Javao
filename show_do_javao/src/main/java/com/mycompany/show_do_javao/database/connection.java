/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.show_do_javao.database;
import  javax.swing.JOptionPane;

import java.sql.*;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class connection {
    
     

    private static final String URL = "jdbc:sqlite:show_do_javao.bd";
    private static Connection conn = null;

    // Método para conectar ao banco de dados
    public static Connection conectar() {
        try {
            // Se a conexão não existir ainda
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(URL);
            }
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco: " + e.getMessage());
        }
        return conn;
    }

    // Método para fechar a conexão
    public static void desconectar() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar do banco: " + e.getMessage());
        }
    }
    
    
  

}
