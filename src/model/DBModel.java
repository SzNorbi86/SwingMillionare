/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Norbert Szilagyi
 */
public class DBModel implements IModel{
    
    Connection conn;
    private PreparedStatement getKerdesekPstmt;
    private PreparedStatement addKerdesPstmt;


    public DBModel(Connection conn) throws SQLException {
        this.conn = conn;
        getKerdesekPstmt = conn.prepareStatement("SELECT * FROM kerdes");
        addKerdesPstmt = conn.prepareStatement("INSERT INTO kerdes (kerdes,valasz0,valasz1,valasz2,valasz3,helyesvalasz) VALUES(?,?,?,?,?,?)");
    }
    

    @Override
    public List<Kerdes> getKerdesek() throws SQLException {
     ResultSet rs = getKerdesekPstmt.executeQuery();
        List<Kerdes> kerdesek = new ArrayList<>();
        
        
        while (rs.next()) {
            kerdesek.add(new Kerdes(rs.getString("kerdes"), rs.getString("valasz0"), rs.getString("valasz1"), rs.getString("valasz2"), rs.getString("valasz3"),rs.getInt("helyesvalasz")));

        }
        
        rs.close();
        return kerdesek;    
    }

    @Override
    public void close() throws SQLException {
        conn.close();
    }

    @Override
    public int addKerdes(Kerdes kerdes) throws SQLException {
        addKerdesPstmt.setString(1,kerdes.getKerdes());
        addKerdesPstmt.setString(2,kerdes.getValasz0());
        addKerdesPstmt.setString(3,kerdes.getValasz1());
        addKerdesPstmt.setString(4,kerdes.getValasz2());
        addKerdesPstmt.setString(5,kerdes.getValasz3());
        addKerdesPstmt.setInt(6,kerdes.getHelyesvalasz());
        return addKerdesPstmt.executeUpdate();

    }

   
    
}
