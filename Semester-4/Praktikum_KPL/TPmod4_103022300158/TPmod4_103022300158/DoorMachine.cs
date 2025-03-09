using System;

class DoorMachine
{
    private enum State { Terkunci, Terbuka }

    private State currentState;

    public DoorMachine()
    {
        currentState = State.Terkunci;                                  // Inisialisasi state awal sebagai terkunci
        Console.WriteLine("Pintu terkunci");                            // Menampilkan status awal di console
    }

    // Method untuk membuka pintu
    public void BukaPintu()
    {
        if (currentState == State.Terkunci)                             // Jika pintu dalam keadaan terkunci
        {
            currentState = State.Terbuka;                               // Ubah state menjadi terbuka
            Console.WriteLine("Pintu tidak terkunci");                  // Tampilkan pesan di console
        }
    }

    // Method untuk mengunci pintu kembali
    public void KunciPintu()
    {
        if (currentState == State.Terbuka)                              // Jika pintu dalam keadaan terbuka
        {
            currentState = State.Terkunci;                              // Ubah state menjadi terkunci
            Console.WriteLine("Pintu terkunci");                        // Tampilkan pesan di console
        }
    }
}
