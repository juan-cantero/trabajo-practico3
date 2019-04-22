import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Ex2 {
  public List<Integer> list = new ArrayList<>() ;
  public int fibonacci (int n) {

    if (n == 0)
      return 1;
    else if (n == 1)
      return 1;
    else
      return fibonacci(n -1) + fibonacci(n-2);
  }

  public void setList(int n) {
    while (n >= 0) {
      this.list.add(fibonacci(n));
      n--;
    }

  }

  public List<Integer> getList() {

     Collections.reverse(list);
     return list;
  }


}
