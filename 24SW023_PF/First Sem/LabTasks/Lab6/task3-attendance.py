#include <iostream>
#include <string>
using namespace std;

struct Student {
    string name;
    string rollNo;
    string username;
    string password;
    bool attendance[30] = {false};
    int present = 0;
};

struct System {
    Student students[50];
    int count = 0;
    int day = 0;
    string admin_user = "admin";
    string admin_pass = "1234";
    
    bool adminLogin(string user, string pass) {
        return (user == admin_user && pass == admin_pass);
    }
    
    bool studentLogin(string user, string pass) {
        for(int i = 0; i < count; i++) {
            if(students[i].username == user && students[i].password == pass)
                return true;
        }
        return false;
    }
    
    void addStudent() {
        cout << "Enter name: ";
        cin >> students[count].name;
        cout << "Enter roll no: ";
        cin >> students[count].rollNo;
        students[count].username = "s" + students[count].rollNo;
        students[count].password = "p" + students[count].rollNo;
        cout << "Username: " << students[count].username << endl;
        cout << "Password: " << students[count].password << endl;
        count++;
    }
    
    void markAttendance() {
        char mark;
        for(int i = 0; i < count; i++) {
            cout << students[i].name << " present? (y/n): ";
            cin >> mark;
            if(mark == 'y') {
                students[i].attendance[day] = true;
                students[i].present++;
            }
        }
        day++;
    }
    
    void viewAttendance(string username) {
        for(int i = 0; i < count; i++) {
            if(students[i].username == username) {
                cout << "\nPresent days: " << students[i].present;
                cout << "\nPercentage: " << (students[i].present * 100.0 / day) << "%\n";
                return;
            }
        }
    }
};

int main() {
    System sys;
    string username, password;
    cout << "Username: ";
    cin >> username;
    cout << "Password: ";
    cin >> password;
    
    bool isAdmin = sys.adminLogin(username, password);
    bool isStudent = sys.studentLogin(username, password);
    
    if(!isAdmin && !isStudent) {
        cout << "Invalid login!\n";
        return 0;
    }
    
    int choice;
    do {
        if(isAdmin) {
            cout << "\n1. Add Student\n";
            cout << "2. Mark Attendance\n";
            cout << "3. Exit\n";
            cout << "Choice: ";
            cin >> choice;
            
            switch(choice) {
                case 1: sys.addStudent(); break;
                case 2: sys.markAttendance(); break;
                case 3: cout << "Exiting...\n"; break;
            }
        } else {
            cout << "\n1. View Attendance\n";
            cout << "2. Exit\n";
            cout << "Choice: ";
            cin >> choice;
            
            if(choice == 1) sys.viewAttendance(username);
            else if(choice == 2) cout << "Exiting...\n";
        }
    } while(choice != (isAdmin ? 3 : 2));
    
    return 0;
}
