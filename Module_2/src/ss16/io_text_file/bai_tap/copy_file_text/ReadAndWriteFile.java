package ss16.io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<String> readFileText(String filePath) {
        List<String> stringList = new ArrayList<>();
        BufferedReader br = null;
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            br = new BufferedReader(fileReader);
            String line;
            while ((line = br.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringList;
    }

    public void writeFile(String filePath, int count, List<String> list) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath, true);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        for (String l : list) {
            buff.write(l +"\n" );
        }
        buff.write("Số kí tự trong tệp: " + count +"\n");
        buff.close();
    }
}





