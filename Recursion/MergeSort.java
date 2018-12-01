package chapter6MergeSort;

import java.util.ArrayList;

public class MergeSort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		
		myArrayList.add(15);
		myArrayList.add(18);
		myArrayList.add(2);
		myArrayList.add(0);
		
		System.out.println(myArrayList);

		mergeSort(myArrayList);
		
		System.out.println(myArrayList);

	}
	
	public static ArrayList<Integer> mergeSort(ArrayList<Integer> m)
	{
		if (m.size() <= 1)
		{
			return m;
		}
		
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		
		for(int i=0; i < m.size(); i++)
		{
			if(i < (m.size()/2))
			{
				left.add(m.get(i));
			}
			else
			{
				right.add(m.get(i));
			}
		}
		
		left = mergeSort(left);
		right = mergeSort(right);
		
		return merge(left, right);
	}
	
	public static ArrayList<Integer> merge(ArrayList<Integer> l, ArrayList<Integer> r)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		int i = 0;
		
		while(!(l.isEmpty()) && !(r.isEmpty()))
		{
			if(l.get(i) <= r.get(i))
			{
				result.add(l.get(i));
				l.remove(i);
				i++;
			}
			else
			{
				result.add(r.get(i));
				r.remove(i);
				i++;	
			}
		}
		
		while(!(l.isEmpty()))
		{
			result.add(l.get(i));
			l.remove(i);
			i++;
		}
		while(!(r.isEmpty()))
		{
			result.add(r.get(i));
			r.remove(i);
			i++;
		}
		return result;
	}

}
