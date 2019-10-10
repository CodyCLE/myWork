// Cody Gentry

using System;

namespace HeightRangeCheck
{
    class Program
    {
        static void Main(string[] args)
        {
            int height;

            Console.Write("How tall are you in inches? ");
            height = Convert.ToInt32(Console.ReadLine());

            if (height <= 60 || height > 75 )
            {
                Console.WriteLine("Your height is definately not average, go see a doctor.");
            }
            else
            {
                Console.WriteLine("Your height is within a normal range.");
            }

            Console.ReadKey();
        }
    }
}
