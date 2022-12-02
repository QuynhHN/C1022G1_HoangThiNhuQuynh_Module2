import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cần đọc");
        String number = sc.nextLine();
        if (number.length() == 1) {
            switch (number) {
                case "0":
                    System.out.println("zero");
                case "1":
                    System.out.println("one");
                    break;
                case "2":
                    System.out.println("two");
                    break;
                case "3":
                    System.out.println("three");
                    break;
                case "4":
                    System.out.println("four");
                    break;
                case "5":
                    System.out.println("five");
                    break;
                case "6":
                    System.out.println("six");
                    break;
                case "7":
                    System.out.println("seven");
                    break;
                case "8":
                    System.out.println("eight");
                    break;
                case "9":
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("Out off ability");
            }

        } else if (number.length() == 2) {
            if (Integer.parseInt(number) < 20) {
                switch (number) {
                    case "10":
                        System.out.println("ten");
                    case "11":
                        System.out.println("eleven");
                        break;
                    case "12":
                        System.out.println("twelve");
                        break;
                    case "13":
                        System.out.println("thirteen");
                        break;
                    case "14":
                        System.out.println("fourteen");
                        break;
                    case "15":
                        System.out.println("fiveteen");
                        break;
                    case "16":
                        System.out.println("sixteen");
                        break;
                    case "17":
                        System.out.println("seventeen");
                        break;
                    case "18":
                        System.out.println("eighteen");
                        break;
                    case "19":
                        System.out.println("nineteen");
                        break;
                }
            } else {
                switch (number.substring(0, 1)) {
                    case "2":
                        System.out.print("twenty-");
                    case "3":
                        System.out.print("thirty-");
                        break;
                    case "4":
                        System.out.print("forty-");
                        break;
                    case "5":
                        System.out.print("fifty-");
                        break;
                    case "6":
                        System.out.print("sixty-");
                        break;
                    case "7":
                        System.out.print("seventy-");
                        break;
                    case "8":
                        System.out.print("eighty-");
                        break;
                    case "9":
                        System.out.print("ninety-");
                        break;
                }
                switch (number.substring(1)) {
                    case "0":
                        System.out.print("");
                    case "1":
                        System.out.print("one");
                        break;
                    case "2":
                        System.out.print("two");
                        break;
                    case "3":
                        System.out.print("three");
                        break;
                    case "4":
                        System.out.print("four");
                        break;
                    case "5":
                        System.out.print("five");
                        break;
                    case "6":
                        System.out.print("six");
                        break;
                    case "7":
                        System.out.print("seven");
                        break;
                    case "8":
                        System.out.print("eight");
                        break;
                    case "9":
                        System.out.print("nine");
                        break;
                }
            }
        }
    }
}
