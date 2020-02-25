package pj1;
/** An interface for the Pile. */
public interface pile<T> 
{
	/** Detects whether this pile is empty.
	@return True if the pile is empty. */
	boolean isEmpty();
	
	/** Detects whether this pile is full.
	@return True if the pile is full. */
	boolean isFull();
	
	/** Removes all entries from this pile. */
	void clear();
	
    /**Removes and returns the item most recently added to this pile.
     * @return the item most recently added
     * @throws java.util.NoSuchElementException if this pile is empty*/
	T pop();
	 
	/** Adds a new object(book) to the top of this pile.
	@param obj An object to be added to the pile. */
	void push(T obj);
	
	/** Retrieves this pile's top book.
	@return The book at the top of the pile.
	@throws NoSuchElementException if the pile is empty. */
	T top();
	
    /** Returns the number of items in the pile.
     * @return the number of items in the pile */
	int size();
}// end if
