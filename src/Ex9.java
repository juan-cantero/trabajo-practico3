// triangulo de pascal
public class Ex9 {

  public int pascal(int row, int column) {

    if (row == 0 || row ==1)
      return 1;
    else
    return this.factorial(row) / (this.factorial(column) * this.factorial(row - column));

  }

  public int factorial(int n) {
    if (n == 0)
      return 1;
    else
      return n * factorial(n-1);
  }
}
