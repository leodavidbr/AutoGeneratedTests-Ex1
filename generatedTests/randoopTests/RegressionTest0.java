package imd.ufrn;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Class<?> wildcardClass1 = financialDataAnalysis0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis16 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis17 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray20 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList21 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList21, doubleArray20);
        java.lang.Double[] doubleArray27 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList28 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList28, doubleArray27);
        double double30 = financialDataAnalysis17.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList21, (java.util.List<java.lang.Double>) doubleList28);
        double double31 = financialDataAnalysis16.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList21);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis32 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis33 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray36 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList37 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList37, doubleArray36);
        java.lang.Double[] doubleArray43 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList44 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList44, doubleArray43);
        double double46 = financialDataAnalysis33.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList37, (java.util.List<java.lang.Double>) doubleList44);
        double double47 = financialDataAnalysis32.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList37);
        double double48 = financialDataAnalysis16.calculateAverage((java.util.List<java.lang.Double>) doubleList37);
        double double49 = financialDataAnalysis0.calculateAverage((java.util.List<java.lang.Double>) doubleList37);
        java.lang.Class<?> wildcardClass50 = financialDataAnalysis0.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 70.71067811865476d + "'", double31 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 70.71067811865476d + "'", double47 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 50.0d + "'", double48 == 50.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 50.0d + "'", double49 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        java.lang.Class<?> wildcardClass16 = doubleList5.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis16 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis17 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray20 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList21 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList21, doubleArray20);
        java.lang.Double[] doubleArray27 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList28 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList28, doubleArray27);
        double double30 = financialDataAnalysis17.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList21, (java.util.List<java.lang.Double>) doubleList28);
        double double31 = financialDataAnalysis16.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList21);
        double double32 = financialDataAnalysis0.calculateAverage((java.util.List<java.lang.Double>) doubleList21);
        java.lang.Class<?> wildcardClass33 = financialDataAnalysis0.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 70.71067811865476d + "'", double31 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 50.0d + "'", double32 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis16 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis17 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray20 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList21 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList21, doubleArray20);
        java.lang.Double[] doubleArray27 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList28 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList28, doubleArray27);
        double double30 = financialDataAnalysis17.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList21, (java.util.List<java.lang.Double>) doubleList28);
        double double31 = financialDataAnalysis16.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList21);
        double double32 = financialDataAnalysis0.calculateAverage((java.util.List<java.lang.Double>) doubleList21);
        java.lang.Class<?> wildcardClass33 = doubleList21.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 70.71067811865476d + "'", double31 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 50.0d + "'", double32 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        java.util.List<java.lang.Double> doubleList16 = null;
        double double17 = financialDataAnalysis0.calculateAverage(doubleList16);
        java.util.List<java.lang.Double> doubleList18 = null;
        double double19 = financialDataAnalysis0.calculateAverage(doubleList18);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis20 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray23 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList24 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList24, doubleArray23);
        java.lang.Double[] doubleArray30 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList31 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList31, doubleArray30);
        double double33 = financialDataAnalysis20.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList24, (java.util.List<java.lang.Double>) doubleList31);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis34 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray37 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList38 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList38, doubleArray37);
        java.lang.Double[] doubleArray44 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList45 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList45, doubleArray44);
        double double47 = financialDataAnalysis34.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList38, (java.util.List<java.lang.Double>) doubleList45);
        double double48 = financialDataAnalysis20.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList45);
        double double49 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList45);
        java.lang.Class<?> wildcardClass50 = financialDataAnalysis0.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 57.74152174417759d + "'", double48 == 57.74152174417759d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 57.74152174417759d + "'", double49 == 57.74152174417759d);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        boolean boolean3 = securityService0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass4 = securityService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("");
        java.lang.String str4 = securityService0.encryptData("\013\033T");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\177o&" + "'", str4, "\177o&");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        boolean boolean3 = securityService0.validateUser("", "hi!");
        java.lang.String str5 = securityService0.encryptData("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\013\033T" + "'", str5, "\013\033T");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis16 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray19 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList20 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList20, doubleArray19);
        java.lang.Double[] doubleArray26 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList27 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList27, doubleArray26);
        double double29 = financialDataAnalysis16.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList20, (java.util.List<java.lang.Double>) doubleList27);
        double double30 = financialDataAnalysis0.calculateAverage((java.util.List<java.lang.Double>) doubleList20);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis31 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis32 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray35 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList36 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList36, doubleArray35);
        java.lang.Double[] doubleArray42 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList43 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList43, doubleArray42);
        double double45 = financialDataAnalysis32.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList36, (java.util.List<java.lang.Double>) doubleList43);
        double double46 = financialDataAnalysis31.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList36);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis47 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis48 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray51 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList52 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList52, doubleArray51);
        java.lang.Double[] doubleArray58 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList59 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList59, doubleArray58);
        double double61 = financialDataAnalysis48.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList52, (java.util.List<java.lang.Double>) doubleList59);
        double double62 = financialDataAnalysis47.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList52);
        double double63 = financialDataAnalysis31.calculateAverage((java.util.List<java.lang.Double>) doubleList52);
        double double64 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList52);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis65 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray68 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList69 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList69, doubleArray68);
        java.lang.Double[] doubleArray75 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList76 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList76, doubleArray75);
        double double78 = financialDataAnalysis65.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList69, (java.util.List<java.lang.Double>) doubleList76);
        double double79 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList76);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 50.0d + "'", double30 == 50.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 70.71067811865476d + "'", double46 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 70.71067811865476d + "'", double62 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 50.0d + "'", double63 == 50.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 70.71067811865476d + "'", double64 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 57.74152174417759d + "'", double79 == 57.74152174417759d);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("hi!");
        java.lang.String str4 = securityService0.encryptData("\177o&");
        java.lang.String str6 = securityService0.encryptData("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\006\026U" + "'", str4, "\006\026U");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis16 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray19 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList20 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList20, doubleArray19);
        java.lang.Double[] doubleArray26 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList27 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList27, doubleArray26);
        double double29 = financialDataAnalysis16.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList20, (java.util.List<java.lang.Double>) doubleList27);
        double double30 = financialDataAnalysis0.calculateAverage((java.util.List<java.lang.Double>) doubleList20);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis31 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis32 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray35 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList36 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList36, doubleArray35);
        java.lang.Double[] doubleArray42 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList43 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList43, doubleArray42);
        double double45 = financialDataAnalysis32.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList36, (java.util.List<java.lang.Double>) doubleList43);
        double double46 = financialDataAnalysis31.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList36);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis47 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis48 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray51 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList52 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList52, doubleArray51);
        java.lang.Double[] doubleArray58 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList59 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList59, doubleArray58);
        double double61 = financialDataAnalysis48.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList52, (java.util.List<java.lang.Double>) doubleList59);
        double double62 = financialDataAnalysis47.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList52);
        double double63 = financialDataAnalysis31.calculateAverage((java.util.List<java.lang.Double>) doubleList52);
        double double64 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList52);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis65 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis66 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray69 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList70 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList70, doubleArray69);
        java.lang.Double[] doubleArray76 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList77 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList77, doubleArray76);
        double double79 = financialDataAnalysis66.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList70, (java.util.List<java.lang.Double>) doubleList77);
        double double80 = financialDataAnalysis65.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList70);
        java.util.List<java.lang.Double> doubleList81 = null;
        double double82 = financialDataAnalysis65.calculateAverage(doubleList81);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis83 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray86 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList87 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList87, doubleArray86);
        java.lang.Double[] doubleArray93 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList94 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList94, doubleArray93);
        double double96 = financialDataAnalysis83.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList87, (java.util.List<java.lang.Double>) doubleList94);
        double double97 = financialDataAnalysis65.calculateAverage((java.util.List<java.lang.Double>) doubleList87);
        double double98 = financialDataAnalysis0.calculateAverage((java.util.List<java.lang.Double>) doubleList87);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 50.0d + "'", double30 == 50.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 70.71067811865476d + "'", double46 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 70.71067811865476d + "'", double62 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 50.0d + "'", double63 == 50.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 70.71067811865476d + "'", double64 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 70.71067811865476d + "'", double80 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertArrayEquals(doubleArray93, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double96));
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 50.0d + "'", double97 == 50.0d);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 50.0d + "'", double98 == 50.0d);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        java.util.List<java.lang.Double> doubleList16 = null;
        double double17 = financialDataAnalysis0.calculateAverage(doubleList16);
        java.util.List<java.lang.Double> doubleList18 = null;
        double double19 = financialDataAnalysis0.calculateAverage(doubleList18);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis20 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray23 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList24 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList24, doubleArray23);
        java.lang.Double[] doubleArray30 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList31 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList31, doubleArray30);
        double double33 = financialDataAnalysis20.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList24, (java.util.List<java.lang.Double>) doubleList31);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis34 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis35 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray38 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList39 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList39, doubleArray38);
        java.lang.Double[] doubleArray45 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList46 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList46, doubleArray45);
        double double48 = financialDataAnalysis35.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList39, (java.util.List<java.lang.Double>) doubleList46);
        double double49 = financialDataAnalysis34.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList39);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis50 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray53 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList54 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList54, doubleArray53);
        java.lang.Double[] doubleArray60 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList61 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList61, doubleArray60);
        double double63 = financialDataAnalysis50.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList54, (java.util.List<java.lang.Double>) doubleList61);
        double double64 = financialDataAnalysis34.calculateAverage((java.util.List<java.lang.Double>) doubleList54);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis65 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis66 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray69 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList70 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList70, doubleArray69);
        java.lang.Double[] doubleArray76 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList77 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList77, doubleArray76);
        double double79 = financialDataAnalysis66.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList70, (java.util.List<java.lang.Double>) doubleList77);
        double double80 = financialDataAnalysis65.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList70);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis81 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis82 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray85 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList86 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList86, doubleArray85);
        java.lang.Double[] doubleArray92 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList93 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList93, doubleArray92);
        double double95 = financialDataAnalysis82.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList86, (java.util.List<java.lang.Double>) doubleList93);
        double double96 = financialDataAnalysis81.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList86);
        double double97 = financialDataAnalysis65.calculateAverage((java.util.List<java.lang.Double>) doubleList86);
        double double98 = financialDataAnalysis34.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList86);
        double double99 = financialDataAnalysis0.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList31, (java.util.List<java.lang.Double>) doubleList86);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 70.71067811865476d + "'", double49 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 50.0d + "'", double64 == 50.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 70.71067811865476d + "'", double80 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double95));
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 70.71067811865476d + "'", double96 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 50.0d + "'", double97 == 50.0d);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 70.71067811865476d + "'", double98 == 70.71067811865476d);
        org.junit.Assert.assertTrue(Double.isNaN(double99));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        boolean boolean3 = securityService0.validateUser("\177o&", "\006\026U");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        java.util.List<java.lang.Double> doubleList16 = null;
        double double17 = financialDataAnalysis0.calculateAverage(doubleList16);
        java.util.List<java.lang.Double> doubleList18 = null;
        double double19 = financialDataAnalysis0.calculateAverage(doubleList18);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis20 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray23 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList24 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList24, doubleArray23);
        java.lang.Double[] doubleArray30 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList31 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList31, doubleArray30);
        double double33 = financialDataAnalysis20.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList24, (java.util.List<java.lang.Double>) doubleList31);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis34 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray37 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList38 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList38, doubleArray37);
        java.lang.Double[] doubleArray44 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList45 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList45, doubleArray44);
        double double47 = financialDataAnalysis34.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList38, (java.util.List<java.lang.Double>) doubleList45);
        double double48 = financialDataAnalysis20.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList45);
        double double49 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList45);
        java.lang.Double[] doubleArray53 = new java.lang.Double[] { 0.0d, (-1.0d), (-1.0d) };
        java.util.ArrayList<java.lang.Double> doubleList54 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList54, doubleArray53);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis56 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis57 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray60 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList61 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList61, doubleArray60);
        java.lang.Double[] doubleArray67 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList68 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList68, doubleArray67);
        double double70 = financialDataAnalysis57.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList61, (java.util.List<java.lang.Double>) doubleList68);
        double double71 = financialDataAnalysis56.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList61);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis72 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray75 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList76 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList76, doubleArray75);
        java.lang.Double[] doubleArray82 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList83 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList83, doubleArray82);
        double double85 = financialDataAnalysis72.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList76, (java.util.List<java.lang.Double>) doubleList83);
        double double86 = financialDataAnalysis56.calculateAverage((java.util.List<java.lang.Double>) doubleList76);
        double double87 = financialDataAnalysis0.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList54, (java.util.List<java.lang.Double>) doubleList76);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 57.74152174417759d + "'", double48 == 57.74152174417759d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 57.74152174417759d + "'", double49 == 57.74152174417759d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new java.lang.Double[] { 0.0d, (-1.0d), (-1.0d) });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 70.71067811865476d + "'", double71 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 50.0d + "'", double86 == 50.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double87));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("");
        java.lang.String str4 = securityService0.decryptData("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\013\033T" + "'", str4, "\013\033T");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        java.util.List<java.lang.Double> doubleList16 = null;
        double double17 = financialDataAnalysis0.calculateAverage(doubleList16);
        java.util.List<java.lang.Double> doubleList18 = null;
        double double19 = financialDataAnalysis0.calculateAverage(doubleList18);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis20 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray23 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList24 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList24, doubleArray23);
        java.lang.Double[] doubleArray30 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList31 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList31, doubleArray30);
        double double33 = financialDataAnalysis20.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList24, (java.util.List<java.lang.Double>) doubleList31);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis34 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray37 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList38 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList38, doubleArray37);
        java.lang.Double[] doubleArray44 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList45 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList45, doubleArray44);
        double double47 = financialDataAnalysis34.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList38, (java.util.List<java.lang.Double>) doubleList45);
        double double48 = financialDataAnalysis20.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList45);
        double double49 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList45);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis50 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis51 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray54 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList55 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList55, doubleArray54);
        java.lang.Double[] doubleArray61 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList62 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList62, doubleArray61);
        double double64 = financialDataAnalysis51.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList55, (java.util.List<java.lang.Double>) doubleList62);
        double double65 = financialDataAnalysis50.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList55);
        java.util.List<java.lang.Double> doubleList66 = null;
        double double67 = financialDataAnalysis0.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList55, doubleList66);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis68 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray71 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList72 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList72, doubleArray71);
        java.lang.Double[] doubleArray78 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList79 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList79, doubleArray78);
        double double81 = financialDataAnalysis68.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList72, (java.util.List<java.lang.Double>) doubleList79);
        double double82 = financialDataAnalysis0.calculateAverage((java.util.List<java.lang.Double>) doubleList79);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 57.74152174417759d + "'", double48 == 57.74152174417759d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 57.74152174417759d + "'", double49 == 57.74152174417759d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 70.71067811865476d + "'", double65 == 70.71067811865476d);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 50.25d + "'", double82 == 50.25d);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.Class<?> wildcardClass1 = securityService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("hi!");
        java.lang.String str4 = securityService0.encryptData("\006\026U");
        java.lang.String str6 = securityService0.decryptData("\006\026U");
        java.lang.String str8 = securityService0.decryptData("");
        java.lang.Class<?> wildcardClass9 = securityService0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ue\n" + "'", str4, "ue\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ue\n" + "'", str6, "ue\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis2 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray5 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList6 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList6, doubleArray5);
        java.lang.Double[] doubleArray12 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList13 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList13, doubleArray12);
        double double15 = financialDataAnalysis2.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList6, (java.util.List<java.lang.Double>) doubleList13);
        double double16 = financialDataAnalysis1.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList6);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis17 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray20 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList21 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList21, doubleArray20);
        java.lang.Double[] doubleArray27 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList28 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList28, doubleArray27);
        double double30 = financialDataAnalysis17.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList21, (java.util.List<java.lang.Double>) doubleList28);
        double double31 = financialDataAnalysis1.calculateAverage((java.util.List<java.lang.Double>) doubleList21);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis32 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis33 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray36 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList37 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList37, doubleArray36);
        java.lang.Double[] doubleArray43 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList44 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList44, doubleArray43);
        double double46 = financialDataAnalysis33.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList37, (java.util.List<java.lang.Double>) doubleList44);
        double double47 = financialDataAnalysis32.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList37);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis48 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis49 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray52 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList53 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList53, doubleArray52);
        java.lang.Double[] doubleArray59 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList60 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList60, doubleArray59);
        double double62 = financialDataAnalysis49.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList53, (java.util.List<java.lang.Double>) doubleList60);
        double double63 = financialDataAnalysis48.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList53);
        double double64 = financialDataAnalysis32.calculateAverage((java.util.List<java.lang.Double>) doubleList53);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis65 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis66 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray69 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList70 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList70, doubleArray69);
        java.lang.Double[] doubleArray76 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList77 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList77, doubleArray76);
        double double79 = financialDataAnalysis66.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList70, (java.util.List<java.lang.Double>) doubleList77);
        double double80 = financialDataAnalysis65.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList70);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis81 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis82 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray85 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList86 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList86, doubleArray85);
        java.lang.Double[] doubleArray92 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList93 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList93, doubleArray92);
        double double95 = financialDataAnalysis82.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList86, (java.util.List<java.lang.Double>) doubleList93);
        double double96 = financialDataAnalysis81.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList86);
        double double97 = financialDataAnalysis65.calculateAverage((java.util.List<java.lang.Double>) doubleList86);
        double double98 = financialDataAnalysis32.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList86);
        double double99 = financialDataAnalysis0.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList21, (java.util.List<java.lang.Double>) doubleList86);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 70.71067811865476d + "'", double16 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 50.0d + "'", double31 == 50.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 70.71067811865476d + "'", double47 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 70.71067811865476d + "'", double63 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 50.0d + "'", double64 == 50.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 70.71067811865476d + "'", double80 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double95));
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 70.71067811865476d + "'", double96 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 50.0d + "'", double97 == 50.0d);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 70.71067811865476d + "'", double98 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double99 + "' != '" + 1.0d + "'", double99 == 1.0d);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        java.util.List<java.lang.Double> doubleList16 = null;
        double double17 = financialDataAnalysis0.calculateAverage(doubleList16);
        java.util.List<java.lang.Double> doubleList18 = null;
        double double19 = financialDataAnalysis0.calculateAverage(doubleList18);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis20 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray23 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList24 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList24, doubleArray23);
        java.lang.Double[] doubleArray30 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList31 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList31, doubleArray30);
        double double33 = financialDataAnalysis20.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList24, (java.util.List<java.lang.Double>) doubleList31);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis34 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray37 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList38 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList38, doubleArray37);
        java.lang.Double[] doubleArray44 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList45 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList45, doubleArray44);
        double double47 = financialDataAnalysis34.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList38, (java.util.List<java.lang.Double>) doubleList45);
        double double48 = financialDataAnalysis20.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList45);
        double double49 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList45);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis50 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis51 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray54 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList55 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList55, doubleArray54);
        java.lang.Double[] doubleArray61 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList62 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList62, doubleArray61);
        double double64 = financialDataAnalysis51.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList55, (java.util.List<java.lang.Double>) doubleList62);
        double double65 = financialDataAnalysis50.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList55);
        java.util.List<java.lang.Double> doubleList66 = null;
        double double67 = financialDataAnalysis0.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList55, doubleList66);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis68 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray71 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList72 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList72, doubleArray71);
        java.lang.Double[] doubleArray78 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList79 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList79, doubleArray78);
        double double81 = financialDataAnalysis68.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList72, (java.util.List<java.lang.Double>) doubleList79);
        double double82 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList72);
        java.lang.Class<?> wildcardClass83 = doubleList72.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 57.74152174417759d + "'", double48 == 57.74152174417759d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 57.74152174417759d + "'", double49 == 57.74152174417759d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 70.71067811865476d + "'", double65 == 70.71067811865476d);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 70.71067811865476d + "'", double82 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.decryptData("hi!");
        java.lang.Class<?> wildcardClass3 = securityService0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("hi!");
        java.lang.String str4 = securityService0.encryptData("\006\026U");
        java.lang.String str6 = securityService0.encryptData("");
        java.lang.String str8 = securityService0.encryptData("hi!");
        java.lang.Class<?> wildcardClass9 = securityService0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ue\n" + "'", str4, "ue\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\013\033T" + "'", str8, "\013\033T");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        boolean boolean3 = securityService0.validateUser("", "hi!");
        java.lang.String str5 = securityService0.decryptData("hi!");
        java.lang.String str7 = securityService0.encryptData("\006\026U");
        java.lang.String str9 = securityService0.encryptData("hi!");
        java.lang.String str11 = securityService0.encryptData("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\013\033T" + "'", str5, "\013\033T");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ue\n" + "'", str7, "ue\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\013\033T" + "'", str9, "\013\033T");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\013\033T" + "'", str11, "\013\033T");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("hi!");
        java.lang.String str4 = securityService0.encryptData("\006\026U");
        java.lang.String str6 = securityService0.encryptData("");
        boolean boolean9 = securityService0.validateUser("", "\006\026U");
        java.lang.Class<?> wildcardClass10 = securityService0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ue\n" + "'", str4, "ue\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        boolean boolean3 = securityService0.validateUser("", "hi!");
        java.lang.String str5 = securityService0.decryptData("hi!");
        java.lang.String str7 = securityService0.encryptData("\006\026U");
        boolean boolean10 = securityService0.validateUser("hi!", "\177o&");
        java.lang.Class<?> wildcardClass11 = securityService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\013\033T" + "'", str5, "\013\033T");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ue\n" + "'", str7, "ue\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        boolean boolean3 = securityService0.validateUser("\177o&", "ue\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        java.util.List<java.lang.Double> doubleList16 = null;
        double double17 = financialDataAnalysis0.calculateAverage(doubleList16);
        java.util.List<java.lang.Double> doubleList18 = null;
        double double19 = financialDataAnalysis0.calculateAverage(doubleList18);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis20 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray23 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList24 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList24, doubleArray23);
        java.lang.Double[] doubleArray30 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList31 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList31, doubleArray30);
        double double33 = financialDataAnalysis20.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList24, (java.util.List<java.lang.Double>) doubleList31);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis34 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray37 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList38 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList38, doubleArray37);
        java.lang.Double[] doubleArray44 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList45 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList45, doubleArray44);
        double double47 = financialDataAnalysis34.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList38, (java.util.List<java.lang.Double>) doubleList45);
        double double48 = financialDataAnalysis20.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList45);
        double double49 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList45);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis50 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis51 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray54 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList55 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList55, doubleArray54);
        java.lang.Double[] doubleArray61 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList62 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList62, doubleArray61);
        double double64 = financialDataAnalysis51.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList55, (java.util.List<java.lang.Double>) doubleList62);
        double double65 = financialDataAnalysis50.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList55);
        java.util.List<java.lang.Double> doubleList66 = null;
        double double67 = financialDataAnalysis0.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList55, doubleList66);
        java.lang.Class<?> wildcardClass68 = financialDataAnalysis0.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 57.74152174417759d + "'", double48 == 57.74152174417759d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 57.74152174417759d + "'", double49 == 57.74152174417759d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 70.71067811865476d + "'", double65 == 70.71067811865476d);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        java.util.List<java.lang.Double> doubleList16 = null;
        double double17 = financialDataAnalysis0.calculateAverage(doubleList16);
        java.util.List<java.lang.Double> doubleList18 = null;
        double double19 = financialDataAnalysis0.calculateAverage(doubleList18);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis20 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray23 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList24 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList24, doubleArray23);
        java.lang.Double[] doubleArray30 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList31 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList31, doubleArray30);
        double double33 = financialDataAnalysis20.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList24, (java.util.List<java.lang.Double>) doubleList31);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis34 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray37 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList38 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList38, doubleArray37);
        java.lang.Double[] doubleArray44 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList45 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList45, doubleArray44);
        double double47 = financialDataAnalysis34.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList38, (java.util.List<java.lang.Double>) doubleList45);
        double double48 = financialDataAnalysis20.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList45);
        double double49 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList45);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis50 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis51 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray54 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList55 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList55, doubleArray54);
        java.lang.Double[] doubleArray61 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList62 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList62, doubleArray61);
        double double64 = financialDataAnalysis51.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList55, (java.util.List<java.lang.Double>) doubleList62);
        double double65 = financialDataAnalysis50.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList55);
        java.util.List<java.lang.Double> doubleList66 = null;
        double double67 = financialDataAnalysis0.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList55, doubleList66);
        java.lang.Class<?> wildcardClass68 = doubleList55.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 57.74152174417759d + "'", double48 == 57.74152174417759d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 57.74152174417759d + "'", double49 == 57.74152174417759d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 70.71067811865476d + "'", double65 == 70.71067811865476d);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("hi!");
        boolean boolean5 = securityService0.validateUser("hi!", "");
        boolean boolean8 = securityService0.validateUser("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("");
        boolean boolean5 = securityService0.validateUser("\013\033T", "ue\n");
        boolean boolean8 = securityService0.validateUser("hi!", "\013\033T");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("hi!");
        boolean boolean5 = securityService0.validateUser("hi!", "");
        java.lang.String str7 = securityService0.decryptData("\006\026U");
        java.lang.String str9 = securityService0.decryptData("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ue\n" + "'", str7, "ue\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("hi!");
        java.lang.String str4 = securityService0.encryptData("\177o&");
        boolean boolean7 = securityService0.validateUser("\177o&", "hi!");
        boolean boolean10 = securityService0.validateUser("\177o&", "");
        java.lang.Class<?> wildcardClass11 = securityService0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\006\026U" + "'", str4, "\006\026U");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("hi!");
        java.lang.String str4 = securityService0.encryptData("\177o&");
        java.lang.String str6 = securityService0.encryptData("\013\033T");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\006\026U" + "'", str4, "\006\026U");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\177o&" + "'", str6, "\177o&");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("hi!");
        boolean boolean5 = securityService0.validateUser("hi!", "");
        java.lang.String str7 = securityService0.encryptData("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\013\033T" + "'", str7, "\013\033T");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("hi!");
        java.lang.String str4 = securityService0.encryptData("\006\026U");
        java.lang.String str6 = securityService0.decryptData("\006\026U");
        java.lang.Class<?> wildcardClass7 = securityService0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ue\n" + "'", str4, "ue\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ue\n" + "'", str6, "ue\n");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        java.util.List<java.lang.Double> doubleList16 = null;
        double double17 = financialDataAnalysis0.calculateAverage(doubleList16);
        java.util.List<java.lang.Double> doubleList18 = null;
        double double19 = financialDataAnalysis0.calculateAverage(doubleList18);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis20 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray23 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList24 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList24, doubleArray23);
        java.lang.Double[] doubleArray30 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList31 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList31, doubleArray30);
        double double33 = financialDataAnalysis20.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList24, (java.util.List<java.lang.Double>) doubleList31);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis34 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray37 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList38 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList38, doubleArray37);
        java.lang.Double[] doubleArray44 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList45 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList45, doubleArray44);
        double double47 = financialDataAnalysis34.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList38, (java.util.List<java.lang.Double>) doubleList45);
        double double48 = financialDataAnalysis20.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList45);
        double double49 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList45);
        java.lang.Double[] doubleArray56 = new java.lang.Double[] { 50.25d, 0.0d, 50.0d, 70.71067811865476d, 70.71067811865476d, 57.74152174417759d };
        java.util.ArrayList<java.lang.Double> doubleList57 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList57, doubleArray56);
        double double59 = financialDataAnalysis0.calculateAverage((java.util.List<java.lang.Double>) doubleList57);
        java.lang.Class<?> wildcardClass60 = financialDataAnalysis0.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 57.74152174417759d + "'", double48 == 57.74152174417759d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 57.74152174417759d + "'", double49 == 57.74152174417759d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new java.lang.Double[] { 50.25d, 0.0d, 50.0d, 70.71067811865476d, 70.71067811865476d, 57.74152174417759d });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 58.27714633024785d + "'", double59 == 58.27714633024785d);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        boolean boolean3 = securityService0.validateUser("", "hi!");
        java.lang.String str5 = securityService0.decryptData("hi!");
        java.lang.String str7 = securityService0.encryptData("\006\026U");
        java.lang.String str9 = securityService0.encryptData("hi!");
        java.lang.String str11 = securityService0.decryptData("hi!");
        boolean boolean14 = securityService0.validateUser("\006\026U", "");
        java.lang.String str16 = securityService0.decryptData("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\013\033T" + "'", str5, "\013\033T");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ue\n" + "'", str7, "ue\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\013\033T" + "'", str9, "\013\033T");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\013\033T" + "'", str11, "\013\033T");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\013\033T" + "'", str16, "\013\033T");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("hi!");
        java.lang.String str4 = securityService0.encryptData("\177o&");
        boolean boolean7 = securityService0.validateUser("\177o&", "hi!");
        boolean boolean10 = securityService0.validateUser("\013\033T", "\006\026U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\006\026U" + "'", str4, "\006\026U");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        boolean boolean3 = securityService0.validateUser("", "hi!");
        java.lang.String str5 = securityService0.decryptData("hi!");
        java.lang.String str7 = securityService0.decryptData("\177o&");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\013\033T" + "'", str5, "\013\033T");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\026U" + "'", str7, "\006\026U");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        java.util.List<java.lang.Double> doubleList16 = null;
        double double17 = financialDataAnalysis0.calculateAverage(doubleList16);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis18 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray21 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList22 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList22, doubleArray21);
        java.lang.Double[] doubleArray28 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList29 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList29, doubleArray28);
        double double31 = financialDataAnalysis18.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList22, (java.util.List<java.lang.Double>) doubleList29);
        double double32 = financialDataAnalysis0.calculateAverage((java.util.List<java.lang.Double>) doubleList22);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis33 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis34 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray37 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList38 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList38, doubleArray37);
        java.lang.Double[] doubleArray44 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList45 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList45, doubleArray44);
        double double47 = financialDataAnalysis34.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList38, (java.util.List<java.lang.Double>) doubleList45);
        double double48 = financialDataAnalysis33.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList38);
        double double49 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList38);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 50.0d + "'", double32 == 50.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 70.71067811865476d + "'", double48 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 70.71067811865476d + "'", double49 == 70.71067811865476d);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis16 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis17 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray20 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList21 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList21, doubleArray20);
        java.lang.Double[] doubleArray27 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList28 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList28, doubleArray27);
        double double30 = financialDataAnalysis17.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList21, (java.util.List<java.lang.Double>) doubleList28);
        double double31 = financialDataAnalysis16.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList21);
        double double32 = financialDataAnalysis0.calculateAverage((java.util.List<java.lang.Double>) doubleList21);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis33 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis34 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray37 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList38 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList38, doubleArray37);
        java.lang.Double[] doubleArray44 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList45 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList45, doubleArray44);
        double double47 = financialDataAnalysis34.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList38, (java.util.List<java.lang.Double>) doubleList45);
        double double48 = financialDataAnalysis33.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList38);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis49 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis50 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray53 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList54 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList54, doubleArray53);
        java.lang.Double[] doubleArray60 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList61 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList61, doubleArray60);
        double double63 = financialDataAnalysis50.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList54, (java.util.List<java.lang.Double>) doubleList61);
        double double64 = financialDataAnalysis49.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList54);
        double double65 = financialDataAnalysis33.calculateAverage((java.util.List<java.lang.Double>) doubleList54);
        double double66 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList54);
        java.lang.Class<?> wildcardClass67 = financialDataAnalysis0.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 70.71067811865476d + "'", double31 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 50.0d + "'", double32 == 50.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 70.71067811865476d + "'", double48 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 70.71067811865476d + "'", double64 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 50.0d + "'", double65 == 50.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 70.71067811865476d + "'", double66 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("hi!");
        boolean boolean5 = securityService0.validateUser("hi!", "");
        java.lang.String str7 = securityService0.decryptData("\006\026U");
        boolean boolean10 = securityService0.validateUser("hi!", "ue\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ue\n" + "'", str7, "ue\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("hi!");
        java.lang.String str4 = securityService0.encryptData("\006\026U");
        java.lang.String str6 = securityService0.encryptData("");
        java.lang.String str8 = securityService0.encryptData("hi!");
        java.lang.String str10 = securityService0.encryptData("\013\033T");
        java.lang.String str12 = securityService0.encryptData("\013\033T");
        java.lang.String str14 = securityService0.encryptData("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ue\n" + "'", str4, "ue\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\013\033T" + "'", str8, "\013\033T");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\177o&" + "'", str10, "\177o&");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\177o&" + "'", str12, "\177o&");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis16 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis17 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray20 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList21 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList21, doubleArray20);
        java.lang.Double[] doubleArray27 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList28 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList28, doubleArray27);
        double double30 = financialDataAnalysis17.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList21, (java.util.List<java.lang.Double>) doubleList28);
        double double31 = financialDataAnalysis16.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList21);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis32 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis33 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray36 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList37 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList37, doubleArray36);
        java.lang.Double[] doubleArray43 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList44 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList44, doubleArray43);
        double double46 = financialDataAnalysis33.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList37, (java.util.List<java.lang.Double>) doubleList44);
        double double47 = financialDataAnalysis32.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList37);
        double double48 = financialDataAnalysis16.calculateAverage((java.util.List<java.lang.Double>) doubleList37);
        double double49 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList37);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis50 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis51 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray54 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList55 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList55, doubleArray54);
        java.lang.Double[] doubleArray61 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList62 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList62, doubleArray61);
        double double64 = financialDataAnalysis51.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList55, (java.util.List<java.lang.Double>) doubleList62);
        double double65 = financialDataAnalysis50.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList55);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis66 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis67 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray70 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList71 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList71, doubleArray70);
        java.lang.Double[] doubleArray77 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList78 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList78, doubleArray77);
        double double80 = financialDataAnalysis67.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList71, (java.util.List<java.lang.Double>) doubleList78);
        double double81 = financialDataAnalysis66.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList71);
        double double82 = financialDataAnalysis50.calculateAverage((java.util.List<java.lang.Double>) doubleList71);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis83 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis84 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray87 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList88 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList88, doubleArray87);
        java.lang.Double[] doubleArray94 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList95 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList95, doubleArray94);
        double double97 = financialDataAnalysis84.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList88, (java.util.List<java.lang.Double>) doubleList95);
        double double98 = financialDataAnalysis83.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList88);
        double double99 = financialDataAnalysis0.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList71, (java.util.List<java.lang.Double>) doubleList88);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 70.71067811865476d + "'", double31 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 70.71067811865476d + "'", double47 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 50.0d + "'", double48 == 50.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 70.71067811865476d + "'", double49 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 70.71067811865476d + "'", double65 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 70.71067811865476d + "'", double81 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 50.0d + "'", double82 == 50.0d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertArrayEquals(doubleArray94, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double97));
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 70.71067811865476d + "'", double98 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double99 + "' != '" + 1.0d + "'", double99 == 1.0d);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        boolean boolean3 = securityService0.validateUser("", "hi!");
        java.lang.String str5 = securityService0.decryptData("hi!");
        java.lang.String str7 = securityService0.decryptData("\006\026U");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\013\033T" + "'", str5, "\013\033T");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ue\n" + "'", str7, "ue\n");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("hi!");
        java.lang.String str4 = securityService0.encryptData("\006\026U");
        java.lang.String str6 = securityService0.decryptData("\006\026U");
        java.lang.String str8 = securityService0.decryptData("");
        boolean boolean11 = securityService0.validateUser("\177o&", "ue\n");
        boolean boolean14 = securityService0.validateUser("\177o&", "\177o&");
        java.lang.String str16 = securityService0.decryptData("\013\033T");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ue\n" + "'", str4, "ue\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ue\n" + "'", str6, "ue\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\177o&" + "'", str16, "\177o&");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis16 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis17 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray20 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList21 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList21, doubleArray20);
        java.lang.Double[] doubleArray27 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList28 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList28, doubleArray27);
        double double30 = financialDataAnalysis17.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList21, (java.util.List<java.lang.Double>) doubleList28);
        double double31 = financialDataAnalysis16.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList21);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis32 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis33 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray36 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList37 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList37, doubleArray36);
        java.lang.Double[] doubleArray43 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList44 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList44, doubleArray43);
        double double46 = financialDataAnalysis33.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList37, (java.util.List<java.lang.Double>) doubleList44);
        double double47 = financialDataAnalysis32.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList37);
        double double48 = financialDataAnalysis16.calculateAverage((java.util.List<java.lang.Double>) doubleList37);
        double double49 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList37);
        java.lang.Class<?> wildcardClass50 = financialDataAnalysis0.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 70.71067811865476d + "'", double31 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 70.71067811865476d + "'", double47 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 50.0d + "'", double48 == 50.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 70.71067811865476d + "'", double49 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("hi!");
        java.lang.String str4 = securityService0.encryptData("\006\026U");
        java.lang.String str6 = securityService0.encryptData("");
        java.lang.String str8 = securityService0.encryptData("hi!");
        java.lang.String str10 = securityService0.decryptData("\177o&");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ue\n" + "'", str4, "ue\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\013\033T" + "'", str8, "\013\033T");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\006\026U" + "'", str10, "\006\026U");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("hi!");
        java.lang.String str4 = securityService0.encryptData("\177o&");
        boolean boolean7 = securityService0.validateUser("\177o&", "hi!");
        boolean boolean10 = securityService0.validateUser("\177o&", "");
        java.lang.String str12 = securityService0.decryptData("\013\033T");
        java.lang.String str14 = securityService0.encryptData("\013\033T");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\006\026U" + "'", str4, "\006\026U");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\177o&" + "'", str12, "\177o&");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\177o&" + "'", str14, "\177o&");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis0 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis1 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList12 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList12, doubleArray11);
        double double14 = financialDataAnalysis1.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList5, (java.util.List<java.lang.Double>) doubleList12);
        double double15 = financialDataAnalysis0.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList5);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis16 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis17 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray20 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList21 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList21, doubleArray20);
        java.lang.Double[] doubleArray27 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList28 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList28, doubleArray27);
        double double30 = financialDataAnalysis17.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList21, (java.util.List<java.lang.Double>) doubleList28);
        double double31 = financialDataAnalysis16.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList21);
        java.util.List<java.lang.Double> doubleList32 = null;
        double double33 = financialDataAnalysis16.calculateAverage(doubleList32);
        java.util.List<java.lang.Double> doubleList34 = null;
        double double35 = financialDataAnalysis16.calculateAverage(doubleList34);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis36 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray39 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList40 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList40, doubleArray39);
        java.lang.Double[] doubleArray46 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList47 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList47, doubleArray46);
        double double49 = financialDataAnalysis36.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList40, (java.util.List<java.lang.Double>) doubleList47);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis50 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray53 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList54 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList54, doubleArray53);
        java.lang.Double[] doubleArray60 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList61 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList61, doubleArray60);
        double double63 = financialDataAnalysis50.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList54, (java.util.List<java.lang.Double>) doubleList61);
        double double64 = financialDataAnalysis36.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList61);
        double double65 = financialDataAnalysis16.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList61);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis66 = new imd.ufrn.FinancialDataAnalysis();
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis67 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray70 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList71 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList71, doubleArray70);
        java.lang.Double[] doubleArray77 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList78 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList78, doubleArray77);
        double double80 = financialDataAnalysis67.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList71, (java.util.List<java.lang.Double>) doubleList78);
        double double81 = financialDataAnalysis66.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList71);
        java.util.List<java.lang.Double> doubleList82 = null;
        double double83 = financialDataAnalysis16.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList71, doubleList82);
        imd.ufrn.FinancialDataAnalysis financialDataAnalysis84 = new imd.ufrn.FinancialDataAnalysis();
        java.lang.Double[] doubleArray87 = new java.lang.Double[] { 0.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList88 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList88, doubleArray87);
        java.lang.Double[] doubleArray94 = new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList95 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList95, doubleArray94);
        double double97 = financialDataAnalysis84.calculatePearsonCorrelation((java.util.List<java.lang.Double>) doubleList88, (java.util.List<java.lang.Double>) doubleList95);
        double double98 = financialDataAnalysis16.calculateStandardDeviation((java.util.List<java.lang.Double>) doubleList88);
        double double99 = financialDataAnalysis0.calculateAverage((java.util.List<java.lang.Double>) doubleList88);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 70.71067811865476d + "'", double15 == 70.71067811865476d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 70.71067811865476d + "'", double31 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 57.74152174417759d + "'", double64 == 57.74152174417759d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 57.74152174417759d + "'", double65 == 57.74152174417759d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 70.71067811865476d + "'", double81 == 70.71067811865476d);
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new java.lang.Double[] { 0.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertArrayEquals(doubleArray94, new java.lang.Double[] { 1.0d, (-1.0d), 100.0d, 100.0d });
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double97));
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 70.71067811865476d + "'", double98 == 70.71067811865476d);
        org.junit.Assert.assertTrue("'" + double99 + "' != '" + 50.0d + "'", double99 == 50.0d);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("hi!");
        java.lang.String str4 = securityService0.encryptData("\006\026U");
        java.lang.String str6 = securityService0.encryptData("");
        java.lang.String str8 = securityService0.encryptData("hi!");
        java.lang.String str10 = securityService0.encryptData("\013\033T");
        java.lang.String str12 = securityService0.encryptData("\013\033T");
        java.lang.String str14 = securityService0.encryptData("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ue\n" + "'", str4, "ue\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\013\033T" + "'", str8, "\013\033T");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\177o&" + "'", str10, "\177o&");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\177o&" + "'", str12, "\177o&");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\013\033T" + "'", str14, "\013\033T");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        imd.ufrn.SecurityService securityService0 = new imd.ufrn.SecurityService();
        java.lang.String str2 = securityService0.encryptData("hi!");
        java.lang.String str4 = securityService0.encryptData("\006\026U");
        java.lang.String str6 = securityService0.encryptData("");
        java.lang.String str8 = securityService0.encryptData("hi!");
        java.lang.String str10 = securityService0.encryptData("\013\033T");
        boolean boolean13 = securityService0.validateUser("ue\n", "\177o&");
        java.lang.String str15 = securityService0.encryptData("\177o&");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\013\033T" + "'", str2, "\013\033T");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ue\n" + "'", str4, "ue\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\013\033T" + "'", str8, "\013\033T");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\177o&" + "'", str10, "\177o&");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\026U" + "'", str15, "\006\026U");
    }
}

