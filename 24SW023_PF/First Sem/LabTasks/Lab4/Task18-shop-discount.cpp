#include <iostream>
using namespace std;

int main() {
    int quantity;
    cout << "Enter quantity: ";
    cin >> quantity;
    
    float totalCost = quantity * 100;
    
    if (totalCost > 1000) {
        totalCost = totalCost * 0.9;
    }
    
    cout << "Total cost: " << totalCost;
    return 0;
}
