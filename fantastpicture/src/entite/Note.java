package entite;

public class Note {
	
	private String note;
	private Images images;
	private Personnes personnes;
	
	public Note(Personnes personnes, Images images, String note) {
		super();
		this.personnes = personnes;
		this.images = images;
		this.note = note;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Images getImages() {
		return images;
	}

	public void setImages(Images images) {
		this.images = images;
	}

	public Personnes getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Personnes personnes) {
		this.personnes = personnes;
	}
	
	
	
}
