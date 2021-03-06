





//$$strtCprt
/**
* NNFSA (Neural Net Generator For Simple Algebra)
* 
* Copyright (C) 2018 Thornton Green
* 
* This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as
* published by the Free Software Foundation; either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty 
* of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program; if not, 
* see <http://www.gnu.org/licenses>.
* Additional permission under GNU GPL version 3 section 7
*
*/
//$$endCprt








import java.io.FileOutputStream;
import java.io.PrintStream;


/**
 * Tests the ability to export Pickle files of a TensorFlow neural-net model for 2-D slope estimation to text files that can be read from Java.
 * 
 * Note: the Pickle files used by this script are not checked-in, but are instead generated by runTrain_2d_a.sh
 * 
 * @author tgreen
 *
 */
public class GenExportScript_2d_a {

	
	
	/**
	 * Tests the ability to export Pickle files of a TensorFlow neural-net model for 2-D slope estimation to text files that can be read from Java.
	 * 
	 * Note: the Pickle files used by this script are not checked-in, but are instead generated by runTrain_2d_a.sh
	 * 
	 * @param args Input args.
	 */
	public static void main(String[] args) throws Throwable {
		
		FileOutputStream fox = new FileOutputStream( "runExport_2d_a.sh" );
		
		
		PrintStream psx = new PrintStream( fox );
		
		
		psx.println( "#$$strtCprt");
		psx.println( "#");
		psx.println( "# NNFSA (Neural Net Generator For Simple Algebra)");
		psx.println( "#");
		psx.println( "# Copyright (C) 2018 Thornton Green");
		psx.println( "#");
		psx.println( "# This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as");
		psx.println( "# published by the Free Software Foundation; either version 3 of the License, or (at your option) any later version.");
		psx.println( "# This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty ");
		psx.println( "# of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.");
		psx.println( "# You should have received a copy of the GNU General Public License along with this program; if not, ");
		psx.println( "# see <http://www.gnu.org/licenses>.");
		psx.println( "# Additional permission under GNU GPL version 3 section 7");
		psx.println( "#");
		psx.println( "#");
		psx.println( "#$$endCprt");
		psx.println( "");
		psx.println( "");
		psx.println( "");
		psx.println( "#");
		psx.println( "# Tests the ability to export Pickle files of a TensorFlow neural-net model for 2-D slope estimation to text files that can be read from Java.");
		psx.println( "# Generated by GenExportScript_2d_a.java.  Do not directly modify this file.  Instead, modify the GenExportScript_2d_a.java file that produced it.");
		psx.println( "# Note: the Pickle files used by this script are not checked-in, but are instead generated by runTrain_2d_a.sh");
		psx.println( "# Code derived from examples on the web.");
		psx.println( "#");
		psx.println( "");

		
		
		final int[] cntrVals = { MAX_T - 1 , ( MAX_X - 1 ) / 2 };
		
		
		
		for( int t = 0 ; t < MAX_T ; t++ )
		{
			final int x = cntrVals[ 1 ];
			psx.println( "python3 export_a.py wvals_" + t + "_" + x + "_.pkl bvals_" + t + "_" + x + "_.pkl wvals_txt_" + t + "_" + x + "_.txt bvals_txt_" + t + "_" + x + "_.txt"  );
		}
		
		
		
		for( int x = 0 ; x < MAX_X ; x++ )
		{
			final int t = cntrVals[ 0 ];
			psx.println( "python3 export_a.py wvals_" + t + "_" + x + "_.pkl bvals_" + t + "_" + x + "_.pkl wvals_txt_" + t + "_" + x + "_.txt bvals_txt_" + t + "_" + x + "_.txt"  );
		}
		
		
		
		
		
		psx.close();

	}	
	
	
	
	
	
	
	/**
	 * Maximum size of the evaluation cell along the T-axis.
	 */
	static final int MAX_T = 5;
	
	/**
	 * Maximum size of the evaluation cell along the X-axis.
	 */
	static final int MAX_X = 5;
	
	
	


	
	
}


