

#!/bin/bash

for file in $( ls )
#for file in *
do
   # echo "file: $file"
   if [ -d "$file" ]; then
     echo "start running $file.jar ..."
     java -jar "$file/target/$file.jar"
     echo "Completion of operation $file.jar"
   fi
done