package db;

import db.DbException;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {

    private static Connection connection=null;

    public static Connection getConnection(){
       try {
           if(connection==null){
               Properties prop = loadProperties();
               String url=prop.getProperty("dburl");
               connection=DriverManager.getConnection(url,prop);
           }
           return connection;
       } catch (Exception e) {
           throw new DbException(e.getMessage());
       }
    };

    public static void closeConnection(){
        try{
            if(connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    private static Properties loadProperties(){
        try(FileInputStream fis = new FileInputStream("db.properties")){
            Properties prop = new Properties();
            prop.load(fis);
            return prop;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static void closeStatement(Statement stmt){
        try{
            if(stmt!=null){
                stmt.close();
            }
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }

    public static void closeResultSet(ResultSet rs){
        try{
            if(rs!=null){
                rs.close();
            }
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }

}
