package sorting; // Define the package

public class Arraysorter {
    // Method to sort the array using bubble sort and return the sorted array
    public int[] Arraysorter(int[] sorter) {
        for (int i = 0; i < sorter.length - 1; i++) {
            for (int j = 0; j < sorter.length - i - 1; j++) {
                if (sorter[j] > sorter[j + 1]) {
                    int temp = sorter[j];
                    sorter[j] = sorter[j + 1];
                    sorter[j + 1] = temp;
                }
            }
        }
        return sorter;
    }
}
