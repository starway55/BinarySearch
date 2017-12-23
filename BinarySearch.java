public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 8, 12, 13, 16, 20, 23, 25};

        System.out.println("Searching 1 in the array, the index is: " + search(1, array));
        System.out.println("Searching 2 in the array, the index is: " + search(2, array));
        System.out.println("Searching 12 in the array, the index is: " + search(12, array));
        System.out.println("Searching 16 in the array, the index is: " + search(16, array));
        System.out.println("Searching 25 in the array, the index is: " + search(25, array));
        System.out.println("Searching 24 in the array, the index is: " + search(24, array));
    }

    public static int search(int target, int[] array){
        int p = 0;
        int q = array.length - 1;

        while(p <= q){
            int r = (p + q) / 2;
            if(target < array[r]){
                q = r-1;
            } else if (target > array[r]){
                p = r+1;
            } else if (target == array[r]){
                return r;
            }
        }

        System.out.println("Did not find target number in the array!");
        return -1;
    }
}
