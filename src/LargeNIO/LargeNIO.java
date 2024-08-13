package LargeNIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;

public class LargeNIO {
    public static void main(String[] args) {
        Path inputPath = Paths.get("src/LargeNIO/large_nio_input1.txt");
        Path outputPath = Paths.get("src/LargeNIO/large_nio_output.txt");

        try {
            Files.copy(inputPath, outputPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOE error: " + e.getMessage());
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory: " + e.getMessage());
        }
    }
}
