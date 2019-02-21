/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entites.Astuces;
import Utilities.datasource;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import services.ServiceAstuces;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * FXML Controller class
 *
 * @author Nckey Larson
 */
public class AddController implements Initializable {
 Connection conn =datasource.getInstance().getConnection(); 
    @FXML
    private TextField tf_titre;
    @FXML
    private TextField tf_type;
    @FXML
    private TextField tf_desc;
    @FXML
    private Button btn_ajouter;
    
    
     @FXML
  private FontAwesomeIconView image1;
    @FXML
    private ImageView pic1;
     
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajouterastuce(ActionEvent event) throws SQLException {
         Image image1 = pic1.getImage();
            String nameImage1 = saveToFileImageNormal(image1);
        /*String categorie= txtCategorie.getText();
          String sous_categorie= txtsous_categorie.getText();
          service s=new service(categorie,sous_categorie);
            s.setImage(nameImage1);
          AffichageAjout sg =new AffichageAjout();
          sg.ajouterService(s);*/
        String Titre_Astuce = tf_titre.getText();
        String Type_Astuce = tf_type.getText();
        String Desc_Astuce = tf_desc.getText();
        
        
        Astuces p =new Astuces(Titre_Astuce, Type_Astuce, Desc_Astuce);
        p.setImage_Astuce(nameImage1);
        ServiceAstuces sa = new ServiceAstuces();
        sa.ajouterpersonne(p);
       
       

    }
    
    public static String saveToFileImageNormal(Image image)throws SQLException  {

        String ext = "jpg";
        File dir = new File("C:/xampp/htdocs/images");
        String name = String.format("%s.%s", RandomStringUtils.randomAlphanumeric(8), ext);
        File outputFile = new File(dir, name);
        BufferedImage bImage = SwingFXUtils.fromFXImage(image, null);
        try {
            ImageIO.write(bImage, "png", outputFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return name;
    }

    @FXML
    private void addImage(MouseEvent event) throws IOException{
        FileChooser fc = new FileChooser();

        FileChooser.ExtensionFilter extFilterJPG = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.JPG");
        FileChooser.ExtensionFilter extFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.PNG");
        fc.getExtensionFilters().addAll(extFilterJPG, extFilterPNG);
        File selectedFile = fc.showOpenDialog(null);
        try {
            BufferedImage bufferedImage = ImageIO.read(selectedFile);
            Image image = SwingFXUtils.toFXImage(bufferedImage, null);
            pic1.setImage(image);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
}
