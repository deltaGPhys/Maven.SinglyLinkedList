package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {

    private SinglyLinkedList<Integer> SLL;

    @org.junit.Before
    public void setUp() throws Exception {
        SLL = new SinglyLinkedList<Integer>();
    }

    @org.junit.Test
    public void add() {
        Assert.assertEquals(0,SLL.size());
        SLL.add(3);
        Assert.assertEquals(1,SLL.size());
        SLL.add(7);
        Assert.assertEquals(2,SLL.size());
    }

    @org.junit.Test
    public void contains() {
        Assert.assertFalse(SLL.contains(3));
        SLL.add(3);
        Assert.assertTrue(SLL.contains(3));
        Assert.assertFalse(SLL.contains(7));
        SLL.add(7);
        Assert.assertTrue(SLL.contains(3));
        Assert.assertTrue(SLL.contains(7));
    }

    @Test
    public void find() {
        SLL.add(9);
        SLL.add(7);
        SLL.add(3);
        Assert.assertEquals(-1, SLL.find(5));
        Assert.assertEquals(2, SLL.find(3));
        Assert.assertEquals(0, SLL.find(9));
    }

    @Test
    public void get() {
        SLL.add(9);
        SLL.add(7);
        SLL.add(3);
        Assert.assertEquals(null, SLL.get(5));
        Assert.assertEquals((Integer) 9, SLL.get(0));
        Assert.assertEquals((Integer) 3, SLL.get(2));

    }

    @org.junit.Test
    public void remove() {
        SLL.add(9);
        SLL.add(7);
        SLL.add(3);
        SLL.add(4);
        Assert.assertTrue(SLL.contains(3));
        Assert.assertTrue(SLL.contains(7));
        SLL.remove(2);
        Assert.assertFalse(SLL.contains(3));
        Assert.assertTrue(SLL.contains(7));
        SLL.remove(0);
        Assert.assertFalse(SLL.contains(3));
        Assert.assertFalse(SLL.contains(9));
        Assert.assertTrue(SLL.contains(7));
    }

    @org.junit.Test
    public void copy() {
        Integer integerObj = 3;
        SLL.add(9);
        SLL.add(7);
        SLL.add(integerObj);
        SLL.add(4);
        SinglyLinkedList<Integer> copy = SLL.copy();
        Assert.assertEquals(9,copy.get(0),.01);
        Assert.assertEquals(2,copy.find(3),.01);
        Assert.assertNotEquals(integerObj,copy.get(3),.01);
        Assert.assertEquals(3,copy.find(4),.01);
    }

    @org.junit.Test
    public void sort() {
        SLL.add(9);
        SLL.add(7);
        SLL.add(3);
        SLL.add(4);
        SLL.sort();
        Assert.assertEquals(3,SLL.get(0),.01);
        Assert.assertEquals(4,SLL.get(1),.01);
        Assert.assertEquals(7,SLL.get(2),.01);
        Assert.assertEquals(9,SLL.get(3),.01);
    }

    @org.junit.Test
    public void reverse() {
        SLL.add(9);
        SLL.add(7);
        SLL.add(3);
        SLL.add(4);
        SLL.reverse();
        Assert.assertEquals(9,SLL.get(0),.01);
        Assert.assertEquals(7,SLL.get(1),.01);
        Assert.assertEquals(4,SLL.get(2),.01);
        Assert.assertEquals(3,SLL.get(3),.01);
    }

}