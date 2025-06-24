#include<stdio.h>

int main (){
    int idade = 20;
    float altura = 1.75;
    char genero = 'M';
    double preço = 10.99;
    
    printf("Idade: %d\n",idade);
    printf("Altura: %.2f\n",altura);
    printf("Gênero:%c\n",genero);
    printf("Preço:%,21f\n",preço);

    return 0;
    
}