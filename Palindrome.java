import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to check if it is a palindrome: ");
        String word = sc.nextLine();
        int length = word.length();
        int flag = 0;

        for(int i = 0; i < length; i++){
            if(word.charAt(i) != word.charAt(length-i-1)){
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            System.out.println(word + " is not a palindrome.");
        }
        else {
            System.out.println(word + " is a palindrome.");
        }
    }
}
