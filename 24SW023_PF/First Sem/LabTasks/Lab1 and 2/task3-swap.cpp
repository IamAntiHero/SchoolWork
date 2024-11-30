#include <iostream>
using namespace std;

int main() {
    int first = 10;
    int second = 20;
    
    cout << "Before swap:" << endl;
    cout << "First: " << first << endl;
    cout << "Second: " << second << endl;
    
    int temp = first;
    first = second;
    second = temp;
    
    cout << "After swap:" << endl;
    cout << "First: " << first << endl;
    cout << "Second: " << second << endl;
    
    return 0;
}
