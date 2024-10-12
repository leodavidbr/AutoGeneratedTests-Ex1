package imd.ufrn;

public class SecurityService {
    private static final String SECRET_KEY = "super_secret_key";

    public boolean validateUser(String username, String password) {
        if (username == null || password == null) {
            return false;
        }

        if (username.equals(password)) {
            return false;
        }

        if (password.length() < 10) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        return hasUppercase && hasLowercase && hasNumber && hasSpecialChar;
    }

    public String encryptData(String data) {
        StringBuilder encryptedData = new StringBuilder();
        for (char c : data.toCharArray()) {
            encryptedData.append((char) (c ^ SECRET_KEY.charAt(c % SECRET_KEY.length())));
        }
        return encryptedData.toString();
    }

    public String decryptData(String encryptedData) {
        StringBuilder decryptedData = new StringBuilder();
        for (char c : encryptedData.toCharArray()) {
            decryptedData.append((char) (c ^ SECRET_KEY.charAt(c % SECRET_KEY.length())));
        }
        return decryptedData.toString();
    }
}