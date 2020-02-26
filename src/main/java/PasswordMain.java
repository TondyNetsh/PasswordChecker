import java.util.Scanner;

public class PasswordMain {

    public static void main(String[] args) {
        PasswordChecker pass = new PasswordChecker();
        System.out.println("=====================================================");
        System.out.println("1. Password should not be empty.\n" +
                "2. Password should be at least 8 characters long.\n" +
                "3. Password should have at least one uppercase.\n" +
                "4. Password should have at least one lowercase.\n" +
                "5. Password should have at least one digit.\n" +
                "6. Password should have at least one char.");
        System.out.println("=====================================================");
        System.out.println("Enter your password: ");
        Scanner sc = new Scanner(System.in);
        String passWord = sc.nextLine();

        try {
            pass.validatePassword(passWord);
            PasswordChecker.passwordIsOk(passWord);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
