package arraylistassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAssignment {

	ArrayList<Integer> numberList = new ArrayList<Integer>();
	
	//Task 1
	public ArrayListAssignment() {
		numberList.add(1);
		numberList.add(8);
		numberList.add(37);
		numberList.add(40);
		numberList.add(9);
		numberList.add(81);
		numberList.add(11);
		numberList.add(15);
		numberList.add(31);
		numberList.add(11);
	}
	
	//Task 2
	public void displayArrayList(ArrayList<Integer> list) {
		for(Integer num : list) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	//Task 3
	public void addElement(int element) {
		numberList.add(element);
	}
	
	//Task 4
	public void removeElement(int index) {
		numberList.remove(Integer.valueOf(index));
	}
	
	//Task 5
	public void reverseArrayList() {
			Collections.reverse(numberList);
	}
	
	//Task 6
	public int findSum(ArrayList<Integer> list) {
		int sum = 0;
		for(Integer num : list) {
			sum = sum + num;
		}	
		return sum;
	}
	
	//Task 7
	public int findMaximum(ArrayList<Integer> mylist) {
		if(mylist.isEmpty()) {
			return 0;
		}
		
		int max = mylist.get(0);
		for (Integer num : mylist) {
			if(num > max) {
				max = num;
			}
		}
		return max;
	}

	//Task 7
	public int findMinimum(ArrayList<Integer> mylist) {
		if(mylist.isEmpty()) {
			return 0;
		}
		
		int min = mylist.get(0);
		for (Integer num : mylist) {
			if(num < min) {
				min = num;
			}
		}
		return min;
	}
	
	//Task 8
	public void sortArrayList(ArrayList<Integer> mylist) {
		Collections.sort(mylist);
	}
	
	//Task 10
	public int findElement(ArrayList<Integer> mylist) {
		int pos = mylist.indexOf(31);
		if(mylist.get(pos) == null) {
			return -1;
		} else {
			return pos;
		}
	}
	
	//Task 11
	public void removeDuplicates(ArrayList<Integer> list) {
		for (int i = 0 ; i < list.size(); i++) { 
			for (int j = 1+i;  j < list.size() ; j++) {  
		        if (list.get(j).equals( list.get(i))) {
		            list.remove(list.get(j));
		        }
	        }                                
		} 	
	}
	
	//Task 12
	public List<Integer> getSublist(int ini,int end) {
		//list.removeRange(2,7); // my remove range is not working. usar sublist
		return numberList.subList(ini,end);
	}
	
	//Task 13
	public boolean isEmptyArrayList(ArrayList<Integer> list) {
		return list.isEmpty();
	}
	
	//Task 14
	public void replaceElements(int oldnumber, int newnumber) {
		//list.set(8,200); // nao pode ser este porque ele precisa do indice
		Collections.replaceAll(numberList,oldnumber,newnumber);
	}
	
	//Task 15
	public int countOccurences(ArrayList<Integer> list) {
		int occ = 0;
		for (Integer i : list) {
            if(list.get(i) == 11) {
            	occ++;
            }   
		}
		return occ;
		
		//Collections.frequency(numberList,elem);
	}
	
	//Task 16
	public void clearArrayList(ArrayList<Integer> list) {
		list.removeAll(list);
	}
	
	//Task 17
	public static int getArrayListSize(ArrayList<Integer> list) {
		return list.size();
	}
	
	//Task 18
	public ArrayList<Integer> copyArrayList() {
		ArrayList<Integer> list = new ArrayList<Integer>(numberList);
		return list;
	}
	
	//Task 19
	public double findAverage(ArrayList<Integer> list) {
		double avg = 0;
		for(Integer num : list) {
			avg = avg + num;
		}
		return (avg / list.size());		
	}
	
	
	//Task 9
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListAssignment example = new ArrayListAssignment();
		
		example.addElement(45);		
		example.displayArrayList(example.numberList);
		
		example.removeElement(8);
		example.displayArrayList(example.numberList);

		example.reverseArrayList();
		example.displayArrayList(example.numberList);

		int sum = example.findSum(example.numberList);
		System.out.println(sum);
		
		System.out.println(example.findMaximum(example.numberList));
		
		System.out.println(example.findMinimum(example.numberList));
		
		example.sortArrayList(example.numberList);
		example.displayArrayList(example.numberList);
		
		int pos = example.findElement(example.numberList);
		System.out.println(pos);
		
		example.removeDuplicates(example.numberList);
		example.displayArrayList(example.numberList);

		System.out.println(example.getSublist(2,6));
		
		boolean result = example.isEmptyArrayList(example.numberList);
		System.out.println(result);
		
		example.replaceElements(9,200);
		example.displayArrayList(example.numberList);
		
		//example.clearArrayList(example.numberList);
		//example.displayArrayList(example.numberList);
		
		System.out.println(getArrayListSize(example.numberList));
		
		double avg = example.findAverage(example.numberList);
		System.out.println(avg);
		
	}

}
