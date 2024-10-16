/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 13 00:12:56 GMT 2024
 */

package imd.ufrn;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import imd.ufrn.FinancialDataAnalysis;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FinancialDataAnalysis_ESTest extends FinancialDataAnalysis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double(Double.NaN);
      linkedList0.add(double0);
      linkedList0.add(double0);
      double double1 = financialDataAnalysis0.calculatePearsonCorrelation(linkedList0, linkedList0);
      assertEquals(Double.NaN, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double(7768035.6960453205);
      linkedList0.add(double0);
      linkedList0.addAll((Collection<? extends Double>) linkedList0);
      double double1 = financialDataAnalysis0.calculatePearsonCorrelation(linkedList0, linkedList0);
      assertEquals(Double.NaN, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double((-1.0));
      linkedList0.add(double0);
      LinkedList<Double> linkedList1 = new LinkedList<Double>();
      linkedList1.add(double0);
      double double1 = financialDataAnalysis0.calculatePearsonCorrelation(linkedList0, linkedList1);
      assertEquals(Double.NaN, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double((-680.76600478206));
      linkedList0.add(double0);
      LinkedList<Double> linkedList1 = new LinkedList<Double>();
      double double1 = financialDataAnalysis0.calculatePearsonCorrelation(linkedList1, linkedList0);
      assertEquals(Double.NaN, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double(Double.NaN);
      linkedList0.add(double0);
      linkedList0.add(double0);
      double double1 = financialDataAnalysis0.calculateStandardDeviation(linkedList0);
      assertEquals(Double.NaN, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double(0.0);
      linkedList0.addFirst(double0);
      Double double1 = new Double(7768035.6960453205);
      linkedList0.add(double1);
      double double2 = financialDataAnalysis0.calculateAverage(linkedList0);
      assertEquals(3884017.8480226602, double2, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double((-1.0));
      linkedList0.add(double0);
      double double1 = financialDataAnalysis0.calculateAverage(linkedList0);
      assertEquals((-2.0), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double(0.0);
      linkedList0.addFirst(double0);
      List<Double> list0 = linkedList0.subList(1, 1);
      linkedList0.offerLast(double0);
      // Undeclared exception!
      try { 
        financialDataAnalysis0.calculateStandardDeviation(list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      linkedList0.add((Double) null);
      // Undeclared exception!
      try { 
        financialDataAnalysis0.calculateStandardDeviation(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("imd.ufrn.FinancialDataAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double((-1.0));
      linkedList0.add(double0);
      List<Double> list0 = linkedList0.subList(0, 0);
      linkedList0.remove(0);
      // Undeclared exception!
      try { 
        financialDataAnalysis0.calculatePearsonCorrelation(list0, linkedList0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      linkedList0.offerFirst((Double) null);
      // Undeclared exception!
      try { 
        financialDataAnalysis0.calculatePearsonCorrelation(linkedList0, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("imd.ufrn.FinancialDataAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double((-1.0));
      linkedList0.add(double0);
      List<Double> list0 = linkedList0.subList(0, 0);
      linkedList0.remove(0);
      // Undeclared exception!
      try { 
        financialDataAnalysis0.calculateAverage(list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double(0.0);
      linkedList0.addFirst(double0);
      double double1 = financialDataAnalysis0.calculateAverage(linkedList0);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double(0.0);
      linkedList0.addFirst(double0);
      Double double1 = new Double(7768035.6960453205);
      linkedList0.add(double1);
      double double2 = financialDataAnalysis0.calculatePearsonCorrelation(linkedList0, linkedList0);
      assertEquals(1.0, double2, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      LinkedList<Double> linkedList1 = new LinkedList<Double>();
      Double double0 = new Double(0.0);
      linkedList0.add(double0);
      double double1 = financialDataAnalysis0.calculatePearsonCorrelation(linkedList0, linkedList1);
      assertEquals(Double.NaN, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      double double0 = financialDataAnalysis0.calculatePearsonCorrelation(linkedList0, (List<Double>) null);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      double double0 = financialDataAnalysis0.calculatePearsonCorrelation((List<Double>) null, linkedList0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double((-1.0));
      linkedList0.add(double0);
      linkedList0.remove(0);
      double double1 = financialDataAnalysis0.calculateStandardDeviation(linkedList0);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      double double0 = financialDataAnalysis0.calculateStandardDeviation((List<Double>) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double((-1.0));
      linkedList0.add(double0);
      double double1 = financialDataAnalysis0.calculateStandardDeviation(linkedList0);
      assertEquals(Double.POSITIVE_INFINITY, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      linkedList0.add((Double) null);
      // Undeclared exception!
      try { 
        financialDataAnalysis0.calculateAverage(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("imd.ufrn.FinancialDataAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      double double0 = financialDataAnalysis0.calculateAverage(linkedList0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FinancialDataAnalysis financialDataAnalysis0 = new FinancialDataAnalysis();
      double double0 = financialDataAnalysis0.calculateAverage((List<Double>) null);
      assertEquals(0.0, double0, 0.01);
  }
}
