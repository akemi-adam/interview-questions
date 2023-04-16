import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        
        Integer number = sc.nextInt();

        Integer first = 0, last = 1, current = 0;

        for (int i = 0; i <= number; i++)
        {
            current = first + last;

            first = last;

            last = current;

            if (number == current)
                break;
        }

        System.out.printf("\nO número inserido (%d): %s\n", number, (number == current ? "Pertence a sequência de Fibonacci" : "Não pertence a sequência de Fibonacci"));

        sc.close();
    }
}
