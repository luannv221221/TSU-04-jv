package exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName = "";
        String email = "";
        String phoneNumber = "";
        String password = "";
        do {
            System.out.println("\n******************QUẢN LÝ NGƯỜI DÙNG****************\n" +
                    "\n" +
                    "1. Nhập thông tin người dùng\n" +
                    "2. Chuẩn hóa họ tên\n" +
                    "3. Kiểm tra email hợp lệ\n" +
                    "4. Kiểm tra số điện thoại hợp lệ\n" +
                    "5. Kiểm tra mật khẩu hợp lệ\n" +
                    "6. Thoát");
            System.out.println("Moi ban chon tu 1-6");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhap vao ho ten ");
                    fullName = scanner.nextLine();
                    System.out.println("Nhap vao email ");
                    email = scanner.nextLine();
                    System.out.println("Nhap vao sdt ");
                    phoneNumber = scanner.nextLine();
                    System.out.println("Nhap vao mat khau ");
                    password = scanner.nextLine();
                    break;
                case 2:
                    String fullNameShort = fullName.strip().replaceAll("\\s+"," ");
                    // chuuyen chuoi thanh mang
                    String[] arrayFullName = fullNameShort.split(" ");
                    StringBuilder stringStandard = new StringBuilder();
                    for (int i = 0; i < arrayFullName.length; i++) {
                        stringStandard.append(Character.toUpperCase(arrayFullName[i].charAt(0)))
                                .append(arrayFullName[i].substring(1).toLowerCase())
                                .append(" ");
                    }
                    System.out.println("Họ tên sau khi format : "+stringStandard.toString().trim());
                    break;
                case 3:
                    // email đúng định dạng tranlinh01a-1@gmail.com
                    String regexEmail = "^[a-zA-Z\\d.-]{3,}@[a-zA-Z\\d]{3,}.[a-zA-Z]{2,3}$";
                    if(Pattern.matches(regexEmail,email)){
                        System.out.println("Email  hop le ");
                    } else {
                        System.out.println("Email khong hop le");
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui long chon 1 - 6");
            }
        }while (true);
    }
}
