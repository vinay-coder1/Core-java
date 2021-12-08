public class ControlStatements{
	
      public static void main(String[] args) {
      	

      	//else-if
        String gender = "Others"; 

        if(gender=="Male"){
	               System.out.println("the person is Male");
                 }

        else if(gender=="Female"){
	               System.out.println("the person is Female");
                 }
        
        else if(gender=="Others"){
	               System.out.println("the person is others");
                 }
        else{
	          System.out.println("Not valid Gender");
             
            }


           String country = "India";
           int age = 19;
           boolean isVotterId = false;

          //nested-if
         if(country=="India"){
	
	        if(age>=18){

	           if(isVotterId){
                System.out.println("Eligble to vote");
	            }
	            else{
	            System.out.println("Votter Id not available");
	            }  
	       }
           else{
           	  System.out.println("Age is not valid");
           }

        }

        else{
        	System.out.println("Not Eligble For Votting");
        }
   
   }

}