import java.util.Scanner;

public class Ex12 {
    public static void setVector(int[]list) {
        for (int i = 0; i < list.length; i++) {
            Scanner input = new Scanner(System.in);
             list[i] = input.nextInt();
        }

    }

    public static void inversa(int []list) {
        for (int i = list.length-1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }

    public static void printInverse(int [] list, int pos) {

        if (pos == 0)
            System.out.println(list[0]);
        else {
            System.out.println(list[pos
                    ]);
            printInverse(list, pos - 1);
        }

    }
    public static int add(int [] list, int pos) {
        if (pos == 0 )
            return list[0];
        else
            return list[pos] + add(list,pos-1);
    }

    public static void main(String[] args) {
        int[] lista = new int[4];
        int pos = lista.length -1;
        setVector(lista);
        printInverse(lista, pos );
        System.out.println(add(lista,pos));

    }

}
