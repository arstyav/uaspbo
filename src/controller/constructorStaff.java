/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import view.menu1;
import database.database;
import model.staff;


public class constructorStaff extends staff {
    ArrayList <String[]> arraystaff = new ArrayList <>();
    public boolean create() {
            boolean isOperationSuccess = false;

            try{
                this.openConnection();
                String queryZero = "SELECT COUNT(*) FROM staff";
                this.preparedStatement  = this.connection.prepareStatement(queryZero);
                this.resultSet = this.preparedStatement.executeQuery();
                this.statement = this.connection.createStatement();
                this.resultSet.next();
                int rowCount = this.resultSet.getInt(1);
                if (rowCount == 0){
                        String sql = "INSERT INTO staff (id_staff, nama, alamat, nomor_telepon, bidang_pekerjaan) VALUES (?, ?, ?, ?, ?)";
                        this.preparedStatement = this.connection.prepareStatement(sql);
                        this.preparedStatement.setString(1, "1");
                        this.preparedStatement.setString(2, this.getNama());
                        this.preparedStatement.setString(3, this.getAlamat());
                        this.preparedStatement.setString(4, this.getNomorTelepon());
                        this.preparedStatement.setString(5, this.getBidangPekerjaan());

                        int result = this.preparedStatement.executeUpdate();

                        isOperationSuccess = result > 0;
                }else {
                        String getMaxIdQuery = "SELECT id_staff FROM staff ORDER BY id_staff DESC LIMIT 1";
                        this.preparedStatement = this.connection.prepareStatement(getMaxIdQuery);
                        this.resultSet  = this.preparedStatement.executeQuery();
                        this.resultSet.next();
                        String newIdStr = this.resultSet.getString("id_staff");
                        Integer newIdInt = Integer.parseInt(newIdStr) + 1;
                        String newIdStrUsed = newIdInt.toString();
                        String sql = "INSERT INTO staff (id_staff, nama, Alamat, nomor_telepon, bidang_pekerjaan) VALUES (?, ?, ?, ?, ?)";
                        this.preparedStatement = this.connection.prepareStatement(sql);
                        this.preparedStatement.setString(1, newIdStrUsed);
                        this.preparedStatement.setString(2, this.getNama());
                        this.preparedStatement.setString(3, this.getAlamat());
                        this.preparedStatement.setString(4, this.getNomorTelepon());
                        this.preparedStatement.setString(5, this.getBidangPekerjaan());

                        int result = this.preparedStatement.executeUpdate();

                        isOperationSuccess = result > 0;
                }

            }catch (SQLException ex){
                this.displayErrors(ex);
            }finally{
                this.closeConnection();
            }
            return isOperationSuccess;
        }
    
    public boolean updateStaff() {
        boolean isOperationSuccess = false;
        try{
            this.openConnection();
            String sql = "UPDATE staff SET bidang_pekerjaan = ? WHERE id_staff = ?";
            this.preparedStatement = this.connection.prepareStatement(sql);
            this.preparedStatement.setString(1,this.getBidangPekerjaan());
            this.preparedStatement.setString(2, staff.idStaff);
            int result = this.preparedStatement.executeUpdate();
            
            isOperationSuccess = result > 0;    
        }catch(SQLException ex){
            this.displayErrors(ex);
        }finally{
            this.closeConnection();
        }return isOperationSuccess; 
    }
     
    public ArrayList<String[]> readStaff() throws SQLException {
        this.openConnection();
        String query = "SELECT * FROM staff";
        this.statement = this.connection.createStatement();
        ResultSet rs = this.statement.executeQuery(query);
        while (rs.next()) {            
            String idStaff = rs.getString("Id_staff");
            String nama = rs.getString("nama");
            String alamat = rs.getString("alamat");
            String nomorTelepon = rs.getString("nomor_telepon");
            String bidangPekerjaan = rs.getString("bidang_pekerjaan");
            String[] data = {idStaff, nama, alamat, nomorTelepon, bidangPekerjaan};   
            arraystaff.add(data);
        }return arraystaff;
    }
    
    public boolean delete(){
        boolean isOperationSuccess = false;
        try{
            this.openConnection();
            String sql = "DELETE FROM staff WHERE id_staff = ?";
            this.preparedStatement = this.connection.prepareStatement(sql);
            this.preparedStatement.setString(1,staff.idStaff);
            int result = this.preparedStatement.executeUpdate();
            
            isOperationSuccess = result > 0;    
        }catch(SQLException ex){
            this.displayErrors(ex);
        }finally{
            this.closeConnection();
        }return isOperationSuccess; 
    }
    
    public boolean find (String id) {
        boolean isoperationSuccess = false;
            try {
                this.openConnection();
                this.preparedStatement = this.connection.prepareStatement("SELECT * FROM staff WHERE id_staff = ?");
                this.preparedStatement.setString(1, id);
                this.resultSet = this.preparedStatement.executeQuery();
                if (this.resultSet.next()){
                    this.idStaff = this.resultSet.getString("ID_staff");
                    this.nama=  this.resultSet.getString("nama");
                    this.alamat = this.resultSet.getString("alamat");
                    this.nomorTelepon = this.resultSet.getString("nomor_telepon");
                    this.bidangPekerjaan = this.resultSet.getString("bidang_pekerjaan");
                    isoperationSuccess = true;
                }
            }catch (SQLException ex) {
                this.displayErrors (ex);
            }finally {
                this.closeConnection();
            }
            return isoperationSuccess;
    }
}