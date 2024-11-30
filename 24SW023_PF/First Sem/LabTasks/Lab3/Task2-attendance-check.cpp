#include <iostream>
using namespace std;

int main() {
    float classesHeld, classesAttended;
    
    cout << "Enter number of classes held: ";
    cin >> classesHeld;
    
    cout << "Enter number of classes attended: ";
    cin >> classesAttended;
    
    float attendancePercentage = (classesAttended / classesHeld) * 100;
    
    cout << "Percentage of classes attended: " << attendancePercentage << "%" << endl;
    
    if (attendancePercentage >= 75) {
        cout << "Student is allowed to sit in exam.";
    } else {
        cout << "Student is not allowed to sit in exam.";
    }
    
    return 0;
}
