#include <stdio.h>

int main(){
    int x, *px, *py;
    x = 9;
    px = &x;
    py = px;

    printf("x = %d\n", x);
    printf("&x = %p\n", &x);
    printf("px = %p\n", px);
    printf("*px = %d\n", *px);
    printf("*py = %d\n", *py);
    printf("*px + 2 = %d\n", *px+2);
    printf("*px++ = %d\n", *px++);
    return 0;
}
