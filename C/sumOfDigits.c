#include <stdio.h>

int main(void)
{
    int t, digit, sum=0;
    scanf("%d", &t);
    
    while(t--)
    {
        scanf("%d", &digit);
        while(digit!=0)
        {
            sum+=digit%10;
            digit/=10;
        }
        printf("%d\n", sum);
        sum=0;
    }
    return 0;
}
