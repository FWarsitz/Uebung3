package h3;

public class H3_main {

	public static void main(String[] args) {
		int max =5;
		int fix = 5;
		int wartend = 2;
		boolean istVoll = false; 
		
		//wenn plätze noch frei sind 
		if (max > fix)
		{
			//temp = plätze noch frei 
			int temp = max - fix;
			if (temp >= wartend) 
			{
				fix += wartend;
				wartend = 0;
				
				if(max == fix)
				{
					istVoll = true;
				}
				else
				{
					istVoll = false;
				}
			}
			else
			{
				wartend -= temp;
				fix += temp;
				istVoll = true;
			}
			
		}
		else
		{
			istVoll = true;
		}
		
		//System.out.println("Max: " + max + " Fix: "+ fix + " wartend: " + wartend + " istVoll: "+ istVoll);
	}

}
