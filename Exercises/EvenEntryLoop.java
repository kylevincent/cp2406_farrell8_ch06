import javax.swing.*;

/**
 * Created by jc431075 on 25/08/17.
 */
public class EvenEntryLoop
{
    public static void main(String[]args)
    {
        Integer userInput = getUserInput();
        while (userInput != 999)
        {
            if (userInput % 2 == 0)
                System.out.println("Good Job!");
                else
                    System.out.println("BAD JOB!!!!!");
            userInput = getUserInput();
        }
        }
    public static Integer getUserInput()
    {
        String test = JOptionPane.showInputDialog(null, "Type an even number, or 999:");
        Integer theInput = Integer.parseInt(test);
        return theInput;
    }
}
