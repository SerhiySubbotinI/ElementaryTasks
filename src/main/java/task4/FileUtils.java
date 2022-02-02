package task4;

import java.io.*;

public class FileUtils {
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

    public void writeFile(String filePath, String data) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write(data);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

}
