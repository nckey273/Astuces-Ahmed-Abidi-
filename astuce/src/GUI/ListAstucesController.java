/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entites.Astuces;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.util.Duration;
import static org.apache.commons.lang3.time.FastDateParserSDFTest.data;
import services.ServiceAstuces;

/**
 * FXML Controller class
 *
 * @author Nckey Larson
 */
public class ListAstucesController implements Initializable {

     @FXML
    private JFXTextField recherchetext;
    @FXML
    private ScrollPane pane;
    @FXML
    private JFXComboBox<?> tri;
 private ObservableList<Astuces> data;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            services.ServiceAstuces Lp = new ServiceAstuces();
          
            TilePane b = new TilePane();
            b.setPadding(new javafx.geometry.Insets(30));
            TilePane c = new TilePane();
            FadeTransition ft = new FadeTransition(Duration.millis(1500));
            
            data =FXCollections.observableArrayList( Lp.afficherAstuce());
            for ( Astuces d : data) {
                
                try {
                    
                    
                    
                    
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("divastuce.fxml"));
                    Parent root = (Pane) loader.load();
                    DivastuceController DHC = loader.getController();
                    DHC.LoadValues(d);
                    
                    //   c.setVgap(40);
                    c.getChildren().removeAll();
                    
                    
                    c.getChildren().add(root);
                } catch (IOException ex) {
                   // Logger.getLogger(ListrestoController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
         c.setPrefColumns(3);
        c.setPadding(new javafx.geometry.Insets(0));
        c.setHgap(10);
        c.setVgap(80);
        b.getChildren().add(c);
        b.setPrefWidth(1000);
        pane.setContent(b);
       
        
        
             
        
        
        }
        catch (SQLException ex) {
            Logger.getLogger(ListAstucesController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }    
    
}
