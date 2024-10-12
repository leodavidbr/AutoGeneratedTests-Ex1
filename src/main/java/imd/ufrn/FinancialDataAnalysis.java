package imd.ufrn;

import java.util.List;

public class FinancialDataAnalysis {

    public double calculateAverage(List<Double> data) {
        if (data == null || data.isEmpty()) {
            return 0.0;
        }

        double sum = data.get(0);
        for (Double value : data) {
            sum += value;
        }

        return sum / data.size();
    }

    public double calculateStandardDeviation(List<Double> data) {
        if (data == null || data.isEmpty()) {
            return 0.0;
        }

        double average = calculateAverage(data);
        double sumSquaredDifferences = 0.0;

        for (Double value : data) {
            double difference = value - average;
            sumSquaredDifferences += difference * difference;
        }

        double variance = sumSquaredDifferences / (data.size() - 1);
        return Math.sqrt(variance);
    }

    public double calculatePearsonCorrelation(List<Double> data1, List<Double> data2) {
        if (data1 == null || data2 == null || data1.size() != data2.size()) {
            return Double.NaN;
        }

        int n = data1.size();
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0, sumY2 = 0;

        for (int i = 0; i < n; i++) {
            double x = data1.get(i);
            double y = data2.get(i);

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