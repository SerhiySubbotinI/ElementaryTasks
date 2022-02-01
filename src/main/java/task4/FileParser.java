package task4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.TreeMap;

public class FileParser {
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner keyboard = new Scanner(System.in);
        // String file = keyboard.nextLine();
        String file = "c:\\Text.txt";

        TreeMap<String, Integer> index = new TreeMap();

        String[] list = null;
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String line = br.readLine();


            while (line != null) {
                list = line.split("[ \n\t\r:;',.(){}]");
                for (int i = 0; i < list.length; i++) {
                    String word = list[i].toLowerCase();
                    if (word.length() != 0) {
                        if (index.get(word) == null) {
                            index.put(word, 1);
                        } else {
                            int occur = index.get(word).intValue();
                            occur++;
                            index.put(word, occur);
                        }
                        line = br.readLine();
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        for (String item : index.keySet()) {
            int repeats = index.get(item).intValue();
            System.out.printf("\n%10s\t%d", item, repeats);
        }
    }
}
