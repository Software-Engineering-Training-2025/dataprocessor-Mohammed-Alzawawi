package org.example.dataprocessor.clean;

import java.util.ArrayList;
import java.util.List;

public class ReplaceNegativesWithZero implements Clean {
    @Override
    public List<Integer> clean(List<Integer> list) {
        return list.stream()
                .map(item -> item < 0 ? 0 : item)
                .toList();
    }

    //        List<Integer> temp = new ArrayList<>();
//        for(int item: list) {
//            if(item < 0){
//                temp.add(0);
//            } else {
//                temp.add(item);
//            }
//        }
//        return temp;
}
