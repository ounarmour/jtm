import java.io.File;
import java.util.HashMap;

public class GlobalDirectory {

	public String gdFileName;
	public File gdFile;
	public HashMap<String, Global> globals;
	public HashMap<String, Region> regions;
	public HashMap<String, Segment> segments;
	public HashMap<String, Dat> dats;
	
	public static void main(String[] args) {
		GlobalDirectory gd = new GlobalDirectory();
		
		Dat wide = new Dat("wide", "wide.dat");
		gd.dats.put(wide.ID, wide);
		
		Segment segWide = new Segment("segWide", wide);
		gd.segments.put(segWide.ID, segWide);
		
		Region regWide = new Region("regWide", segWide);
		gd.regions.put(regWide.ID, regWide);
		
		Global LNN = new Global("LNN", regWide);
		gd.globals.put(LNN.ID, LNN);
		
		
		
	}
	

	public GlobalDirectory() {
		gdFileName = "c:\\programdata\\jtm\\global-directory.dat";
		File gdFile = new File(gdFileName);

		// eventually, I should read in names, regions, segments, dats from this file but for now, I'll create new HashMaps
		globals = new HashMap<String, Global>();
		regions = new HashMap<String, Region>();
		segments = new HashMap<String, Segment>();
		dats = new HashMap<String, Dat>();
	}
	
}
