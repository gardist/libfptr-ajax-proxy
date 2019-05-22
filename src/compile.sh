#!/bin/sh

LIBFPTRPATH="/home/pi/atol/10.4.6/ajaxproxy/java/*"
PROXYPATH="/home/pi/atol/10.4.6/ajaxproxy/src/proxydrv/proxydrv.java"

/usr/bin/javac -cp $LIBFPTRPATH $PROXYPATH
