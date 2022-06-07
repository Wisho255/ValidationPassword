import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordCreation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 boolean run= true;
		    do{
		    String regex ="^(?=.*[a-z])(?=.*[A-Z])(?=.*[!]).{7,12}$";
		    System.out.println("Write what your password would be");
		    String password1 = scan.nextLine();
		    boolean validPassword =Correct(password1,regex);
		    System.out.println(password1 + " is a valid password: " + validPassword);
		    System.out.println("Do yo want to change the password? y/n");
		    
		    String answ = scan.nextLine();
		    if(answ.equalsIgnoreCase("n")){
		      run = false;
		    }
		  }while(run);
		  scan.close();
	}
	public static boolean Correct(String password, String regex){
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(password);
	    return matcher.matches();
	}
}
