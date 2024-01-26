// C++ code
//
//Mantén presionado unos segundos el botón para que cambie a verde.

int led_roja_1 = 2;
int led_amarilla_1 = 3;
int led_verde_1 = 4;
int boton1 = 8;
int botonState1;

int led_roja_2 = 5;
int led_amarilla_2 = 6;
int led_verde_2 = 7;
int boton2 = 9;
int botonState2;

int led_roja_3 = 10;
int led_amarilla_3 = 11;
int led_verde_3 = 12;
int boton3 = 13;
int botonState3;

int led_roja_4 = 14;
int led_amarilla_4 = 15;
int led_verde_4 = 16;
int boton4 = 17;
int botonState4;

int i;

void setup()
{
  pinMode(led_roja_1, OUTPUT);
  pinMode(led_amarilla_1, OUTPUT);
  pinMode(led_verde_1, OUTPUT);
  pinMode(led_roja_2, OUTPUT);
  pinMode(led_amarilla_2, OUTPUT);
  pinMode(led_verde_2, OUTPUT);
  pinMode(led_roja_3, OUTPUT);
  pinMode(led_amarilla_3, OUTPUT);
  pinMode(led_verde_3, OUTPUT);
  pinMode(led_roja_4, OUTPUT);
  pinMode(led_amarilla_4, OUTPUT);
  pinMode(led_verde_4, OUTPUT);
  pinMode(boton1, INPUT);
  pinMode(boton2, INPUT);
  pinMode(boton3, INPUT);
  pinMode(boton4, INPUT);
  
  Serial.begin(9600);
  
}

void LED_1A_green(){
  
  	digitalWrite(led_amarilla_1, HIGH);
  	digitalWrite(led_amarilla_4, HIGH);
  
    delay(2000);
  
  	digitalWrite(led_amarilla_1, LOW);
    digitalWrite(led_amarilla_2, LOW);
    digitalWrite(led_amarilla_3, LOW);
  	digitalWrite(led_amarilla_4, LOW);
  
    delay(200);  
  
	digitalWrite(led_verde_1, HIGH);
	digitalWrite(led_verde_2, LOW);
	digitalWrite(led_verde_3, LOW);
	digitalWrite(led_verde_4, LOW);
  	digitalWrite(led_roja_1, LOW);
  	digitalWrite(led_roja_2, HIGH);
  	digitalWrite(led_roja_3, HIGH);
  	digitalWrite(led_roja_4, HIGH);
  
    delay(2000);
  
  	digitalWrite(led_verde_1, LOW);
}

void LED_2A_green(){
  
  	digitalWrite(led_amarilla_1, HIGH);
    digitalWrite(led_amarilla_2, HIGH);
  
    delay(2000);
  
  	digitalWrite(led_amarilla_1, LOW);
    digitalWrite(led_amarilla_2, LOW);
    digitalWrite(led_amarilla_3, LOW);
  	digitalWrite(led_amarilla_4, LOW);
  
    delay(200);  
  
	digitalWrite(led_verde_2, HIGH);
	digitalWrite(led_verde_1, LOW);
	digitalWrite(led_verde_3, LOW);
	digitalWrite(led_verde_4, LOW);
  	digitalWrite(led_roja_2, LOW);
  	digitalWrite(led_roja_1, HIGH);
  	digitalWrite(led_roja_3, HIGH);
  	digitalWrite(led_roja_4, HIGH);
  
    delay(2000);
  
  	digitalWrite(led_verde_2, LOW);
}

void LED_3A_green(){

    digitalWrite(led_amarilla_2, HIGH);
    digitalWrite(led_amarilla_3, HIGH);
  
    delay(2000);
  
  	digitalWrite(led_amarilla_1, LOW);
    digitalWrite(led_amarilla_2, LOW);
    digitalWrite(led_amarilla_3, LOW);
  	digitalWrite(led_amarilla_4, LOW);
  
    delay(200);  
  
	digitalWrite(led_verde_3, HIGH);
	digitalWrite(led_verde_1, LOW);
	digitalWrite(led_verde_2, LOW);
	digitalWrite(led_verde_4, LOW);
  	digitalWrite(led_roja_3, LOW);
  	digitalWrite(led_roja_1, HIGH);
  	digitalWrite(led_roja_2, HIGH);
  	digitalWrite(led_roja_4, HIGH);
  
    delay(2000);
  
  	digitalWrite(led_verde_3, LOW);
}

void LED_4A_green(){

    digitalWrite(led_amarilla_3, HIGH);
  	digitalWrite(led_amarilla_4, HIGH);
  
    delay(2000);
  
  	digitalWrite(led_amarilla_1, LOW);
    digitalWrite(led_amarilla_2, LOW);
    digitalWrite(led_amarilla_3, LOW);
  	digitalWrite(led_amarilla_4, LOW);
  
    delay(200);  
  
	digitalWrite(led_verde_4, HIGH);
	digitalWrite(led_verde_1, LOW);
	digitalWrite(led_verde_2, LOW);
	digitalWrite(led_verde_3, LOW);
  	digitalWrite(led_roja_4, LOW);
  	digitalWrite(led_roja_1, HIGH);
  	digitalWrite(led_roja_2, HIGH);
  	digitalWrite(led_roja_3, HIGH);
  
    delay(2000);
  
  	digitalWrite(led_verde_3, LOW);
}

void checkBotonStatus(){
  
  botonState1 = digitalRead(boton1);
  botonState2 = digitalRead(boton2);
  botonState3 = digitalRead(boton3);
  botonState4 = digitalRead(boton4);
  
  if(botonState1 == HIGH){
    i = 4;
  }
  
  if(botonState2 == HIGH){
    i = 1;
  }
  
  if(botonState3 == HIGH){
    i = 2;
  }
  
  if(botonState4 == HIGH){
    i = 3;
  }
}

void loop()
{  
  for(i=1; i<5; ++i){
    switch(i){
  	case 1:
    	LED_1A_green();
	    checkBotonStatus();
      break;
  	case 2:
    	LED_2A_green();
	    checkBotonStatus();
      break;
  	case 3:
    	LED_3A_green();
	    checkBotonStatus();
      break;
  	case 4:
    	LED_4A_green();
	    checkBotonStatus();
      break;
  	}
  }   
}
