public class Ex7 {



  // en este caso la funcion recursiva es llamada dentro de otra funcion
  public Boolean isPower(int n, int m) {
      return m == isPowerOf(n,m);
  }


  public int isPowerOf(int n, int m) {

    if (n == m)
      return m;
    else if(n % m != 0)
      return 0;
    else
       return  isPowerOf(n /m,m);
  }
}
