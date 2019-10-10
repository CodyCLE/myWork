using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AreaPerimeterRectangle
{
    class Program
    {
        static void Main(string[] args)
        {
            int width;
            int height;
            int area;
            int perimeter;

                Console.Write("What is the Height? ");
                height = Console.ReadLine();

                Console.Write("What is the Width? ");
                width = Console.ReadLine();

                perimeter = 2 * (height + width);
                Console.Write("Perimeter of the rectangle = %d inches\n", perimeter);

                area = height * width;
                Console.Write("Area of the rectangle = %d square inches\n", area);

                Console.ReadKey();
        }
    }
}
