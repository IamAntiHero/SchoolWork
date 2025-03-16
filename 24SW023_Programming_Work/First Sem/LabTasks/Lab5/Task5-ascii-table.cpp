#include <iostream>
using namespace std;

int main() {
    int count = 0;
    for(int i = 97; i <= 122; i++) {
        cout << char(i) << " ";
        count++;
        if(count == 10) {
            cout << endl;
            count = 0;
        }
    }
    return 0;
}
