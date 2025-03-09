using System;
class Program
{
    static void Main()
    {
        DoorMachine pintu = new DoorMachine();                          // Membuat objek dari kelas DoorMachine, otomatis terkunci

        Console.WriteLine("Menekan tombol untuk membuka pintu...");     // Menampilkan proses membuka pintu
        pintu.BukaPintu();                                              // Memanggil method untuk membuka pintu

        Console.WriteLine("Menekan tombol untuk mengunci pintu...");    // Menampilkan proses mengunci pintu
        pintu.KunciPintu();                                             // Memanggil method untuk mengunci pintu kembali
    }
}
