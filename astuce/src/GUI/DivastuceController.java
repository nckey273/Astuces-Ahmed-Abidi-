/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entites.Astuces;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Nckey Larson
 */
public class DivastuceController implements Initializable {

    @FXML
    private AnchorPane ap;
    @FXML
    private Pane sq;
    @FXML
    private Label nom;
    @FXML
    private Label id;
    @FXML
    private Rectangle rectangle;
    @FXML
    private Label sous_categorie;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
    public void LoadValues(Astuces e) throws IOException {
    
        nom.setText(e.getTitre_Astuce());
        sous_categorie.setText(e.getDesc_Astuce());
        
        
     //   etoile.setRating(Double.valueOf(e.getEtoile()));

        
        id.setText(String.valueOf(e.getId_Astuce()));
        
       

        

       
//        sq.setPadding(new Insets(-10, -10, -10, -10));

       //        circle.setFill(new ImagePattern(imageURI));
//       qualite.setRating(e.getMoyqualite());
        Image imageURI2 = new Image("file:C://xampp/htdocs/images/" + e.getImage_Astuce().toString());
        rectangle.setFill(new ImagePattern(imageURI2));
      
       
    

      }
        
    
    
}
