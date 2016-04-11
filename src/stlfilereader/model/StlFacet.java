package stlfilereader.model;

/**
 * Stl facet model.
 * 
 * @author Francois
 */
public class StlFacet {
	
	/**
	 * 3 points forming the triangle.
	 */
	public Point3D[] points;
	
	/**
	 * Normal.
	 */
	public Point3D normal;
	
	/**
	 * Constructor.
	 * @param n Normal.
	 * @param p1 Point 1.
	 * @param p2 Point 2.
	 * @param p3 Point 3.
	 */
	public StlFacet(Point3D n, Point3D p1, Point3D p2, Point3D p3) {
		points = new Point3D[3];
		points[0] = p1;
		points[1] = p2;
		points[2] = p3;
		normal = n;
	}
	
	/**
	 * Default constructor.
	 */
	public StlFacet() {
		this(new Point3D(), new Point3D(), new Point3D(), new Point3D());
	}
}
