#include<bits/stdc++.h>

using namespace std;

typedef long long int lli;
typedef pair<int, int> pii;

/**
 * D. John and pizza
 * 
 * time limit per test: 1 second
 * memory limit per test: 256 megabytes
 * inputstandard input
 * outputstandard output
 * 
 * https://codeforces.com/gym/103029/problem/D
 * 
 * solved
 */

int main()
{   
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    double n, m;
    cin >> n >> m;
    
    lli res = max(((lli)n*2-1)*floor((m/(sqrt(3)/2.f))), ((lli)m*2-1)*floor((n/(sqrt(3)/2.f))));
    cout << res << endl;
}