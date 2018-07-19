import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    char[] inputs = sc.next().toCharArray();
	    
	    String[] alphabets = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	    String alphabet = "";
	    int digitSum = 0;
	    for(int i=0;i<inputs.length;i++)
	    {
	        if(Character.isDigit(inputs[i]))
	            digitSum += Integer.parseInt(String.valueOf(inputs[i]));
	        else
	            alphabet += String.valueOf(inputs[i]); 
	    }
	    
	    int pick = 0;
	    for(int i=0;i<alphabet.length();i++)
	    {
	        int position = findPosition(alphabet.charAt(i));
	        if((digitSum+position)>=26)
	            pick = digitSum+position - 26;
	        else
	            pick = digitSum+position;
                
            int picked = pick % 26;	            
	        if(picked==0)
	            System.out.print(alphabets[25]);
	        else
	            System.out.print(alphabets[picked-1]);
	    }
	}
	
	public static int findPosition(char letter)
	{
	    char tempInput = Character.toLowerCase(letter);
	    int ascii = (int) tempInput;
	    return ascii - 96;
	}
}
