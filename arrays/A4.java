package assignments.arrays;

import java.util.Arrays;

public class A4 {
        public static void main(String[] args) {
            String str = "Hello my name is Divyanshu I live in pune";
            evenWords(str);
        }
        public static void evenWords(String s){

            String[] words = s.split(" ");
            int[] length = new int[words.length];

            for (int i=0 ; i<words.length;i++){
                length[i] = words[i].length();
            }

            for (int i=0 ; i<words.length;i++){
                if (length[i]%2==0){
                    System.out.println(words[i]);
                }
            }
        }
}
