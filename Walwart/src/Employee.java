
public abstract class Employee 
{
    private String firstName;
    private String lastName;

    public Employee(String fn, String ln)//constroucter method
{
	firstName = fn;
	lastName =  ln;
	
}
    
    public String toString()// prints Employess 
{

return(firstName + " " + lastName);

}
    abstract double pay(double period);
    
    
    
}

