import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira uma palavra: ");

        String word = sc.nextLine();

        String reverseString = "";

        for (int i = word.length() - 1; i >= 0; i--)
        {
            reverseString += word.charAt(i);
        }

        System.out.println("String original: " + word);
        System.out.println("Reverso da String: " + reverseString);

        sc.close();
    }
}