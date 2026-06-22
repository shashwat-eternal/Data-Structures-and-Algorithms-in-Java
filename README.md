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
## Math
|  |
| ------- |
| [0002-add-two-numbers](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0002-add-two-numbers) |
| [0007-reverse-integer](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0007-reverse-integer) |
| [0009-palindrome-number](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0009-palindrome-number) |
| [0012-integer-to-roman](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0012-integer-to-roman) |
| [0013-roman-to-integer](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0013-roman-to-integer) |
## Recursion
|  |
| ------- |
| [0002-add-two-numbers](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0002-add-two-numbers) |
| [0010-regular-expression-matching](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0010-regular-expression-matching) |
## String
|  |
| ------- |
| [0006-zigzag-conversion](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0006-zigzag-conversion) |
| [0008-string-to-integer-atoi](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0008-string-to-integer-atoi) |
| [0010-regular-expression-matching](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0010-regular-expression-matching) |
| [0012-integer-to-roman](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0012-integer-to-roman) |
| [0013-roman-to-integer](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0013-roman-to-integer) |
| [0014-longest-common-prefix](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0014-longest-common-prefix) |
| [1189-maximum-number-of-balloons](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/1189-maximum-number-of-balloons) |
## Hash Table
|  |
| ------- |
| [0012-integer-to-roman](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0012-integer-to-roman) |
| [0013-roman-to-integer](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0013-roman-to-integer) |
| [1189-maximum-number-of-balloons](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/1189-maximum-number-of-balloons) |
## Counting
|  |
| ------- |
| [1189-maximum-number-of-balloons](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/1189-maximum-number-of-balloons) |
## Dynamic Programming
|  |
| ------- |
| [0010-regular-expression-matching](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0010-regular-expression-matching) |
## Array
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0011-container-with-most-water) |
| [0014-longest-common-prefix](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0014-longest-common-prefix) |
| [0015-3sum](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0015-3sum) |
| [0016-3sum-closest](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0016-3sum-closest) |
## Two Pointers
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0011-container-with-most-water) |
| [0015-3sum](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0015-3sum) |
| [0016-3sum-closest](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0016-3sum-closest) |
## Greedy
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0011-container-with-most-water) |
## Trie
|  |
| ------- |
| [0014-longest-common-prefix](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0014-longest-common-prefix) |
## Sorting
|  |
| ------- |
| [0015-3sum](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0015-3sum) |
| [0016-3sum-closest](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0016-3sum-closest) |
<!---LeetCode Topics End-->