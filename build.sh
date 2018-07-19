#!/bin/bash

for file in $( ls )
#for file in *
do
   # echo "file: $file"
   if [ -d "$file" ]; then
     echo "In folder: $file"
     cd "$file"
     echo "build $file.jar ..."
     mvn clean package
     echo "finish build $file.jar"
     ls target/
     cd ..
   fi
done