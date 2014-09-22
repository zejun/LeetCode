package com.solution;

import java.util.ArrayList;
import java.util.Hashtable;

import com.structure.Point;

public class MaxPointOnALine {

	public static int maxPoint(ArrayList<Point> points){
		
		
		int maxPoint = 2;
		int lineNum = 0;
		Hashtable<String, Integer> table = new Hashtable();
		
		if(points.size()==0||points.size()==1){
			return 0;
		}else if(points.size()==2){
			return maxPoint;
		}else{
			//there should be more than 2 points in the same line
			//first loop for the points
			for(int i=0;i<points.size();i++){
				Point p1 = points.get(i);
				
				for(int j=i+1;j<points.size();j++){
					Point p2 = points.get(j);
					//for each line we have k 
					float k = ((float)p1.gety()-(float)p2.gety())/((float)p1.getx()-(float)p2.getx());
					float a = (float)p1.gety()-(float)k*p1.gety();
					
					
					
					if(table.get(k+" "+a)!=null){
						//System.out.println("Line already exist");
						
					}else{
						table.put(k+" "+a, 2);
						lineNum++;
						Integer num = 2;
						
						System.out.println("Initial line "+p1.getx()+" "+p1.gety()+"  "+p2.getx()+" "+p2.gety());
//						
						for(int x=j+1;x<points.size();x++){
							Point px = points.get(x);
							
							if((a+k*px.getx())==px.gety()){
								num++;
								System.out.println("Find same line "+px.getx()+" "+px.gety());
								
								if(num>maxPoint){
									maxPoint = num;
								}
							}
							
						}
						
						System.out.println("Line don't exist, add line "+lineNum);
					}
					
				}
				
			}
			
			return maxPoint;
		}
		
		
	}
	
	public static int maxPoint(Point[] points){
		
		int maxPoint = 2;
		int lineNum = 0;
		Hashtable<String, Integer> table = new Hashtable();
		Hashtable<String, Integer> pointDul = new Hashtable();
		Hashtable<String, Integer> pointDulCheck = new Hashtable();
		
		if(points.length==0){
			return 0;
		}else if(points.length==1){
		    return 1;
		}
		else if(points.length==2){
			return 2;
		}else{
		    
		    
		    for(int i=0;i<points.length;i++){
		        if(pointDulCheck.get(points[i].x+" "+points[i].y)==null){
		            pointDulCheck.put(points[i].x+" "+points[i].y,1);
		        }else{
		            pointDulCheck.put(points[i].x+" "+points[i].y,pointDulCheck.get(points[i].x+" "+points[i].y)+1);
		        }
		    }
		    
		    
		    
		    if(pointDulCheck.size()==1)
		        return points.length;
		    
			//there should be more than 2 points in the same line
			//first loop for the points
			for(int i=0;i<points.length;i++){
				
				System.out.println("I loop "+points[i].x+" "+points[i].y+" "+pointDul.get(points[i].x+" "+points[i].y));
			    
			    if(pointDul.get(points[i].x+" "+points[i].y)==null){
			        Point p1 = points[i];
			        
			        pointDul.put(p1.x+" "+p1.y,0);
			        
			        System.out.println("loop1");
			        for(int j=i+1;j<points.length;j++){
			            
			        	System.out.println("loop2");
			            if(pointDul.get(points[j].x+" "+points[j].y)==null){
			                Point p2 = points[j];
			                
			                pointDul.put(p2.x+" "+p2.y,0);
			                	
			                	//y=kx+b
            					//ax+by+c=0
            				
            					
            					float a=0;
            					float b=0;
            					float c=0;
            					
            					float k=0;
            					float d=0;
            					
            					if(p1.y==p2.y){
            					    a=0;
            					    b=1;
            					    c=0-p2.y;
            					    //System.out.println("case 1");
            					}else if(p1.x==p2.x){
            					   // k=1;
            					   // a=0-p1.x;
            					   a=1;
            					   b=0;
            					   c=0-p2.x;
            					   //System.out.println("case 2");
            					}else{
            					    k = ((float)p1.y-(float)p2.y)/((float)p1.x-(float)p2.x);
            					    d = (float)p1.y-(float)k*p1.x;
            					    //System.out.println("case 3");
            					}
            					
            					
            					if(!(a==0&&b==0&&c==0)){
            						//System.out.println("case A");
            					    if(table.get(a+" "+b+" "+c)!=null){
            					        
            					    }else{
            					        	table.put(a+" "+b+" "+c, 2);
                    						lineNum++;
                    						Integer num = 0;
                    						
                    //						
                    						for(int x=j+1;x<points.length;x++){
                    							Point px = points[x];
                    							
                    							if(a*px.x+b*px.y+c==0){
                    								num++;
                    								
                    							}else{
                    							    
                    							}
                    							
                    							
            						         }
            						         
        						         if((num+pointDulCheck.get(p1.x+" "+p1.y)+pointDulCheck.get(p2.x+" "+p2.y))>maxPoint)
        						            maxPoint = (num+pointDulCheck.get(p1.x+" "+p1.y)+pointDulCheck.get(p2.x+" "+p2.y));
            						         
            					    }
            					}else{
            						
            						//System.out.println("case B");
            					    if(table.get(k+" "+d)!=null){
            					    	
            					    }else{
            					        
                						table.put(k+" "+d, 2);
                						lineNum++;
                						Integer num = 0;
                						
                						for(int x=j+1;x<points.length;x++){
                							Point px = points[x];
                							System.out.println("loop "+px.x+" "+px.y);
                							if((k*px.x+b==px.y)){
                								num++;
                								
                							}else{
                    							System.out.println("num not add "+px.x+" "+px.y); 
                    						}
                						
                						
            						      
                							
                						}
                						System.out.println("num is "+num);
                						System.out.println("Point 1 "+pointDulCheck.get(p1.x+" "+p1.y)+" Point 2 "+pointDulCheck.get(p2.x+" "+p2.y));
                						
                						if((num+pointDulCheck.get(p1.x+" "+p1.y)+pointDulCheck.get(p2.x+" "+p2.y))>maxPoint)
        						            maxPoint = (num+pointDulCheck.get(p1.x+" "+p1.y)+pointDulCheck.get(p2.x+" "+p2.y));
            					    }
            					}
                					
                				
			                
			            }
			            
    					
    				}
			        
			        
			    }
			    
				
				
				
				
				
			}
			
			return maxPoint;
		}
		
	}
}
