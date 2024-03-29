package org.example.jdk15;

/**
 * @author vateur
 * @version 1.0.0
 * @description 文本快
 * @createTime 2024-03-30 16:41
 */
public class TestTextBlock {

    public static void main(String[] args) {


        //String content = "JDK 10\nJDK 11\nJDK 12";


        String content = """
            JDK 10
            JDK 11
            JDK 12
        """;
        System.out.println(content);
    }
}
