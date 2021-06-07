#include<bits/stdc++.h>

using namespace std;

typedef long long int lli;
typedef pair<int, int> pii;

/**
 * A. John and nuts
 * 
 * time limit per test: 1 second
 * memory limit per test: 256 megabytes
 * inputstandard input
 * outputstandard output
 * 
 * https://codeforces.com/gym/103029/problem/A
 * 
 * solved
 */

int main()
{   
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n, x, k;
    vector<int> a, b;
    cin >> n >> x;
    a.resize(n);
    for(int i = 0; i < n; i++) cin >> a[i];
    cin >> k;
    for(int i = 0; i < k; i++) {
        int temp;
        cin >> temp;
        a[temp-1] = 0;
    }

    int sum = 0;
    for(auto v : a){
        sum += v;
    }
    
    cout << sum+1 << endl;
}