package com.god.unittest.handler.report;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExecutionReport {
    public String say(String path) throws FileNotFoundException {
        try{
            FileInputStream fin = new FileInputStream(path);
            fin.close();
        } catch (Exception e) {
            throw new FileNotFoundException("文件不存在哦");
        }
        return "hello";
    }
}
