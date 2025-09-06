package org.example.dataprocessor.output;

public class Console implements Output{
    @Override
    public void output(double value) {
        System.out.println(value);
    }
}
