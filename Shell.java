import java.util.Scanner;

public class Shell {
	
	public static void main(String[] args) {
		
		Shell sh = new Shell();
		sh.run();
		
		
		
		
	}
	
	public void setGlobalNode(Global g) {
		
	}
	
	public void run() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("JTM> ");
		
		while (userInput.hasNextLine()) {
			String input = userInput.nextLine();
			if (input.toLowerCase().equals("q")) {
				break;
			}
			
			// TODO process input function call needs to go here
			if (input.matches("^\\^[a-zA-z]+=.+")) {
				System.out.println("matched!");
			}
			
			System.out.print("JTM> ");
		}
		userInput.close();
	}
	
}
