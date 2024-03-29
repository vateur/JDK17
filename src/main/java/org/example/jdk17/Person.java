package org.example.jdk17;

/**
 * @author vateur
 * @version 1.0.0
 * @description 密封类
 * @createTime 2024-03-29 16:47
 */
public sealed class Person permits Teacher, Worker{

    // 密封类可以是封闭类和或者封闭接口，用来增强 Java 编程语言，防止其他类或接口扩展或实现它们。
}

// 子类可以被修饰为 final
final class Teacher extends Person { }//教师

// 子类可以被修饰为 non-sealed，此时 Worker类就成了普通类，谁都可以继承它
non-sealed class Worker extends Person { }  //工人
// 任何类都可以继承Worker
class AnyClass extends Worker{}
