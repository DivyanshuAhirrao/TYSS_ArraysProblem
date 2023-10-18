package assignments.arrays.logical;

public class MatchingItems {
    public static void main(String[] args) {
        String[][] items = { {"phone", "red", "iphone11"}, {"laptop", "silver", "hp"}, {"phone", "purple", "iphone14Pro"}, {"camera", "red", "nikonD11"}, {"phone", "red", "vivoY10"}, {"laptop", "black", "dell"}};
        String ruleKey = "color", ruleValue = "red";


        for (int i=0;i<items.length;i++){
            for (int j=0;j<items[i].length;j++){
                if (items[i][j] == ruleValue){
                    System.out.println(items[i][0]);
                    System.out.println(items[i][j]);
                    System.out.println(items[i][2]);
                    System.out.println("---------------------------------");
                }
            }
        }



    }

}
