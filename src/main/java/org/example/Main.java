package org.example;

import com.snowflake.snowpark_java.DataFrame;

import static org.example.ConfigurationSnowflake.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println(session.toString());
//        System.out.println("Hello world!");
//        System.out.println(session.getSessionStage());
        DataFrame df =session.sql("show tables");
        df.show();
        session.close();
    }
}