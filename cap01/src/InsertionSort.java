import java.util.Arrays;

public class InsertionSort {


    public static void main(String[] args) {

        int A[] = {5, 2, 4, 6, 1, 3, -1};

        var algorithm = new InsertionSort();
        algorithm.execute(A);

        System.out.println(Arrays.toString(A));

    }

    // O(n²)
    void execute(int A[]) {
        for (int j = 1; j < A.length; j++) { // c1 * n

            var key = A[j];  // c2 * (n - 1)

            var i = j - 1;  // c3 * (n-1)

            while (i > -1 && A[i] > key) { // c4 * n * t -> (t = 1, best case) (t = n, worst case)
                A[i + 1] = A[i]; // c5 * n * (t-1)
                i--; // c6 * n * (t-1)
            }

            A[i + 1] = key; // c6 * (n - 1)

        }
    }

}
