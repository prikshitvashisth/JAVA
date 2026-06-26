public class StringBuilderMethods {

    // 1. append() - Adds text at the end
    public static void appendExample() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

        System.out.println("append(): " + sb);
    }

    // 2. insert() - Inserts text at a specific index
    public static void insertExample() {
        StringBuilder sb = new StringBuilder("Hllo");
        sb.insert(1, "e");

        System.out.println("insert(): " + sb);
    }

    // 3. replace() - Replaces characters from start index to end index
    public static void replaceExample() {
        StringBuilder sb = new StringBuilder("I love Java");
        sb.replace(7, 11, "Python");

        System.out.println("replace(): " + sb);
    }

    // 4. delete() - Deletes characters from start index to end index
    public static void deleteExample() {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.delete(5, 11);

        System.out.println("delete(): " + sb);
    }

    // 5. deleteCharAt() - Deletes a single character
    public static void deleteCharAtExample() {
        StringBuilder sb = new StringBuilder("Java!");
        sb.deleteCharAt(4);

        System.out.println("deleteCharAt(): " + sb);
    }

    // 6. reverse() - Reverses the string
    public static void reverseExample() {
        StringBuilder sb = new StringBuilder("Java");
        sb.reverse();

        System.out.println("reverse(): " + sb);
    }

    // 7. charAt() - Returns the character at a given index
    public static void charAtExample() {
        StringBuilder sb = new StringBuilder("Programming");

        char ch = sb.charAt(3);

        System.out.println("charAt(): " + ch);
    }

    // 8. setCharAt() - Changes the character at a given index
    public static void setCharAtExample() {
        StringBuilder sb = new StringBuilder("Java");
        sb.setCharAt(0, 'K');

        System.out.println("setCharAt(): " + sb);
    }

    // 9. length() - Returns the length
    public static void lengthExample() {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("length(): " + sb.length());
    }

    // 10. capacity() - Returns current capacity
    public static void capacityExample() {
        StringBuilder sb = new StringBuilder();

        System.out.println("capacity(): " + sb.capacity());
    }

    // 11. ensureCapacity() - Increases capacity if needed
    public static void ensureCapacityExample() {
        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(50);

        System.out.println("ensureCapacity(): " + sb.capacity());
    }

    // 12. setLength() - Changes the length
    public static void setLengthExample() {
        StringBuilder sb = new StringBuilder("Programming");

        sb.setLength(7);

        System.out.println("setLength(): " + sb);
    }

    // 13. substring() - Returns part of the string
    public static void substringExample() {
        StringBuilder sb = new StringBuilder("Programming");

        String str = sb.substring(3, 8);

        System.out.println("substring(): " + str);
    }

    // 14. toString() - Converts StringBuilder to String
    public static void toStringExample() {
        StringBuilder sb = new StringBuilder("Java");

        String str = sb.toString();

        System.out.println("toString(): " + str);
    }

    public static void main(String[] args) {

        appendExample();
        insertExample();
        replaceExample();
        deleteExample();
        deleteCharAtExample();
        reverseExample();
        charAtExample();
        setCharAtExample();
        lengthExample();
        capacityExample();
        ensureCapacityExample();
        setLengthExample();
        substringExample();
        toStringExample();

    }
}