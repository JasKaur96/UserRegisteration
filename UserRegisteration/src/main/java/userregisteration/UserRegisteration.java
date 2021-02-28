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
    public static String FIRST_NAME = " ";
    public static String LAST_NAME = " ";
    public static String EMAIL = " ";
    public static String MOBILE = " ";
    public static String PASSWORD = " ";

    public boolean validateName(String name) throws UserRegistrationException{
        //To check if name starts with Capital and has min 3 characters.
        try {
            String regex="[A-Z][a-z]{3,}";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(name);
            return m.matches();
        } catch(NullPointerException e) {
            throw new UserRegistrationException("\n Entered null!", UserRegistrationException.ExceptionType.ENTERED_NULL);
        }
    }

    public boolean validateEmail(String email)throws UserRegistrationException {
        //Checks email pattern.
        try {
            String regex = "^[a-zA-Z0-9]{3,}([\\\\.\\\\+\\\\-]?[a-zA-Z0-9]{3,})?[@][A-Za-z0-9]{1,}[.][A-Za-z]{2,4}[,]?([.][A-Za-z]{2,4}[.]?)?$";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(email);
            return m.matches();
        }catch(NullPointerException e) {
            throw new UserRegistrationException("\n Entered null!", UserRegistrationException.ExceptionType.ENTERED_NULL);
        }
    }

    public boolean validatePhoneNo(String mobile)throws UserRegistrationException {
        //Checks mobile number.
        try {

            String regex = "^[9][1]\\\\s[6-9][0-9]{9}$";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(mobile);
            return m.matches();
        }catch(NullPointerException e) {
            throw new UserRegistrationException("\n Entered null!", UserRegistrationException.ExceptionType.ENTERED_NULL);
        }
    }

    public boolean validatePassword(String password) throws UserRegistrationException{
        //Checks Password validity.
        try {
            String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()]).{8,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher m = pattern.matcher(password);
            return m.matches();
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