#include<bits/stdc++.h>

using namespace std;

typedef long long int lli;
typedef pair<int, int> pii;

/**
 * B. Kavi on Pairing Duty
 * 
 * time limit per test: 1 second
 * memory limit per test: 256 megabytes
 * inputstandard input
 * outputstandard output
 * 
 * https://codeforces.com/problemset/problem/1528/B
 * 
 * not solved
 */

const int MODULAR = 998244353;
const int MAX = 10e6 + 2;
lli MEM[MAX];

lli dp(int n) {
    if(n == 1) return 1;

    if(MEM[n] != -1) return MEM[n];

    lli res = 0;
    for(int i = 1; i < n; i++)
        res += dp(n-i);
    res %= MODULAR;
    return MEM[n] = 2 + res;
}


int main()
{   
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    
    memset(MEM, -1, sizeof(MEM));
    int n;
    cin >> n;
    cout << dp(n) % MODULAR << endl;
}