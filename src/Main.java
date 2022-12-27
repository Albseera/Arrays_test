public class Main {
    public static void main(String[] args) {
        System.out.println("Задача");
        System.out.println(divideString("казак "));
    }

    public static Boolean divideString (String str) {
        str=str.trim();
        char[] chars = str.toCharArray();
        int leghtChars=chars.length;
        char[] newChars = new char[leghtChars];
        for (int i = 0; i < leghtChars ; i++) {
            newChars[i] = chars[leghtChars-1-i];
        }
        return str.equals(new String(newChars))  ;
    }

}