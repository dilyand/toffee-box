#!/bin/bash

set -e

mkdir -p ~/.aws

cat > ~/.aws/credentials << EOL
[default]
aws_access_key_id = ${AWS_ACCESS_KEY_ID}
aws_secret_access_key = ${AWS_SECRET_ACCESS_KEY}
EOL

cd $TRAVIS_BUILD_DIR
pwd
sbt assembly
aws --region eu-west-2 s3 ls
aws --region eu-west-2 s3 cp ./target/scala-2.11 s3://dilyan-test-lambda/travis-builds --recursive --exclude "*" --include "*.jar"
