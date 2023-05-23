package org.example;

import java.util.HashMap;
import java.util.Map;
import com.snowflake.snowpark_java.Session;
public class ConfigurationSnowflake {
    static Session session=null;
    static{
        Map<String, String> properties = new HashMap<>();
        properties.put("URL","https://epxbxff-xl81092.snowflakecomputing.com:443");
        properties.put("USER", "AnushkaDBT");
        properties.put("PASSWORD", "Anushkadbt@123");
        properties.put("ROLE", "ACCOUNTADMIN");
        properties.put("WAREHOUSE", "COMPUTE_WH");
        properties.put("DB", "RAW");
        properties.put("SCHEMA", "PUBLIC");
        session = Session.builder().configs(properties).create();
    }
}
