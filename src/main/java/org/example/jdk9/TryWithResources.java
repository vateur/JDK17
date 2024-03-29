package org.example.jdk9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * @author vateur
 * @version 1.0.0
 * @description TODO
 * @createTime 2024-03-30 16:21
 */
public class TryWithResources {

    public static void main(String[] args) {

    }

    public String readDataOld(String message) throws IOException {
        try (Reader reader = new StringReader(message);
             BufferedReader br = new BufferedReader(reader)) {
            return br.readLine();
        }
    }


    public String readData(String message) throws IOException {
        Reader reader = new StringReader(message);
        BufferedReader br = new BufferedReader(reader);
        // 不需要重新声明变量
        try (br) {
            return br.readLine();
        }
    }

}
