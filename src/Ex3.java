public class Ex3 {
    public String immprimirInversamente(int n, int [] lista, String s) {
        String a = "";
        if (n == 0)
          a += lista[0];
        else {
          a += lista[n] + immprimirInversamente(n - 1, lista, s);

        }

        return a;


    }

}
