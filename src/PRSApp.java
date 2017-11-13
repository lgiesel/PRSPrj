
public class PRSApp {

	public static void main(String[] args) {
		
		Console.printToConsole("Welcome to User Data Entry");
		Console.printToConsole("");

		String choice = "y";
		while(choice.equalsIgnoreCase("y")){
					
			int id = Console.getInt("Enter ID:\t");
			String username = Console.getString("Enter username:\t", 20);
			String password = Console.getString("Enter password:\t", 10);
			String firstName = Console.getString("Enter firstname:\t", 20);
			String lastName = Console.getString("Enter lastname:\t", 20);
			String phone = Console.getString("Enter phone:\t", 12);
			String email = Console.getString("Enter email:\t", 75);			
			boolean reviewer = Console.getBoolean("Enter reviewer:\t");
			boolean admin = Console.getBoolean("Enter admin:\t");
			
			User u = new User(username, password, firstName, lastName, phone, email, reviewer, admin);

			Console.printToConsole("");
		
			Console.printToConsole(u.buildDisplayText());
			
			Console.printToConsole(u.toString());
			
			Console.printToConsole("");
			choice = Console.getString("Continue? y/n:\t", "y", "n");
		}	
		Console.printToConsole("");
		Console.printToConsole("Bye!");
	}
		
}
