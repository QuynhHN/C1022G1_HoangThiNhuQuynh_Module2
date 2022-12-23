package ss16.io_text_file.bai_tap.copy_file_text;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CountCharCoppyFile {
    public static final String SOURCE = "C:\\Users\\DELL\\Desktop\\CODEGYM\\module_2\\Module_2\\src\\ss16\\io_text_file\\bai_tap\\copy_file_text\\sourcefile.csv";
    public static final String TARGET = "C:\\Users\\DELL\\Desktop\\CODEGYM\\module_2\\Module_2\\src\\ss16\\io_text_file\\bai_tap\\copy_file_text\\targetfile.csv";

    public static void main(String[] args) throws IOException {
        System.out.println("Nhập vào đường dẫn file");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> list = ReadAndWriteFile.readFileText(path);
        int count = countChar(list);
        readAndWriteFile.writeFile(TARGET, count, list);
    }

    public static int countChar(List<String> list) {
        int count = 0;
        for (String line : list) {
            count += line.length();
        }
        return count;
    }

}
