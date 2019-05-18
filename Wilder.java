public class Wilder{
	// attributs
	private String firstName;
	private boolean aware;

	//constructors
	public Wilder (String firstName){
		this.firstName = firstName;
		this.aware = true;
	}
	
	public Wilder (String firstName, boolean aware){
		this.firstName = firstName;
		this.aware=true;
	} 

	//Statics Methods
	public static String jaffar(){
		return "GRITT !";	
	}

	//instances methods
	public String whoAmI(){
		if (this.aware == true){
			return "My name is " + firstName + " and I'm aware";
		}
		else{
			return "My name is " + firstName + " and I'm not aware";
		}
	}

	//getters
	public String getFirstName(){
		return this.firstName;
	}

	public boolean isAware(){
		return this.aware;
	}
	
	//setters
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}

	public void setAware(boolean aware){
		this.aware=aware;
	}


}
