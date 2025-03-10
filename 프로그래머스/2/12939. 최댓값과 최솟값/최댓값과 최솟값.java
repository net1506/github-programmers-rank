class Solution {
    public String solution(String s) {
        String[] splitArr = s.split(" ");
        int min = Integer.parseInt(splitArr[0]); // 첫 번째 숫자로 초기화
        int max = min;

        for (String str : splitArr) {
            int num = Integer.parseInt(str);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return min + " " + max;
    }
}