public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int counter=1;
        while(counter<n-1){
            for (int i = 0; i < n-counter; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;               
                }
            }
            counter++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        bubbleSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
