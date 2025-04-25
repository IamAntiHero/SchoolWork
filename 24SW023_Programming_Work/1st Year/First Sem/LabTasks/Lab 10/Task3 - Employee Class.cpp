#include <iostream>
using namespace std;

class Employee {
private:
    int empNumber;
    float salary;
    
public:
    void enterData() {
        cout << "Enter employee number: ";
        cin >> empNumber;
        cout << "Enter salary: ";
        cin >> salary;
    }
    
    void displayData() {
        cout << "\nEmployee Number: " << empNumber;
        cout << "\nSalary: " << salary << endl;
    }
};

int main() {
    Employee emp[3];
    
    for(int i = 0; i < 3; i++) {
        cout << "\nEnter data for employee " << i + 1 << endl;
        emp[i].enterData();
    }
    
    cout << "\nEmployee Data:" << endl;
    for(int i = 0; i < 3; i++) {
        emp[i].displayData();
    }
    
    return 0;
}
