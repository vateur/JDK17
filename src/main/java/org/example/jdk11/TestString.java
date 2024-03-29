package org.example.jdk11;

/**
 * @author vateur
 * @version 1.0.0
 * @description 字符串新增方法
 * @createTime 2024-03-30 16:28
 */
public class TestString {

    public static void main(String[] args) {

        // 判断字符串是否为空
        " ".isBlank(); // true
        // 去除字符串首尾空格
        " JDK11 ".strip();// "JDK11"
        // 去除字符串首部空格
        " JDK11 ".stripLeading();   // "JDK11 "
        // 去除字符串尾部空格
        " JDK11 ".stripTrailing();  // " JDK11"
        // 重复字符串多少次
        "JDK11 ".repeat(3);             // "JDK11 JDK11 JDK11 "
        // 返回由行终止符分隔的字符串集合
        "A\nB\nC".lines().count();    // 3
    }
}
