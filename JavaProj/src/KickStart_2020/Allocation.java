package KickStart_2020;

import java.io.*;
import java.util.*;

/**
 * Round A - Kick Start 2020 problem 1
 * https://codingcompetitions.withgoogle.com/kickstart/round/000000000019ffc7/00000000001d3f56
 * 
 * solved
 */


public class Allocation {
    public void run() {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for (int tc = 1; tc <= t; ++tc) {
            int N = in.nextInt();
            int B = in.nextInt();
            int[] A = new int[N];
            for(int i = 0; i < N; i++) A[i] = in.nextInt();
            System.out.println("Case #" + tc + ": " + solution(N, A, B));
        }
    }

    int solution(int N, int[] A, int B){
        Arrays.sort(A);
        int num = 0;
        for(int i = 0; i < N; i++){
            if(B < A[i]) break;
            B -= A[i];
            num++;
        }

        return num;
    }
}
