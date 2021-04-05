package KickStart_2021;

import java.io.*;
import java.util.*;

/**
 * Round A - Kick Start 2021 problem 1
 * https://codingcompetitions.withgoogle.com/kickstart/round/0000000000436140/000000000068cca3
 * 
 * solved
 */

public class KGoodnessString {
    public void run() {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for (int tc = 1; tc <= t; ++tc) {
            int N = in.nextInt();
            int K = in.nextInt();
            String S = in.next();
            System.out.println("Case #" + tc + ": " + solution(N, K, S));
        }
    }

    int solution(int N, int K, String S) {
        int answer = 0;
        int score = goodnessScore(S);

        for (int i = 0; i < N / 2; i++) {
            if (score == K)
                break;
            if (score > K && S.charAt(i) != S.charAt(N - i - 1)) {
                answer++;
                score--;
            } else if (score < K && S.charAt(i) == S.charAt(N - i - 1)) {
                answer++;
                score++;
            }
        }

        return answer;
    }

    int goodnessScore(String s) {
        int score = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                score++;
        }
        return score;
    }
}