class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;

        int[] count_s=new int[26];
        for(int i=0;i<26;i++)
        count_s[i]=0;

        for(int i=0;i<s.length();i++)
        count_s[s.charAt(i)-97]++;

        for(int j=0;j<t.length();j++)
        count_s[t.charAt(j)-97]--;

        for(int i=0;i<26;i++)
        if(count_s[i]!=0)return false;

        return true;
        
    }
}
