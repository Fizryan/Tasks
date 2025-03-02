#ifndef SENSOR_H_INCLUDED
#define SENSOR_H_INCLUDED

class Sensor {
private:
    int trigPin;
    int echoPin;

public:
    Sensor(int trig, int echo);

    int getDistance();
};

#endif
