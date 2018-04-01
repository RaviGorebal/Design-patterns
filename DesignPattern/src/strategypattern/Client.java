package strategypattern;

import java.io.File;
import java.util.ArrayList;

public class Client {
	 private static final ArrayList<File> ravifiles = null;

	public static void main(String[] args) {
		    CompressionContext ctx = new CompressionContext();
		    //we could assume context is already set by preferences
		    ctx.setCompressionStrategy(new ZipCompressionStrategy());
 System.out.println("ravi");
			//get a list of files...
//		   System.out.print(ctx.createArchive(ravifiles));
		  }

}
