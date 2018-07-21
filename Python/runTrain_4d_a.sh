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
# Tests the ability to train a 4-D TensorFlow neural-net model for slope estimation and write the results to Pickle files.
# Generated by GenTrainScript_4d_a.java.  Do not directly modify this file.  Instead, modify the GenTrainScript_4d_a.java file that produced it.
# Note: the xvals and yvals files used by this script are not checked-in, but are instead generated by GenEstimationTests_4d_a.java
# Code derived from examples on the web.
#

python3 train_4d_a.py yvals_0_2_2_2_.txt wvals_0_2_2_2_.pkl bvals_0_2_2_2_.pkl
python3 train_4d_a.py yvals_1_2_2_2_.txt wvals_1_2_2_2_.pkl bvals_1_2_2_2_.pkl
python3 train_4d_a.py yvals_2_2_2_2_.txt wvals_2_2_2_2_.pkl bvals_2_2_2_2_.pkl
python3 train_4d_a.py yvals_3_2_2_2_.txt wvals_3_2_2_2_.pkl bvals_3_2_2_2_.pkl
python3 train_4d_a.py yvals_4_2_2_2_.txt wvals_4_2_2_2_.pkl bvals_4_2_2_2_.pkl
python3 train_4d_a.py yvals_4_0_2_2_.txt wvals_4_0_2_2_.pkl bvals_4_0_2_2_.pkl
python3 train_4d_a.py yvals_4_1_2_2_.txt wvals_4_1_2_2_.pkl bvals_4_1_2_2_.pkl
python3 train_4d_a.py yvals_4_2_2_2_.txt wvals_4_2_2_2_.pkl bvals_4_2_2_2_.pkl
python3 train_4d_a.py yvals_4_3_2_2_.txt wvals_4_3_2_2_.pkl bvals_4_3_2_2_.pkl
python3 train_4d_a.py yvals_4_4_2_2_.txt wvals_4_4_2_2_.pkl bvals_4_4_2_2_.pkl
python3 train_4d_a.py yvals_4_2_0_2_.txt wvals_4_2_0_2_.pkl bvals_4_2_0_2_.pkl
python3 train_4d_a.py yvals_4_2_1_2_.txt wvals_4_2_1_2_.pkl bvals_4_2_1_2_.pkl
python3 train_4d_a.py yvals_4_2_2_2_.txt wvals_4_2_2_2_.pkl bvals_4_2_2_2_.pkl
python3 train_4d_a.py yvals_4_2_3_2_.txt wvals_4_2_3_2_.pkl bvals_4_2_3_2_.pkl
python3 train_4d_a.py yvals_4_2_4_2_.txt wvals_4_2_4_2_.pkl bvals_4_2_4_2_.pkl
python3 train_4d_a.py yvals_4_2_2_0_.txt wvals_4_2_2_0_.pkl bvals_4_2_2_0_.pkl
python3 train_4d_a.py yvals_4_2_2_1_.txt wvals_4_2_2_1_.pkl bvals_4_2_2_1_.pkl
python3 train_4d_a.py yvals_4_2_2_2_.txt wvals_4_2_2_2_.pkl bvals_4_2_2_2_.pkl
python3 train_4d_a.py yvals_4_2_2_3_.txt wvals_4_2_2_3_.pkl bvals_4_2_2_3_.pkl
python3 train_4d_a.py yvals_4_2_2_4_.txt wvals_4_2_2_4_.pkl bvals_4_2_2_4_.pkl
