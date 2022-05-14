```CSharp
using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter a noun: ");
        string noun = Console.ReadLine();

        Console.Write("Enter a verb: ");
        string verb = Console.ReadLine();

        Console.Write("Enter an adjective: ");
        string adjective = Console.ReadLine();

        Console.Write("Enter an adverb: ");
        string adverb = Console.ReadLine();

        Console.WriteLine($"On a sunny day, a very {adjective} {noun} was walking down the street. The {noun} was {verb} {adverb}.");
    }
}
```