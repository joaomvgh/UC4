#include <stdio.h>

int main(){

    int variedade[5]={1,2,3,4,5};
    int *ponteiro1 = &variedade[2];
    int *ponteiro2 = &variedade[0];
    printf("A diferença de ponteiro e %d\n", ponteiro1 - ponteiro2);
    return 0;
}
