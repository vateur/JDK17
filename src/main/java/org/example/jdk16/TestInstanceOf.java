package org.example.jdk16;

/**
 * @author vateur
 * @version 1.0.0
 * @description instanceof 模式匹配
 * @createTime 2024-03-30 16:42
 */
public class TestInstanceOf {

    public static void main(String[] args) {

        // 之前使用instanceof 进行类型判断之后，需要进行对象类型转换后才能使用。
        // 而在 JDK 16 中，可以在判断类型时指定变量名称进行类型转换，方便了使用。

        Object obj = "Hello";
        // JDK 16之前
        if (obj instanceof String) {
            // 强制转换后使用
            String str = (String)obj;
            //... use str ...
        }

        // JDK 16
        if (obj instanceof String str) {
            // 直接使用str变量
            // ... use s ...
        }
    }
}
