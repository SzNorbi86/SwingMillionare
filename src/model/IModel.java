/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Norbert Szilagyi
 */
public interface IModel {
        List<Kerdes> getKerdesek() throws SQLException;
        int addKerdes(Kerdes kerdes) throws SQLException;

        void close() throws SQLException;  
        


}
