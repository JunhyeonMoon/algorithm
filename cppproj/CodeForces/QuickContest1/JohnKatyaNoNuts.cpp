#include<bits/stdc++.h>

using namespace std;

typedef long long int lli;
typedef pair<int, int> pii;

/**
 * C. John, Katya, no nuts
 * 
 * time limit per test: 1 second
 * memory limit per test: 256 megabytes
 * inputstandard input
 * outputstandard output
 * 
 * https://codeforces.com/gym/103029/problem/C
 * 
 * solved
 */

int main()
{   
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    lli a, b;
    cin >> a >> b;

    lli dif = abs(a-b)+1;
    if(a-dif >= 0) cout << 0 << endl;
    else cout << a+dif << endl;
}