import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNumberInEachWindowOfSizeK {
    public static void main(String[] args) {
        long[] A = {12, -1, -7, 8, -15, 30, 16, 28};
        int i = 0, j = 0,k=3,n=A.length, idx = 0;
        Queue<Long> q = new LinkedList<>();
        long result[] = new long[n - k + 1];
        while (j < n) {
            if (A[j] < 0)
                q.add(A[j]);
            if (j - i + 1 == k) {
                if (q.size() == 0)  //no negative
                    result[idx++] = 0;
                 else {
                    result[idx++] = q.peek();
                    if (A[i] == q.peek())
                        q.poll();
                }
                i++;
            }
            j++;
        }
        for(long l : result)
            System.out.println(" l :: " + l);
    }
}
