echo Setting Java Path..
set path="C:\Program Files\Java\jdk1.6.0_18\bin"
echo Java Path is set...
javac -d ./bin -classpath lib\selenium-java-client-driver.jar;lib\junit.jar;lib\org.hamcrest.core_1.1.0.v20090501071000.jar src/com/tinywall/selenium/*.java
java -classpath bin\;lib\selenium-java-client-driver.jar;lib\junit.jar;lib\org.hamcrest.core_1.1.0.v20090501071000.jar; com.tinywall.selenium.DoPartTimeTest