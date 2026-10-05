class Solution {
    public List<Integer> findAnagrams(String s, String p) {
     List<Integer> ans = new ArrayList<>();
     int[] a = new int[26];
     int[] b = new int[26];
     for(int i =0; i<p.length(); i++){
        b[p.charAt(i)-'a']++;
     }   
     for(int i =0; i<s.length(); i++){
        a[s.charAt(i) - 'a']++;
        if(i >= p.length()){
            a[s.charAt(i-p.length()) - 'a']--;
        }
        if(Arrays.equals(a,b)){
            ans.add(i-p.length() + 1);
        }
     }
     return ans;
    }
}