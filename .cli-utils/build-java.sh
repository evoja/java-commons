#!/bin/sh
set -e
DIR="$( cd "$( dirname "$0" )" && pwd )"
CUR=$(pwd)
GITROOT=$DIR/..

$DIR/check-editorconfig.sh

cd $GITROOT
echo "\n>>> Start building the java project"
mvn --version
mvn clean install $@
echo "<<< Done with building the java project\n"
cd -
