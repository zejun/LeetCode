package com.solution;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class BestTimeBuyStock {
	
	public static int maxProfit(int k, int[] prices) {
        if (k == 0 || prices.length <= 1){
            return 0;
        }
        
        Queue<Integer> queue = new PriorityQueue<Integer>(queueCompare);
        
        int profit = 0;
        
        for (int i = 1; i < prices.length; i++){
            if (prices[i] >= prices[i - 1]){
                profit += (prices[i] - prices[i - 1]);
            } else if (profit != 0){
                queue.offer(profit);
                profit = 0;
            }
            
            if (i == prices.length - 1 && profit > 0){
                queue.offer(profit);
            }
        }
        
        profit = 0;
        int count = 1;
        while (!queue.isEmpty() && count <= k){
        	int tem = queue.poll();
            System.out.println(tem);
        	profit += tem;
            
            count++;
        }
        
        return profit;
    }
    
    private static Comparator<Integer> queueCompare = new Comparator<Integer>(){
        public int compare(Integer a, Integer b){
            return b - a;
        }
    };

}
