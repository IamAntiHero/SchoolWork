#include <iostream>
using namespace std;

int main() {
    int seconds;
    cout << "Input seconds: ";
    cin >> seconds;
    
    int minutes = seconds / 60;
    int hours = minutes / 60;
    
    cout << "Minutes: " << minutes << endl;
    cout << "Hours: " << hours;
    
    return 0;
}
