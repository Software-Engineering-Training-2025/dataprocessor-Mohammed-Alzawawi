package org.example.dataprocessor.clean;

import org.example.dataprocessor.enums.CleaningType;

public class CleanFactory {
    public static Clean getCleanByType(CleaningType cleaningType) {
        if(cleaningType == CleaningType.REMOVE_NEGATIVES){
            return new RemoveNegative();
        } else if(cleaningType == CleaningType.REPLACE_NEGATIVES_WITH_ZERO) {
            return new ReplaceNegativesWithZero();
        }
        throw new RuntimeException("Not supported");
    }
}
