#!/bin/bash

set -e

cd $TRAVIS_BUILD_DIR
pwd
echo ${AWS_ACCESS_KEY_ID}
echo ${AWS_SECRET_ACCESS_KEY}
echo ${AWS_DEFAULT_REGION}
sbt assembly
aws --region eu-west-2 s3 ls
aws --region eu-west-2 s3 cp ./target/scala-2.11 s3://dilyan-test-lambda/travis-builds --recursive --exclude "*" --include "*.jar"
