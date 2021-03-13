package demo;

public class BruteForce {
    public static int getStringMatch(int[] N , int[] M){
        int n = N.length;          //文本串的长度
        int m = M.length;          //模式串的长度
        for(int i = 0;i < n-m;i++){       //最后一轮子串匹配的起始位置是n-m，如果大于n-m一定不会出现匹配子串
            int j = 0;
            while(j < m && M[j] == N[i+j])
                j = j +1;
            if(j == m)
                return i;
        }
        return -1;
    }

    public static void main(String args[]){
        int[] N  = {1,2,3,2,4,5,6,7,8,9};
        int[] M = {6,7,8};
        int position = getStringMatch(N,M);
        System.out.println("文本串N中第"+position+"位开始，可以寻找一个匹配模式M的子串，该位置字符值为："+N[position]);
    }
}

