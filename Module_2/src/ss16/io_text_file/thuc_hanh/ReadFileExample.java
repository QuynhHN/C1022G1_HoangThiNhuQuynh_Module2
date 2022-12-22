package ss16.io_text_file.thuc_hanh;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    private static final String FILE_PATH = "C:\\Users\\DELL\\Desktop\\CODEGYM\\module_2\\Module_2\\src\\ss16\\io_text_file\\thuc_hanh\\filenumbers.csv";

    public void readFileText(String FILE_PATH) {
        BufferedReader br = null;
        try {
            File file = new File(FILE_PATH);
            FileReader fileReader = new FileReader(FILE_PATH);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            br = new BufferedReader(fileReader);
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println("Tổng" +sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
//            {catch(FileNotFoundException e){
//                throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}
