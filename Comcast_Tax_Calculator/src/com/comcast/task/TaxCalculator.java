package com.comcast.task;

public class TaxCalculator{
	
	public double getItemTotalCost(double itemprice, int itemype) throws Exception  
	{
       
    	if (itemype==1)
    	{
    		    		
    	return itemprice+(itemprice * 0.01); 
    	}
        
        else if(itemype==2)
        	
        	return itemprice+(itemprice * 0.09);
        
         // if the itemtype not valid
        else 
        	
        {
        	throw (new Exception("Invalid item type is provided. It should be 1 or 2"));
        }
			
}

}
