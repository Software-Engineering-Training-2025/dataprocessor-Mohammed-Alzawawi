package org.example.dataprocessor.analysis;

import org.example.dataprocessor.analysis.Mean;
import org.example.dataprocessor.enums.AnalysisType;

public class AnalysisFactory {
    public static Analysis getAnalyzer(AnalysisType analysisType) {
        if(analysisType == AnalysisType.MEAN) {
            return new Mean();
        }
        if(analysisType == AnalysisType.MEDIAN) {
            return new Median();
        }
        if(analysisType == AnalysisType.STD_DEV) {
            return new StdDev();
        }

        if(analysisType == AnalysisType.P90_NEAREST_RANK) {
            return new P90();
        }
        if(analysisType == AnalysisType.TOP3_FREQUENT_COUNT_SUM) {
            return new TopThreeFrequentElementSum();
        }
        throw new RuntimeException();
    }
}
