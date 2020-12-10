package practice;

import java.util.Stack;

public class NextLargerElement {

    public static void main(String[] args) {
        nextLargerElementUsingStack(new int[]{8, 6, 0, 1, 12}, 5);
//        final int[] resArr = nextLargerElement(new int[]{6, 8, 0, 1, 3}, 5);
//        for (int i = 0; i < resArr.length; i++) {
//            System.out.print(resArr[i] + " ");
//        }
    }

    private static void nextLargerElementUsingStack(int[] arr, int n) {
//        final Stack<Integer> stack = new Stack<>();
//        int[] resArr = new int[n];
//
//        stack.push(arr[0]);
//
//        for (int i = 1; i < arr.length; i++) {
//
//            if (arr[i] < stack.peek()) {
//                stack.push(arr[i]);
//            } else {
//                final Integer element = stack.pop();
//                while(element < )
//            }
//        }
//        System.out.println(resArr);
    }

    public static int[] nextLargerElement(int[] arr, int n) {
        int[] resArr = new int[n];
        int next;
        for (int i = 0; i < arr.length; i++) {
            next = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            resArr[i] = next;
        }
        return resArr;
    }
}
