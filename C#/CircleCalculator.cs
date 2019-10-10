using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CircleCalculator
{
    class Program
    {
        static void Main(string[] args)
        {

            double r, per_cir;
            double PI = 3.14;

            Console.Write("What is the radius of the circle: ");
            r = Convert.ToDouble(Console.ReadLine());

            per_cir = 2 * PI * r;

            Console.WriteLine("The circumference of circle is: {0}", per_cir);

            Console.WriteLine("Press any key to exit program...");

            Console.Read();
        }
    }
}
