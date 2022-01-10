#!/bin/sh
set -e
DIR="$( cd "$( dirname "$0" )" && pwd )"
CUR=$(pwd)
GITROOT=$DIR/..

cd $GITROOT
echo "\n>>> Start building the java project (no 'clean', no 'test')"
mvn --version
mvn install -DskipTests -Dpmd.skip=true $@
echo "<<< Done with building the java project\n"
cd -
