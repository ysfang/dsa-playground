package recursive;

public class FindFactorial {
    public static int findRecursively(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * findRecursively(--n);
        }
    }

    public static int findWithLoop(int n) {
        for (int i = n - 1; i > 0; i--) {
            n *= i;
        }
        return n;
    }
}
