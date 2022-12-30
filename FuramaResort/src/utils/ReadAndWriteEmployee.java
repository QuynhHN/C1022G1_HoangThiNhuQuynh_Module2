package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {
public static List<String>readEmployee (String filePath){
    List<String> stringListEmployee = new ArrayList<>();
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
            stringListEmployee.add(line);
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
    return stringListEmployee;


}
}
