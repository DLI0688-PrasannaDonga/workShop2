package ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
//        File file= new File("src/ExceptionHandling/input.txt");
//
//        try{
//           file.createNewFile();
//            System.out.println("File created");
//        }catch (IOException e){
//            System.out.println(e);
//        }
        try(BufferedReader bf = new BufferedReader(new FileReader("src/ExceptionHandling/input.txt"))){
         String line;
         while ((line=bf.readLine())!=null)

             System.out.println(line);
        }catch (IOException e){
            System.out.println("File not found!");
        }
    }
}
