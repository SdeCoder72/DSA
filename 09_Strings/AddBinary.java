class Solution {
    public String addBinary(String a, String b) { 
        int m = a.length()-1;
        int n = b.length()-1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        int sum = 0;
        while(m >= 0 || n >= 0) {
            sum = carry;
            if(m >= 0) {
                sum += a.charAt(m)-'0';
                m--;
            }
            if(n >= 0) {
                sum += b.charAt(n) - '0';
                n--;
            }
            carry = (sum > 1)? 1 : 0;
            if(sum % 2 == 0) ans.append('0');
            else ans.append('1');
        }
        if(carry == 1) ans.append('1');
        ans.reverse();
        return ans.toString();
        
    }
}
