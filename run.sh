#!/bin/sh
cd resteasy-server
xterm -hold -e "mvn tomcat7:run" &

cd ..
cd nginx-manager/target/nginx-1.5.6/conf
chmod 777 *
./openssl.sh
sudo nginx -c "$PWD/nginx.conf"

echo "Remember to stop nginx: sudo nginx -s stop"
cd ..
cd ..
cd ..

