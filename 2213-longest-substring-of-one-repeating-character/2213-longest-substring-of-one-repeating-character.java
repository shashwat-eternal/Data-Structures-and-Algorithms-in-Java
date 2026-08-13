class Solution {
    int[] leftLen, rightLen, maxLen, len;
    char[] leftChar, rightChar, arr;

    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
        int n = s.length();
        int k = queryIndices.length;

        arr = s.toCharArray();

        int size = 4 * n;
        leftLen = new int[size];
        rightLen = new int[size];
        maxLen = new int[size];
        len = new int[size];
        leftChar = new char[size];
        rightChar = new char[size];

        build(1, 0, n - 1);

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            int idx = queryIndices[i];
            char ch = queryCharacters.charAt(i);

            arr[idx] = ch;
            update(1, 0, n - 1, idx);

            ans[i] = maxLen[1];
        }

        return ans;
    }

    private void build(int node, int l, int r) {
        if (l == r) {
            leftLen[node] = rightLen[node] = maxLen[node] = len[node] = 1;
            leftChar[node] = rightChar[node] = arr[l];
            return;
        }

        int mid = (l + r) >>> 1;

        build(node << 1, l, mid);
        build(node << 1 | 1, mid + 1, r);

        merge(node, node << 1, node << 1 | 1);
    }

    private void update(int node, int l, int r, int idx) {
        if (l == r) {
            leftLen[node] = rightLen[node] = maxLen[node] = len[node] = 1;
            leftChar[node] = rightChar[node] = arr[idx];
            return;
        }

        int mid = (l + r) >>> 1;

        if (idx <= mid) {
            update(node << 1, l, mid, idx);
        } else {
            update(node << 1 | 1, mid + 1, r, idx);
        }

        merge(node, node << 1, node << 1 | 1);
    }

    private void merge(int p, int a, int b) {
        len[p] = len[a] + len[b];

        leftChar[p] = leftChar[a];
        rightChar[p] = rightChar[b];

        leftLen[p] = leftLen[a];

        if (leftLen[a] == len[a] && rightChar[a] == leftChar[b]) {
            leftLen[p] = len[a] + leftLen[b];
        }

        rightLen[p] = rightLen[b];

        if (rightLen[b] == len[b] && rightChar[a] == leftChar[b]) {
            rightLen[p] = len[b] + rightLen[a];
        }

        maxLen[p] = Math.max(maxLen[a], maxLen[b]);

        if (rightChar[a] == leftChar[b]) {
            maxLen[p] = Math.max(
                maxLen[p],
                rightLen[a] + leftLen[b]
            );
        }
    }
}