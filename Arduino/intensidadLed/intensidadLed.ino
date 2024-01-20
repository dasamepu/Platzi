int led1 = 3;

int potPin1 = A0;
int potValue1 = 0;
int brightValue1 = 0;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  potValue1 = analogRead(potPin1);
  Serial.println(potValue1);
  brightValue1 = map(potValue1, 0, 1023, 0, 255);
  analogWrite(led1, brightValue1);
  delay(1);
}
