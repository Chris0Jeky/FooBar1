import java.util.ArrayList;
public class Solution {
    public static String solution(String x) {
        ArrayList<Character> solutionArray = new ArrayList<>();
        for (int i = 0; i < x.length(); i++){
            char ch = x.charAt(i);
            if (ch > 96 && ch < 123) {
                float mid = createMid('z', 'a');
                char revertedCh = revertChar(ch, mid);
                solutionArray.add(revertedCh);
            }
            else {
                solutionArray.add(ch);
            }
        }
        return arrayLToString(solutionArray);
    }
    public static float createMid(int maxV, int minV){
        return maxV - ((float)(maxV - minV)/2);
    }
    public static char revertChar(char x, float mid){
        return (char) (mid - x + mid);
    }
    public static String arrayLToString(ArrayList<Character> arr){
        StringBuilder result = new StringBuilder();
        for (char i : arr) {
            result.append(i);
        }
        return result.toString();
    }
}