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
## Recursion
|  |
| ------- |
| [0002-add-two-numbers](https://github.com/shashwat-eternal/Data-Structures-and-Algorithms-in-Java/tree/master/0002-add-two-numbers) |
<!---LeetCode Topics End-->