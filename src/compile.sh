#!/bin/sh

LIBFPTRPATH="/home/pi/atol/10.4.6/jsonproxy/java/*"
PROXYPATH="/home/pi/atol/10.4.6/jsonproxy/src/proxydrv/proxydrv.java"

/usr/bin/javac -cp $LIBFPTRPATH $PROXYPATH
