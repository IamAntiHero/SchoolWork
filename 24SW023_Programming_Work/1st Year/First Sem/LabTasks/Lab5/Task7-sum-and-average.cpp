#include <iostream>
using namespace std;

int main() {
    int sum = 0;
    for(int i = 1; i <= 100; i++) {
        sum += i;
    }
    float average = float(sum) / 100;
    
    cout << "The sum is " << sum << endl;
    cout << "The average is " << average;
    return 0;
}
