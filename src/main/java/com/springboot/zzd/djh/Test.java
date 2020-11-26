package com.springboot.zzd.djh;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author: zhendong.Z
 * @date: 2019-11-06 10:08
 */

@Slf4j
public class Test {

    @Autowired
    private User user;

    public static void main(String[] args) {
        String s = "(({[]}))";
        String s1 = "([]{})";
        String s2 = "(){}[]";
        System.out.println(isValid(s));
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
    }



    public static  boolean isValid(String s){

        if (s == null || s.length() == 0){
            return true;
        }
//        char[] chars = s.toCharArray();
//        Stack<Character> stack = new Stack<>();
//        for (char c : s.toCharArray()){
//            if (c == '('){
//                stack.push(')');
//            }else if (c == '['){
//                stack.push(']');
//            }else if (c == '{'){
//                stack.push('}');
//            }else if (stack.isEmpty() || stack.pop() != c){
//                return false;
//            }
//        }
//        return stack.isEmpty();


        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (map.containsValue(c)){
                stack.add(c);
            }
            if (map.containsKey(c) && (stack.isEmpty() || !stack.pop().equals(map.get(c)))) {
                return false;
            }

        }
        if (!stack.isEmpty()){
            return false;
        }
        return true;

    }
}
