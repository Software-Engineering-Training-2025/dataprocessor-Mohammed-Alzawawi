package org.example.dataprocessor.analysis;

import java.util.List;
import java.util.Map;

//  √(Σ(xᵢ - μ)² / N)
public class StdDev implements Analysis {
    @Override
    public double analyze(List<Integer> list) {
        double mean = list.stream()
                .mapToDouble(item -> (double) item)
                .average()
                .orElse(Double.NaN);
        double sum = list.stream()
                .mapToDouble(item -> (item - mean) * (item - mean))
                .sum();
        return Math.sqrt(sum / list.size());
    }
    //        double sum = 0;
//        for (int item: list) {
//            sum += (item - mean) * (item - mean);
//        }
//        return Math.sqrt(sum / list.size());
}
