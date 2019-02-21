/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

/**
 *
 * @author Nckey Larson
 */
public class Astuces {

    @Override
    public String toString() {
        return "Astuces{" + "Id_Astuce=" + Id_Astuce + ", Titre_Astuce=" + Titre_Astuce + ", Type_Astuce=" + Type_Astuce + ", Desc_Astuce=" + Desc_Astuce + ", Image_Astuce=" + Image_Astuce + '}';
    }
    
private int Id_Astuce;
    private String Titre_Astuce;
    private String Type_Astuce;
    private String Desc_Astuce;
    private String Image_Astuce;
    
    
    public Astuces(int Id_Astuce, String Titre_Astuce, String Type_Astuce, String Desc_Astuce, String Image_Astuce) {
        this.Id_Astuce = Id_Astuce;
        this.Titre_Astuce = Titre_Astuce;
        this.Type_Astuce = Type_Astuce;
        this.Desc_Astuce = Desc_Astuce;
        this.Image_Astuce = Image_Astuce;
    }

    public Astuces(String Titre_Astuce, String Type_Astuce, String Desc_Astuce, String Image_Astuce) {
        this.Titre_Astuce = Titre_Astuce;
        this.Type_Astuce = Type_Astuce;
        this.Desc_Astuce = Desc_Astuce;
        this.Image_Astuce = Image_Astuce;
    }

    public Astuces(String Titre_Astuce, String Type_Astuce, String Desc_Astuce) {
        this.Titre_Astuce = Titre_Astuce;
        this.Type_Astuce = Type_Astuce;
        this.Desc_Astuce = Desc_Astuce;
    }
    

    public int getId_Astuce() {
        return Id_Astuce;
    }

    public void setId_Astuce(int Id_Astuce) {
        this.Id_Astuce = Id_Astuce;
    }

    public String getTitre_Astuce() {
        return Titre_Astuce;
    }

    public void setTitre_Astuce(String Titre_Astuce) {
        this.Titre_Astuce = Titre_Astuce;
    }

    public String getType_Astuce() {
        return Type_Astuce;
    }

    public void setType_Astuce(String Type_Astuce) {
        this.Type_Astuce = Type_Astuce;
    }

    public String getDesc_Astuce() {
        return Desc_Astuce;
    }

    public void setDesc_Astuce(String Desc_Astuce) {
        this.Desc_Astuce = Desc_Astuce;
    }

    public String getImage_Astuce() {
        return Image_Astuce;
    }

    public void setImage_Astuce(String Image_Astuce) {
        this.Image_Astuce = Image_Astuce;
    }
     
}
