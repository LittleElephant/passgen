import java.util.Random;


public class testRand {

	public static void main(String[] args){
		
		String s[] = {"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j",
				"k","l","z","x","c","v","b","n","m"};
		
		
		int length = 0;
	
		
		String letter = new String();
		String pass = new String();
		
		for (int i = 0 ; i<length ; i++ ){
			Random r = new Random();
			int randomInt = r.nextInt(26);
			
			letter = s[randomInt];
						
			pass = pass + letter;
			
					
		}
		System.out.println(pass);
		
	}
}
