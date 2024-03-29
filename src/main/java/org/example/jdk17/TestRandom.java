package org.example.jdk17;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

/**
 * @author vateur
 * @version 1.0.0
 * @description 增强的伪随机数生成器
 * @createTime 2024-03-30 16:46
 */
public class TestRandom {

    public static void main(String[] args) {

        RandomGeneratorFactory<RandomGenerator> l128X256MixRandom = RandomGeneratorFactory.of("L128X256MixRandom");
        // 使用时间戳作为随机数种子
        RandomGenerator randomGenerator = l128X256MixRandom.create(System.currentTimeMillis());
        // 生成随机数
        randomGenerator.nextInt(10);

    }
}
