#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);
vector<string> split(const string &);


void show_value(const vector<int>& arr) {
    for (int v : arr)
        cout << v << ' ';
    cout << '\n';
}

void insertionSort1(int n, vector<int> arr) {
    int key = arr[n - 1];
    int j = n - 2;

    while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        show_value(arr);
        j--;
    }

    arr[j + 1] = key;
    show_value(arr);
}
