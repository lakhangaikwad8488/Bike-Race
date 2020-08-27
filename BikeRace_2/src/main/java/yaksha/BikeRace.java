package main.java.yaksha;

public class BikeRace {
	 
		public String findBonusPoint(int d) {
			int bpe=1,bpo=1,i=1,rem=0;
			  if(d<0)
		        {
		        return "Invalid Input";
		        }
		        else if(d==0)
		        {
		            return "Your bonus points is "+rem; 
		        }
		        else
		        {
		        while(d!=0)
		        {
		            rem=d%10;
		            d=d/10;
		            if(i%2==1)
		            {
		            bpo=bpo*rem;
		            }
		            if(i%2==0)
		            {
		                bpe=bpe*rem;
		            }
		            i++;
		        }
		        if(bpe==bpo)
		        {
		            bpe=2*bpo;
		           return "Your bonus points is "+bpe;
		        }
		       else if(bpe>bpo)
		        {
		            return "Your bonus points is "+bpe; 
		        }
		        else
		        {
		         return "Your bonus points is "+bpo; 
		        }
		       }
			
		}
		
	}


