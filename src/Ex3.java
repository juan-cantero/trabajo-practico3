public class Ex3 {
    public void immprimirInversamente(int n, int [] lista) {
        String p = "";


        if (n == 0)
             p += lista[0];
        else
             p += immprimirInversamente(n-1, lista);
            System.out.println(p);

    }

}
