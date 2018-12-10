#!/bin/bash

set -e

cd $TRAVIS_BUILD_DIR
pwd

if [[$TRAVIS_TAG == toffee-box*]]
  cd ./toffee-box
  pwd
fi

sbt assembly
aws --region $AWS_DEFAULT_REGION s3 cp ./target/scala-2.11 s3://dilyan-test-lambda/travis-builds --recursive --exclude "*" --include "*.jar"
