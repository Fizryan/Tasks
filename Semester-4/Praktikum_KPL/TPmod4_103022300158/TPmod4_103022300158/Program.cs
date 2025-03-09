using System;

class Program
{
    static void Main()
    {
        Console.Write("Masukkan nama kelurahan: ");             // Menampilkan pesan input ke pengguna
        string kelurahan = Console.ReadLine();                  // Menerima input kelurahan dari pengguna

        string kodePos = KodePos.GetKodePos(kelurahan);         // Memanggil method untuk mendapatkan kode pos
        Console.WriteLine($"Kode Pos {kelurahan}: {kodePos}");  // Menampilkan kode pos dari kelurahan yang dimasukkan
    }
}
