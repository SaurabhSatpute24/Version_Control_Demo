package org.example;

import java.io.Console;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.snowflake.snowpark_java.Session;
public class ConfigurationSnowflake {
    static Session session=null;
    static{
        Scanner sc=new Scanner(System.in);
        Map<String, String> properties = new HashMap<>();
        properties.put("URL","https://epxbxff-xl81092.snowflakecomputing.com:443");
        properties.put("USER", "AnushkaDBT");
//        System.out.print("Enter Password:- ");
        String password= null;
        Console console = System.console();
        if(console != null){
            password = Arrays.toString(console.readPassword("Enter Password: "));
        }
        if(password.isEmpty())
        {
            System.out.println("password is empty");
        }else{
        properties.put("PASSWORD", password);
        properties.put("ROLE", "ACCOUNTADMIN");
        properties.put("WAREHOUSE", "COMPUTE_WH");
        properties.put("DB", "RAW");
        properties.put("SCHEMA", "PUBLIC");
        session = Session.builder().configs(properties).create();
        }
    }
}
