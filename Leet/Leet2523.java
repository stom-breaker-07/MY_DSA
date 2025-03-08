package MY_DSA.Leet;

public class Leet2523 {
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] closestPrimes(int left, int right) {
        int num1 = -1, num2 = -1;
        int prevPrime = -1, diff = Integer.MAX_VALUE;

        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                if (prevPrime != -1) {
                    int curDiff = i - prevPrime;
                    if (curDiff < diff) {
                        diff = curDiff;
                        num1 = prevPrime;
                        num2 = i;
                    }
                }
                prevPrime = i;
            }
        }

        return new int[] { num1, num2 };
    }
}
