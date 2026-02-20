// Time Complexity - O(n²)
// Space Complexity - O(n)

class Solution {
    public String makeLargestSpecial(String s) {
        List<String> specials = new ArrayList<>();
        int sum = 0;
        int start = 0;
    for(int i = 0; i<s.length(); i++) {
        sum += (s.charAt(i) == '1') ? 1 : -1;
        if(sum == 0) {
            String inner = s.substring(start+1, i);
            specials.add("1" + makeLargestSpecial(inner) + "0");
            start = i + 1;
        }
    }
        Collections.sort(specials, Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        for(String str : specials) {
            result.append(str);
        }
        return result.toString();
    }
}
