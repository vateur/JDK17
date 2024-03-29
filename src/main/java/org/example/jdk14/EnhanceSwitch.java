package org.example.jdk14;

/**
 * @author vateur
 * @version 1.0.0
 * @description 增强switch
 * @createTime 2024-03-30 16:38
 */
public class EnhanceSwitch {

    public static void main(String[] args) {
        String s = "a";
        switch (s) {
            case "a":
                System.out.println("a");
                break;
            case "b":
                System.out.println("b");
                break;
            default:
                System.out.println("default");
        }




        // 支持箭头表达式，支持返回值，支持null
        String day = "Monday";

        String result = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "工作日";
            case "weekend" -> "周末";
            // case null -> "null";
            default -> {
                // yield 关键字 yield的是JDK13后的一个新特性，它主要的作用是进行程序的局部返回
                yield "unknown";
            }

        };
        System.out.println(result);
    }
}
