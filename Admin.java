package ok3;
import java.util.ArrayList;


	public class Admin extends User {
	    public Admin() {
	        this.userId = "A001";
	        this.username = "admin";
	        this.password = "admin123";
	        this.email = "admin@example.com";
	    }

	    public void viewAllAccounts(ArrayList<Account> accounts) {
	        for (Account acc : accounts) {
	            System.out.println(acc.accountId + " | " + acc.accountHolderName + " | $" + acc.balance + " | " + acc.accountType);
	        }
	    }

	    public void blockUser(ArrayList<User> users, String userId) {
	        users.removeIf(user -> user.userId.equals(userId));
	        System.out.println("User " + userId + " blocked.");
	    }
	}



