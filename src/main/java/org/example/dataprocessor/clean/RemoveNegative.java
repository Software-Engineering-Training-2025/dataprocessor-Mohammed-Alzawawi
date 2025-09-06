package org.example.dataprocessor.clean;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RemoveNegative implements Clean {

    @Override
    public List<Integer> clean(List<Integer> list) {
        return list.stream()
                .filter((item) -> item >= 0)
                .toList();
    }

    //        List<Integer> temp = new ArrayList<>();
//        for(int index = 0; index < list.size(); index++) {
//            if(list.get(index) >= 0)
//                temp.add(list.get(index));
//        }
//        for(int item: list) {
//            if(item >= 0){
//                temp.add(item);
//            }
//        }
//
//        list.stream().filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer item) {
//                return item >= 0;
//            }
//        });
}
