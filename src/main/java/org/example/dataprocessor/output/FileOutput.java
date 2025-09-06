package org.example.dataprocessor.output;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOutput implements Output{
    @Override
    public void output(double value) throws IOException {
        String result = "Result = " + value;
        Path path = Paths.get("target/result.txt");
        Files.createDirectories(path.getParent());
        Files.write(path, result.getBytes());
    }
}
