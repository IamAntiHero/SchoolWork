#include <iostream>
using namespace std;

int main() {
    float cpp, dataStructures, operatingSystems;
    
    cout << "Enter C++ marks: ";
    cin >> cpp;
    cout << "Enter Data Structures marks: ";
    cin >> dataStructures;
    cout << "Enter Operating Systems marks: ";
    cin >> operatingSystems;
    
    float total = cpp + dataStructures + operatingSystems;
    float percentage = (total / 300) * 100;
    
    cout << "Total Marks: " << total << "/300" << endl;
    cout << "Percentage: " << percentage << "%" << endl;
    cout << "Grade: ";
    
    if (percentage >= 90) {
        cout << "A";
    } else if (percentage >= 80) {
        cout << "B";
    } else if (percentage >= 70) {
        cout << "C";
    } else if (percentage >= 60) {
        cout << "D";
    } else {
        cout << "FAIL";
    }
    
    return 0;
}
