package assignments.arrays.logical;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "leetcodeabcdfghijklmnpqrsuvwxyz";

        sentence = sentence.toUpperCase();

        boolean[] alphaList = new boolean[26];
        int index = 0;
        int flag = 1;

        for (int i=0;i<sentence.length();i++){
            if (sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z'){
                index = sentence.charAt(i) -'A';
            }
            alphaList[index]= true;
        }

        for (int i=0;i<=25;i++){
            if (alphaList[i] == false){
                flag = 0;
            }
        }

        System.out.println("Given String is :- "+sentence);

        if (flag == 1){
            System.out.println("The Above String is Pangram !! ");
        }
        else {
            System.out.println("Above String is not Pangram !!");
        }

    }
}
