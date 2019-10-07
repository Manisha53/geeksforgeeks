{
	 static void isPrime (int n) 
	 {
	     int flag=0;     //yes
	     if(n==1){
	        flag=1;        //no
	     }
	     else{
	          for(int i=2;i<=Math.sqrt(n);i++)
            {
                //Your code here
                if(n%i==0){
                    flag=1;
                }
                
            }
	     }
           
         if(flag==0){
              System.out.println("Yes");
         }   
         else{
              System.out.println("No");
         }
        
	 }
}
