set projectLocation=C:\Users\ADMIN\eclipse-workspace\EmpirixTestProject
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause