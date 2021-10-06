#include<stdio.h>
#include<stdlib.h>

int factorial(int);   //function declaration

int main()
{
   int N,T,i,j;
   
   scanf("%d",&T);	//accepts the number of test cases
   int arr[T];
   
   if(T<1 || T>100){	//contraints
   	exit(0);
    }
   
    for(i=0;i<T;i++){	  //accepts the numbers to find the factorial
   	scanf("%d",&N);
   	
   	if(N<1 || N>100)	//constraints
   		exit(0);
   	else{
   		arr[i]=factorial(N);	//stores the factorial of each number in an array
	    } 
    }
    
    for(i=0;i<T;i++){		//prints the array in the desired format
   	printf("%d\n",arr[i]);
   		}
   	return 0;
}

//function definition
int factorial(int n)
{
   
    if(n==0){
        return 1;
    }
    return n*factorial(n-1);

}
