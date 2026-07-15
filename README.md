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
| [3336-find-the-number-of-subsequences-with-equal-gcd](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3336-find-the-number-of-subsequences-with-equal-gcd) |
| [3658-gcd-of-odd-and-even-sums](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3658-gcd-of-odd-and-even-sums) |
| [3700-number-of-zigzag-arrays-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3700-number-of-zigzag-arrays-ii) |
| [3756-concatenate-non-zero-digits-and-multiply-by-sum-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3756-concatenate-non-zero-digits-and-multiply-by-sum-ii) |
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
| [1331-rank-transform-of-an-array](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/1331-rank-transform-of-an-array) |
| [3336-find-the-number-of-subsequences-with-equal-gcd](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3336-find-the-number-of-subsequences-with-equal-gcd) |
| [3532-path-existence-queries-in-a-graph-i](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3532-path-existence-queries-in-a-graph-i) |
| [3739-count-subarrays-with-majority-element-ii](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3739-count-subarrays-with-majority-element-ii) |
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
| [1331-rank-transform-of-an-array](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/1331-rank-transform-of-an-array) |
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
## Divide and Conquer
|  |
| ------- |
| [0023-merge-k-sorted-lists](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0023-merge-k-sorted-lists) |
| [0053-maximum-subarray](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0053-maximum-subarray) |
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
## Sliding Window
|  |
| ------- |
| [0030-substring-with-concatenation-of-all-words](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0030-substring-with-concatenation-of-all-words) |
## Binary Search
|  |
| ------- |
| [0035-search-insert-position](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0035-search-insert-position) |
| [3532-path-existence-queries-in-a-graph-i](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3532-path-existence-queries-in-a-graph-i) |
## Matrix
|  |
| ------- |
| [0036-valid-sudoku](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0036-valid-sudoku) |
| [0037-sudoku-solver](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0037-sudoku-solver) |
| [0054-spiral-matrix](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0054-spiral-matrix) |
## Simulation
|  |
| ------- |
| [0043-multiply-strings](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0043-multiply-strings) |
| [0054-spiral-matrix](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0054-spiral-matrix) |
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
| [2685-count-the-number-of-complete-components](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/2685-count-the-number-of-complete-components) |
## Breadth-First Search
|  |
| ------- |
| [2685-count-the-number-of-complete-components](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/2685-count-the-number-of-complete-components) |
## Enumeration
|  |
| ------- |
| [1291-sequential-digits](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/1291-sequential-digits) |
## Number Theory
|  |
| ------- |
| [3336-find-the-number-of-subsequences-with-equal-gcd](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3336-find-the-number-of-subsequences-with-equal-gcd) |
| [3658-gcd-of-odd-and-even-sums](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/3658-gcd-of-odd-and-even-sums) |
<!---LeetCode Topics End-->