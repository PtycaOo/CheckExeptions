package WorkWithFile;

import java.io.BufferedWriter;
import java.io.IOException;

public class WriteFile {

    static public void writeFile(String[] person){
        String path = person[0];
        try (BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(path,true))){
            for(String s: person){
                bw.write(s + " ");
            }
            bw.write("\n");
        } catch (IOException e) {
            System.out.println("Путь не может быть пустым");
        }
    }
}
