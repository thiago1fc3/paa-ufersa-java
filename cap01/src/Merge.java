import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {

        int A[] = {1, 2, 3, 4, -1, 5, 10};

        var algorithm = new Merge();
        algorithm.execute(A, 0, 3, 6);

        System.out.println(Arrays.toString(A));

    }

    void execute(int A[], int p, int q, int r) {

        var n1 = q - p + 1; // c1
        var n2 = r - q; // c2

        int L[] = new int[n1 + 1]; // c3
        int R[] = new int[n2 + 1]; // c4

        for (int i = 0; i < n1; i++) { // c5 * n1
            L[i] = A[p + i]; // c6 * (n1 - 1)
        }

        for (int j = 0; j < n2; j++) { // c7 * n2
            R[j] = A[q + j + 1]; // c8 * (n2 -1 )
        }

        L[n1] = Integer.MAX_VALUE; // c9
        R[n2] = Integer.MAX_VALUE; // c10

        var i = 0; // c11
        var j = 0; // c12

        for (int k = p; k <= r; k++) { // c13 * (r-p)
            if (L[i] <= R[j]) { // c14 * (r - p -1)
                A[k] = L[i]; // c15 ??????
                i++; // c16 ??????
            } else {
                A[k] = R[j]; // c17 ??????
                j++; // c18 ?????
            }
        }
    }
}
