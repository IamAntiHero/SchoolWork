#include <iostream>
using namespace std;

class Calculator {
public:
    float add(float a, float b) {
        return a + b;
    }
    
    float sub(float a, float b) {
        return a - b;
    }
    
    float mul(float a, float b) {
        return a * b;
    }
    
    float div(float a, float b) {
        if(b != 0) {
            return a / b;
        }
        cout << "Error: Division by zero" << endl;
        return 0;
    }
};

int main() {
    Calculator calc;
    float num1, num2;
    
    cout << "Enter two numbers: ";
    cin >> num1 >> num2;
    
    cout << "Addition: " << calc.add(num1, num2) << endl;
    cout << "Subtraction: " << calc.sub(num1, num2) << endl;
    cout << "Multiplication: " << calc.mul(num1, num2) << endl;
    cout << "Division: " << calc.div(num1, num2) << endl;
    
    return 0;
}
