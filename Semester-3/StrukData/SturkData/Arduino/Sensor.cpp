const int TRIGPIN = 8;
const int ECHOPIN = 9;
long timer;
int jarak;

void setup() {
  Serial.begin(9600);
  pinMode(TRIGPIN, OUTPUT);
  pinMode(ECHOPIN, INPUT);
}

void loop() {
  digitalWrite(TRIGPIN, LOW);
  delayMicroseconds(2);
  digitalWrite(TRIGPIN, HIGH);
  delayMicroseconds(10);
  digitalWrite(TRIGPIN, LOW);

  timer = pulseIn(ECHOPIN, HIGH);

  if (timer > 0) {
    jarak = timer / 58;
    Serial.print("Jarak = ");
    Serial.print(jarak);
    Serial.println(" cm");
  } else {
    Serial.println("Tidak ada objek yang terdeteksi");
  }

  delay(500);
}
