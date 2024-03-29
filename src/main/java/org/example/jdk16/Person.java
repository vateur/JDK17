package org.example.jdk16;

/**
 * @author vateur
 * @version 1.0.0
 * @description 记录类
 * @createTime 2024-03-30 16:44
 */
public record Person(String name, Integer age) {

//    record 是一种全新的类型，它本质上是一个 final 类，同时所有的属性都是 final 修饰，或者可看成是 Lombok 中 @Data 注解的一个 "低配" 替代。
//    它会自动编译出 getXXX、toString、 hashcode 、equals等方法，减少了代码编写量。


    public static void main(String[] args) {
        Person person = new Person("zhangsan", 18);
    }
}
