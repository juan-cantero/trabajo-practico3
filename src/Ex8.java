public class Ex8 {
  public int triangular(int n) {
    if (n ==1)
      return 1;
    else
      return n + triangular(n -1);
  }
}
