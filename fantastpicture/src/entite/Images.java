package entite;

public class Images{
	
	private String nomImg;
	private String url;
	
	
	public Images(String nomImg, String url) {
		super();
		this.nomImg = nomImg;
		this.url = url;
	}
	


	public String getNomImg() {
		return nomImg;
	}

	public void setNomImg(String nomImg) {
		this.nomImg = nomImg;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
