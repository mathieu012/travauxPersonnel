package service;

import java.io.IOException;
import java.util.ArrayList;
import entite.Images;
import entite.Note;
import entite.Personnes;


public class Modele {
	
	ArrayList<Note> listNote = new ArrayList<>();
	
	public Modele() {
		super();
		
		Personnes personnes1 = new Personnes("Robert", "Robert12");
		Personnes personnes2 = new Personnes("Justin", "Justin12");
		
		
		Images image1 = new Images("Montagne", "C:\\Users\\Eleve\\Desktop\\montagne.jpg");
		Images image2 = new Images("Foret", "C:\\Users\\Eleve\\Desktop\\Foret.jpg");
		Images image3 = new Images("Mer", "C:\\Users\\Eleve\\Desktop\\mer.jpg");
		
		Note note1 = new Note(personnes1,image2,"14");
		Note note2 = new Note(personnes2,image3,"17");
		
		listNote.add(note1);
		listNote.add(note2);
	}
	
	public void checkPers(Personnes personnes) throws IOException{
		boolean userOk = false;
			for(Note i : listNote) {
				if(i.getPersonnes().getNom().equals(personnes.getNom()) && i.getPersonnes().getLogin().equals(personnes.getLogin())){
					userOk = true;
				}
			}
			if(userOk != true) {
				throw new IOException("Les données sont invalides");
			}
	}

	

}
