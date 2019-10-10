using System;

namespace NumberGuessingGame
{
    class Program
    {
        static void Main(string[] args)
        {
            Random random = new Random();

            int answer;
            int guess;
            int count;
            answer = random.Next(1, 11);
            count = 0;

            Console.WriteLine("GUESSING GAME - by Cody Gentry");
            Console.WriteLine("");
            Console.WriteLine("I'm thinking of a number between 0 - 10, can you guess the number i'm thinking of? ");
            Console.Write("Your Guess: ");
            guess = Convert.ToInt32(Console.ReadLine());
            count++;

            while (guess != answer)
            {
                if (guess > answer)
                {
                    Console.WriteLine("Too High! I'm sorry, please try again with a lower number...");
                    Console.Write("Your Guess: ");
                    guess = Convert.ToInt32(Console.ReadLine());
                    count++;
                }
                else if (guess < answer)
                {
                    Console.WriteLine("Too Low! I'm sorry, please try again with a higher number...");
                    Console.Write("Your Guess: ");
                    guess = Convert.ToInt32(Console.ReadLine());
                    count++;
                }
            }

            if (count == 1)
            {
                Console.WriteLine("");
                Console.Write("Congratulations! You got the correct answer on your first try! :)");
            }
            else if (count > 1)
            {
                Console.WriteLine("");
                Console.WriteLine("Nice job! You were able to guess the number I was thinking of! It only took you " + count + " tries!");
            }

            Console.WriteLine("");
            Console.WriteLine("Press any key to continue... ");

            Console.ReadKey();
        }
    }
}
