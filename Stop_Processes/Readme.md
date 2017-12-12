Steps to follow to destroy running processes on various ports->(Step:0 is optional)

0. To compile "SplitAndGetProcesses.java" again use below command:

javac SplitAndGetProcesses.java

1. Files "destroy_processes.bat" and "SplitAndGetProcesses.class" should be in same folder

2. In the first line, the variable list should be the set of ports separated by spaces: For e.g.,

set list=10008 10009 10010

3. Run "destroy_processes.bat" file.