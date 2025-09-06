package org.example.dataprocessor.analysis;

import java.text.Collator;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopThreeFrequentElementSum implements Analysis{
    // 1 2 1 3
    // 1 --> 2
    // 2 --> 1
    // 3 --> 1
    @Override
    public double analyze(List<Integer> list) {
        Map<Integer, Long> frequencyMap = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return frequencyMap.values()
                .stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .mapToLong(item -> item)
                .sum();
    }
//
//    Map<Integer, Integer> frequencyMap = new HashMap<>();
//        for(int item: list) {
//        int count = frequencyMap.getOrDefault(item, 0) + 1;
//        frequencyMap.put(item, count);
//    }
//    double sum = 0;
//    List<Integer> values = new ArrayList<>();
//        for(int key: frequencyMap.keySet()) {
//        values.add(frequencyMap.get(key));
//    }
//        Collections.sort(values);
//        Collections.reverse(values);
//        for(int index = 0; index < Math.min(values.size(), 3); index++) {
//        sum += values.get(index);
//    }
//        return sum;
}
