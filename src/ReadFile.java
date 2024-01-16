import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {

    static public void readFile(String path){
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
