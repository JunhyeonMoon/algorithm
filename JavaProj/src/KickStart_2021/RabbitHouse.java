package KickStart_2021;

import java.util.*;
import java.io.*;

/**
 * Round A - Kick Start 2021 problem 3
 * https://codingcompetitions.withgoogle.com/kickstart/round/0000000000436140/000000000068cb14
 * 
 * solved
 */

public class RabbitHouse {
    public void run() {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int tc = 1; tc <= t; ++tc) {
            int R = in.nextInt();
            int C = in.nextInt();
            int[][] G = new int[R][C];        
            for(int i = 0; i < R; i++){
                for(int j = 0; j < C; j++){
                    G[i][j] = in.nextInt();
                }
            }
            System.out.println("Case #" + tc+ ": " + solution(R, C, G));
        }
    }

    long solution(int R, int C, int[][] G){
        long answer = 0;
        PriorityQueue<Pos> pq = new PriorityQueue<>(new Comparator<Pos>(){
            @Override
            public int compare(Pos o1, Pos o2) {
                return o2.num - o1.num;
            } 
        });

        boolean[][] visited = new boolean[R][C];

        for(int i = 0; i < R; i++)
            for(int j = 0; j < C; j++)
                pq.add(new Pos(i, j, G[i][j]));

        while(!pq.isEmpty()){
            Pos pos = pq.poll();
            if(visited[pos.x][pos.y]) continue;
            pos.refresh(G);
            for(int dir = 0; dir < 4; dir++){
                Pos nPos = pos.move(dir);
                if(!nPos.check(R, C)) continue;
                nPos.refresh(G);
                
                if(pos.num > nPos.num + 1){
                    G[nPos.x][nPos.y] = pos.num - 1;
                    answer += pos.num - 1 - nPos.num;
                    nPos.refresh(G);
                    pq.add(nPos);
                }
            }
            visited[pos.x][pos.y] = true;
        }

        return answer;
    }

    class Pos {
        int x;
        int y;
        int num;
        Pos(int x, int y, int num){
            this.x = x;
            this.y = y;
            this.num = num;
        }

        boolean check(int R, int C){
            return this.x >= 0 && this.y >= 0 && this.x < R && this.y < C;
        }

        Pos move(int dir){
            int[] dirx = {1, -1, 0, 0};
            int[] diry = {0, 0, 1, -1};
            return new Pos(this.x + dirx[dir], this.y + diry[dir], this.num);
        }

        void refresh(int[][] map){
            this.num = map[this.x][this.y];
        }
    }
}
