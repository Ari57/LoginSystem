import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {



        String Username;
        String Password; // creates username/password variable

        Username = "abc"; // login details
        Password = "123";

        Scanner username1 = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = username1.next();
        // above allows user to input their username

        Scanner password1 = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = password1.next();
        // above allows user to input their password

        if (username.equals(Username) && password.equals(Password)) {
            System.out.println("You have logged in");
        } else if (username.equals(Username)) {
            System.out.println("Invalid Username");
        } else if (password.equals(Password)) {
            System.out.println("Invalid Password");
        } else {
            System.out.println("Invalid Username and Password");
        }
        // if statement above checks to see if the details are correct
        // note that there are lower/upper case variants of username/password
        // lower case is used for scanner input
        // upper case holds the login details
        username1.close();
        password1.close();


    }
}

