package imd.ufrn;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SecurityServiceTest.ValidateUserTests.class,
        SecurityServiceTest.EncryptDataTests.class,
        SecurityServiceTest.DecryptDataTests.class
})
public class SecurityServiceTest {

    public static class ValidateUserTests {

        private final SecurityService securityService = new SecurityService();

        @Test
        public void testValidCredentials() {
            Assert.assertTrue(securityService.validateUser("ValidUser", "Passw0rd!"));
        }

        @Test
        public void testNullUsername() {
            Assert.assertFalse(securityService.validateUser(null, "Password123!"));
        }

        @Test
        public void testNullPassword() {
            Assert.assertFalse(securityService.validateUser("ValidUser", null));
        }

        @Test
        public void testUsernameEqualsPassword() {
            Assert.assertFalse(securityService.validateUser("SameUser", "SameUser"));
        }

        @Test
        public void testPasswordTooShort() {
            Assert.assertFalse(securityService.validateUser("ValidUser", "short"));
        }

        @Test
        public void testPasswordMissingUppercase() {
            Assert.assertFalse(securityService.validateUser("ValidUser", "lowercase1!"));
        }

        @Test
        public void testPasswordMissingLowercase() {
            Assert.assertFalse(securityService.validateUser("ValidUser", "UPPERCASE1!"));
        }

        @Test
        public void testPasswordMissingNumber() {
            Assert.assertFalse(securityService.validateUser("ValidUser", "NoNumber!"));
        }

        @Test
        public void testPasswordMissingSpecialChar() {
            Assert.assertFalse(securityService.validateUser("ValidUser", "NoSpecial123"));
        }

        @Test
        public void testPasswordValidAllConditionsMet() {
            Assert.assertTrue(securityService.validateUser("ValidUser", "ValidPass1!"));
        }
    }

    public static class EncryptDataTests {

        private final SecurityService securityService = new SecurityService();

        @Test
        public void testEncryptNonEmptyData() {
            String data = "TestData";
            String encryptedData = securityService.encryptData(data);
            Assert.assertNotEquals(data, encryptedData);
        }

        @Test
        public void testEncryptEmptyData() {
            String data = "";
            String encryptedData = securityService.encryptData(data);
            Assert.assertEquals(data, encryptedData);
        }

        @Test
        public void testEncryptSpecialChars() {
            String data = "!@#$%^&*()";
            String encryptedData = securityService.encryptData(data);
            Assert.assertNotEquals(data, encryptedData);
        }
    }

    public static class DecryptDataTests {

        private final SecurityService securityService = new SecurityService();

        @Test
        public void testDecryptEncryptedData() {
            String data = "TestData";
            String encryptedData = securityService.encryptData(data);
            String decryptedData = securityService.decryptData(encryptedData);
            Assert.assertEquals(data, decryptedData);
        }

        @Test
        public void testDecryptEmptyData() {
            String encryptedData = "";
            String decryptedData = securityService.decryptData(encryptedData);
            Assert.assertEquals(encryptedData, decryptedData);
        }

        @Test
        public void testDecryptSpecialChars() {
            String data = "!@#$%^&*()";
            String encryptedData = securityService.encryptData(data);
            String decryptedData = securityService.decryptData(encryptedData);
            Assert.assertEquals(data, decryptedData);
        }
    }
}