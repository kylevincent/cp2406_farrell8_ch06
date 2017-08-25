import javax.swing.*;

/**
 * Created by jc431075 on 25/08/17.
 */
public class CountByAnything
{
    public static void main(String[] args)
    {
        final int start = getCount();
        final int stop = start * 100;
        int numInLine = 0;
        for (int i = start;i <= stop; i += start)
        {
            System.out.println(i + " ");
            numInLine++;
            if (numInLine % 10 == 0)
                System.out.println();
        }
    }
    public static Integer getCount()
    {
        String ayy = JOptionPane.showInputDialog(null, "input ya number mon");
        Integer theNum = Integer.parseInt(ayy);
        return theNum;
    }


}

