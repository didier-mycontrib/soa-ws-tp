cd /d %~dp0
set JAVA_HOME="C:\Prog\Java\jdk1.8.0_60"
"%JAVA_HOME%/bin/wsimport" -d src/main/java -keep http://localhost:8282/calculateurFinancier?wsdl
pause