#include <stdio.h>

int main(){
  int age;
  printf("Enter the age: ");
  scanf("%d", &age);
  printf("The age you entered is: %d", age);
  
  if(age >= 18){
    printf("\n The person is of legal age"); 
  }else if(age < 18 && age > 0){
    printf("\n The person is under age");
  }else{
    printf("\n The data is invalid");
  }
}
