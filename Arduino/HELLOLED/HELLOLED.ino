const byte ledRojo1 = 2;

void setup() {
  // put your setup code here, to run once:
  pinMode(ledRojo1, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(ledRojo1, HIGH);
  delay(100);
  digitalWrite(ledRojo1, LOW);
  delay(100);

}
