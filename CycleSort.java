public class CycleSort {
    public static void cycleSort(int[] arr) {
        int n = arr.length;
        for (int start = 0; start < n - 1; start++) {
            int item = arr[start];
            int pos = start;

            for (int i = start + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }

            if (pos == start) {
                continue;
            }

            while (item == arr[pos]) {
                pos++;
            }

            int temp = arr[pos];
            arr[pos] = item;
            item = temp;

            while (pos != start) {
                pos = start;
                for (int i = start + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }

                while (item == arr[pos]) {
                    pos++;
                }

                temp = arr[pos];
                arr[pos] = item;
                item = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 8, 4};
        cycleSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
