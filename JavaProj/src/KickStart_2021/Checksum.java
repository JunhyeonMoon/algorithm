package KickStart_2021;

import java.io.*;
import java.util.*;

/**
 * Round A - Kick Start 2021 problem 4
 * https://codingcompetitions.withgoogle.com/kickstart/round/0000000000436140/000000000068c2c3
 * 
 * not solved
 */

public class Checksum {
    public void run() {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for (int tc = 1; tc <= t; ++tc) {
            int N = in.nextInt();
            int[][] A = new int[N][N];
            int[][] B = new int[N][N];
            int[] R = new int[N];
            int[] C = new int[N];
            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    A[i][j] = in.nextInt();

            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    B[i][j] = in.nextInt();

            for(int i = 0; i < N; i++)
                R[i] = in.nextInt();

            for(int i = 0; i < N; i++)
                C[i] = in.nextInt();

            System.out.println("Case #" + tc + ": " + solution(N, A, B, R, C));
        }
    }

    int solution(int N, int[][] A, int[][] B, int[] R, int[] C) {
        int answer = 0;
        int[][] costMap = new int[N][N];    
        int[] rerr = new int[N];
        int[] cerr = new int[N];

        for(int i = 0; i < N; i++){
            Pos rpos = new Pos();
            Pos cpos = new Pos();
            for(int j = 0; j < N; j++){
                if(A[i][j] == -1) {
                    rerr[i]++;
                    rpos = new Pos(i, j);
                }
                if(A[j][i] == -1) {
                    cerr[i]++;
                    cpos = new Pos(j, i);
                }
            }

            if(rerr[i] == 1){
                rerr[i] = 0;
                A[rpos.x][rpos.y] = 0;
            }

            if(cerr[i] == 1){
                cerr[i] = 0;
                A[cpos.x][cpos.y] = 0;
            }
        }

        


        return answer;
    }

    class Pos {
        int x;
        int y;

        Pos(){}
        Pos(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
