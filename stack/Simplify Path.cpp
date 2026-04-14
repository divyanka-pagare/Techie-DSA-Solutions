71. Simplify Path


class Solution {
public:
    string simplifyPath(string path) {
        vector<string> st;
        string temp;
        stringstream ss(path);
        
        while (getline(ss, temp, '/')) {
            if (temp == "" || temp == ".") continue;
            if (temp == "..") {
                if (!st.empty()) st.pop_back();
            } else {
                st.push_back(temp);
            }
        }
        
        string result = "/";
        for (int i = 0; i < st.size(); i++) {
            result += st[i];
            if (i != st.size() - 1) result += "/";
        }
        return result;
    }
};
