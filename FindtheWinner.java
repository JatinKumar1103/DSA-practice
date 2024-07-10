package Array;

import java.util.ArrayList;

public class FindtheWinner {
    public static int solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int i = 0;
        while (list.size() > 1) {
            int idx = (i + k - 1) % list.size();
            list.remove(idx);
            i = idx;
        }
        return list.get(0);
    }
}
