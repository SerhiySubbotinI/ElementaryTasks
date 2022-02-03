package task4;

import java.io.*;

public class FileUtils {
    public String readFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));       // Creates a new file object
        try {                                                                     // Read from the stream
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {                             // need to read all the buffer for a clean connection close
                sb.append(line).append(System.lineSeparator());  //get system specific line separator and append it  (\n)
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }

    public void writeFile(String filePath, String data) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);             // Creates a BufferedWriter
        bufferedWriter.write(data);          // Writes the string to the file
        bufferedWriter.flush();              // Flush the buffer writer
        bufferedWriter.close();              // Closes the writer
    }

}
