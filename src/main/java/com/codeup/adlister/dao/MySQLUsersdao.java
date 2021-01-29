package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLUsersdao implements Users {
    private Connection connection;

    public MySQLUsersdao(Config config){
        try{
            DriverManager.registerDriver(new Driver());
            this.connection= DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        }catch(SQLException e){
            throw new RuntimeException("Error connecting to the database");
        }

    }

    @Override
    public User findByUsername(String username) {

        try {
            String query = "SELECT * FROM users WHERE username = ?";
            PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            ResultSet resultSet = statement.executeQuery();

            User newUser = new User(
                    resultSet.getString("username"),
                    resultSet.getString("email"),
                    resultSet.getString("password")
            );

            System.out.println(newUser.getUsername());
            return newUser;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public Long insert(User user) {

         try {
             String query = "INSERT INTO users(username,email,password)  VALUES (? ,?, ?)";
             PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                 statement.setString(1, user.getUsername());
                 statement.setString(2, user.getPassword());
                 statement.setString(3, user.getEmail());

                 statement.executeUpdate();
                 ResultSet rs = statement.getGeneratedKeys();
                 rs.next();
                 return rs.getLong(1) ;
         }catch (SQLException e){
             throw new RuntimeException("Error in inserting values",e);
         }
    }
}
