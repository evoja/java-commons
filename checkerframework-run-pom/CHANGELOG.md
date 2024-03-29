# Change Log of net.evoja.commons:checkerfamework-run-pom

<!---
#### [Unreleased][unreleased]
##### Added
##### Changed
##### Deprecated
##### Removed
##### Fixed
##### Security
##### Broken
--->


## v0.0

### [0.0.5] - [2022-11-21][c-0.0.5]
##### Changed
The parent POM to [common-pom:0.0.0/pom.xml](https://github.com/evoja/java-commons/blob/common-pom/0.0.0/pom.xml)
which:
* is a pure POM parent that does not combine other modules
* does not specify version of `maven-compiler-plugin`, `maven-dependency-plugin`,
	`maven-deploy-plugin`, `maven-install-plugin` anymore

Start managing version of `maven-compiler-plugin:3.10.1`

### [0.0.4] - [2022-11-16][c-0.0.4]
##### Changed
* Configure `markersDirectory` in order to not conflict
with `jira-maven-plugin:copy-bundled-dependencies`
* Upgrade `checkerframework.version` from `3.26.0` to `3.27.0`


### [0.0.3] - [2022-10-30][c-0.0.3]
##### Changed
* The parent POM to [commons:0.0.8/pom.xml](https://github.com/evoja/java-commons/blob/commons/0.0.8/pom.xml),
	which changes compilation source and target to JDK11
* Upgrade `checkerframework.version` to `3.26.0`
* Bump [checkerframework-stubs-nullness](../checkerframework-stubs-nullness/) from 0.0.0 to 0.0.1
* Bump [checkerframework-stubs-purity](../checkerframework-stubs-purity/) from 0.0.0 to 0.0.1
* Bump [checkerframework-stubs-units](../checkerframework-stubs-units/) from 0.0.0 to 0.0.1
* Bump [checkerframework-units](../checkerframework-units/) from 0.0.2 to 0.0.3


### [0.0.2] - [2022-08-14][c-0.0.2]
##### Changed
* The parent POM to [commons:0.0.7/pom.xml](https://github.com/evoja/java-commons/blob/commons/0.0.7/pom.xml),
	which supports dependencies license checking and reporting.
* Upgrade `checkerframework.version` to `3.24.0`
* Bump [checkerframework-units](../checkerframework-units/) from 0.0.1 to 0.0.2


### [0.0.1] - [2022-01-15][c-0.0.1]
##### Added
* checkerframework version property

##### Changed
* The parent POM to [commons:0.0.6/pom.xml](https://github.com/evoja/java-commons/blob/commons/0.0.6/pom.xml)
* Bump [checkerframework-units](../checkerframework-units/) from 0.0.0 to 0.0.1


### [0.0.0] - 2022-01-11

A parent POM for checkerframework checks, which also supports
an optional _purity-strict_ profile.

The parent POM is [commons:0.0.5/pom.xml](https://github.com/evoja/java-commons/blob/commons/0.0.5/pom.xml)





------------
Changelog file follows [this convention](https://keepachangelog.com/)

[The root CHANGELOG](/CHANGELOG.md)


[unreleased]: https://github.com/evoja/java-commons/compare/checkerframework-run-pom/0.0.5...master

[c-0.0.5]: https://github.com/evoja/java-commons/compare/checkerframework-run-pom/0.0.4...checkerframework-run-pom/0.0.5
[0.0.5]: https://github.com/evoja/java-commons/tree/checkerframework-run-pom/0.0.5

[c-0.0.4]: https://github.com/evoja/java-commons/compare/checkerframework-run-pom/0.0.3...checkerframework-run-pom/0.0.4
[0.0.4]: https://github.com/evoja/java-commons/tree/checkerframework-run-pom/0.0.4

[c-0.0.3]: https://github.com/evoja/java-commons/compare/checkerframework-run-pom/0.0.2...checkerframework-run-pom/0.0.3
[0.0.3]: https://github.com/evoja/java-commons/tree/checkerframework-run-pom/0.0.3

[c-0.0.2]: https://github.com/evoja/java-commons/compare/checkerframework-run-pom/0.0.1...checkerframework-run-pom/0.0.2
[0.0.2]: https://github.com/evoja/java-commons/tree/checkerframework-run-pom/0.0.2

[c-0.0.1]: https://github.com/evoja/java-commons/compare/checkerframework-run-pom/0.0.0...checkerframework-run-pom/0.0.1
[0.0.1]: https://github.com/evoja/java-commons/tree/checkerframework-run-pom/0.0.1

[0.0.0]: https://github.com/evoja/java-commons/tree/checkerframework-run-pom/0.0.0
