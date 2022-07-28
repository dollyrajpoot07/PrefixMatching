// We have a list of lexicographically sorted strings A. We also have a string B. 
// We need the first and last indexes of strings from A which are having their prefix as B.
// A can contain duplicate strings. Return [-1, -1] if no such prefix exists. Return a vector containing 
// first and last indexes and [-1, -1] in case no such prefix exists. Consider 0-based indexing.

//Input 1:
// String[] A = {"a", "aa", "aab", "b", "bb", "bbb", "bba"};
// String B = "bb";
//Output 1:
// 3 3 

public class PrefixMatching {
    public static int[] solve(String[] A, String B) {
        int sizeOfArray = A.length;
        
        int firstIndex = -1;
        int lastIndex = -1;

        for(int i = 0 ; i < sizeOfArray; i++) {
            String target = A[i];
            if(target.startsWith(B)){
                if(firstIndex == -1){
                    firstIndex = i;
                    lastIndex = i;
                } else {
                    lastIndex = i;
                }
            }
        }
        int[] array = {firstIndex, lastIndex};
        return array;
    }
    public static void main(String[] args) {
        String[] A = {"a", "aa", "aab", "b", "bb", "bbb", "bba"};
        String B = "bb";
        int[] solr = solve(A, B);
        for (int i = 0; i < solr.length; i++) 
        System.out.print( solr[i]+ " ");
    }  
}
