public class Ex5 {

  StringBuilder convertedNumber = new StringBuilder();

  public void decimalToBinary(int n) {
    // uso convertedNumber como un atributo de la clase porque cada vez que usaba recursion la variable convertedNumber
    // volvia a tener el valor inicial.

    int remainder = 0;
    if (n == 0 || n == 1) {
      this.convertedNumber.append(n);
    } else {

      this.convertedNumber.append(n %2);

      decimalToBinary(n/2);
    }
    convertedNumber.reverse();// reverse() me da vuelta la cadena(es un metodo de StringBuilder)

  }
  public StringBuilder getConvertedNumber() {
    return this.convertedNumber;
  }

  }

