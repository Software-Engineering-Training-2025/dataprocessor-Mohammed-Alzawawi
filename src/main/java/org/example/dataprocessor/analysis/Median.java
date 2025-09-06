package org.example.dataprocessor.analysis;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// 1 2 3 4 --> (2 + 3) / 2;
// 1 2 3 4 5 --> 3
// 1 2 3 4 5 6 --> 3 + 4 / 2 --> 3.5
public class Median implements Analysis{
    @Override
    public double analyze(List<Integer> list) {
        list = list.stream().sorted().toList();
        if (list.isEmpty())
            return Double.NaN;
        int n = list.size();
        if(n % 2 == 0) {
            return (list.get(n / 2) + list.get(n / 2 - 1)) / 2.0;
        } else  {
            return list.get(n / 2);
        }
//        return n % 2 == 0 ?
//                (list.get(n / 2) + list.get(n / 2 - 1)) / 2.0 :
//                list.get(n / 2);
    }
}
