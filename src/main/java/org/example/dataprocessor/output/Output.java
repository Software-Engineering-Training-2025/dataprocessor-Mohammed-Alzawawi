package org.example.dataprocessor.output;

import java.io.IOException;

public interface Output {
    void output(double value) throws IOException;
}
