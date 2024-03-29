package org.example.jdk9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author vateur
 * @version 1.0.0
 * @description 集合API优化
 * @createTime 2024-03-30 16:17
 */
public class TestCollection {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(){{
            add("a");
        }};

        Map<String,String> map = new HashMap<>(){{
            put("a","1");
        }};





        // 通过java.util.Set 创建 不可变 的集合实例
        Set<String> set = Set.of("A", "B", "C");
        set.add("");

        // 通过java.util.List 创建 不可变 的集合实例
        List<String> newList = List.of("A", "B", "C");

        // 通过k1,v1,k2,v2,...,形式创建
        Map<String, String> newMap = Map.of("A", "V1", "B", "v2", "C", "v3");

        // 通过 Map.entry 形式创建
        Map<Integer, String> map1 = Map.ofEntries(
                Map.entry(1, "v1"),
                Map.entry(2, "v2"),
                Map.entry(3, "v3"));
    }
}
