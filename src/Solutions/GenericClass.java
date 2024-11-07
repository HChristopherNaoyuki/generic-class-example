package Solutions;

public class GenericClass <Thing, Thing1>
{
    // Member variables of type Thing and Thing1
    Thing x;
    Thing1 y;

    // Constructor that initializes the two member variables with values
    public GenericClass(Thing x, Thing1 y)
    {
        this.x = x;  // Assigns the value of x to the member variable x
        this.y = y;  // Assigns the value of y to the member variable y
    }
    
    // Method that returns the value of the member variable y, which is of type Thing1
    public Thing1 getValue()
    {
        return y;  // Returns the value of the member variable y
    }
}
