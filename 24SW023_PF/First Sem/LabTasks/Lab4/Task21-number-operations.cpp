#include <iostream>
using namespace std;

int main() {
    int num1, num2, num3;
    
    cout << "Enter first number: ";
    cin >> num1;
    cout << "Enter second number: ";
    cin >> num2;
    cout << "Enter third number: ";
    cin >> num3;
    
    int sum = num1 + num2 + num3;
    float average = sum / 3.0;
    
    cout << "Sum: " << sum << endl;
    cout << "Average: " << average;
    
    return 0;
}
