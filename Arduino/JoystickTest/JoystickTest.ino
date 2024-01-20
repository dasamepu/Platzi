int X;
int Y;
int LED_IZQ = 3;
int LED_DER = 5;
int LED_ABAJ = 6;
int LED_ARRI = 9;
int PULSADOR = 10;
int LED_SW = 11;
int SW;

void setup() {
  // put your setup code here, to run once:
  pinMode(LED_IZQ, OUTPUT);
  pinMode(LED_DER, OUTPUT);
  pinMode(LED_ABAJ, OUTPUT);
  pinMode(LED_ARRI, OUTPUT);
  pinMode(LED_SW, OUTPUT);
  pinMode(PULSADOR, INPUT);
  //Las entradas analogicas no requieren inicialización
}

void loop() {
  // put your main code here, to run repeatedly:
  X = analogRead(A0);
  Y = analogRead(A1);
  SW = digitalRead(PULSADOR);

  if(X >= 0 && X < 480){
    analogWrite(LED_IZQ, map(X, 0, 480, 255, 0));
  }else{
    analogWrite(LED_IZQ, 0); 
  }

  if(X >= 520 && X < 1023){
    analogWrite(LED_DER, map(X, 520, 1023, 0, 255));
  }else{
     analogWrite(LED_DER, 0);
  }
    
  if(Y >= 0 && Y < 480){
    analogWrite(LED_ABAJ, map(Y, 0, 480, 255, 0));
  }else{
    analogWrite(LED_ABAJ, 0);
  }

  if(Y >= 520 && Y < 1023){
    analogWrite(LED_ARRI, map(Y, 520, 1023, 0, 255));
  }else{
    analogWrite(LED_ARRI, 0);
  }

  digitalWrite(LED_SW, !SW);
}