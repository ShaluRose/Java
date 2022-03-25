### Algorithm

1. Pass two Strings **word** and **anagram** to method called **isAnagramUsingStringMethods()**
2. Iterate over first String **word** and get char **c** from it using **charAt()** method
3. If index of char c is **-1** in second String **anagram**, then two strings are not anagrams
4. If index of char c is not equal to **-1** in second String **anagram**, then remove the character from the String **anagram**
5. If you get empty String in the end, then two Strings are anagrams of each other.

Note:
**-1** simply denotes that a charcter of String **anagram** does not match any characters in String **word**.
