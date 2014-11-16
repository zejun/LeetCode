package com.solution;

import java.util.ArrayList;

public class BinarySearch {
	
	/**
	 * iteration solution
	 * if find return index, other wise return -1
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int solution(int[] nums,int target){
		int start = 0;
		int end = nums.length-1;
		
		while(start+1<end){
			
			int mid = start+(end-start)/2;
			if(nums[mid]>target){
				end = mid;
			}else if(nums[mid]<target){
				start = mid;
			}else if(nums[mid]==target){
				end = mid;
			}
		
		}
		
		if(nums[start]==target){
			return start;
		}
		if(nums[end]==target){
			return end;
		}
		
		return -1;
	}
	
	/**
	 * Recursion solution
	 * With helper method pluged in. 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int solutionII(int[] nums,int target){
		
		return -1;
	}
	
	public static int[] binarySearchRange(int[] A, int target){
		int start = 0;
        int end = A.length-1;
        
        while(start+1<end){
            int mid = start + (end-start)/2;
            
            if(A[mid]==target){
                end = mid;
            }else if(A[mid]>target){
                end = mid;
            }else if(A[mid]<target){
                start = mid;
            }
        }
        
        if(A[start]==target){
            int range = start;
            while(range<A.length&&A[range+1]==target){
                range++;
            }
            
            int[] result = {start,range};
            return result;
        }
        
        if(A[end]==target){
            int range = end;
            while(range<A.length&&A[range+1]==target){
                range++;
            }
            int[] result = {end,range};
            return result;
        }
        
        int[] result = {-1,-1};
        return result;
		
	}
	
	public static ArrayList<Integer> binarySearchRangeII(ArrayList<Integer> A,int target){
		
		
		return null;
		
	}
	
	public static int InserationPosition(int[] A, int target){
		int start = 0;
		int end = A.length;
		
		if(A[0]>target){
			return 0;
		}
		
		if(A[A.length]<target){
			return A.length;
			
		}
		
		while(start+1<end){
			int mid = start+(end-start)/2;
			
			if(A[mid]==target){
				end = mid;
			}else if(A[mid]>target){
				end = mid;
			}else if(A[mid]<target){
				start = mid;
			}
			
		}
		
		if(A[start]==target){
			return start;
		}else if(A[end]==target){
			return end;
		}
		
		return start+1;
		
	}
	
	public static int binarySearchRotatedArray(int[] A,int target){
		if(A == null || A.length == 0){
			return -1;
		}
		
		int start = 0;
		int end = A.length - 1;
		
		while(start + 1 < end){
			int mid = start + (end - start) / 2;
			if(A[start]<A[mid]){
				if(A[start] <= target && target <= A[mid]){
					end = mid;
				}else{
					start = mid;
				}
			}else{
				if(A[mid] <= target && target <= A[end]){
					start = mid;
				}else{
					end = mid;
				}
			}
		}
		
		if(A[start] == target ){
			return start;
		}
		
		if(A[end] == target){
			return end;
		}
		
		return -1;
		
	}

}
