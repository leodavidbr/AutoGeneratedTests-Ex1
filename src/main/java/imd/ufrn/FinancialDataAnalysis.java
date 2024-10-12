package imd.ufrn;

public class FinancialDataAnalysis {

    public double calculateAverage(double[] data) {
        if (data == null || data.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (double value : data) {
            sum += value;
        }

        return sum / data.length;
    }

    public double calculateStandardDeviation(double[] data) {
        if (data == null || data.length == 0) {
            return 0.0;
        }

        double average = calculateAverage(data);
        double sumSquaredDifferences = 0.0;

        for (double value : data) {
            double difference = value - average;
            sumSquaredDifferences += difference * difference;
        }

        double variance = sumSquaredDifferences / (data.length - 1);
        return Math.sqrt(variance);
    }

    public double calculatePearsonCorrelation(double[] data1, double[] data2) {
        if (data1 == null || data2 == null || data1.length != data2.length) {
            return Double.NaN;
        }

        int n = data1.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0, sumY2 = 0;

        for (int i = 0; i < n; i++) {
            double x = data1[i];
            double y = data2[i];

            sumX += x;
            sumY += y;
            sumXY += x * y;
            sumX2 += x * x;
            sumY2 += y * y;
        }

        double numerator = n * sumXY - sumX * sumY;
        double denominator = Math.sqrt((n * sumX2 - sumX * sumX) * (n * sumY2 - sumY * sumY));

        if (denominator == 0) {
            return Double.NaN;
        }

        return numerator / denominator;
    }
}