package CaiNiao;

import java.util.regex.Pattern;

/**
 * @Author: lizhongyi
 * @Date: 2021/10/10 4:13 下午
 * @Version 1.0
 * 正则表达
 */
public class RegexDemo {
    public static void main(String[] args) {
        String content = "I am a student";
        String pattern = ".*student.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("匹配结果为："+isMatch);
    }
}
