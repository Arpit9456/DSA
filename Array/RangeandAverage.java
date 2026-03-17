public class RangeandAverage {
    public static void calculateValues(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            sum += val;
            if (val > largest) {
                secondLargest = largest;
                largest = val;
            } 
            else if (val > secondLargest && val < largest) {
                secondLargest = val;
            }
            if (val < smallest) {
                smallest = val;
            }
        }
        int range = largest - smallest;
        double average = (double) sum / n;
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Smallest: " + smallest);
        System.out.println("Range: " + range);
        System.out.println("Average: " + average);
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 2};
        calculateValues(arr);
    }
}
