package KickStart_2020;

import java.io.*;
import java.util.*;

/**
 * Round A - Kick Start 2020 problem 2
 * https://codingcompetitions.withgoogle.com/kickstart/round/000000000019ffc7/00000000001d40bb
 * 
 * not solved
 */


public class Plates {
    public void run() {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for (int tc = 1; tc <= t; ++tc) {
            int N = in.nextInt();
            int K = in.nextInt();
            int P = in.nextInt();
            int[][] plates = new int[N][K];
            for(int i = 0; i < N; i++){
                for(int j = 0; j < K; j++){
                    plates[i][j] = in.nextInt();
                }
            }
            System.out.println("Case #" + tc + ": " + solution(N, K, P, plates));
        }
    }

    int solution(int N, int K, int P, int[][] plates){
        


        return 0;
    }
}
