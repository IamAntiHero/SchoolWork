#include <iostream>
#include <string>
using namespace std;

int main() {
    int houseNumber;
    string street, city, state, postalCode;
    int aptNumber;
    
    cout << "Enter house number: ";
    cin >> houseNumber;
    
    cout << "Enter street name: ";
    cin >> street;
    
    cout << "Enter apartment number (0 if none): ";
    cin >> aptNumber;
    
    cout << "Enter city: ";
    cin >> city;
    
    cout << "Enter state: ";
    cin >> state;
    
    cout << "Enter postal code: ";
    cin >> postalCode;
    
    cout << "\nYour address:\n";
    cout << houseNumber << " " << street;
    if (aptNumber != 0) {
        cout << " Apt " << aptNumber;
    }
    cout << endl;
    cout << city << ", " << state << " " << postalCode << endl;
    
    return 0;
}