BITS Distributed Computing Assignment 
----------------------------------------
Heading - Deadlock_detection Chandy-Misra-Haas deadlock detection algorithm for OR model.
Name:Rahul Kumar Yadav Bits ID: 2020mt12284
This program is implemented using JAVA and Eclipse as IDE

Code Details
---------------
The Program uses JAVA source code file - chandymisrahass_or.java 
The Executable JAR file is - cmh-Or_Algorithm.jar
Source code, JAR and this Readme file are attached to the Assignment Word File for download and execute and also submitted along with ZIP file "DC_Assignment_RahulKYadav_2020MT12284.zip"

once the JAR file is downloaded it can be saved to any location on local drive (e.g. C:\Users\rahul)


System requirement and execution steps - 
--------------------------------------
Windows 10 64 bits
JDK version 14 required to support this JAR execution please check if the installed JDK on local machine has
following JDK version at this location (path may vary on machines) - C:\Program Files\Java\jdk-14.0.2\bin

Next it can be executed on the command prompt using ->  First we need to navigate to the path where the JDK is installed so 

1) use commands-  cd C:\Program Files\Java\jdk-14.0.2\bin> to change the path
2) use command java -jar C:\Users\rahul\cmh-Or_Algorithm.jar  
3) so this will look like this on command prompt C:\Program Files\Java\jdk-14.0.2\bin> java -jar C:\Users\rahul\cmh-Or_Algorithm.jar  
4) Hit enter 

The program execution starts as below 


Enter the number of processes - only Integer values
4
Enter the wait for graph: - Only Integer values
please enter wait upto:16times (this is auto calculated value)
1
0
0
1
1
0
0
0
0
0
1
1
1
0
0
0
the wait for graph is: (Auto Calculated)
1 0 0 1
1 0 0 0
0 0 1 1
1 0 0 0
Enter the process initiating probe - Only integer value within the range of processes entered)
2
Initiating probe...
[(2,0,0), (2,0,3), (2,1,0), (2,2,2), (2,2,3), (2,3,0)]
The Deadlock has been detected...

