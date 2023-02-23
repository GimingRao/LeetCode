package Topic;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Topic166 {
    public static final char  left='(';
    public static final char  right=')';
    public String fractionToDecimal(int numerator, int denominator) {
        long a=numerator,b=denominator;
        if (a%b==0)
            return String.valueOf(a/b);
        StringBuilder stringBuilder=new StringBuilder();
        if (a*b<0)
            stringBuilder.append('-');
        Map<Long,Integer> indexOfNum=new HashMap<>();
        //将除数与被除数均变为正数
        a=Math.abs(a);
        b=Math.abs(b);
        //加入整数部分并将分子小于分母
        stringBuilder.append(a / b);
        stringBuilder.append(".");
        a%=b;
        //循环判断
        while (a!=0){
            a*=10;
            char nexNum= (char) (a/b+'0');
            if (indexOfNum.containsKey(a)){
                stringBuilder.insert(indexOfNum.get(a), "(");
                stringBuilder.append(')');
                return stringBuilder.toString();
            }
            indexOfNum.put(a,stringBuilder.length());
            a%=b;
            stringBuilder.append(nexNum);
        }
        return stringBuilder.toString();
    }
}
