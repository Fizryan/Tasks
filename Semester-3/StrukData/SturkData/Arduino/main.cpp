#include <iostream>
#include "Sensor.h"
#include <thread>
#include <chrono>
using namespace std;

int main()
{
    Sensor sensor(8, 9);

    while (true) {
        int jarak = sensor.getDistance();
        cout << "Jarak = " << jarak << " cm" << endl;

        this_thread::sleep_for(chrono::seconds(1));
    }

    return 0;
}
