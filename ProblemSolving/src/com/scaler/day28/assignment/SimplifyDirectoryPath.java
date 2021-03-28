package com.scaler.day28.assignment;

import java.util.Stack;

public class SimplifyDirectoryPath {
	public String simplifyPath(String A) {
		Stack<String> stack = new Stack<>();
        StringBuilder bufferString = new StringBuilder();
        int index = 0;

        while (index < A.length()) {
            if (A.charAt(index) == '/') {
                index++;
                
                while (index < A.length() && A.charAt(index) != '/') {
                    bufferString.append(A.charAt(index++));
                }
                String finalString = bufferString.toString();
                bufferString.setLength(0);
                
                if (finalString.length() > 0) {
                    if (finalString.equals("..") && !stack.isEmpty()) {
                        stack.pop();
                    } else if (!(finalString.equals("..") || finalString.equals("."))) {
                        stack.push(finalString);
                    }
                }
            }
        }
        
        while (!stack.isEmpty()) {
            bufferString.insert(0, stack.pop());
            bufferString.insert(0, "/");
        }
        if (bufferString.length() >0)
        	return bufferString.toString();
        return "/";
        
//        return bufferString.length() > 0 ? bufferString.toString() : "/";
		
	}
	public static void main(String[] args) {
		SimplifyDirectoryPath obj = new SimplifyDirectoryPath();
		System.out.println(obj.simplifyPath("/home/"));
	}
}
