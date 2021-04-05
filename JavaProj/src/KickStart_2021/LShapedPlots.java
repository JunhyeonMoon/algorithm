package KickStart_2021;

import java.io.*;
import java.util.*;

/**
 * Round A - Kick Start 2021 problem 2
 * https://codingcompetitions.withgoogle.com/kickstart/round/0000000000436140/000000000068c509
 * 
 * solved
 */

public class LShapedPlots {
    public void run() {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for (int tc = 1; tc <= t; ++tc) {
            int R = in.nextInt();
            int C = in.nextInt();
            int[][] map = new int[R][C];
            for (int i = 0; i < R; i++)
                for (int j = 0; j < C; j++)
                    map[i][j] = in.nextInt();
            System.out.println("Case #" + tc + ": " + solution(R, C, map));
        }
    }

    int solution(int R, int C, int[][] map) {
        int answer = 0;

        int[][] top = new int[R][C];
        int[][] bottom = new int[R][C];
        int[][] left = new int[R][C];
        int[][] right = new int[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 0)
                    continue;

                top[i][j] = i-1 >= 0 ? top[i-1][j] + 1 : map[i][j];
                left[i][j] = j-1 >= 0 ? left[i][j-1] + 1 : map[i][j];
            }
        }

        for (int i = R-1; i >= 0; i--) {
            for (int j = C-1; j >= 0; j--) {
                if (map[i][j] == 0)
                    continue;

                bottom[i][j] = i+1 < R ? bottom[i+1][j] + 1 : map[i][j];
                right[i][j] = j+1 < C ? right[i][j+1] + 1 : map[i][j];
            }
        }

        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                if(map[i][j] == 0)
                    continue;
                answer += count(top[i][j], left[i][j]);
                answer += count(top[i][j], right[i][j]);
                answer += count(bottom[i][j], left[i][j]);
                answer += count(bottom[i][j], right[i][j]);
            }
        }

        return answer;
    }

    int count(int a, int b){
        int c = Math.min(a, b) * 2 <= Math.max(a, b) ? Math.min(a, b) : Math.max(a, b) / 2;
        return Math.max(c - 1, 0) + Math.max(Math.min(a, b)/2 - 1, 0);
    }
}