package src.medium;

/***
 @author: Pratiksha Kulkarni
 date: 9/14/2022
 */
public class SlidingWindow1456 {
    /***
     min number
     abc 1
     bci 1
     cii 2
     iii 3
     ide 1
     def 1
     **/
    private static boolean isAVowel(char c){
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }
    public static int maxVowels(String s, int k) {
        int currentNumbers = 0;
        int maxNumber = Integer.MIN_VALUE;
        int len = s.length();
        int j;

        for(j=0;j<k;j++){
            if(isAVowel(s.charAt(j)))
                currentNumbers++;
        }
        //we have reached the window size
        maxNumber = Math.max(maxNumber,currentNumbers);

        for(int end=k;end<len;end++){
            if(isAVowel(s.charAt(end-k))) currentNumbers--;
            if(isAVowel(s.charAt(end))) currentNumbers++;
            maxNumber = Math.max(maxNumber,currentNumbers);
        }

        return maxNumber;
    }

    public static void main(String[] args) {
        System.out.println("result - " + maxVowels("abciiidef",3));
    }
}
