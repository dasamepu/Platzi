#include <stdio.h>

#define PIZZACOST 1.5 
const char NEWLINE = '\n';

int main(){

    float costoPizzas;
    float numeroPizzas = 3;
    costoPizzas = PIZZACOST * numeroPizzas;
    
    printf("Total bill: %c %f", NEWLINE, costoPizzas);

}