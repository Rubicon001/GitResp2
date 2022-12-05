package 高频题1;

public class _62_圆圈中最后剩下的数字 {
    //f(n, m) = (f(n - 1, m) + m) % n
    public int lastRemaining1(int n, int m) {
        if (n == 1) return 0;
        return (lastRemaining(n - 1, m) + m) % n;
    }
    // f(1, 3) = 0
    // f(2, 3) = (f(1, 3) + 3) % 2
    // ...
    // f(7, 3) = (f(6, 3) + 3) % 7
    // f(8, 3) = (f(7, 3) + 3) % 8
    // f(9, 3) = (f(8, 3) + 3) % 9
    // f(10, 3) = (f(9, 3) + 3) % 10
    public int lastRemaining(int n, int m) {
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = (res + m) % i;
        }
        return res;
    }

    public static void main(String[] args) {
        _62_圆圈中最后剩下的数字 a = new _62_圆圈中最后剩下的数字();
        System.out.println(a.lastRemaining(10, 17));
    }
}
