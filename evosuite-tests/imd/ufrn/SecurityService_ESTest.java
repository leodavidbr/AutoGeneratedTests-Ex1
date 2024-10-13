/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 13 00:10:30 GMT 2024
 */

package imd.ufrn;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import imd.ufrn.SecurityService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SecurityService_ESTest extends SecurityService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SecurityService securityService0 = new SecurityService();
      boolean boolean0 = securityService0.validateUser("", "B`OI~$P7(o");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SecurityService securityService0 = new SecurityService();
      String string0 = securityService0.encryptData("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SecurityService securityService0 = new SecurityService();
      String string0 = securityService0.decryptData("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SecurityService securityService0 = new SecurityService();
      // Undeclared exception!
      try { 
        securityService0.encryptData((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("imd.ufrn.SecurityService", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SecurityService securityService0 = new SecurityService();
      // Undeclared exception!
      try { 
        securityService0.decryptData((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("imd.ufrn.SecurityService", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SecurityService securityService0 = new SecurityService();
      boolean boolean0 = securityService0.validateUser("", "super_secret_key");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SecurityService securityService0 = new SecurityService();
      String string0 = securityService0.decryptData("@S`F'icrW=uRt]`[");
      assertEquals("36\u00135B\u001B\u0006\u00022V*\"\u00066\u0013/", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SecurityService securityService0 = new SecurityService();
      String string0 = securityService0.encryptData("4gt%^k_z1");
      assertEquals("F\u0002\u0006z;\u001F&\u001FD", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SecurityService securityService0 = new SecurityService();
      boolean boolean0 = securityService0.validateUser("RVF2oUObB2rufRO", "Rzj2eoEbBu2ruOJRE");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SecurityService securityService0 = new SecurityService();
      boolean boolean0 = securityService0.validateUser("F\u0002\u0006z;\u0003\u001F&\u001FD", "36\u00135B\u001B\u0006\u00022V*\"\u00066\u0013/");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SecurityService securityService0 = new SecurityService();
      boolean boolean0 = securityService0.validateUser("36\u00135B\u001B\u0006\u00022V*\"\u00066\u0013/", "@S`F'icrW=uRt]`[");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SecurityService securityService0 = new SecurityService();
      boolean boolean0 = securityService0.validateUser("36\u00135B\u001B\u0006\u00022V*\"\u00066\u0013/", "36\u00135B\u001B\u0006\u00022V*\"\u00066\u0013/");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SecurityService securityService0 = new SecurityService();
      boolean boolean0 = securityService0.validateUser("J", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SecurityService securityService0 = new SecurityService();
      boolean boolean0 = securityService0.validateUser("J", "I");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SecurityService securityService0 = new SecurityService();
      boolean boolean0 = securityService0.validateUser((String) null, (String) null);
      assertFalse(boolean0);
  }
}
