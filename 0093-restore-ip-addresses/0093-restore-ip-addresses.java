class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new java.util.ArrayList<>();
        backtrack(result, new java.util.ArrayList<>(), s, 0);
        return result;
    }

    private void backtrack(List<String> result, List<String> path, String s, int start) {
        if (path.size() == 4) {
            if (start == s.length()) {
                result.add(String.join(".", path));
            }
            return;
        }

        for (int len = 1; len <= 3; len++) {
            if (start + len > s.length()) break;
            String segment = s.substring(start, start + len);
            if (isValid(segment)) {
                path.add(segment);
                backtrack(result, path, s, start + len);
                path.remove(path.size() - 1);
            }
        }
    }

    private boolean isValid(String segment) {
        if (segment.length() > 1 && segment.charAt(0) == '0') return false;
        int val = Integer.parseInt(segment);
        return val >= 0 && val <= 255;
    }
}
