public class Ex6 {
  public int getNumberOfDigits(int n) {
    return getNumberOfDigits(n,1);


  }
  // Aca uso una funcion auxiliar para que la funcion recursiva termine con cola y sea mas elegante.
  public int getNumberOfDigits(int n, int totalDigits) {
    if (n/10 == 0)

      return totalDigits;

    else

      return getNumberOfDigits(n/10,totalDigits +1);
  }
}
