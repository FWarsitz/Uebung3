package h2;

public class H2_main {

	public static void main(String[] args) {
		int jahr = 2006;
		boolean schalt = false;
		
		if(jahr % 4 == 0) {
			if(jahr % 100 == 0)
			{
				schalt = false; 
				if(jahr % 400 == 0) {
					schalt = true; 
				}
			}
			else {
				schalt = true;
			}
		}
		
		//System.out.println( jahr + " " + schalt);

	}

}
