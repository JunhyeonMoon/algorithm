import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        Solution app = new Solution();
        app.run();
    }


    void run(){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for (int tc = 1; tc <= t; ++tc) {
            int A = in.nextInt();
            int B = in.nextInt();
            solution(A, B);    
        }
    }

    void solution(int A, int B){
        if(B <= 1){
            System.out.println("NO");
            return;
        }

        if(B == 2) {
            B *= 2;
        }

        System.out.println("YES");
        System.out.printf("%d %d %d\n", A, A*(B-1), A+A*(B-1));
    }
}