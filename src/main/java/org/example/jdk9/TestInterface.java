package org.example.jdk9;

/**
 * @author vateur
 * @version 1.0.0
 * @description 接口私有方法
 * @createTime 2024-03-30 16:09
 */
public interface TestInterface {

    default void method(){
        init();
        // ...
    }

    default void anotherMethod(){
        init();
    }

    private void init(){
        System.out.println("Initializing");
    }
}
