#include<stdio.h>
int main(){
    int variedade[5]={1,2,3,4,5};
    int *ponteiro = variedade;
    printf("%d\n",*(ponteiro + 2));
    return 0;
}