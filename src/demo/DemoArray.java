package demo;

public class DemoArray {
    public static void main(String[] args) {
        // khai báo mảng

        // khai bao mang gom 3 phan tu chua diem cua 3 mon toan ly hoa
        float [] arr = new float[3];
        // khai bao khoi tao gia tri cua mang so nguyen
        int [] arr2 = {1,2,3,4,5};

        // gian gia tri cho phan tu cua mang
        arr[0] = 10;
        arr[1] = 9;
        arr[2] = 8;
        // truy cap phan tu mang
        System.out.println(" gia tri cua phan tu thu 2 trong mang arr "+arr[1]);
//        System.out.println(arr[3]);
        // duyet qua cac phan tu cua mang
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d] = %d \n",i,arr2[i]);
        }
    }
}
