#$$strtCprt
#
# NNFSA (Neural Net Generator For Simple Algebra) 
# 
# Copyright (C) 2018 Thornton Green
# 
# This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as
# published by the Free Software Foundation; either version 3 of the License, or (at your option) any later version.
# This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty 
# of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
# You should have received a copy of the GNU General Public License along with this program; if not, 
# see <http://www.gnu.org/licenses>.
# Additional permission under GNU GPL version 3 section 7
#
#
#$$endCprt



#
# Tests the ability to export Pickle files of a TensorFlow neural-net model for slope estimation to text files that can be read from Java.
# Code derived from examples on the web.
#


from __future__ import absolute_import
from __future__ import division
from __future__ import print_function

import tensorflow as tf
from tensorflow.contrib import learn
import matplotlib.pyplot as plt

from sklearn.pipeline import Pipeline
from sklearn import datasets, linear_model
from sklearn import cross_validation
import numpy as np
import pickle
import io
import sys



# Parameters
learning_rate = 0.001
training_epochs = 1
batch_size = 10
display_step = 1
dropout_rate = 0.9
# Network Parameters
n_hidden_1 = 32 # 1st layer number of features
n_hidden_2 = 200 # 2nd layer number of features
n_hidden_3 = 200
n_hidden_4 = 256
n_classes = 1

with open(sys.argv[1],'rb') as input:
        wvals = pickle.load(input)
with open(sys.argv[2],'rb') as input:
        bvals = pickle.load(input)





file = open( sys.argv[3] , "w" )


print( wvals.keys() )






file.write( "# File generated by export_a.py.  Do not directly modify this file.  Instead, modify the export_a.py file that created it.\n" )

h1 = wvals[ 'h1' ]

file.write( str( len( h1 ) ) )
file.write( "\n" )

file.write( str( len( h1[ 0 ] ) ) )
file.write( "\n" )


for i in range( len( h1 ) ):
   for j in range( len( h1[ i ] ) ):
      file.write( str( h1[ i ][ j ] ) )
      file.write( "\n" )







file.write( "\n" )

h2 = wvals[ 'h2' ]

file.write( str( len( h2 ) ) )
file.write( "\n" )

file.write( str( len( h2[ 0 ] ) ) )
file.write( "\n" )


for i in range( len( h2 ) ):
   for j in range( len( h2[ i ] ) ):
      file.write( str( h2[ i ][ j ] ) )
      file.write( "\n" )







file.write( "\n" )

h3 = wvals[ 'h3' ]

file.write( str( len( h3 ) ) )
file.write( "\n" )

file.write( str( len( h3[ 0 ] ) ) )
file.write( "\n" )


for i in range( len( h3 ) ):
   for j in range( len( h3[ i ] ) ):
      file.write( str( h3[ i ][ j ] ) )
      file.write( "\n" )








file.write( "\n" )

h4 = wvals[ 'h4' ]

file.write( str( len( h4 ) ) )
file.write( "\n" )

file.write( str( len( h4[ 0 ] ) ) )
file.write( "\n" )


for i in range( len( h4 ) ):
   for j in range( len( h4[ i ] ) ):
      file.write( str( h4[ i ][ j ] ) )
      file.write( "\n" )








file.write( "\n" )

out = wvals[ 'out' ]

file.write( str( len( out ) ) )
file.write( "\n" )

file.write( str( len( out[ 0 ] ) ) )
file.write( "\n" )


for i in range( len( out ) ):
   for j in range( len( out[ i ] ) ):
      file.write( str( out[ i ][ j ] ) )
      file.write( "\n" )














file.close()



print( "#######################" )



file = open( sys.argv[4] , "w" )


print( bvals.keys() )




file.write( "# File generated by export_a.py.  Do not directly modify this file.  Instead, modify the export_a.py file that created it.\n" )

b1 = bvals[ 'b1' ]

file.write( str( len( b1 ) ) )
file.write( "\n" )


for i in range( len( b1 ) ):
   file.write( str( b1[ i ] ) )
   file.write( "\n" )





file.write( "\n" )

b2 = bvals[ 'b2' ]

file.write( str( len( b2 ) ) )
file.write( "\n" )


for i in range( len( b2 ) ):
   file.write( str( b2[ i ] ) )
   file.write( "\n" )






file.write( "\n" )

b3 = bvals[ 'b3' ]

file.write( str( len( b3 ) ) )
file.write( "\n" )


for i in range( len( b3 ) ):
   file.write( str( b3[ i ] ) )
   file.write( "\n" )






file.write( "\n" )

b4 = bvals[ 'b4' ]

file.write( str( len( b4 ) ) )
file.write( "\n" )


for i in range( len( b4 ) ):
   file.write( str( b4[ i ] ) )
   file.write( "\n" )









file.write( "\n" )

out = bvals[ 'out' ]

file.write( str( len( out ) ) )
file.write( "\n" )


for i in range( len( out ) ):
   file.write( str( out[ i ] ) )
   file.write( "\n" )










file.close()
    




