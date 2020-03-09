import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {
    static boolean passwordExist = false;
    static boolean upperCase = false;
    static boolean lowerCase = false;
    static boolean digitCheck = false;
    static boolean oneSpecialChar = false;
    static int counter = 0;

    public static void passwordIsValid(String password) throws PasswordException{

        Pattern pass = Pattern.compile(".~!@#\\$%\\^&*\\(\\)_-=\\+:;'/,<>\\{}");
        Matcher matcher = pass.matcher(password);

        if(password.isEmpty() || password == null){
            throw new PasswordException("Password is empty.");
        }

        if(password.length() < 8){
            throw new PasswordException("Password less than 8 characters.");
        }
        if(password != null){
            passwordExist = true;
        }
        for(char c : password.toCharArray()){
            if(Character.isUpperCase(c)){
                upperCase = true;
            }
            if(Character.isLowerCase(c)){
                lowerCase = true;
            }
            if(Character.isDigit(c)){
                digitCheck = true;
            }
            if (password.matches(password)) {
                oneSpecialChar = true;
            }
        }

        if(upperCase == true){
            counter++;
        }
        if(lowerCase == true){
            counter++;
        }
        if(oneSpecialChar == true){
            counter++;
        }
        if(digitCheck == true){
            counter++;
        }

        if(!upperCase){
            throw new PasswordException("There is no uppercase character in your password");
        }
        if(!lowerCase){
            throw new PasswordException("There is no lowercase character in your password");
        }
        if(!digitCheck){
            throw new PasswordException("There is no number character in your password");
        }
        if(!oneSpecialChar){
            throw new PasswordException("There is no special character in your password.");
        }
        System.out.println("Valid password");
    }

    public static boolean passwordIsOk(String password) throws PasswordException{
        boolean valid = false;

        if(counter >= 3){
            valid = true;
            System.out.print("Password is valid: " + valid);
        }
        else{
            System.out.print("Password is valid: " + valid);
        }
        return valid;
    }
}
