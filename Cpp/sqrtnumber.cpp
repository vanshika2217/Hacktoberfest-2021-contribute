#include <iostream>
#include <cmath>
using namespace std;

int number(int a)
{
    return sqrt(a);
}
int main() {
	int T,x;
	cin>>T; // Entered Input 
	
	for(int i=1;i<=T;i++)
	{
	    cin>>x;
	    cout<<number(x)<<endl;
	}
	return 0;
}
