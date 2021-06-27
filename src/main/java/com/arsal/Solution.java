package com.arsal;

import java.util.*;

class Solution {

    Optional reverseOrder(String input) {
        String finalStr = "";
        char[] inputChar = input.toCharArray();
        for(int i = input.length()-1; i > -1; i--) {
            finalStr += inputChar[i];
        }
        return Optional.ofNullable(finalStr);
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[]{0,0};
        boolean foundResult = false;
        int inpArrLen = nums.length;

        for (int i = 0; i < inpArrLen; i++) {
            if(i < (inpArrLen - 1) && nums[i] + nums[i+1] == target) {
                foundResult = true;
                result = new int[]{i, i+1};
                break;
            } else {
                int[] subNums = Arrays.copyOfRange(nums, i,inpArrLen -1);
                result = twoSum(subNums, target);
                break;
            }
        }
        return result;
    }

    public int negNum(){
        int i = -4;
        System.out.println(i);
        return i;
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        List<Integer> finalList = new ArrayList();
        for (int i = 0; i < (array.length -1); i++) {
            for(int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    finalList.add(array[i]);
                    finalList.add(array[j]);
                }
            }
        }
        Integer[] integerArray = (Integer[])(finalList.toArray(new Integer[0]));
        int[] intArray = Arrays.stream(integerArray).mapToInt(Integer::intValue).toArray();
        return intArray;
    }

    public class ListNode {
        int value;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.value = val; }
        ListNode(int _x, ListNode _next) {
            value = _x;
            next = _next;
        }

        @Override
        public String toString() {
            final String DELIMITER = ", ";
            String finalStr = "";
//            print first one
            ListNode curr = this;
            finalStr += curr.value;

            while( curr.next != null) {
                curr = curr.next;
                finalStr += DELIMITER + curr.value;
            }
//              curr = curr.next
//              print curr.value;
            return finalStr;
        }
    }


    public ListNode convertArrToListNode(Integer[] _input) {
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        for (int i = 0; i < _input.length; i++) {
            current.next = new ListNode(_input[i]);
            current = current.next;
        }
        return dummyHead.next;
    }

    public Integer[] convertListNodeToArr(ListNode _input) {

        return new Integer[1];
    }

    public ListNode addTwoNumbersListNode(ListNode _l1, ListNode _l2) {
        int carry = 0;
        ListNode l1 = _l1,
                 l2 = _l2;
        ListNode dummyHead = new ListNode(),
                 current = dummyHead;

        while (l1 != null || l2 != null ) {
            int val1 = l1 != null ? l1.value : 0;
            int val2 = l2 != null ? l2.value : 0;
            int sum = val1 + val2 + carry;
            current.next = new ListNode(sum % 10);
            carry = sum / 10;
            current = current.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static Integer[] addTwoNumbersLinkedList(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        int firstInt = 0;
        List resultList = new ArrayList();
        for (int i = 0; i<l1.size(); i++) {
//            int sum;

            int sum = l1.get(i) + l2.get(i) + firstInt;
            int finalInt;
            if(sum > 9) {
                finalInt = sum % 10;
                firstInt = sum / 10;
                resultList.add(finalInt);
            } else {
                firstInt = 0;
                resultList.add(sum);
            };

        };
        Integer[] resultArr = new Integer[1];
        return (Integer[])resultList.toArray(resultArr);
    }


    public static Integer[] testToArray() {
        List l1 = new ArrayList();
        for(int i = 0; i <2; i++) {
                l1.add(i);
        }
        Integer[] intArr = (Integer[]) l1.toArray(new Integer[0]);

        return intArr;
    }

    public static void main(String[] args) {
        int[] input = new int[]{2,7,11,15};
        int[] result = twoSum(input,9);
        int[] expected = new int[]{0,1};
    }


}