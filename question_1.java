
/**
 * PayMoney. processes thousands of transactions daily amounting to crores of Rupees. They also have a daily target that they must achieve. Given a list of transactions done by PayMoney and a daily target, your task is to determine at which transaction PayMoney achieves the same. If the target is not achievable, then display the target is not achieved.
 */

import java.util.Scanner;

class PayMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of transaction array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values of array: ");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
        }
        System.out.print("Enter total no of targets that needs to be achieved: ");
        int target = sc.nextInt();
        System.out.print("Enter the values of target: ");
        int targetValue = sc.nextInt();
        sc.close();
        int finalTransactionNumber = calcTransaction(arr, target, targetValue);
        if (finalTransactionNumber > 0) {
            System.out.print("Target achieved after " + finalTransactionNumber + " transactions");
        } else {
            System.out.print("Given target is not achieved");
        }
    }

    public static int calcTransaction(int[] arr, int target, int targetValue) {
        int sum = 0;
        for (int i = 0; i < target; i++) {
            sum += arr[i];
            if (sum >= targetValue) {
                return i + 1;
            }
        }
        return 0;
    }
}