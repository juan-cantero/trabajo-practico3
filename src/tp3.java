public class tp3 {

    public static void main(String[] args) {
        Ex1 factorial = new Ex1();
        System.out.println(factorial.factorial(5));

        /*Ex2 fibonacci = new Ex2();
        System.out.println(fibonacci.fibonacci(5));
        fibonacci.setList(5);
        System.out.println(fibonacci.getList());*/

       /* Ex4 pascal = new Ex4();
        System.out.println(pascal.calcCombinations(5,3));*/
       /*Ex5 binary = new Ex5();
       binary.decimalToBinary(20);
       System.out.println(binary.getConvertedNumber());*/
       /*Ex6 counter = new Ex6();
       System.out.println(counter.getNumberOfDigits(555888));*/
       //Ex7 power = new Ex7();
       //System.out.println(power.isPower(64,4));
       //Ex8 triangular = new Ex8();
       //System.out.println(triangular.triangular(3));
        Ex9 triangle = new Ex9();
        System.out.println(triangle.pascal(2,2));
    }
}
