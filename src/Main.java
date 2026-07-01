import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //Thuật toán sắp xếp bọt
    public static void bubbleSort(int[] arr){
        boolean neednNextPass=true;
        for(int i=1;i<arr.length && neednNextPass;i++){
            neednNextPass=false;
            for (int j=0;j<arr.length-i;j++){
                if (arr[j+1]>arr[j]){
                    //Thuật toán hoán đổi
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    neednNextPass=true;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr_lenght = 0;
        do {
            System.out.print("Nhập số lượng phần tử của mảng: ");
            if(sc.hasNextInt()){
                arr_lenght=sc.nextInt();
                if (arr_lenght<=0){
                    System.out.println("Lỗi số lượng phần tử phải lớn hơn 0. Vui lòng nhập lại!");
                }
                else {
                    break;
                }
            }else {
                System.out.println("Lỗi số lượng phần tử phải là số nguyên. Vui lòng nhâọ lại!");
                sc.next();
            }
        }while(true);
        int[] arr= new int[arr_lenght];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i=0; i<arr.length;i++){
            System.out.print("Nhập phần tử thứ "+ (i+1)+": ");
            if (sc.hasNextInt()){
                arr[i]=sc.nextInt();
            }
            else {
                System.out.println("Lỗi mảng phải là sô nguyên vui lòng nhập lại");
                sc.next();
                i--;
            }
        }
        bubbleSort(arr);
        System.out.println("Mảng sau khi phàn tử sắp xếp giảm dần:");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}

