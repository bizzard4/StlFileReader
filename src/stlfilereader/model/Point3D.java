package stlfilereader.model;

/**
 * 3D floating point model.
 * @author Francois
 *
 */
public class Point3D {
	
	/**
	 * X.
	 */
	public float x;
	
	/**
	 * Y.
	 */
	public float y;
	
	/**
	 * Z.
	 */
	public float z;
	
	/**
	 * Constructor.
	 */
	public Point3D() {
		this(0.0f, 0.0f, 0.0f);
	}
	
	/**
	 * Constrcutor.
	 * @param px X.
	 * @param py Y.
	 * @param pz Z.
	 */
	public Point3D(float px, float py, float pz) {
		x = px;
		y = py;
		z = pz;
	}
}
