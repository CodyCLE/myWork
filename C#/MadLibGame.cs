using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MadLib
{
    class Program
    {
        static void Main(string[] args)
        {
            // Madlib program directions //
            //---------------------------//
            // 1. Create your variables //
            // 2. Give variables values --> Prompt user for info  --> Assign those values to variables //
            // 3. Generate story. //

            //assign variables
            string Color;
            string Animal;
            string PluralNoun;
            string Person;
            string Adject;

            //ask player to enter words
            Console.Write("Please enter a color: ");
            Color = Console.ReadLine();

            Console.Write("Now enter an adjective: ");
            Adject = Console.ReadLine();

            Console.Write("Now enter the name of someone famous: ");
            Person = Console.ReadLine();

            Console.Write("Now enter your favorite animal: ");
            Animal = Console.ReadLine();

            Console.Write("Finally, enter another adjective: ");
            PluralNoun = Console.ReadLine();

            //madlib story
            Console.WriteLine("Baker Mayfield, Johnny Manziel and " + Person + " walk into a " + Adject + " bar and " +
                "see a " + Color + " " + Animal + " with a " + PluralNoun + " weapon. " + Person + " tried to play with the " 
                + Animal + " but he was inevitabily bit and had to be rushed to the hospital. ");

            //keep window open and prompt for exit
            Console.WriteLine("Press enter to exit...");
            Console.ReadKey();
        }
    }
}
