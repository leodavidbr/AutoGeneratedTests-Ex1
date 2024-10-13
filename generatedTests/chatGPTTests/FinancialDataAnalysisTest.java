package imd.ufrn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        FinancialDataAnalysisTest.CalculateAverageTests.class,
        FinancialDataAnalysisTest.CalculateStandardDeviationTests.class,
        FinancialDataAnalysisTest.CalculatePearsonCorrelationTests.class
})
public class FinancialDataAnalysisTest {

    private FinancialDataAnalysis financialDataAnalysis = new FinancialDataAnalysis();

    // Tests for calculateAverage()
    public static class CalculateAverageTests {

        private FinancialDataAnalysis financialDataAnalysis = new FinancialDataAnalysis();

        @Test
        public void testAverageOfValidList() {
            List<Double> data = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
            double result = financialDataAnalysis.calculateAverage(data);
            assertEquals(3.0, result, 0.001);
        }

        @Test
        public void testAverageOfSingleElementList() {
            List<Double> data = Collections.singletonList(10.0);
            double result = financialDataAnalysis.calculateAverage(data);
            assertEquals(10.0, result, 0.001);
        }

        @Test
        public void testAverageOfEmptyList() {
            List<Double> data = Collections.emptyList();
            double result = financialDataAnalysis.calculateAverage(data);
            assertEquals(0.0, result, 0.001);
        }

        @Test
        public void testAverageOfNullList() {
            double result = financialDataAnalysis.calculateAverage(null);
            assertEquals(0.0, result, 0.001);
        }
    }

    // Tests for calculateStandardDeviation()
    public static class CalculateStandardDeviationTests {

        private FinancialDataAnalysis financialDataAnalysis = new FinancialDataAnalysis();

        @Test
        public void testStandardDeviationOfValidList() {
            List<Double> data = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
            double result = financialDataAnalysis.calculateStandardDeviation(data);
            assertEquals(1.581, result, 0.1);
        }

        @Test
        public void testStandardDeviationOfSingleElementList() {
            List<Double> data = Collections.singletonList(10.0);
            double result = financialDataAnalysis.calculateStandardDeviation(data);
            assertEquals(0.0, result, 0.01);
        }

        @Test
        public void testStandardDeviationOfEmptyList() {
            List<Double> data = Collections.emptyList();
            double result = financialDataAnalysis.calculateStandardDeviation(data);
            assertEquals(0.0, result, 0.001);
        }

        @Test
        public void testStandardDeviationOfNullList() {
            double result = financialDataAnalysis.calculateStandardDeviation(null);
            assertEquals(0.0, result, 0.001);
        }
    }

    // Tests for calculatePearsonCorrelation()
    public static class CalculatePearsonCorrelationTests {

        private FinancialDataAnalysis financialDataAnalysis = new FinancialDataAnalysis();

        @Test
        public void testPearsonCorrelationOfValidLists() {
            List<Double> data1 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
            List<Double> data2 = Arrays.asList(5.0, 4.0, 3.0, 2.0, 1.0);
            double result = financialDataAnalysis.calculatePearsonCorrelation(data1, data2);
            assertEquals(-1.0, result, 0.001);
        }

        @Test
        public void testPearsonCorrelationOfIdenticalLists() {
            List<Double> data1 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
            List<Double> data2 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
            double result = financialDataAnalysis.calculatePearsonCorrelation(data1, data2);
            assertEquals(1.0, result, 0.001);
        }

        @Test
        public void testPearsonCorrelationWithDifferentSizedLists() {
            List<Double> data1 = Arrays.asList(1.0, 2.0, 3.0);
            List<Double> data2 = Arrays.asList(1.0, 2.0);
            double result = financialDataAnalysis.calculatePearsonCorrelation(data1, data2);
            assertTrue(Double.isNaN(result));
        }

        @Test
        public void testPearsonCorrelationWithNullList() {
            List<Double> data1 = Arrays.asList(1.0, 2.0, 3.0);
            double result = financialDataAnalysis.calculatePearsonCorrelation(data1, null);
            assertTrue(Double.isNaN(result));
        }

        @Test
        public void testPearsonCorrelationWithZeroDenominator() {
            List<Double> data1 = Arrays.asList(1.0, 1.0, 1.0);
            List<Double> data2 = Arrays.asList(2.0, 2.0, 2.0);
            double result = financialDataAnalysis.calculatePearsonCorrelation(data1, data2);
            assertTrue(Double.isNaN(result));
        }
    }
}
