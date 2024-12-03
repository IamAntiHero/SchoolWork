#include <iostream>
using namespace std;

struct DateFormat {
    int day;
    int month;
    int year;
    
    void displayDate(int choice) {
        switch(choice) {
            case 1:
                cout << day << "-" << month << "-" << year;
                break;
            case 2:
                cout << month << "-" << day << "-" << year;
                break;
            case 3:
                cout << year << "-" << month << "-" << day;
                break;
        }
    }
};

int main() {
    DateFormat date = {30, 9, 2023};
    char choice;
    int format;
    
    do {
        cout << "Select date format:\n";
        cout << "1. DD-MM-YYYY\n";
        cout << "2. MM-DD-YYYY\n";
        cout << "3. YYYY-MM-DD\n";
        cin >> format;
        
        cout << "Date format ";
        switch(format) {
            case 1: cout << "DD-MM-YYYY"; break;
            case 2: cout << "MM-DD-YYYY"; break;
            case 3: cout << "YYYY-MM-DD"; break;
        }
        cout << " is selected: ";
        date.displayDate(format);
        
        cout << "\nContinue for next selection (y/n): ";
        cin >> choice;
        cout << "\n";
    } while (choice == 'y' || choice == 'Y');
    
    cout << "End of the Program\n";
    return 0;
}
