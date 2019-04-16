public class tp3 {

    public static void main(String[] args) {
        Ex1 factorial = new Ex1();
        System.out.println(factorial.factorial(4));
        Ex3 reverso = new Ex3();
        int[] lista = {1,2,3,4,5};
        int n = lista.length;
        System.out.println(reverso.immprimirInversamente(n, lista));
    }
}
