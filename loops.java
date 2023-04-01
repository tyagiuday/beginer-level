import java.util.Scanner;
public class loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*
        ------for loop
        System.out.println("enter the end value  ");
        int end =sc.nextInt();
        for (int i=0;i<end;i++) {
            System.out.println(end);
            System.out.println("time printing uday");
        }
        {System.out.println(i);}*/
        int i=0;
        /*
        ------while loop
        while (i<3)
        {System.out.println(i);
        i++;}*/

        //-----do while loop
        do{
            System.out.println(i);
            i++;
        }while(i<3);
    }//do while is used when you want to terminate the statement atleast one time
}
