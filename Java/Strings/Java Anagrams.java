static boolean isAnagram(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();
    
    char[] c = a.toCharArray();
    java.util.Arrays.sort(c);
    char[] d = b.toCharArray();
    java.util.Arrays.sort(d);
    String A = new String(c);
    String B = new String(d);
    if (A.equals(B)) {
        return true;
    }
    return false;
}