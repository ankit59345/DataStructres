import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static boolean checkAnagram(String a, String b){
        String x = a.toLowerCase();
        String y = b.toLowerCase();
        char[] c1 = x.toCharArray();
        char[] c2 = y.toCharArray();
        if(c1.length != c2.length){
            return false;
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0; i<c1.length; i++) {
        	if(c1[i] != c2[i]) {
        		return false;
        	}
        }
        return true;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first String");
        String a = in.next();
        System.out.println("Enter the Second String");
        String b = in.next();
        if(checkAnagram(a, b)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
