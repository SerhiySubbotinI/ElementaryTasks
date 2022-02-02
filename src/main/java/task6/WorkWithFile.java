package task6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WorkWithFile {
    public String readFromFile(String fileName) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            return everything;
        } finally {
            br.close();
        }
    }
}
