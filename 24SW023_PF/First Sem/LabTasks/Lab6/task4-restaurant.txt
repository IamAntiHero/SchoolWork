#include <iostream>
using namespace std;

struct MenuItem {
    string name;
    int price;
};

struct Order {
    string item;
    int quantity;
    int price;
};

struct Restaurant {
    MenuItem menu[4] = {
        {"Burger", 100},
        {"Biryani", 150},
        {"Roll", 80},
        {"Others", 120}
    };
    
    Order orders[50];
    int orderCount = 0;
    
    void showMenu() {
        cout << "\nMenu card\n";
        for(int i = 0; i < 4; i++) {
            cout << i+1 << ". " << menu[i].name << " Rs." << menu[i].price << endl;
        }
    }
    
    void placeOrder() {
        int choice, qty;
        cout << "Enter choice (1-4): ";
        cin >> choice;
        cout << "Enter Quantity: ";
        cin >> qty;
        
        orders[orderCount].item = menu[choice-1].name;
        orders[orderCount].quantity = qty;
        orders[orderCount].price = menu[choice-1].price;
        orderCount++;
    }
    
    void showBill() {
        int total = 0;
        cout << "\nBill Details\n";
        for(int i = 0; i < orderCount; i++) {
            int amount = orders[i].quantity * orders[i].price;
            cout << orders[i].item << " x " << orders[i].quantity 
                 << " = Rs." << amount << endl;
            total += amount;
        }
        cout << "Total: Rs." << total << endl;
    }
};

int main() {
    Restaurant rest;
    int choice;
    
    do {
        cout << "\n1. Menu Card\n";
        cout << "2. Order an item\n";
        cout << "3. Bill details\n";
        cout << "4. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;
        
        switch(choice) {
            case 1: rest.showMenu(); break;
            case 2: rest.placeOrder(); break;
            case 3: rest.showBill(); break;
            case 4: cout << "Thank you!\n"; break;
        }
    } while(choice != 4);
    
    return 0;
}
