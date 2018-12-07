#!/bin/bash

tag=$1

cd $TRAVIS_BUILD_DIR

export TRAVIS_BUILD_RELEASE_TAG=${tag}

sbt assembly

aws s3 cp ./target/scala-2.11/assembled_jars/toffee-box-${TRAVIS_BUILD_RELEASE_TAG}.jar s3://dilyan-test-lambda