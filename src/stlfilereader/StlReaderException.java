package stlfilereader;

/**
 * Exception class for STL reader.
 * @author Francois
 *
 */
public class StlReaderException extends Exception {
	
	/**
	 * Constructor.
	 * @param message Stl reader error message.
	 */
	public StlReaderException(String message) {
		super(message);
	}
}
