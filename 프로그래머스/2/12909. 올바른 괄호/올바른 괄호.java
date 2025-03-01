class Solution {
    boolean solution(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else {
                count--;
                if (count < 0) return false; // 닫는 괄호가 더 많으면 즉시 false
            }
        }

        return count == 0; // 모든 괄호가 짝을 이루면 true, 그렇지 않으면 false
    }
}
