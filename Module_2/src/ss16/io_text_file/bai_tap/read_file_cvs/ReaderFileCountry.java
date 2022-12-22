package ss16.io_text_file.bai_tap.read_file_cvs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderFileCountry {
    private static final String FILE_NAME = "C:\\Users\\DELL\\Desktop\\CODEGYM\\module_2\\Module_2\\src\\ss16\\io_text_file\\bai_tap\\read_file_cvs\\coutries.csv";

    public static List<Country> readCSV() {
        List<Country> countryList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader buff = null;
        try {
            fileReader = new FileReader(FILE_NAME);
            buff = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Country country;

            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];

                country = new Country(id, code, name);
                countryList.add(country);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                buff.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return countryList;
    }

    public static void main(String[] args) throws IOException {
        List<Country> countryList = readCSV();
        for (Country country : countryList) {
            System.out.println(country);
        }
    }
}
