package com.solution;

public class MergeSort {
	
	public static int[] mergeSort(int[] data){
		return mergeSort(data,0,data.length-1);
	}
	
	public static int[] mergeSort(int[] data, int left, int right){
		
		String A = "abc";
		
		if (left >= right){
			return data;
		}
		int mid = (left+right) / 2;
		mergeSort(data,left,mid);
		mergeSort(data,mid+1, right);
		merge(data,left,mid,right);
		return data;
	}
	
	private static void merge(int[] data, int left, int center, int right){
		int[] temArr = new int[data.length];
		int mid = center + 1;
		int i = left;
		int tem = left;
		while(left <= center && mid <= right){
			if(data[left]<=data[mid]){
				temArr[i++] = data[left++];
			} else {
				temArr[i++] = data[mid++];
			}
		}
		while(mid <= right){
			temArr[i++] = data[mid++];
		}
		while(left <= center){
			temArr[i++] = data[left++];
		}
		while(tem <= right){
			data[tem] = temArr[tem++];
		}
	}

}
