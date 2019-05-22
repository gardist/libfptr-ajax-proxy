#!/bin/sh

LIBFPTRPATH="/home/pi/atol/10.4.6/ajaxproxy/java/*"
DATA="{\"type\":\"getShiftStatus\"}"

/usr/bin/java -classpath .:$LIBFPTRPATH proxydrv.proxydrv $DATA
