package CodeJam_2021;

import java.io.*;
import java.util.*;

/**
 * Qualification Round 2021 - Code Jam 2021 problem 3
 * https://codingcompetitions.withgoogle.com/codejam/round/000000000043580a/00000000006d12d7
 * 
 * solved
 */

public class ReversortEngineering {
    public void run() {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for (int tc = 1; tc <= t; ++tc) {
            int N = in.nextInt();
            int C = in.nextInt();

            List<Integer> ans = solution(N, C);
            if (ans.size() == 0) {
                System.out.println("Case #" + tc + ": IMPOSSIBLE");
            } else {
                System.out.print("Case #" + tc + ": ");
                ans.forEach(ele -> System.out.print(ele + " "));
                System.out.println();
            }
        }
    }

    List<Integer> solution(int N, int C) {
        List<Integer> answer = new ArrayList<>();
        int minLoop = N - 1;
        int maxLoop = 0;
        for (int i = 2; i <= N; i++)
            maxLoop += i;

        if (maxLoop < C || C < minLoop)
            return answer;

        for (int i = 1; i <= N; i++)
            answer.add(i);

        C = C - (N - 1);
        Stack<Integer> stack = new Stack<>();
        int acc = N - 1;
        while (C > 0) {
            stack.push(Math.min(C, acc));
            C = C - acc;
            acc--;
        }

        while (!stack.isEmpty()) {
            int start = stack.pop();
            Collections.reverse(answer.subList(N - start - 1, N));
        }

        return answer;
    }
}
