package egyptMulti;

public class EgyptMulty {

    public int multiply1(int n, int a) {
        if (n == 1) return a;
        int result = multiply1(half(n), a + a);
        if (odd(n)) result = result + a;
        return result;
    }

    public int mult_acc0(int r, int n, int a) {
        if (n == 1) return r + a;
        if (odd(n)) {
            return mult_acc0(r + a, half(n), a + a);
        } else {
            return mult_acc0(r, half(n), a + a);
        }
    }

    public int mult_acc1(int r, int n, int a) {
        if (n == 1) return r + a;
        if (odd(n)) r = r + a;
        return mult_acc1(r, half(n), a + a);
    }

    public int mult_acc2(int r, int n, int a) {
        if (odd(n)) {
            r = r + a;
            if (n == 1) return r;
        }
        return mult_acc2(r, half(n), a + a);
    }

    public int mult_acc3(int r, int n, int a) {
        if (odd(n)) {
            r = r + a;
            if (n == 1) return r;
        }
        n = half(n);
        a = a + a;
        return mult_acc3(r, n, a);
    }

    public int mult_acc4(int r, int n, int a) {
        while (true) {
            if (odd(n)) {
                r = r + a;
                if (n == 1) return r;
            }
            n = half(n);
            a = a + a;
        }
    }

    int multiply2(int n, int a) {
        if (n == 1) return a;
        return mult_acc4(a, n - 1, a);
    }

    public int half(int n) {
        return n >> 1;
    }

    public boolean odd(int n) {
        return (n & 1) == 1;
    }
}
