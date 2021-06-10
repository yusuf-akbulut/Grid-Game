//Yusuf Akbulut-150118023

//Purpose of this program,creating grid game at basic level. 

import java.util.Scanner;

public class Pro5_1_150118023 {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		
	    System.out.println("WELCOME TO GRID GAME");
	
	   //gs variable holds grid size input.
	    System.out.print("Please enter the grid size: ");
	        int gs=input.nextInt();
	
	  //This while loop takes a new grid size input if user entered a negative value.
	     while(true) {  
	        if ( gs<=0 )    {
	        System.out.print("Wrong input! Grid size should be positive.Enter again: ");
	                     gs=input.nextInt();           }
	       else if ( gs>0 )
	                break;
	     }  
	        
	     //Grid game array with gg array reference variable.
	     String [][] gg = new String [gs][gs];
		
	     //In the following nested for loops,elements of array are assigned as space.
	     	for(int i = 0 ; i<gs; i++ ) {
	     		 
	     		for(int j = 0 ; j<gs ; j++)
	     	
	     			   gg[i][j]=" " ;     }
	     	
	    /* a and b variable are created with random numbers between 0 and gs(included) and this loop works gs/2 times.
	    Then using these random integers,character "*" is assigned to array's random indexs."*" characters will be
	    items.*/
	        for(int i = 0 ; i<gs/2 ;i++) {
	       
	      int a = (int) (Math.random() * gs) ;
	      int b = (int) (Math.random() * gs) ;
	              
	            gg[a][b]="*" ;
	       }
	  
	     //Array's first element is character "X".It will be movement character. 
	            gg[0][0]="X" ;
	 
	           System.out.println("--Hello " + gs + "x" + gs + "Grid Game--");
	    
	  //In the following a few code,first screen of grid game is printed.          
	     for(int i=0 ; i<gs ; i++) {
	    	 
	    	 System.out.print("|"); 
	    	    
	    	 for(int j = 0 ; j<gs ; j++)

                   System.out.print( gg[i][j] );
	   
	    	       System.out.println("|");
	      }	    	
	    
	     System.out.println("Moves:" + gs*5/2 + "            Current Cell: (0,0)" );
	    
	               System.out.print("Choose your direction (R,L,U,D):");

	               
 // a and b integers will be used the in following codes for indexs of array and move variable for movement number on leave.
	     int a = 0  ,  b = 0  , move=gs*5/2;
	 
	 //choice variable for direction choice.
	     while(true) {
	    	 
	    	 String choice=input.next();
	          choice=choice.toUpperCase();     
	 
 
	// The following while loop is used for wrong direction input.       
	  while(true) {        
	      if(! ( choice.equals("R") || choice.equals("L")  || choice.equals("U") ||  choice.equals("D") )  )    {
	           
	    	   System.out.print("Wrong input! Enter again:");
	                  choice=input.next();
                      choice=choice.toUpperCase();           }
	      else
	    	  break;
	  }
	  
	  
	 //If statement for choice of right direction.
	   if ( choice.equals("R") ) {
    	
	      //Control statement.  
	       if( b == gs-1 ) {
	        	   System.out.print("Wrong input! You cannot outside of walls.Enter a new input");
	   	    	continue;     }
	     //Control statemnt. 	   
	  	  if ( gg[a][b+1].equals("+") ) {
	   	    System.out.print("Wrong input! You cannot go place that you passed before.Enter a new input");
	   	    	continue;     }
	  
	  	// "+" is assigned to index of "X"  
	             	 gg[a][b]="+" ;   	   
	                  
	             	   b++;
	     //"X" is assigned again according to direction choice.            
	                gg[a][b]="X" ;
	
	     //And game screen is printed again .           
	       for(int i=0 ; i<gs ; i++) {
	   	   	 
	   	    	 System.out.print("|"); 
	   	    	    
	        for(int j = 0 ; j<gs ; j++)
	   	    		 
	            System.out.print( gg[i][j] );
	   	   
	   	        System.out.println("|");}
	   	  
	    // movement integer is decreased.   
	   	        move--;
	   	      
	      System.out.println("Moves:" + move + "            Current Cell:(" + a + "," + b + ")");
	      System.out.print("Choose your direction (R,L,U,D):");
                               
	       	    	
	    }  
	    
	 //If statement for choice of left direction. 	
		if ( choice.equals("L") ) {
	    	
			   if( b == 0 ) {
	        	   System.out.print("Wrong input! You cannot outside of walls.Enter a new input");
	   	    	continue;     }
			
			if ( gg[a][b-1].equals("+") ) {
			   	    System.out.print("Wrong input! You cannot go place that you passed before.Enter a new input");
			   	    	continue;     }
			
		   	 gg[a][b]="+";
		  	        
		         b--;
		         
		     gg[a][b]="X";
		   	    
		       for(int i=0 ; i<gs ; i++) {
		   	   	 
		   	    	 System.out.print("|"); 
		   	    	    
		        for(int j = 0 ; j<gs ; j++)
		   	    		 
		            System.out.print( gg[i][j] );
		   	   
		   	        System.out.println("|");}
		   	   
		      	     move--;
		    	      
	     System.out.println("Moves:" + move + "            Current Cell:(" + a + "," + b + ")");
	     System.out.print("Choose your direction (R,L,U,D):");
		                             
		    }  
	   	
		 //If statement for choice of up direction. 
		if ( choice.equals("U") ) {
			
			  if( a==0 ) {
	        	   System.out.print("Wrong input! You cannot outside of walls.Enter a new input");
	   	    	continue;     }
			
			if ( gg[a-1][b].equals("+") ) {
			   	    System.out.print("Wrong input! You cannot go place that you passed before.Enter a new input");
			   	    	continue;     }
	    	
		   	 gg[a][b]="+";
		       
		         a--;
		         
		     gg[a][b]="X";
		   	    
		       for(int i=0 ; i<gs ; i++) {
		   	   	 
		   	    	 System.out.print("|"); 
		   	    	    
		        for(int j = 0 ; j<gs ; j++)
		   	    		 
		            System.out.print( gg[i][j] );
		   	   
		   	        System.out.println("|");    }

		     	      move--;
		   	      
	     System.out.println("Moves:" + move + "            Current Cell:(" + a + "," + b + ")");
	     System.out.print("Choose your direction (R,L,U,D):");
		                            		    }  
	   	
		 //If statement for choice of down direction. 
		if ( choice.equals("D") ) {
			
		       if( a==gs-1 ) {
	        	   System.out.print("Wrong input! You cannot outside of walls.Enter a new input");
	          continue;     }
			
			if ( gg[a+1][b].equals("+") ) {
			   	    System.out.print("Wrong input! You cannot go place that you passed before.Enter a new input");
			   	    	continue;     }
	    	
		   	 gg[a][b]="+";
	         
		         a++;
		         
		     gg[a][b]="X";
		   	    
		       for(int i=0 ; i<gs ; i++) {
		   	   	 
		   	    	 System.out.print("|"); 
		   	    	    
		        for(int j = 0 ; j<gs ; j++)
		   	    		 
		            System.out.print( gg[i][j] );
		   	   
		   	        System.out.println("|");}
		     	  
		   	        move--;
			   	      
		     System.out.println("Moves:" + move + "            Current Cell:(" + a + "," + b + ")");
		     System.out.print("Choose your direction (R,L,U,D):");		                          	    	
		    }  
	 
		
	//Above if statements works in while(true) loop until move variable equals to zero.
	         if(move==0) {
	    	    
	        	 System.out.println();
	        	 System.out.println();
	        	 System.out.println();
	        	 System.out.println("                     Game Over.You lost!");
	    	     break;   }
	      
	//The rest code of program,number of "*" is counted after each direction choice and when it is zero "You Win" is 
     //is printed.
	         int count = 0;
	      
	      for(int i=0 ; i<gs ; i++)    {
		   	 	  
	    	 for(int j = 0 ; j<gs ; j++)
	   	       		 
	           if (  (gg[i][j].equals("*") ) ) 
	   	   
	   	            count++ ;      }
	   	      
	    	 if (count==0)   {
	   	    	 
	    		  System.out.println();
	    		  System.out.println();
	    		  System.out.println();
	    		  System.out.println("                     *** You Win ***");   
	               break;     }
	    	  
	       }      
	           
		           	             
	}

}
