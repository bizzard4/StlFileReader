package stlfilereader;

import java.io.IOException;
import java.io.InputStream;

import stlfilereader.model.StlObject;

/**
 * Entry point to read an STL file.
 * Format specification from Wikipedia : https://en.wikipedia.org/wiki/STL_(file_format)
 * 
 * @author Francois
 *
 */
public abstract class StlReader {
	
	/**
	 * Abstract method to read file and create STL object.
	 * @param filename File path.
	 * @return Stl obejct.
	 */
	public abstract StlObject createStlObject(String filename) throws IOException, StlReaderException, NumberFormatException;
	
	/**
	 * Abstract method to read file and create STL object from a stream.
	 * @param stream STL file stream
	 * @return Stl object
	 * @throws IOException
	 * @throws StlReaderException
	 * @throws NumberFormatException
	 */
	public abstract StlObject createStlObject(InputStream stream) throws IOException, StlReaderException, NumberFormatException; 
}
