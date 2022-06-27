package com.DSALinkedList.LLimplementation;

import java.util.Iterator;

public class SinglyLinkedList<T> implements Iterable<T>
{
    private int size = 0;
    private Node<T> head = null;
    private  Node<T> tail = null;

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    //Separate Node class representing a complete Single Node
    public class Node<T>
    {
        T _data;
        Node<T> _next = null;
        public Node(T data, Node<T> next)
        {
            this._data = data;
            this._next = next;
        }
        public String toString()
        {
            return this._data.toString();
        }
    }

    //Clears the entire LinkedList
    public void clear()
    {
        Node<T> trav = head;
        while (trav!=null)
        {
            Node<T> next = trav._next;
            trav._next = null;
            trav = next;
        }
        head = tail = trav = null;
        size = 0;
    }

    //Returns the size of LinkedList
    public  int Size()
    {
        return size;
    }

    //Checks if LinkedList is empty
    public boolean isEmpty()
    {
        return Size() == 0;
    }

    //adds element in the head position
    public void addFirst(T elem)
    {
        if(isEmpty())
        {
            head = tail = new Node<T>(elem,null);
        }
        else {
            Node<T> temp = head;
            head = new Node<T>(elem,temp);
        }
        size++;
    }

    //adds element in the tail position
    public void addLast(T elem)
    {
        if(isEmpty())
        {
            head = tail = new Node<T>(elem,null);
        }
        else {
            tail._next = new Node<T>(elem,null);
        }
        size++;
    }
    //generic add, typically adds the new element to the tail
    public void add(T elem)
    {
        addLast(elem);
    }

    //Presents the data of the head node
    public T peekFirst()
    {
        if(isEmpty()) throw  new RuntimeException("Empty List..!");

        return head._data;
    }

    //Presents the data of the tail node
    public T peekLast()
    {
        if(isEmpty()) {
            throw new RuntimeException("Empty List..!");
        }
        return tail._data;
    }

    //Removes the head out of list and make next node as head node
    public T removeFirst()
    {
        if(isEmpty())
        {
            tail = null;
            throw new RuntimeException("Empty List");
        }

        T data = head._data;
        head = head._next;
        --size;

        return data;
    }

    //removes tail out of list and makes the previous node of tail node as current tail node
    public T removeLast()
    {
        if(isEmpty())
        {
            head = null;
            throw new RuntimeException("Empty List");
        }

        T data = tail._data;
        tail = null;
        --size;

        return data;
    }

}

