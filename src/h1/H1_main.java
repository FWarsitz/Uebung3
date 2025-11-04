package h1;

public class H1_main {

	public static void main(String[] args) {
		double guthaben = -100;
		double monEingang = 200;
		int rating = 0;
		boolean warnhinweis = false;
		boolean negativ = false; 
		
		if (guthaben < 0) {
			negativ = true; 
		}
		else 
		{
			negativ = false;
		}
		
		if (guthaben > 0) {
			rating += 3; 
		}
		
		if (guthaben == 0 ) {
			rating += 2;
		}
		
		if (negativ = true && monEingang + guthaben >= 0) {
			rating += 1;
		}
		
		if (negativ = true && monEingang + guthaben <= 0) {
			rating -= 1;
		}
		
		if (negativ = true && monEingang + guthaben <= 0 && rating < 0) {
			warnhinweis = true;
		}
		else {
			warnhinweis = false;
		}
		
		System.out.println("Guthabe: " + guthaben + " monEingang: " + monEingang + " rating :" +rating + " negativ :" +negativ + " warinhinweis :" + warnhinweis);

	}

}
