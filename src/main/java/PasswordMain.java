import java.util.Scanner;

public class PasswordMain {

    public static void main(String[] args) {
        System.out.println("Enter a password: ");
        Scanner sc = new Scanner(System.in);
        String passWord = sc.nextLine();

        try {
            Password.validatePassword(passWord);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
