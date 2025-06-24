#include<stdio.h>

int main(){

    int um = 10,b = 20;
    int soma = um+b;
    int subtração = b-um;
    int multiplicação = um*b;
    float divisão =(float)b/um;
    int restauração = b%um;

    printf("Soma: %d\n",soma);
    printf("Subtração: %d\n",subtração);
    printf("Multiplicação: %d\n",multiplicação);
    printf("Divisão: %.2f\n",divisão);
    printf("Restauração: %d\n",restauração);

    return 0;
}