#include<bits/stdc++.h>

using namespace std;

typedef long long int lli;
typedef pair<int, int> pii;

/**
 * A. Omkar and Bad Story
 * 
 * time limit per test: 2 second
 * memory limit per test: 256 megabytes
 * inputstandard input
 * outputstandard output
 * 
 * https://codeforces.com/problemset/problem/1536/A
 * 
 * solved
 */

vector<int> solution(int n, vector<int> arr) {
    map<int, int> amap;
    for(auto a : arr) amap[a] = 1;
    bool b = false;
    while(1){
        b = false;
        for(int i = 0; i < arr.size()-1; i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int t = abs(arr[i]-arr[j]);
                if(amap[t] <= 0) {
                    b = true;
                    amap[t] = 1;
                    arr.push_back(t);
                    if(arr.size() > 300) {
                        arr.clear();
                        return arr;
                    }
                }
            }
        }

        if(!b) break;
    }
    return arr;
}


int main()
{   
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    
    int tc;
    cin >> tc;
    for(int t = 0; t < tc; t++) {
        int n;
        cin >> n;

        vector<int> arr; arr.resize(n);
        for(int i = 0; i < n; i++) cin >> arr[i];
        vector<int> res = solution(n, arr);
        if(res.size() <= 0) {
            cout << "NO" << endl;
        }else{
            cout << "YES" << endl;
            cout << res.size() << endl;
            for (auto a : res) {
                cout << a << " ";
            }
            cout << endl;
        }
    }
}