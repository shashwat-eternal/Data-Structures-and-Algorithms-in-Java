# Data-Structures-and-Algorithms-in-Java
This repository contains my solutions to various LeetCode problems, implemented in Java. Each solution is structured for clarity and efficiency, following best practices in Data Structures and Algorithms. The goal is to maintain a clean, organized collection of problem-solving code .

# 🚀 LeetCode Solutions in Java

This repository contains my solutions to **LeetCode problems**, written in **Java**.  
It serves as a structured archive of coding practice, interview preparation, and algorithmic problem‑solving.

---

## 📂 Repository Structure
- Each file corresponds to a specific LeetCode problem.
- File names follow the format:  
  `ProblemName.java` (e.g., `LongestSubstringWithoutRepeatingCharacters.java`)
- Solutions are implemented inside a `class Solution` as per LeetCode’s submission format.

---

## 🛠️ Languages & Tools
- **Java** (primary language)
- IDEs: VS Code / IntelliJ
- GitHub for version control and collaboration

---

## 🎯 Goals
- Build a clean and organized collection of solutions.
- Practice **Data Structures & Algorithms (DSA)** daily.
- Prepare for **technical interviews** with optimized solutions.
- Share knowledge with peers and the developer community.

---

## 📌 Example Solutions

### Longest Substring Without Repeating Characters
```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, maxLen = 0;
        int[] index = new int[128];
        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            left = Math.max(left, index[c]);
            maxLen = Math.max(maxLen, right - left + 1);
            index[c] = right + 1;
        }
        return maxLen;
    }
}


<!---LeetCode Topics Start-->
# LeetCode Topics
## Linked List
|  |
| ------- |
| [0002-add-two-numbers](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0002-add-two-numbers) |
| [0019-remove-nth-node-from-end-of-list](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0019-remove-nth-node-from-end-of-list) |
| [0021-merge-two-sorted-lists](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0021-merge-two-sorted-lists) |
| [0023-merge-k-sorted-lists](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0023-merge-k-sorted-lists) |
| [0024-swap-nodes-in-pairs](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0024-swap-nodes-in-pairs) |
| [0025-reverse-nodes-in-k-group](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0025-reverse-nodes-in-k-group) |
| [0061-rotate-list](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0061-rotate-list) |
| [0082-remove-duplicates-from-sorted-list-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0082-remove-duplicates-from-sorted-list-ii) |
| [0083-remove-duplicates-from-sorted-list](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0083-remove-duplicates-from-sorted-list) |
| [0086-partition-list](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0086-partition-list) |
| [0092-reverse-linked-list-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0092-reverse-linked-list-ii) |
## Math
|  |
| ------- |
| [0002-add-two-numbers](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0002-add-two-numbers) |
| [0007-reverse-integer](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0007-reverse-integer) |
| [0009-palindrome-number](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0009-palindrome-number) |
| [0012-integer-to-roman](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0012-integer-to-roman) |
| [0013-roman-to-integer](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0013-roman-to-integer) |
| [0029-divide-two-integers](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0029-divide-two-integers) |
| [0043-multiply-strings](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0043-multiply-strings) |
| [0050-powx-n](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0050-powx-n) |
| [0060-permutation-sequence](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0060-permutation-sequence) |
| [0062-unique-paths](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0062-unique-paths) |
| [0066-plus-one](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0066-plus-one) |
| [0067-add-binary](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0067-add-binary) |
| [0070-climbing-stairs](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0070-climbing-stairs) |
| [0089-gray-code](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0089-gray-code) |
| [0096-unique-binary-search-trees](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0096-unique-binary-search-trees) |
| [1979-find-greatest-common-divisor-of-array](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/1979-find-greatest-common-divisor-of-array) |
| [3336-find-the-number-of-subsequences-with-equal-gcd](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3336-find-the-number-of-subsequences-with-equal-gcd) |
| [3513-number-of-unique-xor-triplets-i](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3513-number-of-unique-xor-triplets-i) |
| [3658-gcd-of-odd-and-even-sums](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3658-gcd-of-odd-and-even-sums) |
| [3700-number-of-zigzag-arrays-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3700-number-of-zigzag-arrays-ii) |
| [3756-concatenate-non-zero-digits-and-multiply-by-sum-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3756-concatenate-non-zero-digits-and-multiply-by-sum-ii) |
| [3867-sum-of-gcd-of-formed-pairs](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3867-sum-of-gcd-of-formed-pairs) |
## Recursion
|  |
| ------- |
| [0002-add-two-numbers](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0002-add-two-numbers) |
| [0010-regular-expression-matching](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0010-regular-expression-matching) |
| [0021-merge-two-sorted-lists](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0021-merge-two-sorted-lists) |
| [0024-swap-nodes-in-pairs](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0024-swap-nodes-in-pairs) |
| [0025-reverse-nodes-in-k-group](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0025-reverse-nodes-in-k-group) |
| [0044-wildcard-matching](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0044-wildcard-matching) |
| [0050-powx-n](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0050-powx-n) |
| [0060-permutation-sequence](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0060-permutation-sequence) |
## String
|  |
| ------- |
| [0006-zigzag-conversion](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0006-zigzag-conversion) |
| [0008-string-to-integer-atoi](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0008-string-to-integer-atoi) |
| [0010-regular-expression-matching](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0010-regular-expression-matching) |
| [0012-integer-to-roman](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0012-integer-to-roman) |
| [0013-roman-to-integer](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0013-roman-to-integer) |
| [0014-longest-common-prefix](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0014-longest-common-prefix) |
| [0017-letter-combinations-of-a-phone-number](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0017-letter-combinations-of-a-phone-number) |
| [0020-valid-parentheses](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0020-valid-parentheses) |
| [0022-generate-parentheses](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0022-generate-parentheses) |
| [0028-find-the-index-of-the-first-occurrence-in-a-string](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0028-find-the-index-of-the-first-occurrence-in-a-string) |
| [0030-substring-with-concatenation-of-all-words](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0030-substring-with-concatenation-of-all-words) |
| [0032-longest-valid-parentheses](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0032-longest-valid-parentheses) |
| [0038-count-and-say](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0038-count-and-say) |
| [0043-multiply-strings](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0043-multiply-strings) |
| [0044-wildcard-matching](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0044-wildcard-matching) |
| [0049-group-anagrams](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0049-group-anagrams) |
| [0058-length-of-last-word](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0058-length-of-last-word) |
| [0065-valid-number](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0065-valid-number) |
| [0067-add-binary](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0067-add-binary) |
| [0068-text-justification](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0068-text-justification) |
| [0071-simplify-path](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0071-simplify-path) |
| [0072-edit-distance](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0072-edit-distance) |
| [0076-minimum-window-substring](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0076-minimum-window-substring) |
| [0079-word-search](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0079-word-search) |
| [0087-scramble-string](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0087-scramble-string) |
| [0091-decode-ways](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0091-decode-ways) |
| [0093-restore-ip-addresses](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0093-restore-ip-addresses) |
| [0097-interleaving-string](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0097-interleaving-string) |
| [1189-maximum-number-of-balloons](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/1189-maximum-number-of-balloons) |
| [3756-concatenate-non-zero-digits-and-multiply-by-sum-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3756-concatenate-non-zero-digits-and-multiply-by-sum-ii) |
## Hash Table
|  |
| ------- |
| [0012-integer-to-roman](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0012-integer-to-roman) |
| [0013-roman-to-integer](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0013-roman-to-integer) |
| [0017-letter-combinations-of-a-phone-number](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0017-letter-combinations-of-a-phone-number) |
| [0030-substring-with-concatenation-of-all-words](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0030-substring-with-concatenation-of-all-words) |
| [0036-valid-sudoku](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0036-valid-sudoku) |
| [0037-sudoku-solver](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0037-sudoku-solver) |
| [0041-first-missing-positive](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0041-first-missing-positive) |
| [0049-group-anagrams](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0049-group-anagrams) |
| [0073-set-matrix-zeroes](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0073-set-matrix-zeroes) |
| [0076-minimum-window-substring](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0076-minimum-window-substring) |
| [0105-construct-binary-tree-from-preorder-and-inorder-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0105-construct-binary-tree-from-preorder-and-inorder-traversal) |
| [0106-construct-binary-tree-from-inorder-and-postorder-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0106-construct-binary-tree-from-inorder-and-postorder-traversal) |
| [1189-maximum-number-of-balloons](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/1189-maximum-number-of-balloons) |
| [1331-rank-transform-of-an-array](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/1331-rank-transform-of-an-array) |
| [3532-path-existence-queries-in-a-graph-i](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3532-path-existence-queries-in-a-graph-i) |
| [3739-count-subarrays-with-majority-element-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3739-count-subarrays-with-majority-element-ii) |
## Counting
|  |
| ------- |
| [1189-maximum-number-of-balloons](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/1189-maximum-number-of-balloons) |
## Dynamic Programming
|  |
| ------- |
| [0010-regular-expression-matching](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0010-regular-expression-matching) |
| [0022-generate-parentheses](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0022-generate-parentheses) |
| [0032-longest-valid-parentheses](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0032-longest-valid-parentheses) |
| [0044-wildcard-matching](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0044-wildcard-matching) |
| [0045-jump-game-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0045-jump-game-ii) |
| [0053-maximum-subarray](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0053-maximum-subarray) |
| [0055-jump-game](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0055-jump-game) |
| [0062-unique-paths](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0062-unique-paths) |
| [0063-unique-paths-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0063-unique-paths-ii) |
| [0064-minimum-path-sum](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0064-minimum-path-sum) |
| [0070-climbing-stairs](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0070-climbing-stairs) |
| [0072-edit-distance](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0072-edit-distance) |
| [0085-maximal-rectangle](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0085-maximal-rectangle) |
| [0087-scramble-string](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0087-scramble-string) |
| [0091-decode-ways](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0091-decode-ways) |
| [0095-unique-binary-search-trees-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0095-unique-binary-search-trees-ii) |
| [0096-unique-binary-search-trees](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0096-unique-binary-search-trees) |
| [0097-interleaving-string](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0097-interleaving-string) |
| [3336-find-the-number-of-subsequences-with-equal-gcd](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3336-find-the-number-of-subsequences-with-equal-gcd) |
| [3699-number-of-zigzag-arrays-i](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3699-number-of-zigzag-arrays-i) |
| [3700-number-of-zigzag-arrays-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3700-number-of-zigzag-arrays-ii) |
## Array
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0011-container-with-most-water) |
| [0014-longest-common-prefix](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0014-longest-common-prefix) |
| [0015-3sum](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0015-3sum) |
| [0016-3sum-closest](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0016-3sum-closest) |
| [0018-4sum](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0018-4sum) |
| [0026-remove-duplicates-from-sorted-array](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0026-remove-duplicates-from-sorted-array) |
| [0027-remove-element](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0027-remove-element) |
| [0031-next-permutation](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0031-next-permutation) |
| [0035-search-insert-position](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0035-search-insert-position) |
| [0036-valid-sudoku](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0036-valid-sudoku) |
| [0037-sudoku-solver](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0037-sudoku-solver) |
| [0039-combination-sum](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0039-combination-sum) |
| [0040-combination-sum-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0040-combination-sum-ii) |
| [0041-first-missing-positive](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0041-first-missing-positive) |
| [0045-jump-game-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0045-jump-game-ii) |
| [0046-permutations](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0046-permutations) |
| [0047-permutations-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0047-permutations-ii) |
| [0049-group-anagrams](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0049-group-anagrams) |
| [0051-n-queens](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0051-n-queens) |
| [0053-maximum-subarray](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0053-maximum-subarray) |
| [0054-spiral-matrix](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0054-spiral-matrix) |
| [0055-jump-game](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0055-jump-game) |
| [0056-merge-intervals](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0056-merge-intervals) |
| [0057-insert-interval](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0057-insert-interval) |
| [0063-unique-paths-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0063-unique-paths-ii) |
| [0064-minimum-path-sum](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0064-minimum-path-sum) |
| [0066-plus-one](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0066-plus-one) |
| [0068-text-justification](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0068-text-justification) |
| [0073-set-matrix-zeroes](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0073-set-matrix-zeroes) |
| [0075-sort-colors](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0075-sort-colors) |
| [0079-word-search](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0079-word-search) |
| [0080-remove-duplicates-from-sorted-array-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0080-remove-duplicates-from-sorted-array-ii) |
| [0081-search-in-rotated-sorted-array-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0081-search-in-rotated-sorted-array-ii) |
| [0084-largest-rectangle-in-histogram](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0084-largest-rectangle-in-histogram) |
| [0085-maximal-rectangle](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0085-maximal-rectangle) |
| [0088-merge-sorted-array](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0088-merge-sorted-array) |
| [0090-subsets-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0090-subsets-ii) |
| [0105-construct-binary-tree-from-preorder-and-inorder-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0105-construct-binary-tree-from-preorder-and-inorder-traversal) |
| [0106-construct-binary-tree-from-inorder-and-postorder-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0106-construct-binary-tree-from-inorder-and-postorder-traversal) |
| [1331-rank-transform-of-an-array](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/1331-rank-transform-of-an-array) |
| [1979-find-greatest-common-divisor-of-array](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/1979-find-greatest-common-divisor-of-array) |
| [3336-find-the-number-of-subsequences-with-equal-gcd](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3336-find-the-number-of-subsequences-with-equal-gcd) |
| [3513-number-of-unique-xor-triplets-i](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3513-number-of-unique-xor-triplets-i) |
| [3532-path-existence-queries-in-a-graph-i](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3532-path-existence-queries-in-a-graph-i) |
| [3739-count-subarrays-with-majority-element-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3739-count-subarrays-with-majority-element-ii) |
| [3867-sum-of-gcd-of-formed-pairs](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3867-sum-of-gcd-of-formed-pairs) |
## Two Pointers
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0011-container-with-most-water) |
| [0015-3sum](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0015-3sum) |
| [0016-3sum-closest](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0016-3sum-closest) |
| [0018-4sum](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0018-4sum) |
| [0019-remove-nth-node-from-end-of-list](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0019-remove-nth-node-from-end-of-list) |
| [0026-remove-duplicates-from-sorted-array](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0026-remove-duplicates-from-sorted-array) |
| [0027-remove-element](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0027-remove-element) |
| [0028-find-the-index-of-the-first-occurrence-in-a-string](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0028-find-the-index-of-the-first-occurrence-in-a-string) |
| [0031-next-permutation](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0031-next-permutation) |
| [0061-rotate-list](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0061-rotate-list) |
| [0075-sort-colors](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0075-sort-colors) |
| [0080-remove-duplicates-from-sorted-array-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0080-remove-duplicates-from-sorted-array-ii) |
| [0082-remove-duplicates-from-sorted-list-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0082-remove-duplicates-from-sorted-list-ii) |
| [0086-partition-list](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0086-partition-list) |
| [0088-merge-sorted-array](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0088-merge-sorted-array) |
| [3867-sum-of-gcd-of-formed-pairs](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3867-sum-of-gcd-of-formed-pairs) |
## Greedy
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0011-container-with-most-water) |
| [0044-wildcard-matching](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0044-wildcard-matching) |
| [0045-jump-game-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0045-jump-game-ii) |
| [0055-jump-game](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0055-jump-game) |
## Trie
|  |
| ------- |
| [0014-longest-common-prefix](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0014-longest-common-prefix) |
## Sorting
|  |
| ------- |
| [0015-3sum](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0015-3sum) |
| [0016-3sum-closest](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0016-3sum-closest) |
| [0018-4sum](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0018-4sum) |
| [0047-permutations-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0047-permutations-ii) |
| [0049-group-anagrams](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0049-group-anagrams) |
| [0056-merge-intervals](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0056-merge-intervals) |
| [0075-sort-colors](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0075-sort-colors) |
| [0088-merge-sorted-array](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0088-merge-sorted-array) |
| [1331-rank-transform-of-an-array](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/1331-rank-transform-of-an-array) |
| [3867-sum-of-gcd-of-formed-pairs](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3867-sum-of-gcd-of-formed-pairs) |
## Backtracking
|  |
| ------- |
| [0017-letter-combinations-of-a-phone-number](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0017-letter-combinations-of-a-phone-number) |
| [0022-generate-parentheses](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0022-generate-parentheses) |
| [0037-sudoku-solver](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0037-sudoku-solver) |
| [0039-combination-sum](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0039-combination-sum) |
| [0040-combination-sum-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0040-combination-sum-ii) |
| [0046-permutations](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0046-permutations) |
| [0047-permutations-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0047-permutations-ii) |
| [0051-n-queens](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0051-n-queens) |
| [0052-n-queens-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0052-n-queens-ii) |
| [0077-combinations](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0077-combinations) |
| [0079-word-search](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0079-word-search) |
| [0089-gray-code](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0089-gray-code) |
| [0090-subsets-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0090-subsets-ii) |
| [0093-restore-ip-addresses](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0093-restore-ip-addresses) |
| [0095-unique-binary-search-trees-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0095-unique-binary-search-trees-ii) |
## Prefix Sum
|  |
| ------- |
| [3699-number-of-zigzag-arrays-i](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3699-number-of-zigzag-arrays-i) |
| [3739-count-subarrays-with-majority-element-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3739-count-subarrays-with-majority-element-ii) |
| [3756-concatenate-non-zero-digits-and-multiply-by-sum-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3756-concatenate-non-zero-digits-and-multiply-by-sum-ii) |
## Stack
|  |
| ------- |
| [0020-valid-parentheses](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0020-valid-parentheses) |
| [0032-longest-valid-parentheses](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0032-longest-valid-parentheses) |
| [0071-simplify-path](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0071-simplify-path) |
| [0084-largest-rectangle-in-histogram](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0084-largest-rectangle-in-histogram) |
| [0085-maximal-rectangle](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0085-maximal-rectangle) |
| [0094-binary-tree-inorder-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0094-binary-tree-inorder-traversal) |
## Divide and Conquer
|  |
| ------- |
| [0023-merge-k-sorted-lists](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0023-merge-k-sorted-lists) |
| [0053-maximum-subarray](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0053-maximum-subarray) |
| [0105-construct-binary-tree-from-preorder-and-inorder-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0105-construct-binary-tree-from-preorder-and-inorder-traversal) |
| [0106-construct-binary-tree-from-inorder-and-postorder-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0106-construct-binary-tree-from-inorder-and-postorder-traversal) |
| [3739-count-subarrays-with-majority-element-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3739-count-subarrays-with-majority-element-ii) |
## Heap (Priority Queue)
|  |
| ------- |
| [0023-merge-k-sorted-lists](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0023-merge-k-sorted-lists) |
## Merge Sort
|  |
| ------- |
| [0023-merge-k-sorted-lists](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0023-merge-k-sorted-lists) |
| [3739-count-subarrays-with-majority-element-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3739-count-subarrays-with-majority-element-ii) |
## String Matching
|  |
| ------- |
| [0028-find-the-index-of-the-first-occurrence-in-a-string](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0028-find-the-index-of-the-first-occurrence-in-a-string) |
## Bit Manipulation
|  |
| ------- |
| [0029-divide-two-integers](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0029-divide-two-integers) |
| [0067-add-binary](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0067-add-binary) |
| [0089-gray-code](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0089-gray-code) |
| [0090-subsets-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0090-subsets-ii) |
| [3513-number-of-unique-xor-triplets-i](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3513-number-of-unique-xor-triplets-i) |
## Sliding Window
|  |
| ------- |
| [0030-substring-with-concatenation-of-all-words](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0030-substring-with-concatenation-of-all-words) |
| [0076-minimum-window-substring](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0076-minimum-window-substring) |
## Binary Search
|  |
| ------- |
| [0035-search-insert-position](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0035-search-insert-position) |
| [0081-search-in-rotated-sorted-array-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0081-search-in-rotated-sorted-array-ii) |
| [3532-path-existence-queries-in-a-graph-i](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3532-path-existence-queries-in-a-graph-i) |
## Matrix
|  |
| ------- |
| [0036-valid-sudoku](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0036-valid-sudoku) |
| [0037-sudoku-solver](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0037-sudoku-solver) |
| [0054-spiral-matrix](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0054-spiral-matrix) |
| [0063-unique-paths-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0063-unique-paths-ii) |
| [0064-minimum-path-sum](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0064-minimum-path-sum) |
| [0073-set-matrix-zeroes](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0073-set-matrix-zeroes) |
| [0079-word-search](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0079-word-search) |
| [0085-maximal-rectangle](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0085-maximal-rectangle) |
## Simulation
|  |
| ------- |
| [0043-multiply-strings](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0043-multiply-strings) |
| [0054-spiral-matrix](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0054-spiral-matrix) |
| [0067-add-binary](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0067-add-binary) |
| [0068-text-justification](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0068-text-justification) |
| [3867-sum-of-gcd-of-formed-pairs](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3867-sum-of-gcd-of-formed-pairs) |
## Segment Tree
|  |
| ------- |
| [3739-count-subarrays-with-majority-element-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3739-count-subarrays-with-majority-element-ii) |
## Combinatorics
|  |
| ------- |
| [0062-unique-paths](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0062-unique-paths) |
## Union-Find
|  |
| ------- |
| [2685-count-the-number-of-complete-components](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/2685-count-the-number-of-complete-components) |
| [3532-path-existence-queries-in-a-graph-i](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3532-path-existence-queries-in-a-graph-i) |
## Graph Theory
|  |
| ------- |
| [2685-count-the-number-of-complete-components](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/2685-count-the-number-of-complete-components) |
| [3532-path-existence-queries-in-a-graph-i](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3532-path-existence-queries-in-a-graph-i) |
## Depth-First Search
|  |
| ------- |
| [0079-word-search](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0079-word-search) |
| [0094-binary-tree-inorder-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0094-binary-tree-inorder-traversal) |
| [0098-validate-binary-search-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0098-validate-binary-search-tree) |
| [0099-recover-binary-search-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0099-recover-binary-search-tree) |
| [0100-same-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0100-same-tree) |
| [0101-symmetric-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0101-symmetric-tree) |
| [0104-maximum-depth-of-binary-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0104-maximum-depth-of-binary-tree) |
| [2685-count-the-number-of-complete-components](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/2685-count-the-number-of-complete-components) |
## Breadth-First Search
|  |
| ------- |
| [0100-same-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0100-same-tree) |
| [0101-symmetric-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0101-symmetric-tree) |
| [0102-binary-tree-level-order-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0102-binary-tree-level-order-traversal) |
| [0103-binary-tree-zigzag-level-order-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0103-binary-tree-zigzag-level-order-traversal) |
| [0104-maximum-depth-of-binary-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0104-maximum-depth-of-binary-tree) |
| [2685-count-the-number-of-complete-components](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/2685-count-the-number-of-complete-components) |
## Enumeration
|  |
| ------- |
| [1291-sequential-digits](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/1291-sequential-digits) |
## Number Theory
|  |
| ------- |
| [1979-find-greatest-common-divisor-of-array](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/1979-find-greatest-common-divisor-of-array) |
| [3336-find-the-number-of-subsequences-with-equal-gcd](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3336-find-the-number-of-subsequences-with-equal-gcd) |
| [3658-gcd-of-odd-and-even-sums](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3658-gcd-of-odd-and-even-sums) |
| [3867-sum-of-gcd-of-formed-pairs](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3867-sum-of-gcd-of-formed-pairs) |
## Memoization
|  |
| ------- |
| [0070-climbing-stairs](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0070-climbing-stairs) |
## Monotonic Stack
|  |
| ------- |
| [0084-largest-rectangle-in-histogram](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0084-largest-rectangle-in-histogram) |
| [0085-maximal-rectangle](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0085-maximal-rectangle) |
## Tree
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0094-binary-tree-inorder-traversal) |
| [0095-unique-binary-search-trees-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0095-unique-binary-search-trees-ii) |
| [0096-unique-binary-search-trees](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0096-unique-binary-search-trees) |
| [0098-validate-binary-search-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0098-validate-binary-search-tree) |
| [0099-recover-binary-search-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0099-recover-binary-search-tree) |
| [0100-same-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0100-same-tree) |
| [0101-symmetric-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0101-symmetric-tree) |
| [0102-binary-tree-level-order-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0102-binary-tree-level-order-traversal) |
| [0103-binary-tree-zigzag-level-order-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0103-binary-tree-zigzag-level-order-traversal) |
| [0104-maximum-depth-of-binary-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0104-maximum-depth-of-binary-tree) |
| [0105-construct-binary-tree-from-preorder-and-inorder-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0105-construct-binary-tree-from-preorder-and-inorder-traversal) |
| [0106-construct-binary-tree-from-inorder-and-postorder-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0106-construct-binary-tree-from-inorder-and-postorder-traversal) |
## Binary Tree
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0094-binary-tree-inorder-traversal) |
| [0095-unique-binary-search-trees-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0095-unique-binary-search-trees-ii) |
| [0096-unique-binary-search-trees](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0096-unique-binary-search-trees) |
| [0098-validate-binary-search-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0098-validate-binary-search-tree) |
| [0099-recover-binary-search-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0099-recover-binary-search-tree) |
| [0100-same-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0100-same-tree) |
| [0101-symmetric-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0101-symmetric-tree) |
| [0102-binary-tree-level-order-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0102-binary-tree-level-order-traversal) |
| [0103-binary-tree-zigzag-level-order-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0103-binary-tree-zigzag-level-order-traversal) |
| [0104-maximum-depth-of-binary-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0104-maximum-depth-of-binary-tree) |
| [0105-construct-binary-tree-from-preorder-and-inorder-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0105-construct-binary-tree-from-preorder-and-inorder-traversal) |
| [0106-construct-binary-tree-from-inorder-and-postorder-traversal](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0106-construct-binary-tree-from-inorder-and-postorder-traversal) |
## Binary Search Tree
|  |
| ------- |
| [0095-unique-binary-search-trees-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0095-unique-binary-search-trees-ii) |
| [0096-unique-binary-search-trees](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0096-unique-binary-search-trees) |
| [0098-validate-binary-search-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0098-validate-binary-search-tree) |
| [0099-recover-binary-search-tree](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0099-recover-binary-search-tree) |
<!---LeetCode Topics End-->