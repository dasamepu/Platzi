int ledRojo = 3;
int potPin = A0;
int potValue = 0;

void setup() {
  // put your setup code here, to run once:
  pinMode(ledRojo, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  potValue = analogRead(potPin);
  Serial.println(potValue);
  digitalWrite(ledRojo, HIGH);
  delay(potValue);
  digitalWrite(ledRojo, LOW);
  delay(potValue);
}
