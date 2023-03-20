import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [10];
        for (int i = 0; i<10; i++){
            System.out.print("Enter a number : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i<10; i++){
            System.out.println("Array : "+arr[i]);
        }

    }
}
