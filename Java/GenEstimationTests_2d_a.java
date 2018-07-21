




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
import java.util.Random;

/**
 * Tests the ability to generate training data for a 2-D TensorFlow neural-net model for slope estimation.
 * 
 * @author tgreen
 *
 */
public class GenEstimationTests_2d_a {
	

	
	/**
	 * Tests the ability to generate training data for a 2-D TensorFlow neural-net model for slope estimation.
	 * 
	 * @param args Command-line arguments for the training.
	 */
	public static void main(String[] args) throws Throwable {
		
		FileOutputStream fox = new FileOutputStream( "xvals.txt" );
		
		final FileOutputStream[][] foy = new FileOutputStream[ MAX_T ][ MAX_X ];
		
		for( int t = 0 ; t < MAX_T ; t++ )
		{
			for( int x = 0 ; x < MAX_X ; x++ )
			{
				foy[ t ][ x ] = new FileOutputStream( "yvals_" + t + "_" + x + "_.txt" );
			}
		}
		
		
		PrintStream psx = new PrintStream( fox );
		
		final PrintStream[][] psy = new PrintStream[ MAX_T ][ MAX_X ];
		
		for( int t = 0 ; t < MAX_T ; t++ )
		{
			for( int x = 0 ; x < MAX_X ; x++ )
			{
				psy[ t ][ x ] = new PrintStream( foy[ t ][ x ] );
			}
		}
		
		
		
		
		
		for( int cnt = 0 ; cnt < GenConstants.NUM_TRAINING_CASES ; cnt++ )
		{
			System.out.println( cnt );
			genCase( cnt + 2525 , psx , psy );
		}
		
		psx.close();
		
		for( int t = 0 ; t < MAX_T ; t++ )
		{
			for( int x = 0 ; x < MAX_X ; x++ )
			{
				psy[ t ][ x ].close();
			}
		}

	}
	
	
	
	
	/**
	 * Maximum size of the evaluation cell along the T-axis.
	 */
	static final int MAX_T = 5;
	
	/**
	 * Maximum size of the evaluation cell along the X-axis.
	 */
	static final int MAX_X = 5;
	
	
	
	
	/**
	 * The maximum inverse wave number along the T-axis.
	 */
	static final int MAXWAV_T = 5;
	
	/**
	 * The maximum inverse wave number along the X-axis.
	 */
	static final int MAXWAV_X = 5;
	
	
	
	
	
	
	
	/**
	 * Calculates the maximum of the absolute value of the array elements.
	 * @param iv The array elements over which to find the maximum.
	 * @return The maximum of the absolute value of the array elements.
	 */
	protected static double findAbsMax( double[][] iv )
	{
		
		double max = 0.0;
		
		for( int t = 0 ; t < ( MAX_T - 1 ) ; t++ )
		{
			for( int x = 0 ; x < MAX_X ; x++ )
			{
				max = Math.max( max , Math.abs( iv[ t ][ x ] ) );
			}
		}
		
		return( max );
		
	}
	
	
	
	/**
	 * Divides all of the array elements by the absolute value of the max.
	 * @param iv The array elements to be divided.
	 * @param max The absolute value of the max.
	 */
	protected static void applyAbsMax( double[][] iv , final double max )
	{
		
		for( int t = 0 ; t < MAX_T ; t++ )
		{
			for( int x = 0 ; x < MAX_X ; x++ )
			{
				iv[ t ][ x ] = iv[ t ][ x ] / max;
			}
		}
		
	}
	
	
	
	/**
	 * Returns a calculated sine wave.
	 * @param mag The magnitude of the sine wave.
	 * @param t The parameter of the sine function, where the entire period extends from zero to four (this is basically the shortest oscillation that shouldn't be filtered out).
	 * @param phase tHE PHASE OF THE WAVE, WHERE THE ENTIRE PHASE OF THE WAVE EXTENDS FROM ZERO TO ONE.
	 * @return The CALCULATED SINE WAVE.
	 */
	protected static double calcSin( final double mag , final double t , final double phase )
	{
		return( mag * ( Math.sin( 0.25 * ( 2.0 * Math.PI ) * t + phase * ( 2.0 * Math.PI ) ) ) );
	}
	
	
	
	/**
	 * Adds one randomly selected training case to each print stream.
	 * @param seed The random number seed for the training case generation.
	 * @param psx The print stream for the X-values of the training case.
	 * @param psy The print streams for the Y-values of the training case.
	 */
	protected static void genCase( final int seed , final PrintStream psx , final PrintStream[][] psy  )
	{
		
		final Random rand = new Random( seed );
		
		for( int i = 0 ; i < 10 ; i++ )
		{
			rand.nextDouble();
		}
		
		final double[][] iv = new double[ MAX_T ][ MAX_X ];
		
		final double[][] ov = new double[ MAX_T ][ MAX_X ];
		
		
		
		
		final double noiseMaxAmplitude = 3000.0 * rand.nextDouble();
		
		final double startConst = 300.0 * ( rand.nextDouble() - 0.5 );
		
		final double tsl = 300.0 * ( rand.nextDouble() - 0.5 );
		
		final double xsl = 300.0 * ( rand.nextDouble() - 0.5 );
		
		
		
		
		
		final double[][] mag = new double[ MAXWAV_T ][ MAXWAV_X ];
		
		final double[][] phase = new double[ MAXWAV_T ][ MAXWAV_X ];
		
		
		
		
		for( int t = 0 ; t < MAX_T ; t++ )
		{
			for( int x = 0 ; x < MAX_X ; x++ )
			{
				mag[ t ][ x ] = 2.0 * rand.nextDouble();
								
				phase[ t ][ x ] = rand.nextDouble();
			}
		}
				
		
		
		
		
		for( int t = 0 ; t < MAX_T ; t++ )
		{
			for( int x = 0 ; x < MAX_X ; x++ )
			{
						
						
						double wsum = 0.0;
						
						for( int t2 = 0 ; t2 < MAXWAV_T ; t2++ )
						{
							final double wt2 = t2 == 0 ? 0.0 : t / t2;
							for( int x2 = 0 ; x2 < MAXWAV_X ; x2++ )
							{
								final double wx2 = x2 == 0 ? 0.0 : x / x2;
										
								wsum += calcSin( mag[ t ][ x ] , wt2 + wx2 , phase[ t ][ x ] );
							}
						}
						
						
						
						
						final double randNoiseVal = 2.0 * noiseMaxAmplitude * rand.nextDouble() - noiseMaxAmplitude;
						
						iv[ t ][ x ] = startConst + tsl * t + xsl * x + wsum + randNoiseVal;
								
						ov[ t ][ x ] = startConst + tsl * t + xsl * x + wsum;
			}
		}
		
		
		
		
		
		final double max = findAbsMax( iv );
		
		System.out.println( max );
		
		applyAbsMax( iv , max );
		
		applyAbsMax( ov , max );
		

		
		
		boolean prevSpace = false;;
		
		for( int t = 0 ; t < ( MAX_T - 1 ) ; t++ )
		{
			for( int x = 0 ; x < MAX_X ; x++ )
			{
				if( prevSpace )
					psx.print( " " );
				prevSpace = true;
				psx.print( iv[ t ][ x ] );
			}
		}
		
		
		
		
		for( int t = 0 ; t < MAX_T ; t++ )
		{
			for( int x = 0 ; x < MAX_X ; x++ )
			{
				psy[ t ][ x ].print( ov[ t ][ x ] );
			}
		}
		
		
		
		psx.println( "" );
		
		for( int t = 0 ; t < MAX_T ; t++ )
		{
			for( int x = 0 ; x < MAX_X ; x++ )
			{
				psy[ t ][ x ].println( "" );
			}
		}
		
		
		
	}
	

	
}



