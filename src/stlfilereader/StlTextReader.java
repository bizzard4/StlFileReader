package stlfilereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;

import stlfilereader.model.Point3D;
import stlfilereader.model.StlFacet;
import stlfilereader.model.StlObject;

/**
 * Read STL object in a text format.
 * @author Francois
 *
 */
public class StlTextReader extends StlReader {

	/**
	 * {@inheritDoc}
	 * @throws IOException 
	 */
	@Override
	public StlObject createStlObject(String filename) throws IOException, StlReaderException, NumberFormatException {
		StlObject obj = new StlObject();
		
		BufferedReader br = Files.newBufferedReader(FileSystems.getDefault().getPath(filename));
		
		String line = "";
		int p = 0;
		StlFacet facet = null;
		while ((line = br.readLine()) != null) {
			line = line.trim();
			if (line.startsWith("solid")) { // Solid name
				obj.name = line.split(" ")[1];
			} else if (line.startsWith("facet")) { // New facet
				facet = new StlFacet();
				facet.normal = getNormal(line);
			} else if (line.startsWith("endfacet")) { // End facet
				obj.getFacets().add(facet);
			} else if (line.startsWith("outer")) { // New triangle
				p = 0;
			} else if (line.startsWith("vertex")) { // New vertex
				facet.points[p] = getPoint(line);
				p++;
			} else if (line.startsWith("endloop")) { // Facet loop end
				
			}
		}
	
		return obj;
	}
	
	/**
	 * Read facet line and return normal point.
	 * @param facetline Facet line.
	 * @return Normal point.
	 * @throws NumberFormatException In case of bad numbers.
	 */
	private Point3D getNormal(String facetline) throws NumberFormatException {
		String[] split = facetline.split(" ");
		float p1 = Float.parseFloat(split[2]);
		float p2 = Float.parseFloat(split[3]);
		float p3 = Float.parseFloat(split[4]);
		return new Point3D(p1, p2, p3);
	}
	
	/**
	 * Read a vertex line and return point.
	 * @param pointline Vertex line.
	 * @return Point.
	 * @throws NumberFormatException In case of bad number.
	 */
	private Point3D getPoint(String pointline) throws NumberFormatException {
		String[] split = pointline.split(" ");
		float p1 = Float.parseFloat(split[1]);
		float p2 = Float.parseFloat(split[2]);
		float p3 = Float.parseFloat(split[3]);
		return new Point3D(p1, p2, p3);
	}
}
