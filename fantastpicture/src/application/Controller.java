package application;



import java.io.IOException;
import java.io.InputStream;

import entite.Images;
import entite.Note;
import entite.Personnes;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import service.Modele;

public class Controller {

	private Personnes personnes;
	private String noteVal;
	private Images images;

	@FXML
	private TextField nom;

	@FXML
	private TextField login;

	@FXML
	private TextField note;

	@FXML
	private Button validerPers;

	@FXML
	private Button validerNote;

	@FXML
	private Button montagne;

	@FXML
	private Button mer;

	@FXML
	private Button foret;

	@FXML
	private Label retour;

	@FXML
	private ImageView contenair;

	Modele modele = new Modele();


	//Ajout de l'utilisateur
	public void valPer(ActionEvent e){
		retour.setText("");
		try {

			Personnes personnes = new Personnes(nom.getText(),login.getText());
			modele.checkPers(personnes);

		}catch(IOException e1) {

			retour.setText("Erreur : " + e1.getMessage());
		}

	}

	//Ajout de la note
	public void valNote(ActionEvent e) {
		this.noteVal = note.getText();

	}

	//Afficher les images sélectionnées
	public void showMontagne(ActionEvent e) {
		Class clazz = this.getClass();
		InputStream input2 = clazz.getResourceAsStream("montagne.jpg");
		Image imageVue = new Image(input2, 250, 250, false, true);
		contenair.setImage(imageVue);

	}

	//Afficher les images sélectionnées
	public void showMer(ActionEvent e) {
		Class clazz = this.getClass();
		InputStream input2 = clazz.getResourceAsStream("mer.jpg");
		Image imageVue = new Image(input2, 250, 250, false, true);
		contenair.setImage(imageVue);

	}

	//Afficher les images sélectionnées
	public void showForet(ActionEvent e) {
		Class clazz = this.getClass();
		InputStream input2 = clazz.getResourceAsStream("Foret.jpg");
		Image imageVue = new Image(input2, 250, 250, false, true);
		contenair.setImage(imageVue);

	}

	/*
	public void showImg() {

		Class clazz = this.getClass();
		InputStream input2 = clazz.getResourceAsStream(this.url);
		Image imageVue = new Image (input2, 50, 50, false, true);
		this.imageVue = imageVue;
		Controller controller = new Controller();
		controller.setImages(imageVue);
	}*/



	//Getters and Setters

	public Personnes getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Personnes personnes) {
		this.personnes = personnes;
	}

	public String getNoteVal() {
		return noteVal;
	}

	public void setNoteVal(String noteVal) {
		this.noteVal = noteVal;
	}

	public Images getImages() {
		return images;
	}

	public void setImages(Images images) {
		this.images = images;
	}

	public ImageView getContenair() {
		return contenair;
	}

	public void setContenair(ImageView contenair) {
		this.contenair = contenair;
	}



}
