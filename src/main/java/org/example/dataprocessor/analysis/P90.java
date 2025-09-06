package org.example.dataprocessor.analysis;

import java.util.Collections;
import java.util.List;

public class P90 implements Analysis{
    @Override
    public double analyze(List<Integer> list) {
        list = list.stream().sorted().toList();
        int p90 = (int) Math.ceil(0.9 * list.size());
        if(list.isEmpty()) {
            return Double.NaN;
        }
        return list.get(p90 - 1);
    }
}
