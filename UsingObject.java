package changingTheValueOfDataMembersViaObject;
//here we are using the object to show that by initializing the elements of the data we can change 

public class UsingObject {
//the value that we have initialized
//here taking the main method  to execute
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer i = new Integer(2);//here we taking an object of integer data type has variable i
	        setToThree(i);//and initialized as 2 and given that method to set had 3
	        System.out.println(i);
	    }//here it prints as 2

	    public static void setToThree(Integer i) {
	        i = new Integer(3);//it sets that the value and it is going to print 2
	    }
	}
