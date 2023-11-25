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
import javax.swing.JOptionPane;
import model.kelas;

    // Method untuk menyimpan data murid ke database
public class constructorKelas extends kelas {
    ArrayList <String[]> arraykelas = new ArrayList <>();  
    database db = new database();
    public boolean create() {
            boolean isOperationSuccess = false;

            try{
                this.db.openConnection();
                String queryZero = "SELECT COUNT(*) FROM kelas";
                this.db.preparedStatement  = this.db.connection.prepareStatement(queryZero);
                this.db.resultSet = this.db.preparedStatement.executeQuery();
                this.db.resultSet.next();
                int rowCount = this.db.resultSet.getInt(1);
                if (rowCount == 0){
                        String sql = "INSERT INTO kelas (id_kelas, nama_kelas, jumlah_murid, kapasitas) VALUES (?, ?, ?, ?)";
                        this.db.preparedStatement = this.db.connection.prepareStatement(sql);
                        this.db.preparedStatement.setString(1, "1");
//                        this.db.preparedStatement.setString(2, this.idKelas);
                        this.db.preparedStatement.setString(2, this.getNamaKelas());
                        this.db.preparedStatement.setInt(3, this.getJumlahMurid());
                        this.db.preparedStatement.setInt(4, this.getKapasitas());
//                        this.db.preparedStatement.setString(6, this.getMateriKhusus());
                        
//                        this.preparedStatement.setString(4, this.getIdOffline());
//                        this.preparedStatement.setString(5, this.Lokasi());
                        int result1 = this.db.preparedStatement.executeUpdate();
                        isOperationSuccess = result1 > 0;
                        String sql2 = "INSERT INTO regular (ID_kelas, metode_pengajaran) VALUES (?, ?)";
                        this.db.preparedStatement = this.db.connection.prepareStatement(sql2);
                        this.db.preparedStatement.setString(1, "1");
                        this.db.preparedStatement.setString(2, this.getMetodePengajaran());
                        int result2 = this.db.preparedStatement.executeUpdate();
                        isOperationSuccess = result2 > 0;
                        String sql3 = "INSERT INTO khusus (ID_kelas, materi_khusus) VALUES (?, ?)";
                        this.db.preparedStatement = this.db.connection.prepareStatement(sql3);
                        this.db.preparedStatement.setString(1, "1");
                        this.db.preparedStatement.setString(2, "");
//                        this.db.preparedStatement.setString(2, this.getMetodePengajaran());
                        int result3 = this.db.preparedStatement.executeUpdate();
                        isOperationSuccess = result3 > 0;
                }else {
                        String getMaxIdQuery = "SELECT id_kelas FROM kelas ORDER BY id_kelas DESC LIMIT 1";
                        this.db.preparedStatement = this.db.connection.prepareStatement(getMaxIdQuery);
                        this.db.resultSet  = this.db.preparedStatement.executeQuery();
//                        String newIdStr;
                        this.db.resultSet.next();
                        String newIdStr = this.db.resultSet.getString("id_kelas");
                        Integer newIdInt = Integer.parseInt(newIdStr) + 1;
                        String newIdStrUsed = newIdInt.toString();
                        String sql = "INSERT INTO kelas (id_kelas, nama_kelas, jumlah_murid, kapasitas) VALUES (?, ?, ?, ?)";
                        this.db.preparedStatement = this.db.connection.prepareStatement(sql);
                        this.db.preparedStatement.setString(1, newIdStrUsed);
//                        this.db.preparedStatement.setString(2, this.idKelas);
                        this.db.preparedStatement.setString(2, this.getNamaKelas());
                        this.db.preparedStatement.setInt(3, this.getJumlahMurid());
                        this.db.preparedStatement.setInt(4, this.getKapasitas());
//                        this.db.preparedStatement.setString(6, this.getMateriKhusus());
//                        this.db.preparedStatement.setString(5, this.getMetodePengajaran());
                        int result = this.db.preparedStatement.executeUpdate();
                        isOperationSuccess = result > 0;
                        String sql2 = "INSERT INTO regular (id_kelas, metode_pengajaran) VALUES (?, ?)";
                        this.db.preparedStatement = this.db.connection.prepareStatement(sql2);
                        this.db.preparedStatement.setString(1, newIdStr);
                        this.db.preparedStatement.setString(2, this.getMetodePengajaran());
                        int result2 = this.db.preparedStatement.executeUpdate();
                        isOperationSuccess = result2 > 0;
                        String sql3 = "INSERT INTO khusus (ID_kelas) VALUES (?)";
                        this.db.preparedStatement = this.db.connection.prepareStatement(sql3);
                        this.db.preparedStatement.setString(1, newIdStr);
//                        this.db.preparedStatement.setString(2, this.getMetodePengajaran());
                        int result3 = this.db.preparedStatement.executeUpdate();
                        isOperationSuccess = result3 > 0;
                }

            }catch (SQLException ex){
                this.db.displayErrors(ex);
            }finally{
                this.db.closeConnection();
            }
            return isOperationSuccess;
        }

    public boolean updateKelas() {
        boolean isOperationSuccess = false;
        try{
            this.db.openConnection();
            String sql = "UPDATE kelas SET jumlah_murid = ? WHERE id_kelas = ?";
            this.db.preparedStatement = this.db.connection.prepareStatement(sql);
            this.db.preparedStatement.setInt(1,this.jumlahMurid);
            this.db.preparedStatement.setString(2, this.idKelas);
            int result = this.db.preparedStatement.executeUpdate();
            
            isOperationSuccess = result > 0;    
        }catch(SQLException ex){
            this.db.displayErrors(ex);
        }finally{
            this.db.closeConnection();
        }return isOperationSuccess; 
    }
    
    public boolean updateExtra(String selectMethod, String plat, String loc) {
        boolean isOperationSuccess = false;
        try{
            this.db.openConnection();
            String sql = "UPDATE khusus SET materi_khusus = ? WHERE ID_kelas = ?";
            this.db.preparedStatement = this.db.connection.prepareStatement(sql);
            this.db.preparedStatement.setString(1,this.materiKhusus);
            this.db.preparedStatement.setString(2, this.idKelas);
            int result = this.db.preparedStatement.executeUpdate();
            isOperationSuccess = result > 0;   
            if (selectMethod.equals("Online")){
                String sqlcheck = "SELECT OFFLINE_ID_offline FROM khusus WHERE ID_kelas = ?";
                this.db.preparedStatement = this.db.connection.prepareStatement(sqlcheck);
                this.db.preparedStatement.setString(1, this.idKelas);
                this.db.resultSet = this.db.preparedStatement.executeQuery();
                if (this.db.resultSet.next()) {
                    if (this.db.resultSet.getObject("OFFLINE_ID_offline") == null) {
                        System.out.println("OFFLINE_ID_offline is NULL");
                    } else {
                        String sqlUpdate = "UPDATE khusus SET OFFLINE_ID_offline = NULL WHERE ID_kelas = ?";
                        this.db.preparedStatement = this.db.connection.prepareStatement(sqlUpdate);
                        this.db.preparedStatement.setString(1, this.idKelas);
                        int resultUpdate = this.db.preparedStatement.executeUpdate();
                        isOperationSuccess = resultUpdate > 0;
                        System.out.println("OFFLINE_ID_offline has been updated to NULL.");
                    }
                }
                String sql2 = "UPDATE online SET platform = ? WHERE ID_online = ?";
                this.db.preparedStatement = this.db.connection.prepareStatement(sql2);
                this.db.preparedStatement.setString(1,plat);
                this.db.preparedStatement.setString(2, this.IdOnline);
                int result2 = this.db.preparedStatement.executeUpdate();
                isOperationSuccess = result2 > 0;
                this.db.preparedStatement = this.db.connection.prepareStatement("SELECT ID_online FROM online WHERE platform = ?");
                this.db.preparedStatement.setString(1, plat);
                this.db.resultSet = this.db.preparedStatement.executeQuery();
                if (this.db.resultSet.next()){
                    this.IdOnline = this.db.resultSet.getString("ID_online");
                    isOperationSuccess = true;
                    String sql3 = "UPDATE khusus SET ONLINE_ID_online = ? WHERE ID_kelas = ?";
                    this.db.preparedStatement = this.db.connection.prepareStatement(sql3);
                    this.db.preparedStatement.setString(1,this.IdOnline);
                    this.db.preparedStatement.setString(2, this.idKelas);
                    int result3 = this.db.preparedStatement.executeUpdate();
                    isOperationSuccess = result3 > 0;
                }
            }else{
                String sqlcheck1 = "SELECT ONLINE_ID_online FROM khusus WHERE ID_kelas = ?";
                this.db.preparedStatement = this.db.connection.prepareStatement(sqlcheck1);
                this.db.preparedStatement.setString(1, this.idKelas);
                this.db.resultSet = this.db.preparedStatement.executeQuery();
                if (this.db.resultSet.next()) {
                    if (this.db.resultSet.getObject("ONLINE_ID_online") == null) {
                        System.out.println("OFFLINE_ID_offline is NULL");
                    } else {
                        String sqlUpdate1 = "UPDATE khusus SET ONLINE_ID_online = NULL WHERE ID_kelas = ?";
                        this.db.preparedStatement = this.db.connection.prepareStatement(sqlUpdate1);
                        this.db.preparedStatement.setString(1, this.idKelas);
                        int resultUpdate1 = this.db.preparedStatement.executeUpdate();
                        isOperationSuccess = resultUpdate1 > 0;
                        System.out.println("OFFLINE_ID_offline has been updated to NULL.");
                    }
                String sql4 = "UPDATE offline SET lokasi = ? WHERE ID_offline = ?";
                this.db.preparedStatement = this.db.connection.prepareStatement(sql4);
                this.db.preparedStatement.setString(1,loc);
                this.db.preparedStatement.setString(2, this.IdOffline);
                int result4 = this.db.preparedStatement.executeUpdate();
                isOperationSuccess = result4 > 0;
                this.db.preparedStatement = this.db.connection.prepareStatement("SELECT ID_offline FROM offline WHERE lokasi = ?");
                this.db.preparedStatement.setString(1, loc);
                this.db.resultSet = this.db.preparedStatement.executeQuery();
                if (this.db.resultSet.next()){
                    this.IdOffline = this.db.resultSet.getString("ID_offline");
                    isOperationSuccess = true;
                    String sql5 = "UPDATE khusus SET OFFLINE_ID_offline = ? WHERE ID_kelas = ?";
                    this.db.preparedStatement = this.db.connection.prepareStatement(sql5);
                    this.db.preparedStatement.setString(1,this.IdOffline);
                    this.db.preparedStatement.setString(2, this.idKelas);
                    int result5 = this.db.preparedStatement.executeUpdate();
                    isOperationSuccess = result5 > 0;
                }
                }
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ini update");
            this.db.displayErrors(ex);
        }finally{
            this.db.closeConnection();
        }return isOperationSuccess; 
    }
     
    public ArrayList<String[]> readKelas() throws SQLException {
        this.db.openConnection();
        String query = "SELECT * FROM kelas";
        this.db.statement = this.db.connection.createStatement();
        ResultSet rs = this.db.statement.executeQuery(query);
        while (rs.next()) {            
            String idKelas = rs.getString("Id_kelas");
            String namaKelas = rs.getString("nama_kelas");
            int jumlahMurid = rs.getInt("jumlah_murid");
            int kapasitas = rs.getInt("kapasitas");
            String strNumber1 = Integer.toString(jumlahMurid);
            String strNumber2 = Integer.toString(kapasitas);
            String[] data = {idKelas, namaKelas, strNumber1, strNumber2, metodePengajaran};   
            arraykelas.add(data);
        }return arraykelas;
    }

    public boolean deleteKelas(String kelasId) {
    boolean isOperationSuccess = false;
    try {
        this.db.openConnection();
        
        String sqlDeleteKhusus = "DELETE FROM khusus WHERE ID_kelas = ?";
        this.db.preparedStatement = this.db.connection.prepareStatement(sqlDeleteKhusus);
        this.db.preparedStatement.setString(1, kelasId);
        int resultDeleteKhusus = this.db.preparedStatement.executeUpdate();
        
        String sqlDeleteRegular = "DELETE FROM regular WHERE id_kelas = ?";
        this.db.preparedStatement = this.db.connection.prepareStatement(sqlDeleteRegular);
        this.db.preparedStatement.setString(1, kelasId);
        int resultDeleteRegular = this.db.preparedStatement.executeUpdate();
        
        String sqlDeleteKelas = "DELETE FROM kelas WHERE id_kelas = ?";
        this.db.preparedStatement = this.db.connection.prepareStatement(sqlDeleteKelas);
        this.db.preparedStatement.setString(1, kelasId);
        int resultDeleteKelas = this.db.preparedStatement.executeUpdate();
        isOperationSuccess = true;
        
    } catch (SQLException ex) {
        this.db.displayErrors(ex);
    } finally {
        this.db.closeConnection();
    }
    return isOperationSuccess;
}

    public boolean find (String id) {
        boolean isoperationSuccess = false;
            try {
                this.db.openConnection();
                this.db.preparedStatement = this.db.connection.prepareStatement("SELECT * FROM kelas WHERE ID_kelas = ?");
                this.db.preparedStatement.setString(1, id);
                this.db.resultSet = this.db.preparedStatement.executeQuery();
                if (this.db.resultSet.next()){
                    this.idKelas = id;
                    this.namaKelas=  this.db.resultSet.getString("nama_kelas");
                    this.jumlahMurid = this.db.resultSet.getInt("jumlah_murid");
                    this.kapasitas = this.db.resultSet.getInt("kapasitas");
                    isoperationSuccess = true;
                }
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ini find");  
                this.db.displayErrors (ex);
            }finally {
                this.db.closeConnection();
            }
            return isoperationSuccess;
    }
    public boolean findOnline (String plat) {
        boolean isOperationSuccess = false;
            try {
                this.db.openConnection();
                this.db.preparedStatement = this.db.connection.prepareStatement("SELECT ID_online FROM online WHERE platform = ?");
                this.db.preparedStatement.setString(1, plat);
                this.db.resultSet = this.db.preparedStatement.executeQuery();
                if (this.db.resultSet.next()){
                    this.IdOnline = this.db.resultSet.getString("ID_online");
                    isOperationSuccess = true;
                    String sql = "UPDATE khusus SET ONLINE_ID_online = ? WHERE ID_kelas = ?";
                    this.db.preparedStatement = this.db.connection.prepareStatement(sql);
                    this.db.preparedStatement.setString(1,this.IdOnline);
                    this.db.preparedStatement.setString(2, this.idKelas);
                    int result = this.db.preparedStatement.executeUpdate();
                    isOperationSuccess = result > 0;
                }
            }catch (SQLException ex) {
                this.db.displayErrors (ex);
            }finally {
                this.db.closeConnection();
            }
            return isOperationSuccess;
    }
    public boolean findOffline (String loc) {
        boolean isOperationSuccess = false;
            try {
                this.db.openConnection();
                this.db.preparedStatement = this.db.connection.prepareStatement("SELECT lokasi FROM offline WHERE ID_offline = ?");
                this.db.preparedStatement.setString(1, loc);
                this.db.resultSet = this.db.preparedStatement.executeQuery();
                if (this.db.resultSet.next()){
                    this.IdOffline = this.db.resultSet.getString("ID_offline");;
                    isOperationSuccess = true;
                    String sql = "UPDATE khusus SET OFFLINE_ID_offline = ? WHERE ID_offline = ?";
                    this.db.preparedStatement = this.db.connection.prepareStatement(sql);
                    this.db.preparedStatement.setString(1,this.IdOffline);
                    this.db.preparedStatement.setString(2, this.idKelas);
                    int result = this.db.preparedStatement.executeUpdate();
                    isOperationSuccess = result > 0;
                }
            }catch (SQLException ex) {
                this.db.displayErrors (ex);
            }finally {
                this.db.closeConnection();
            }
            return isOperationSuccess;
    }
}