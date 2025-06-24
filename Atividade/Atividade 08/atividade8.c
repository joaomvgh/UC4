#include<stdio.h>

int main(){

    int um = 10,b = 20;
    _Bool condicao1 =(um > 5 && b < 30);// Verdadeira
    _Bool condicao2 =(um > 15 || b < 10);// Falso
    printf("Condição 1: %d\n",condicao1);
    printf("Condição 2: %d\n",condicao2);

    return 0;
}