// C++ code
//

const int motor1A = 2;
const int motor1B = 4;
int velocidad;
const int pwm1 = 3;

void setup()
{
	pinMode(motor1A, OUTPUT);
	pinMode(motor1B, OUTPUT);
}

void loop()
{
	digitalWrite(motor1A, HIGH);
	digitalWrite(motor1B, LOW);
	velocidad = 255;
  	analogWrite(pwm1, velocidad);
  	delay(2500);
  
  //Cambio de sentido del motor
	digitalWrite(motor1A, LOW);
	digitalWrite(motor1B, HIGH);
	velocidad = 120;
  	analogWrite(pwm1, velocidad);
  	delay(2500);
}