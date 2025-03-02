// See https://aka.ms/new-console-template for more information
using System.Runtime.CompilerServices;

while (true)                                                                    // Buat Looping
{
    Console.Write("Masukkan satu huruf: ");                                     // Print ke console
    char input = Char.ToUpper(Console.ReadKey().KeyChar);                       // Ubah input ke huruf besar
    Console.WriteLine();                                                        // Buat line kosong biar rapih
    if (input == 'A' || input == 'I' || input == 'U' || input == 'O')           // Check  Huruf vokal apa bukan
    {
        Console.WriteLine($"Huruf {input} merupakan huruf vokal");              // Kalau Huruf vokal
    }
    else if (char.IsLetter(input))
    {
        Console.WriteLine($"Huruf {input} merupakan huruf konsonan");           // Kalau Huruf konsonan
    }
    else
    {
        Console.WriteLine($"{input} bukan huruf yang valid");                   // Kalau Inputnya gk valid
        break;                                                                  // Keluar Dari Looping
    }
}

Console.WriteLine();                                                            // Buat line kosong biar rapih
int[] bilGen = { 2, 4, 6, 8, 10};
for (int i = 0; i < bilGen.Length; i++)                                         // Looping buat print array bilGen
{
    Console.WriteLine($"Angka genap {i}: {bilGen[i]}");                         // Print ke console
}