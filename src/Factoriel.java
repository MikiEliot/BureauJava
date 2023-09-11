public class Factoriel {
    private int val;

    public Factoriel(int f) {
        this.val = this.calculFactoriel(f);
    }

    public int calculFactoriel(int x) {
        int res = 1;

        for(int i = x; i > 0; --i) {
            res *= i;
        }
        System.out.print(res);
        return res;
    }

    public int getVal() {
        return this.val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
