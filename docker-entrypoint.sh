#!/usr/bin/env bash

# create by:  afterloe
#      mail: lm6289511@gmail.com
#   version: v0.1.1

#     usage: file_env VAR [DEFAULT]
#        ie: file_env 'XYZ_SOA_REGISTER' 'example'
# (will allow for "$XYZ_SOA_REGISTER_FILE" to fill in the value of
#  "$XYZ_SOA_REGISTER" from a file, especially for Docker's secrets feature)

bootfile=$(find . -name *.jar)
echo $env

param="-XX:+UseParallelGC -Xmx4g"
if [ -n "$BAIDU_URL" ];
then
    param="$param --integrate.url=$BAIDU_URL"
fi
if [ -n "$SERVICE_DEFAULT_ZONE" ];
then
    param="$param --eureka.client.serviceUrl.defaultZone=$SERVICE_DEFAULT_ZONE"
fi

echo $param

java -Djava.security.egd=file:/dev./urandom \
-jar \
$bootfile \
$param
