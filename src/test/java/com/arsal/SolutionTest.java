package com.arsal;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import com.arsal.Solution.ListNode ;

public class SolutionTest {

    Solution sol = new Solution();

    @Test
    public void testTwoSum() {
        assertArrayEquals(new int[]{0,1}, Solution.twoSum(new int[]{2,7,11,15}, 9));
//        assertArrayEquals(new int[]{}, Solution.twoSum(new int[]{0}, 0));
    }

    @Test
    public void testTwoNumberSum() {
        assertArrayEquals(new int[]{11, -1}, Solution.twoNumberSum(new int[]{3,5,-4, 8, 11, 1, -1, 6}, 10));
    }

    @org.junit.Test
    public void testNegNum(){
        assertEquals(-4, sol.negNum());
    }

    @Test
    public void addTwoNumbersLinkedList() {
        assertArrayEquals(new Integer[]{0}, Solution.addTwoNumbersLinkedList(new LinkedList<>(Arrays.asList(0)), new LinkedList<>(Arrays.asList(0))));
        assertArrayEquals(new Integer[]{7,0,8}, Solution.addTwoNumbersLinkedList(new LinkedList<>(Arrays.asList(2,4,3)), new LinkedList<>(Arrays.asList(5,6,4))));
    }

    @Test
    public void testAddTwoNumbers() {
        Solution sol = new Solution();
        Solution.ListNode input1 = sol.convertArrToListNode(new Integer[]{3,4,2});
        Solution.ListNode input2 = sol.convertArrToListNode(new Integer[]{4,6,5});
        Solution.ListNode resultNode = sol.addTwoNumbersListNode(input1, input2);
        System.out.println(resultNode.toString());
        assertEquals(resultNode.toString(), "7, 0, 8");
        resultNode = sol.addTwoNumbersListNode(sol.convertArrToListNode(new Integer[]{9,9,9,9,9,9,9}),
                sol.convertArrToListNode(new Integer[]{9,9,9,9}));
        assertEquals(resultNode.toString(), "8, 9, 9, 9, 0, 0, 0, 1");
    }

    @Test
    public void testReverseOrder() {
        assertEquals("rts", sol.reverseOrder("str").get());
    }


    @Test
    public void testTestToArray() {
        assertArrayEquals(new Integer[]{0,1}, Solution.testToArray());
    }
}
