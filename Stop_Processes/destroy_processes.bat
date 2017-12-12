set list=10002 10005 10008 10011 10014 10017 10020 10023
(for %%a in (%list%) do (
(netstat -a -n -o | findstr :%%a ) > portProcessData.txt
java SplitAndGetProcesses
for /f "tokens=* delims=" %%x in (uniqueProcessIds.txt) do taskkill -f /pid %%x
))
pause
exit