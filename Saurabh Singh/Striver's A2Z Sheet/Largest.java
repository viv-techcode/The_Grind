// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {

    public static int largest(int[] arr, int n) {
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 3, 0};
        int n = arr.length;

        int result = largest(arr, n);

        System.out.println("Largest element is: " + result);
    }
}
