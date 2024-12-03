#include <iostream>
using namespace std;

struct User {
    string username = "user123";
    string password = "pass123";
    string hint = "123";
};

struct LoginSystem {
    User user;
    int attempts = 5;
    
    void login() {
        string username, password;
        
        while(attempts > 0) {
            cout << "\nAttempts left: " << attempts << endl;
            cout << "Username: ";
            cin >> username;
            cout << "Password: ";
            cin >> password;
            
            if(username == user.username && password == user.password) {
                cout << "Login successful!\n";
                return;
            }
            
            cout << "Invalid login!\n";
            cout << "Want to see password hint? (y/n): ";
            char choice;
            cin >> choice;
            
            if(choice == 'y') {
                cout << "Hint: " << user.hint << endl;
            }
            
            attempts--;
        }
        
        cout << "No more attempts left!\n";
    }
};

int main() {
    LoginSystem sys;
    sys.login();
    return 0;
}
