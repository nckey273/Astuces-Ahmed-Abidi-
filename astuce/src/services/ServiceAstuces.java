/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Utilities.datasource;
import Entites.Astuces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Nckey Larson
 */
public class ServiceAstuces {
    
    
    
    
    
    Connection conn =datasource.getInstance().getConnection(); 
    
    
    
        public void ajouterpersonne(Astuces p) {
            try 
         {
             String req = "INSERT INTO `astuces`(`Titre_Astuce`,`Type_Astuce`,`Desc_Astuce`,`Image_Astuce` ) VALUES (?,?,?,?)";
             PreparedStatement pstm = conn.prepareStatement(req);
            // pstm.setString(1, s.getCategorie());
             pstm.setString(1, p.getTitre_Astuce());
             pstm.setString(2, p.getType_Astuce());
             pstm.setString(3, p.getDesc_Astuce());
             pstm.setString(4, p.getImage_Astuce());
           
             pstm.executeUpdate();
         } 
         catch (SQLException ex) 
         {
             Logger.getLogger(ServiceAstuces.class.getName()).log(Level.SEVERE, null, ex);
         }
        
}
    
    
    public ObservableList<Astuces> afficherAstuce() throws SQLException
      {
          
         ObservableList<Astuces> listService = FXCollections.observableArrayList() ;
        Statement stm = conn.createStatement();
        String req = "SELECT * FROM astuces";
        ResultSet resultat = stm.executeQuery(req);  
         while(resultat.next())
        {
        String Titre_Astuce                =   resultat.getString("Titre_Astuce");
            String Type_Astuce                 =   resultat.getString("Type_Astuce");
            String Desc_Astuce        =   resultat.getString("Desc_Astuce");
            String Image_Astuce =resultat.getString("Image_Astuce");
            listService.add(new Astuces( Titre_Astuce,  Type_Astuce,  Desc_Astuce,  Image_Astuce)); 
       
            
        } 
      return listService ; 
      }
}
    
    
