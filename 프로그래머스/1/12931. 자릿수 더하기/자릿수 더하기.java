import java.util.*;

public class Solution {
    public int solution(int n) {
        int result = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        String nStr = n + "";
        
        for (int i = 0; i < nStr.length(); i++) {        
            result += Integer.parseInt(nStr.charAt(i) + "");        
        }
        
        return result;
    }
}