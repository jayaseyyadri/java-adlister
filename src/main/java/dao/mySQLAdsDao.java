package dao;

import java.util.ArrayList;
import java.util.List;

import models.Ad;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;


public class mySQLAdsDao implements Ads {

    private Connection connection;


    public mySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public mySQLAdsDao() {

    }

    @Override
    public List<Ad> all() {
        List<Ad> output = new ArrayList<>();
        String query = "SELECT * FROM ads";
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                output.add(
                        new Ad(
                                rs.getLong("id"),
                                rs.getLong("user_id"),
                                rs.getString("last_name"),
                                rs.getString("first_name")
                        )
                );

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return output;
    }

    @Override
    public Long insert(Ad ad) {
        List<Ad> output = new ArrayList<>();
            Ad NewAd = new Ad(1,
                    "car for sale",
                    "a car which looks good, and gives good mileage"
            );

                String query = String.format("INSERT INTO ads(user_id,title,description) VALUES('%d','%s','%s')",
                ad.getUserId(),
                ad.getTitle(),
                ad.getDescription()
                );
            try{
                Statement statement = connection.createStatement();
                statement.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
                ResultSet rs = statement.getGeneratedKeys();
                if (rs.next()){
                    System.out.println("Inserted id is: " + rs.getLong(1));

                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

    }
}