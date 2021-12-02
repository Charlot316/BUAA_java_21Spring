import java.util.Scanner;
public class Calculate_Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
                int a,b;
                while(true)
                {
                    String command = input.nextLine();
                    command=command.trim();
                    String []arguments=command.split("\\s+");
                    if(arguments.length==2)
                    {
                        if(arguments[0].matches("^[-\\+]?[\\d]*$")&&arguments[1].matches("^[-\\+]?[\\d]*$"))
                        {
                            a=Integer.parseInt(arguments[0]);
                            b=Integer.parseInt(arguments[1]);
                            System.out.println("a + b = "+Calculate.add(a,b));
                            System.out.println("a - b = "+Calculate.minus(a,b));
                        }
                        else
                        {
                            System.out.println("Please enter two integers");
                        }
                    }
                    else
                    {
                        System.out.println("Please enter two integers");
                    }

                }




        }
        catch(NumberRangeException e){
            System.out.println(e.getReason());
        }
    }

}
