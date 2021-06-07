#include<bits/stdc++.h>

using namespace std;

typedef long long int lli;
typedef pair<int, int> pii;

/**
 * B. John, Katya
 * 
 * time limit per test: 1 second
 * memory limit per test: 256 megabytes
 * inputstandard input
 * outputstandard output
 * 
 * https://codeforces.com/gym/103029/problem/B
 * 
 * solved
 */

int main()
{   
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    int n;
    cin >> n;

    if(n <= 1) cout << "Win" << endl;
    else if(n == 2) cout << "Draw" << endl;
    else cout << "Lose" << endl;    

}