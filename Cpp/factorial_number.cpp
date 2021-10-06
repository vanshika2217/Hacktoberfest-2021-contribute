#include <iostream>
using namespace std;

int Remainder_number(int x,int y)
{
    return x % y;
}
int main() {
	int T,A,B;
	cin>>T; // Entered Input 
	
	for(int i=1;i<=T;i++)
	{
	    cin>>A>>B;
	    cout<<Remainder_number(A,B)<<endl;
	}
	return 0;
}
