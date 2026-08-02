class Solution {
    private TrieNode root;
    private Set<String> result;
    private int m, n;
    private char[][] board;

    public List<String> findWords(char[][] board, String[] words) {
        root = new TrieNode();
        result = new HashSet<>();
        this.board = board;
        m = board.length;
        n = board[0].length;

        for (String word : words) {
            insert(word);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(i, j, root, new StringBuilder());
            }
        }

        return new ArrayList<>(result);
    }

    private void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            node.children.putIfAbsent(c, new TrieNode());
            node = node.children.get(c);
        }
        node.isEnd = true;
    }

    private void dfs(int i, int j, TrieNode node, StringBuilder path) {
        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] == '#') return;

        char c = board[i][j];
        if (!node.children.containsKey(c)) return;

        node = node.children.get(c);
        path.append(c);

        if (node.isEnd) {
            result.add(path.toString());
        }

        board[i][j] = '#';
        dfs(i + 1, j, node, path);
        dfs(i - 1, j, node, path);
        dfs(i, j + 1, node, path);
        dfs(i, j - 1, node, path);
        board[i][j] = c;

        path.deleteCharAt(path.length() - 1);
    }
}

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isEnd = false;
}
