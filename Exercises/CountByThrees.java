/**
 * Created by jc431075 on 25/08/17.
 */
public class CountByThrees
{
    public static void main(String[] args)
    {
        final int start = 3;
        final int stop = 300;
        final int numInLine = 30;
        for (int i = start;i <= stop; i += start)
        {
            System.out.println(i + " ");
            if (i % numInLine == 0)
                System.out.println();
        }
    }


}
