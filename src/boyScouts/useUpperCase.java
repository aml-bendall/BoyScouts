package boyScouts;

public class useUpperCase {
	public static void main(String[] args) {
		
		new upperCase();
		
		boolean isCapital;
		isCapital = upperCase.isUpperCase(0,"Capital");
		System.out.println("True or flase, the letter is capital:" +isCapital);
		
		isCapital = upperCase.isUpperCase(0,"not Capital");
		System.out.println("True or flase, the letter is capital:" +isCapital);
		
		isCapital = upperCase.isUpperCase(0,"+Acbw2");
		System.out.println("True or flase, the letter is capital:" +isCapital);

		isCapital = upperCase.isUpperCase(1,"+Acbw2");
		System.out.println("True or flase, the letter is capital:" +isCapital);
		
		isCapital = upperCase.isUpperCase(0,"28569879");
		System.out.println("True or flase, the letter is capital:" +isCapital);

	}
}
