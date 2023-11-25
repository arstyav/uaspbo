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
import model.murid;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    // Method untuk menyimpan data murid ke database
    public class constructormurid extends murid {
    ArrayList <String[]> arrayMurid = new ArrayList <>();
          public boolean create() {
            boolean isOperationSuccess = false;

            try{
                this.openConnection();
                String queryZero = "SELECT COUNT(*) FROM murid";
                this.preparedStatement  = this.connection.prepareStatement(queryZero);
                this.resultSet = this.preparedStatement.executeQuery();
                this.statement = this.connection.createStatement();
                this.resultSet.next();
                int rowCount = this.resultSet.getInt(1);
                if (rowCount == 0){
                        String sql = "INSERT INTO murid (id_murid, nama, tanggal_lahir, alamat, nama_orang_tua, nomor_orang_tua) VALUES (?, ?, ?, ?, ?, ?)";
                        this.preparedStatement = this.connection.prepareStatement(sql);
                        this.preparedStatement.setString(1, "1");
                        this.preparedStatement.setString(2, this.getNama());
                        this.preparedStatement.setString(3, this.getTanggalLahir());
                        this.preparedStatement.setString(4, this.getAlamat());
                        this.preparedStatement.setString(5, this.getNamaOrangTua());
                        this.preparedStatement.setString(6, this.getNomorOrangTua());
 
                        int result = this.preparedStatement.executeUpdate();

                        isOperationSuccess = result > 0;
                }else {
                        String getMaxIdQuery = "SELECT id_murid FROM murid ORDER BY id_murid DESC LIMIT 1";
                        this.preparedStatement = this.connection.prepareStatement(getMaxIdQuery);
                        this.resultSet  = this.preparedStatement.executeQuery();
                        this.resultSet.next();
                        String newIdStr = this.resultSet.getString("id_murid");
                        Integer newIdInt = Integer.parseInt(newIdStr) + 1;
                        String newIdStrUsed = newIdInt.toString();
                        String sql = "INSERT INTO murid (id_murid, nama, tanggal_lahir, alamat, nama_orang_tua, nomor_orang_tua) VALUES (?, ?, ?, ?, ?, ?)";
                        this.preparedStatement = this.connection.prepareStatement(sql);
                        this.preparedStatement.setString(1, newIdStrUsed);
                        this.preparedStatement.setString(2, this.getNama());
                        this.preparedStatement.setString(3, this.getTanggalLahir());
                        this.preparedStatement.setString(4, this.getAlamat());
                        this.preparedStatement.setString(5, this.getNamaOrangTua());
                        this.preparedStatement.setString(6, this.getNomorOrangTua());

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
    
    public boolean updateMurid() {
        boolean isOperationSuccess = false;
        try {
            this.openConnection();
            String sql = "UPDATE murid SET alamat = ? WHERE id_murid = ?";
            this.preparedStatement = this.connection.prepareStatement(sql);
            this.preparedStatement.setString(1, this.alamat);  
            this.preparedStatement.setString(2, this.idMurid); 
            int result = this.preparedStatement.executeUpdate();
            isOperationSuccess = result > 0;
        } catch (SQLException ex) {
            this.displayErrors(ex);
        } finally {
            this.closeConnection();
        }
        return isOperationSuccess;
    }
        
       public boolean deleteMurid() {
        boolean isOperationSuccess = false;
        try {
            this.openConnection();
            String sql = "DELETE FROM murid WHERE id_murid = ?";
            this.preparedStatement = this.connection.prepareStatement(sql);
            this.preparedStatement.setString(1, this.idMurid); 
            int result = this.preparedStatement.executeUpdate();
            isOperationSuccess = result > 0;
        } catch (SQLException ex) {
            this.displayErrors(ex);
        } finally {
            this.closeConnection();
        }
        return isOperationSuccess;
    }

    public ArrayList<String[]> readMurid() throws SQLException {
        this.openConnection();
        String query = "SELECT * FROM murid";
        this.statement = this.connection.createStatement();
        ResultSet rs = this.statement.executeQuery(query);
        while (rs.next()) {            
            String idStaff = rs.getString("id_murid");
            String nama = rs.getString("nama");
            String tanggalLahir = rs.getString("tanggal_lahir");
            String alamat = rs.getString("alamat");
            String namaOrangTua = rs.getString("nomor_orang_tua");
            String nomorOrangTua = rs.getString("nomor_orang_tua");
            String[] data = {idStaff, nama, alamat, namaOrangTua, nomorOrangTua};   
            arrayMurid.add(data);
        }return arrayMurid;
    }
    
    public boolean find (String id) {
        boolean isoperationSuccess = false;
            try {
                this.openConnection();
                this.preparedStatement = this.connection.prepareStatement("SELECT * FROM murid WHERE id_murid = ?");
                this.preparedStatement.setString(1, id);
                this.resultSet = this.preparedStatement.executeQuery();
                if (this.resultSet.next()){
                    this.idMurid = this.resultSet.getString("ID_murid");
                    this.nama=  this.resultSet.getString("nama");
                    this.tanggalLahir=  this.resultSet.getString("tanggal_lahir");
                    this.alamat = this.resultSet.getString("alamat");
                    this.namaOrangTua=  this.resultSet.getString("nama_orang_tua");
                    this.nomorOrangTua = this.resultSet.getString("nomor_orang_tua");
                    
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