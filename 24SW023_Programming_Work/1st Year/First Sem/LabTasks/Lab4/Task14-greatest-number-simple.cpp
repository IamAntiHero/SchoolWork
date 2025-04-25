#include <iostream>
using namespace std;

int main() {
    int num1, num2, num3;
    cout << "Input the 1st number: ";
    cin >> num1;
    cout << "Input the 2nd number: ";
    cin >> num2;
    cout << "Input the 3rd number: ";
    cin >> num3;
    
    if(num1 >= num2 && num1 >= num3) {
        cout << "The greatest: " << num1;
    }
    else if(num2 >= num1 && num2 >= num3) {
        cout << "The greatest: " << num2;
    }
    else {
        cout << "The greatest: " << num3;
    }
    
    return 0;
}
