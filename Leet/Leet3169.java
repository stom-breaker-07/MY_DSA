package MY_DSA.Leet;

import java.util.Arrays;

public class Leet3169 {
        public int countDays(int days, int[][] meetings) {
            Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

            int BusyDays = 0;
            int cStart = meetings[0][0];
            int cEnd = meetings[0][1];

            for (int i = 1; i < meetings.length; i++) {
                int nStart = meetings[i][0];
                int nEnd = meetings[i][1];

                if (nStart <= cEnd) {
                    cEnd = Math.max(cEnd, nEnd);
                }
                else {
                    BusyDays += (cEnd - cStart + 1);
                    cStart = nStart;
                    cEnd = nEnd;
                }
            }
            BusyDays += (cEnd - cStart + 1);

            return days-BusyDays;
        }
}
