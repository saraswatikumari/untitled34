

import java.util.Scanner;
public class test2 {
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);

        try
        {

            int a=s.nextInt();
            int b=s.nextInt();
            int arr[]={122,45,67,89,90};
            int index=s.nextInt();

           //throw new ArithmeticException(" /by zero");
            System.out.println(a / b);//arithmaticException
            System.out.println(arr[index]);
            return;
        }
        catch( ArrayIndexOutOfBoundsException obj)
        {
            System.out.println(obj);
        }
        catch(IllegalArgumentException obj)
        {
            System.out.println(obj);
        }
        catch (ArithmeticException obj)//handler
        {
            System.out.println(obj);
        }
        catch (Exception obj)//barambhaastra
        {
            System.out.println(obj);
        }
        finally
        {
            System.out.println("inside finally block");
        }
        System.out.println("end of the main");
    }
}
