package userregisteration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@FunctionalInterface
interface ValidateUserEntry{
    boolean validityCheck(String input,String pattern);
}
public class UserRegisteration {
    static Scanner sc = new Scanner(System.in);
    public static String FIRST_NAME = "[A-Z][a-z]{3,}";
    public static String LAST_NAME = "^[a-zA-Z0-9]{3,}([\\\\.\\\\+\\\\-]?[a-zA-Z0-9]{3,})?[@][A-Za-z0-9]{1,}[.][A-Za-z]{2,4}[,]?([.][A-Za-z]{2,4}[.]?)?$";
    public static String EMAIL = "^[a-zA-Z0-9]{3,}([\\\\.\\\\+\\\\-]?[a-zA-Z0-9]{3,})?[@][A-Za-z0-9]{1,}[.][A-Za-z]{2,4}[,]?([.][A-Za-z]{2,4}[.]?)?$";
    public static String MOBILE = "^[9][1]\\\\s[6-9][0-9]{9}$";
    public static String PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()]).{8,}$";
    ValidateUserEntry validate = (String pattern, String name) -> Pattern.matches(pattern, name);

    public boolean validateName(String name) throws UserRegistrationException{
        //To check if name starts with Capital and has min 3 characters.
        try {
            if (name.isEmpty()) throw new UserRegistrationException("Entered value is empty",
                    UserRegistrationException.ExceptionType.ENTERED_EMPTY);
            return validate.validityCheck(FIRST_NAME,name);
        } catch(NullPointerException e) {
            throw new UserRegistrationException("\n Entered null!", UserRegistrationException.ExceptionType.ENTERED_NULL);
        }
    }

    public boolean validateEmail(String email)throws UserRegistrationException {
        //Checks email pattern.
        try {
            if (email.isEmpty()) throw new UserRegistrationException("Entered value is empty",
                    UserRegistrationException.ExceptionType.ENTERED_EMPTY);
            return validate.validityCheck(FIRST_NAME,email);
        }catch(NullPointerException e) {
            throw new UserRegistrationException("\n Entered null!", UserRegistrationException.ExceptionType.ENTERED_NULL);
        }
    }

    public boolean validatePhoneNo(String mobile)throws UserRegistrationException {
        //Checks mobile number.
        try {
            if (mobile.isEmpty()) throw new UserRegistrationException("Entered value is empty",
                    UserRegistrationException.ExceptionType.ENTERED_EMPTY);
            return validate.validityCheck(FIRST_NAME,mobile);
        }catch(NullPointerException e) {
            throw new UserRegistrationException("\n Entered null!", UserRegistrationException.ExceptionType.ENTERED_NULL);
        }
    }

    public boolean validatePassword(String password) throws UserRegistrationException{
        //Checks Password validity.
        try {
            if (password.isEmpty()) throw new UserRegistrationException("Entered value is empty",
                    UserRegistrationException.ExceptionType.ENTERED_EMPTY);
            return validate.validityCheck(FIRST_NAME,password);
        }catch(NullPointerException e) {
            throw new UserRegistrationException("\n Entered null!", UserRegistrationException.ExceptionType.ENTERED_NULL);
        }
    }

    public static void main(String[] args) {
        ValidateUserEntry validate = (String pattern, String input) -> Pattern.matches(pattern,input);
        System.out.println("Enter First Name: ");
        String fname = sc.next();
        System.out.println("Enter Last NAme : ");
        String lname = sc.next();
        System.out.println("Enter Email :");
        String email = sc.next();
        System.out.println("Enter Mobile Number :");
        String mobile = sc.next();
        System.out.println("Enter Password");
        String password = sc.next();

        System.out.println("First Name : " + validate.validityCheck(FIRST_NAME, fname));
        System.out.println("Last Name : " + validate.validityCheck(LAST_NAME,lname));
        System.out.println(" Email : " + validate.validityCheck(EMAIL, email));
        System.out.println("Mobile Number : " + validate.validityCheck(MOBILE, mobile));
        System.out.println("Password " + validate.validityCheck(PASSWORD, password));

    }
}
