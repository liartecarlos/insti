
public class YearUtilities {

		public static boolean isLeap(int year){
	        if(year%4 == 0){
	            if(year%100 == 0){ //no bisiesto
	                if(year%400 == 0){
	                    return true; //modificacion de true a false
	                }else{
	                    return false;  
	                }
	            }else{
	                return true; //modificacion a true
	            }
	        }else{
	            return false;//modificacion de false a true
	        }
	    }
	

}
