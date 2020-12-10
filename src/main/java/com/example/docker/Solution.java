package com.example.docker;

// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.Collectors;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    String reverseWords(String S) {

        if(S.equals(""))
            return "";

        final Stack<String> stack = new Stack<>();
        String[] words = S.split("\\.");
        for(String word : words){
            stack.push(word);
        }

        final List<String> reverseList = new ArrayList<>();
        while(!stack.isEmpty()){
            reverseList.add(stack.pop());
        }

        return reverseList.stream().collect(Collectors.joining("."));
    }
}