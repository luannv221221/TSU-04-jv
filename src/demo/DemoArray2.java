package demo;

public class DemoArray2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {3,4,5};
        int[] arr3 = {5,6,7};
        int[][] arr = {arr1,arr2,arr3};


        int[][] array = new int[3][2];

        // TRUY XUẤT PHẦN TỬ MANG 2 CHIỀU
        System.out.println("arr[0][0]"+arr[0][0]);
        System.out.println("arr[0][1]"+arr[0][1]);
        System.out.println("arr[0][1]"+arr[0][2]);

        System.out.println("arr[1][0]"+arr[1][0]);
        System.out.println("arr[1][1]"+arr[1][1]);
        System.out.println("arr[1][1]"+arr[1][2]);

        System.out.println("arr[2][0]"+arr[2][0]);
        System.out.println("arr[2][1]"+arr[2][1]);
        System.out.println("arr[2][1]"+arr[2][2]);

        // duyet qua cac phan tu cua mang
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.printf("arr[%d][%d] = %d \n",i,j,arr[i][j]);
            }
        }
        // in duoi dang ma tran
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.printf("%d \t",arr[i][j]);
            }
            System.out.println(" ");
        }

    }
}
