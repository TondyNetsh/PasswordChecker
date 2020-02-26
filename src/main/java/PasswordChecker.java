public class PasswordChecker {
    static boolean upperCase = false;
    static boolean lowerCase = false;
    static boolean digitCheck = false;
    static boolean oneSpecialChar = false;
    static int counter = 0;

    public void validatePassword(String password) throws PasswordException{

        String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?,.]*$)";

        if(password.length() < 8 && password != null){
            throw new PasswordException("Password less than 8 characters and should not be empty.");
        }
        for(char c : password.toCharArray()){
            if(Character.isUpperCase(c)){
                upperCase = true;
                counter++;
            }
            if(Character.isLowerCase(c)){
                lowerCase = true;
                counter++;
            }
            if(Character.isDigit(c)){
                digitCheck = true;
                counter++;
            }
            if (password.matches(specialChars)) {
                oneSpecialChar = true;
                counter++;
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
       // System.out.println("Valid password");
    }

    public static boolean passwordIsOk(String password) throws PasswordException{
        boolean valid = false;

        if(counter >= 3){
            valid = true;
            System.out.print("Password valid: " + true);
        }
        else if (counter < 3){
            System.out.print("Password valid: " + false);
        }
        return valid;
    }
}
