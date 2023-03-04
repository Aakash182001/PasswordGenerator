import java.security.SecureRandom;

public class PasswordGenerator {

    
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@";

    
    private static final int LENGTH = 5;

   
    private static SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        String password = generatePassword();
        System.out.println("Your new password is: " + password);
    }

    private static String generatePassword() {
        StringBuilder sb = new StringBuilder(LENGTH);
        for (int i = 0; i < LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }
        return sb.toString();
    }
}
