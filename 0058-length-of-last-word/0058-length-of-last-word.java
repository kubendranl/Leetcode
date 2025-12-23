class Solution {
    public int lengthOfLastWord(String s) {
     s=s.trim();
     int lastvalue=s.lastIndexOf(' ');
     return s.length()-lastvalue-1;
    }
}
