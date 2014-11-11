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
				
				System.out.println("tem "+tem);
				
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
	
	

}
