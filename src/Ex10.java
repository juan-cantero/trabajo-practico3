public class Ex10 {
    int[] list ={1,2,3,4,5,6,7,8,9,10};
    int pos1 = list.length -1;
    public int sumarVector (int [] list1, int pos ) {
        if (pos == 0)
            return list1[0];
        else
            return list1[pos] + sumarVector(list1,pos -1);

    }
}
