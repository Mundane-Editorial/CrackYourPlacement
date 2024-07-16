package Day_3;

public class rabin_karp {

    // Prime number for hashing
    private static final int PRIME = 101;

    // Function to calculate hash value of a string
    public static long calculateHash(String str, int end) {
        long hash = 0;
        for (int i = 0; i <= end; i++) {
            hash += str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    // Function to recalculate hash by sliding window
    public static long recalculateHash(String str, int oldIndex, int newIndex, long oldHash, int patternLength) {
        long newHash = oldHash - str.charAt(oldIndex);
        newHash /= PRIME;
        newHash += str.charAt(newIndex) * Math.pow(PRIME, patternLength - 1);
        return newHash;
    }

    // Function to check if two strings are equal
    public static boolean checkEqual(String str1, String str2, int start1, int end1, int start2, int end2) {
        if (end1 - start1 != end2 - start2) {
            return false;
        }
        while (start1 <= end1 && start2 <= end2) {
            if (str1.charAt(start1) != str2.charAt(start2)) {
                return false;
            }
            start1++;
            start2++;
        }
        return true;
    }

    // Rabin-Karp algorithm for string matching
    public static int search(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();

        long patternHash = calculateHash(pattern, m - 1);
        long textHash = calculateHash(text, m - 1);

        for (int i = 0; i <= n - m; i++) {
            if (patternHash == textHash && checkEqual(text, pattern, i, i + m - 1, 0, m - 1)) {
                return i; // Pattern found at index i
            }

            if (i < n - m) {
                textHash = recalculateHash(text, i, i + m, textHash, m);
            }
        }
        return -1; // Pattern not found
    }

    public static void main(String[] args) {
        String text = "ababcabdababc";
        String pattern = "abc";
        int index = search(text, pattern);

        if (index != -1) {
            System.out.println("Pattern found at index: " + index);
        } else {
            System.out.println("Pattern not found");
        }
    }
}
