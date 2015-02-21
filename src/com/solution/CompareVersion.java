package com.solution;

public class CompareVersion {
	
	public static int compareVersion(String version1, String version2) {
        if (version1 == null && version2 == null){
            return 0;
        }
        
        String[] v1 = version1.split(".");
        String[] v2 = version2.split(".");
        int i = 0; 
        int j = 0;
        while (i < v1.length && j < v2.length){
            int v1Int = Integer.parseInt(v1[i]);
            int v2Int = Integer.parseInt(v2[j]);
            if (v1Int < v2Int){
                return -1;
            } else if (v1Int > v2Int){
                return 1;
            }
            i++;
            j++;
        }
        
        return 0;
    }

}
