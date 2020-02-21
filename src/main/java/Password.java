import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    public static void validatePassword(String password) throws PasswordException{
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digitCheck = false;
        boolean oneSpecialChar = false;

        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        String str = "abc@";
        Matcher match = pattern.matcher(str);

        if(password.length() < 8){
            throw new PasswordException("Password less than 8 characters.");
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
            if (match.matches()){
                oneSpecialChar = true;
            }
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
}
