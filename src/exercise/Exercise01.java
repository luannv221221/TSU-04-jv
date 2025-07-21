package exercise;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] scores = new float[1000];
        // khai bao bien de bien nguoi dung dang nhap den phan tu thu may cua mang
        int currentElement = 0;

        // in menu
        do {
            System.out.println("******************QUẢN LÝ ĐIỂM SV****************\n" +
                    "\n" +
                    "1. Nhập danh sách điểm sinh viên\n" +
                    "2. In danh sách điểm\n" +
                    "3. Tính điểm trung bình của các sinh viên\n" +
                    "4. Tìm điểm cao nhất và thấp nhất\n" +
                    "5. Đếm số lượng sinh viên đạt và trượt\n" +
                    "6.Sắp xếp điểm tăng dần\n" +
                    "7.Thống kê số lượng sinh viên giỏi và xuất sắc\n" +
                    "8. Thoát");
            System.out.println("Moi ban chon 1-8");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Ban muon nhap diem cho bao nhieu sinh vien");
                    int total = scanner.nextInt();
                    for (int i = 0; i < total; i++) {
                        System.out.println("Nhap diem : ");
                        scores[i] = scanner.nextFloat();
                        currentElement++;
                    }
                    break;
                case 2:
                    // in danh sách điểm
                    for (int i = 0; i < currentElement; i++) {
                        System.out.printf("%.1f \t",scores[i]);
                    }
                    break;
                case 3:
                    int sum = 0;
                    for (int i = 0; i < currentElement; i++) {
                        sum += scores[i];
                    }
                    System.out.println("Diem TB "+ (sum/currentElement));
                    break;
                default:
                    System.err.println("Vui long chọn lai");
            }
        } while (true);
    }
}
