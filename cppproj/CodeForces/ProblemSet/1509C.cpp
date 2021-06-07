#include<bits/stdc++.h>

using namespace std;

typedef long long int lli;
typedef pair<int, int> pii;

/**
 * C. The Sports Festival
 * 
 * time limit per test: 1 second
 * memory limit per test: 256 megabytes
 * inputstandard input
 * outputstandard output
 * 
 * https://codeforces.com/problemset/problem/1509/C
 * 
 * solved
 */

const int MAX = 2e3+2;
vector<int> s;
int n;

lli mem[MAX][MAX];

lli dp(int l, int r) {
    if (mem[l][r] != -1) return mem[l][r];
    if (l == r) return 0;
    mem[l][r] = s[r]-s[l]+min(dp(l+1, r), dp(l, r-1));
    return mem[l][r];
}


int main()
{   
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    cin >> n;
    s.resize(n);

    memset(mem, -1, sizeof(mem));
    for(int i = 0; i < n; i++) cin >> s[i];
    sort(s.begin(), s.end(), [](int a, int b){
        return a < b;
    });

    cout << dp(0, n-1) << endl;
}