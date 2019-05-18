public class Classroom{

	public static void main(String[] args){
		//les références
		Wilder celine = new Wilder("Céline", true);
		Wilder jeanClaude = new Wilder("Jean-Claude", false);

		//println
		System.out.println(celine.whoAmI());
		System.out.println(jeanClaude.whoAmI());
	}
}
