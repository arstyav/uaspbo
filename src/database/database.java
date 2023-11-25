///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package database;
import java.sql.*;


public class database {
    private final static String dbhost = "localhost";
    private final static String dbname = "final";
    public static final String username = "root";
    private final static String password = "";
    
    public Connection connection = null;
    public Statement statement;
    public PreparedStatement preparedStatement;
    public ResultSet resultSet;
    public final void openConnection(){
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://" + database.dbhost + "/" + database.dbname + "?user=" + database.username + "&password=" + password);
            System.out.println("Mysql successfully connected");
        } catch (SQLException ex){
            this.displayErrors(ex);
            ex.printStackTrace();
        }
    }
    
    public final void closeConnection(){
        try {
            if (this.resultSet != null) this.resultSet.close();
            if (this.statement != null) this.statement.close();
            if (this.preparedStatement != null) this.preparedStatement.close();
            if (this.connection != null) this.connection.close();
            
            this.resultSet = null;
            this.statement = null;
            this.preparedStatement = null;
            this.connection = null;
            
        }catch (SQLException ex){
            this.displayErrors(ex);
        }
    }
    
    public final void  displayErrors(SQLException ex){
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());

    }
}
