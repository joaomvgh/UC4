#include<stdio.h>

int main(){

int idade = 20;
float valorDoPgto = 12.42;
double velParticula = 2.92817029837;
char tipoHabMotor = 'UM';

printf("Informe a idade");
scanf("%d" ,&idade);
printf("Informar o valor do Pagamento");
scanf("%d" ,&valorDoPgto);
printf("Informe a velocidade da partícula");
scanf("%d",&velParticula);
printf ("Informar o tipo de habilitação");
scanf ("%d",&tipoHabMotor);


printf("Dados Informados: %d, %f, %lf, %c\n",idade,valorDoPgto,velParticula,tipoHabMotor);

return 0;

}
