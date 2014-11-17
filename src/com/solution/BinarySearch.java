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
	
	/**
	 * find a node in 2D matrix
	 * @param A
	 * @param target
	 * @return
	 */
	public static boolean search2DMatrix(ArrayList<ArrayList<Integer>> matrix, int target){
		// write your code
        
        if (matrix.size() == 0 || matrix == null){
            return false;
        }
        
        int xStart = 0;
        int xEnd = matrix.size() - 1;
        
        while (xStart + 1 < xEnd){
            int xMid = xStart + (xEnd - xStart) / 2;
            if (matrix.get(xMid).get(0) == target){
                return true;
            } else if (matrix.get(xMid).get(0) < target){
                xStart = xMid;
            } else {
                xEnd = xMid;
            }
        }
        
        if (matrix.get(xStart).get(0) == target){
            return true;
        }
        
        if (matrix.get(xEnd).get(0) == target){
            return true;
        }
        
        int x = 0;
        
        if (matrix.get(xEnd).get(0) < target){
            x = xEnd;
        } else if (matrix.get(xEnd).get(0) > target){
            x = xStart;
        }
        
         
        
        //second binary search
        int yStart = 0;
        int yEnd = matrix.get(x).size() - 1;
        
        while (yStart + 1 < yEnd){
            int yMid = yStart + (yEnd - yStart) / 2;
            if (matrix.get(x).get(yMid) == target){
                return true;
            } else if (matrix.get(x).get(yMid) < target){
                yStart = yMid;
            } else {
                yEnd = yMid;
            }
        }
        
        if (matrix.get(x).get(yStart) == target){
            return true;
        }
        
        if (matrix.get(x).get(yEnd) == target){
            return true;
        }
        
        return false;
		
	}
	
	/**
	 * Solution for search a 2-D matrix 
	 */
	public static boolean search2DMatrixII(ArrayList<ArrayList<Integer>> matrix, int target){
		int row = matrix.size();
		int col = matrix.get(0).size();
		
		int start = 0;
		int end = row * col - 1;
		
		while (start + 1 < end){
			int mid = start + (end - start) / 2;
			int val = matrix.get(mid / col).get(mid % col);
			if (val == target){
				return true;
			} else if (val > target){
				end = mid;
			} else if (val < target){
				start = mid;
			}
		}
		
		if (matrix.get(start / col).get(start % col) == target){
			return true;
		}
		
		if(matrix.get(end / col).get(end % col) == target){
			return true;
		}
		
		return false;
	}

}
