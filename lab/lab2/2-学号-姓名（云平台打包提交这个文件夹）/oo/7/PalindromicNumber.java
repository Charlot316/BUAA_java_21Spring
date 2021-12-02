import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String words = input.nextLine();
        char [] numbers = words.toCharArray();
        for (char number : numbers) {
            if (!Character.isDigit(number)) {
                System.out.println("不是一个无符号整数");
                System.exit(0);
            }
        }
        if(numbers.length==1) {
            System.out.println("是一个回文数");
        }
        else{
            if (numbers[0]=='0'){
                System.out.println("不是一个没有前导 0 的无符号整数");
                System.exit(0);
            }
            else
            {
                for(int i=0,j=numbers.length-1;i<=j;i++,j--)
                {
                    if(numbers[i]!=numbers[j]){
                        System.out.println("是一个没有前导 0 的无符号整数，但不是回文数");
                        System.exit(0);
                    }
                }
                System.out.println("是一个回文数");
                System.exit(0);
            }
        }
    }
}
