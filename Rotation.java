import java.util.Scanner;

public class Rotation{

    static void leftRotation(int arr[],int n,int k){
        int mod = k%n;

        for(int i=0;i<n;++i){
            System.out.print(arr[(i+mod)%n]+" ");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }

        leftRotation(arr,n,k);
    }
}
