package com.leetcode;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class _1_TwoSum {

	public int[] twoSum(int[] nums, int target) {
        int length=nums.length;
        int []result={0,1};

        for(int i=0;i<length;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    result[0]=i;result[1]=j;
                    System.out.println("Success");
                    return result;   
                }
            }
        }
        return result;  
    }
	
	/*public int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}*/
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start_time = System.nanoTime();
		_1_TwoSum obj=new _1_TwoSum();
		int[] nums={3,2,4};
		int[] result=obj.twoSum(nums, 6);
		System.out.println(result[0]+", "+result[1]);
		
		System.out.println("TimeElapsed= "+(System.nanoTime()-start_time)/1e6+" s");
		
	}

}
