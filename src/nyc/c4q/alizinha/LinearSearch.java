package nyc.c4q.alizinha;
import java.util.ArrayList;

/**
 * Created by c4q-Allison on 4/3/15.
 */
public class LinearSearch
{
    public static void main(String[] args) {

        int num = 45;

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(45);
        numbers.add(3);
        numbers.add(2);
        numbers.add(99);

        System.out.println(searchList(numbers, num));
    }

    public static int searchList (ArrayList alist, int x) {

        for (int i = 0; i < alist.size(); i++) {

            if (alist.get(i).equals(x)) {
                return i;
            }
        }
        return -1;
    }
}
