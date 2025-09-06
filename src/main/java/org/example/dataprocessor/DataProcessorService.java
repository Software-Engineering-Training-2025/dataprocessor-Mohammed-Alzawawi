package org.example.dataprocessor;

import org.example.dataprocessor.analysis.AnalysisFactory;
import org.example.dataprocessor.clean.CleanFactory;
import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.enums.OutputType;
import org.example.dataprocessor.output.OutputFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/**
 * Students ONLY implement the process(...) method below.
 *
 * Requirements:
 * - Order: Clean -> Analyze -> Output -> Return result
 * - Do NOT mutate the original input list
 * - Handle empties as specified in AnalysisType docs
 * - Output format EXACTLY: "Result = <value>"
 * - TEXT_FILE path: target/result.txt (create parent dirs, overwrite file)
 */
public class DataProcessorService {

    /**
     * Implement this method.
     */
    public double process(
            CleaningType cleaningType,
            AnalysisType analysisType,
            OutputType outputType,
            List<Integer> data) throws Exception {

        List<Integer> cleanedList = CleanFactory.getCleanByType(cleaningType).clean(data);
        double analyzedValue = AnalysisFactory.getAnalyzer(analysisType).analyze(cleanedList);
        OutputFactory.getOutput(outputType).output(analyzedValue);
        return analyzedValue;
    }
}

