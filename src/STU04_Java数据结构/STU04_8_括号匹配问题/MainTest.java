package STU04_Java数据结构.STU04_8_括号匹配问题;

import java.util.NoSuchElementException;

public class MainTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("()"));///ture
        System.out.println(solution.isValid("()[]{}"));///ture
        System.out.println(solution.isValid("(]"));///false
        System.out.println(solution.isValid("([])"));///ture
        System.out.println(solution.isValid("！([])"));
    }
    public static class Solution {
        public boolean isValid(String s) {
            LinkedStack stack = new LinkedStack();
            for (int i = 0; i < s.length(); i++) {
                char a = s.charAt(i);
                if (a == '(' || a == '{' || a == '[') {
                    stack.push(a);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (a != ')' && a != '}' && a != ']') {
                        return false;
                    }
                    char b = stack.pop();
                    if ((a == ')' && b != '(') ||
                            (a == '}' && b != '{') ||
                            (a == ']' && b != '[')) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }

    public static class LinkedStack {
        final Node head = new Node('0');

        public void push(char e) {
            Node newNode = new Node(e);
            newNode.next = head.next;
            head.next = newNode;
        }

        public char pop() {
            if(isEmpty())
                throw new NoSuchElementException("栈为空");
            char e = head.next.date;
            head.next = head.next.next;
            return e;
        }

        public boolean isEmpty() {
            return head.next == null;
        }

        public static class Node {
            char date;
            Node next;

            Node(char a) {
                this.date = a;
                this.next = null;
            }
        }
    }
}

