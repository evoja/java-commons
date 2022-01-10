#!/bin/sh
set -e
DIR="$( cd "$( dirname "$0" )" && pwd )"
CUR=$(pwd)
GITROOT=$DIR/..


cd $GITROOT/.github/evj-tools
echo "\n>>> Start checking that files satisfy the .editorconfig"
echo node@$(node --version)
echo npm@$(npm --version)
if [ ! -d "node_modules" ]; then
	npm ci
fi;
npm run check-editorconfig
cd -

echo "<<< Done with checking that files satisfy the .editorconfig\n"


cd $GITROOT
echo "\n>>> Start checking for tabs in a middle of a line\033[0;31m"
find . -type f \
		-not -name '*.iml' \
		-not -name '*.png' \
		-not -path '**/node_modules/**' \
		-not -path '**/target/**' \
		-not -path '**/.idea/**' \
		-not -path './.git/**' \
		-exec grep -HnE $'[^/-](\S| )\t+' {} \; \
	| grep . && printf '\033[0m' && exit 1 || printf '\033[0m'
echo "<<< Done with checking for tabs in a middle of a line\n"
cd -
