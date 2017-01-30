package stlfilereader.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Model class representing a STL object.
 * @author Francois
 *
 */
public class StlObject {
	
	/**
	 * Object name.
	 */
	public String name;
	
	/**
	 * Facet list.
	 */
	private List<StlFacet> facets;
	
	/**
	 * Default constructor.
	 */
	public StlObject() {
		this("");
	}
	
	/**
	 * Constructor.
	 * @param n Object name.
	 */
	public StlObject(String n) {
		name = n;
		facets = new ArrayList<>();
	}
	
	/**
	 * Return facet list.
	 * @return Facet list.
	 */
	public List<StlFacet> getFacets() {
		return facets;
	}
	
	/**
	 * Object description.
	 * @return Return the name and facet count of the stl object.
	 */
	public String toString() {
		return "Name=" + name + " Facets count=" + facets.size();
	}
}
