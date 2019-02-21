/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Nckey Larson
 */
public class GestionAjouter implements Initializable {

    @FXML
    private TableView<?> table;
    @FXML
    private TableColumn<?, ?> id_service;
    @FXML
    private TableColumn<?, ?> categoriee;
    @FXML
    private TableColumn<?, ?> sous_categoriee;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
