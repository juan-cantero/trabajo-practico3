public class Ex4 {
  public long calcCombinations(long n, long m) {
    if (m == 1)
      return n;
    else if (n ==m)
      return 1;
    else
      return calcCombinations(n -1,m-1) + calcCombinations(n-1, m);
  }
}
