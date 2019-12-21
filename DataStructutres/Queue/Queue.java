package com.bridgelabs.DataStructutres.Queue;

import java.util.ArrayList;

public class Queue<T>
{
   ArrayList<T> queue = new ArrayList<T>();
   
   public void enqueue(T data)
   {
	   queue.add(data);
   }
   
   public T dequeue()
   {
	   if(!queue.isEmpty())
	   {
		   T data = queue.get(0);
		   queue.remove(0);
		   return data;
	   }
	   else
	   {
		   System.out.println("queue is empty");
		   return null;
	   }
   }
   
   public boolean isEmpty()
   {
	   if(queue.isEmpty())
		   return true;
	   else
		   return false;
	   }
   
   public int size()
   {
	   return queue.size();
   }
   
   
 }
