#include <Arduino.h>
#include "Sensor.h"

/*
  Turns on an LED on for one second, then off for one second, repeatedly.

  This example code is in the public domain.
*/

const int TRIGPIN = 8;
const int ECHOPIN = 9;

Sensor sensor(TRIGPIN, ECHOPIN);

void setup()
{
	Serial.begin(9600);
}

void loop()
{
	int jarak = sensor.getDistance();
    Serial.print("Jarak = ");
    Serial.print(jarak);
    Serial.println(" cm");
    delay(1000);
}
