using System;

namespace AdditionCalculator
{
    class Program
    {
        static void Main(string[] args)
        {
            double x;
            double y;

            Console.Write("Enter a number:");
            x = Convert.ToDouble(Console.ReadLine());

            Console.Write("Enter a second number:");
            y = Convert.ToDouble(Console.ReadLine());

            Console.Write(x + y);

            Console.ReadKey();
        }
    }
}
