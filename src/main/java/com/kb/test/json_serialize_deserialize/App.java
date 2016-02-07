package com.kb.test.json_serialize_deserialize;

//import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.gson.*;
import com.google.gson.internal.LinkedTreeMap;

/**
 * Hello world! 
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String jsonInput = "[{ \"PostalCode\": \"345\", \"Region\": \"MA\", \"Enabled\": \"True\" }, { \"PostalCode\": \"989\", \"Region\": \"CA\", \"Enabled\": \"True\" } ]";
        
        Gson gson = new GsonBuilder().create();
        Object obj = gson.fromJson(jsonInput, Object.class);
        System.out.println("obj type: " + obj.getClass().toString()); // com.google.gson.internal.LinkedTreeMap
        System.out.println("obj: " + obj);
        List<LinkedTreeMap<Object, Object>> jsonMapList = (List<LinkedTreeMap<Object, Object>>) obj;
        for (LinkedTreeMap<Object, Object> jsonMap : jsonMapList) {
            Set<Entry<Object, Object>> entrySet = jsonMap.entrySet();
            for (Entry<Object, Object> entry : entrySet) {

                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        }

    }
}
