package stlfilereader;

import java.io.IOException;

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
}
