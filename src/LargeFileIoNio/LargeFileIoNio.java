package LargeFileIoNio;

import java.io.*;

public class LargeFileIoNio {
    public static void main(String[] args) {
        String input="src/LargeFileIoNio/large_input.txt";
        String output="src/LargeFileIoNio/large_output.txt";
        try(BufferedReader reader=new BufferedReader(new FileReader(input));
            BufferedWriter writer=new BufferedWriter(new FileWriter(output))){
            String line;
            while ((line=reader.readLine())!=null){
                writer.write(line);
                writer.newLine();
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("IOException");
        }catch (OutOfMemoryError e){
            System.out.println("outofmemory exception");
        }
    }
}
