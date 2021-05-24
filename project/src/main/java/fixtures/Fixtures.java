package fixtures;

public abstract class Fixtures {
	public Fixtures(String name, 
			String shortDescription2, 
			String longDescription2) {
		
		this.name=name;
		this.shortDescription=shortDescription;
		this.longDescription=longDescription;
	}
	public Fixtures() {
	}

	private String name;
	private String shortDescription;
	private String longDescription;
	
}
