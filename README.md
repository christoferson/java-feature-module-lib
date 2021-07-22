# java-feature-module-lib
Java Feature Module Library

# Environment

set JAVA_HOME=C:\Program Files\Java\jdk-16.0.1

# Compile
Unix
$ find -name "*.java" > sources.txt
$ javac @sources.txt

Windows
$ dir /s /B *.java > sources.txt
$ javac @sources.txt -d target

# Jar

"%JAVA_HOME%\bin\jar" --create --file mlib.jar --module-version 1.0.0 -C target .

# Check Jar Content

"%JAVA_HOME%\bin\jar" -tvf mlib.jar

# Check Module Info

"%JAVA_HOME%\bin\jar" -d -f mlib.jar

# References
https://docs.oracle.com/javase/7/docs/technotes/tools/windows/jar.html