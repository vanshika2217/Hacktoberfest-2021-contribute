#include <iostream>
using namespace std;
int main()
{
    int n, sum = 0, m;
    // Entered all value in one time and find the sum
    cout << "Enter a number the all value for find the sum "<<endl;
    cin >> n;
    while (n > 0)
    {
        m = n % 10;
        sum = sum + m;
        n = n / 10;
    }
    cout << "Sum is= " << sum << endl;
    return 0;
}
