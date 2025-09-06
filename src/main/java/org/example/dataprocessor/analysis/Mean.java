package org.example.dataprocessor.analysis;

import java.util.List;
import java.util.Optional;

public class Mean implements Analysis{

    @Override
    public double analyze(List<Integer> list) {
        return list.stream()
                .mapToDouble(item -> (double) item)
                .average()
                .orElse(Double.NaN);
    }

    //        double sum = 0;
//        for(int item : list) {
//            sum += item;
//        }
    // return sum / list.size();

}
