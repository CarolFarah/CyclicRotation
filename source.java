// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
      public int[] solution(int[] A, int K) {
          int[] rot = new int [A.length];
        
        for (int i = 0; i < A.length; i++) {
            if ( i + K >= A.length) {
                rot[(K + i) % A.length] = A[i];
            }
            else {
                rot [K + i] = A[i];
           }
       }
       return rot;
    }
}
