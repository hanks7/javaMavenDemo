package com.hanks.apple;

import com.google.gson.Gson;

/**
 * @ClassName: main.com.hanks.apple.Person
 * @CreateDate: 2022/5/24 18:18
 * @Author: 侯建军
 * @Description: TODO
 */
public class Person {
    public int age;

    public static void main(String[] args) {
        Gson gson = new Gson();
        String jsonString = "{\"name\":\"怪盗kidou\",\"age\":24}";
        Person person = gson.fromJson(jsonString, Person.class);
        System.out.print(person.age + "");
    }
}
