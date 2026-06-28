package OOPS;

public class GarbageCollection {
    public static void main(String[] args) {

        GarbageCollection obj = new GarbageCollection();  // object created on heap
        System.out.println("Object created.");

        obj = null;                          // reference removed - object now has no reference
        System.out.println("Reference removed. Object eligible for GC.");

        System.gc();                         // hints JVM to run garbage collector (not guaranteed)
        System.out.println("Requested GC (not guaranteed to run immediately).");
    }
}