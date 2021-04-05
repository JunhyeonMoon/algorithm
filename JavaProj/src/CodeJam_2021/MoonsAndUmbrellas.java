package CodeJam_2021;

import java.io.*;
import java.util.*;

/**
 * Qualification Round 2021 - Code Jam 2021 problem 2
 * https://codingcompetitions.withgoogle.com/codejam/round/000000000043580a/00000000006d1145
 * 
 * solved
 */

public class MoonsAndUmbrellas {
    public void run() {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for (int tc = 1; tc <= t; ++tc) {
            int X = in.nextInt();
            int Y = in.nextInt();
            String S = in.next();
            System.out.println("Case #" + tc + ": " + solution(X, Y, S));
        }
    }

    int solution(int X, int Y, String S) {
        int answer = 0;
        String[] Sarr = new String[2];
        boolean check = false;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '?') {
                if (!check) {
                    Sarr[0] = S.substring(0, i) + 'C';
                    Sarr[1] = S.substring(0, i) + 'J';
                } else {
                    Sarr[0] += 'C';
                    Sarr[1] += 'J';
                }
                check = true;

                if (i == S.length() - 1) {
                    int minIdx = getPrice(X, Y, Sarr[0]) > getPrice(X, Y, Sarr[1]) ? 1 : 0;
                    S = Sarr[minIdx];
                }
            } else if (check) {
                Sarr[0] += S.charAt(i);
                Sarr[1] += S.charAt(i);
                int minIdx = getPrice(X, Y, Sarr[0]) > getPrice(X, Y, Sarr[1]) ? 1 : 0;
                S = Sarr[minIdx] + S.substring(i);
                check = false;
            }
        }

        answer = getPrice(X, Y, S);
        return answer;
    }

    int getPrice(int X, int Y, String S) {
        int answer = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            String ts = S.substring(i, i + 2);
            if (ts.equals("CJ"))
                answer += X;
            else if (ts.equals("JC"))
                answer += Y;
        }

        return answer;
    }
}
