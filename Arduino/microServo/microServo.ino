//Incluimos libreria para usar el micro servo
#include <Servo.h>

//instanciamos un objeto de la clase "Servo que está en la libreria"
Servo Servo1;

//declaramos las variables 
  //"servoPin" es el pin al que está conectado micro el servo
  int servoPin = 9; 

  //"potPin" es el pin al que está conectado el potenciometro
  int potPin = A0;

void setup() {
  // enlazamos el micro servo al pin que está conectado
  Servo1.attach(servoPin);

  Serial.begin(9600);
}

void loop() {
  // leemos los valores del potenciometro
  int potReading = analogRead(potPin);

  // Convertimos los valores del potenciometro a angulos que se va a mover el micro servo
  int servoAngle = map(potReading, 0, 1023, 0, 180);

  // enviamos la informacion al micro servo
  Servo1.write(servoAngle);

  Serial.print("Angle: ");
  Serial.println(servoAngle);
}