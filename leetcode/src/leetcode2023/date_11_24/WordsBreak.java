package leetcode2023.date_11_24;

import java.util.Arrays;
import java.util.List;

public class WordsBreak {
    public static void main(String[] args) {
        wordBreak2("aaaaaaa", Arrays.asList(new String[]{"aaaa","aaa"}));
    }

    public static boolean wordBreak2(String s, List<String> wordDict) {
        boolean []dp=new boolean[s.length()+1];
        dp[0]=true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(dp[j]&&wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    //初始想法:这个只能处理不含"aaaa","aaa"类似的字符串数组
    public static boolean wordBreak(String s, List<String> wordDict) {
        int start=0,end=1;
        while(end<=s.length()){
            if(wordDict.contains(s.substring(start,end))){
                start=end;
                end=end+1;
                continue;
            }
            end++;
        }
        if(!wordDict.contains(s.substring(start,end-1))&& start!=end-1){
            return false;
        }
        return true;
    }
}
