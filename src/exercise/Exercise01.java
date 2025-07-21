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
                    float sum = 0;
                    for (int i = 0; i < currentElement; i++) {
                        sum += scores[i];
                    }
                    System.out.println("Diem TB "+ (sum/currentElement));
                    break;
                case 4:
                    // b1 coi phan tu dau tien gian voi gia tri max
                    // b2 duyet qua các phan từ từ 1 đến cuốt
                    // b3 so sánh nếu giá trị max nhỏ hơn giá trị của phần tử thì max = score[i]
                    float max = scores[0];
                    for (int i = 1; i < currentElement; i++) {
                        if(max < scores[i]){
                            max = scores[i];
                        }
                    }
                    System.out.println("Diem cao nhat "+max);
                    break;
                case 5:
                    // dem so luong sinh vien dat va truot (<5)
                    int countStudentFail = 0;
                    int countStudentPass = 0;
                    for (int i = 0; i < currentElement; i++) {
                        if(scores[i] >= 5){
                            countStudentPass++;
                        } else {
                            countStudentFail++;
                        }
                    }
                    System.out.println("Tong so luong sv dat : "+countStudentPass);
                    System.out.println("Tong so luong sv truot : "+countStudentFail);
                    break;
                case 6:
                    // sắp xếp điểm tăng dần 
                    for (int i = 0; i < currentElement; i++) {
                        for (int j = i+1; j < currentElement; j++) {
                            if(scores[i] > scores[j]){
                                // hoan doi gia tri cua phan tu i vs j
                                float temp = scores[i];
                                scores[i] = scores[j];
                                scores[j] = temp;
                            }
                        }
                    }
                    //
                    System.out.println(" sau khi sap xep tang dan :");
                    for (int i = 0; i < currentElement; i++) {
                        System.out.printf("%.1f \t",scores[i]);
                    }

                    break;
                case 7:
                    // thong ke so luong sinh vien gioi (>=8)
                    int countStudentGood = 0;
                    for (int i = 0; i < currentElement; i++) {
                        if(scores[i] >=8){
                            countStudentGood++;
                        }
                    }
                    System.out.println("So luong sinh vien gioi la "+countStudentGood);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.err.println("Vui long chọn lai");
            }
        } while (true);
    }
}
