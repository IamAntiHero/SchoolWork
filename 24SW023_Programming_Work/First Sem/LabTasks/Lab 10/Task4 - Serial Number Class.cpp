#include <iostream>
using namespace std;

class SerialNumber {
private:
    static int nextSerial;
    int serialNum;
    
public:
    SerialNumber() {
        serialNum = nextSerial++;
    }
    
    void display() {
        cout << "Object Serial Number: " << serialNum << endl;
    }
};

int SerialNumber::nextSerial = 1;

int main() {
    SerialNumber obj1;
    SerialNumber obj2;
    SerialNumber obj3;
    
    obj1.display();
    obj2.display();
    obj3.display();
    
    return 0;
}
