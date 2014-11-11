package com.solution;

public class GasStation {
	
	public static int solutionI(int[] gas,int[] cost){
		//gas i station's gas
		//cost i to i+1 cost
		//time cost n^2
		for(int i=0;i<gas.length;i++){
			
			int tank = 0;
			int current = 0;
			
			for(int j=0;j<gas.length;j++){
				//start with i+j
				int tem = -1;
				int index = 0;
				if(current+j>=gas.length){
					index = current+j-gas.length;
				}else{
					index = current+j;
				}
				
				tank+=gas[index];
				tem = tank-cost[index];
				
				if(tem<0){
					tank-=cost[index];
					break;
				}else{
					tank-=cost[index];
				}
			}
			
			if(tank>=0)
				return i;
			else{
				current++;
				tank = 0;
			}
			
		}
		
		return -1;
	}
	
	//O(n) solution
	public static int solutionII(int[] gas, int[] cost){
		
		int tank = 0;
		int previous = 0;
		int index = 0;
		
		for(int i=0;i<gas.length;i++){
			System.out.println("Previous "+i+" "+previous);
			tank=tank+gas[i]-cost[i];
			previous += gas[i]-cost[i];
			if(tank<0){
				previous+=tank;
				tank = 0;
				index=i+1;
			}
		}
		
		
		
		if(tank+previous>=0){
			return index;
		}else{
			return -1;
		}
		
	}

}
