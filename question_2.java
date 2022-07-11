import java.util.Scanner;

class CountMoney {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of currency denominations");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the currency denominations value");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
            System.out.println();
        }
        System.out.println("Enter the amount you want to pay: ");
        int amountInput = sc.nextInt();
        sc.close();
        countCurrency(n, arr, amountInput);
    }

    // function to count and
    // print currency notes
    public static void countCurrency(int notesCount, int[] notes, int amount) {
        int[] noteCounter = new int[notesCount];

        // count notes using Greedy approach
        for (int i = 0; i < notesCount; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }

        // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < notesCount; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }
}