public class LongestCommonSubsequence {

//    FUNCTION TO FIND THE LENGTH OF THE LONGEST COMMON SUBSEQUENCE OF
//    SEQUENCES X[0....M-1] AND Y[0....N-1]

    public static int lcsLength(String X, String Y, int M, int N){
//        RETURN IF END OF EITHER SUBSEQUENCE IS REACHED

        if (M == 0 || N == 0){

            return 0;
        }

//        CHECK IF THE LAST CHARACTER OF X AND Y MATCHES
        if(X.charAt(M - 1) == Y.charAt(N - 1)){
            return lcsLength(X, Y, M -1, N - 1) + 1;
        }

//        OTHERWISE, IF LAST ELEMENT OF X AND Y DOES NOT MATCH
        return Integer.max(lcsLength(X, Y, M, N -1 ), lcsLength(X, Y, M - 1, N));
    }

    public static void main (String [] args){
        String X = "ABABABAB";
        String Y = "BABABA";

        System.out.println("The length of LCS is " + lcsLength(X, Y, X.length(), Y.length()));

    }
}
