@echo off

rem mvn clean package

cd resteasy-server
start mvn tomcat7:run

cd ..
cd nginx-manager\target\nginx-1.5.6\conf
call openssl.bat
cd ..
start nginx.exe


"c:\Program Files\Internet Explorer\iexplore.exe" "https://localhost/amf-client/Main.html"

pause

nginx -s stop

cd ..
cd ..
cd ..

