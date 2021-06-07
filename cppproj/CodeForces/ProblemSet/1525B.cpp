#include<bits/stdc++.h>

using namespace std;

typedef long long int lli;
typedef pair<int, int> pii;

/**
 * Permutation Sort
 * 
 * https://codeforces.com/problemset/problem/1525/B
 * 
 * solved
 */

int solution(int n, vector<int> arr){
    int ans = 0;
    vector<int> arrc = arr;
    sort(arrc.begin(), arrc.end());
    if(arrc == arr) ans = 0;
    else if(arr[0] == 1 || arr[n-1] == n) ans = 1;
    else if(arr[0] == n && arr[n-1] == 1) ans = 3;
    else ans = 2;

    return ans;
}

int main()
{   
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int t;
    cin >> t;
    for(int tc = 1; tc <= t; tc++){
        int n;
        cin >> n;

        vector<int> arr;
        arr.resize(n);
        for(int i = 0; i < n; i++){
            cin >> arr[i];
        }

        cout << solution(n, arr) << endl;
    } 
}