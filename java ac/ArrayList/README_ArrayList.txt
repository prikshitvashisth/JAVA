ARRAYLIST JAVA REVISION FOLDER

HOW TO USE:
1. Start with 00_ArrayList_CheatSheet.java.
2. Go through BASICS in order.
3. METHODS gives one small runnable example per important method.
4. OPERATIONS covers common operations.
5. CONVERSION covers arrays <-> ArrayList.
6. IMPORTANT_CONCEPTS covers common traps and advanced forms.
7. DSA_QUESTIONS contains practice from easy to two-pointer and common interview patterns.

IMPORTANT JAVA NAMING NOTE:
The requested names like 01_CreateArrayList.java cannot be used with a Java class named 01_CreateArrayList because Java identifiers cannot start with digits.
Therefore the actual files/classes use names such as:
ArrayList01_CreateArrayList.java
ArrayList02_AddElements.java
and so on.

DSA FILES use Q01_FindMaximum.java etc. because Q starts with a letter.

CORE METHODS:
add()
add(index, value)
addAll()
get()
set()
remove()
removeAll()
contains()
indexOf()
lastIndexOf()
size()
isEmpty()
clear()
toArray()

COLLECTIONS:
Collections.sort(list)
Collections.reverse(list)
Collections.swap(list, i, j)
Collections.max(list)
Collections.min(list)
Collections.frequency(list, value)
Collections.rotate(list, distance)

COMMON TRAP:
For ArrayList<Integer>:
list.remove(2) removes index 2.
list.remove(Integer.valueOf(2)) removes value 2.

COMPLEXITY REMINDER:
ArrayList get/set by index: O(1)
ArrayList add at end: amortized O(1)
add/remove in middle: O(n)
contains/indexOf: O(n)
Sorting: O(n log n)

DSA PATTERNS INCLUDED:
one-pass
two pointers
rotated sorted array
sliding window
hashing
Kadane
Boyer-Moore voting
binary search
prefix/suffix
merge of sorted lists
