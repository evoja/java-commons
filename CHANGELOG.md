# Change Log of net.evoja.commons:commons

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
#### [Unreleased][unreleased]
##### Changed
* Change compile target and source to `11`

### [0.0.7] - [2022-08-14][c-0.0.7]
##### Added
* [MIT License](./LICENSE)
* [README.md](./README.md) that describes purposes of the project and its submodules
* Dependencies license checking: `licensescan-maven-plugin:2.1`
* License reporting: `license-maven-plugin:2.0.0`

##### Changed
* Upgrade `maven-compiler-plugin` dependency to `3.10.1`
* Upgrade `maven-install-plugin` dependency to `3.0.1`
* Upgrade `maven-dependency-plugin` dependency to `3.3.0`
* Upgrade `maven-deploy-plugin` dependency to `3.0.0`
* Upgrade `maven-surefire-plugin` dependency to `3.0.0-M7`
* Upgrade `junit-jupiter` dependency to `5.9.0`


### [0.0.6] - [2022-01-14][c-0.0.6]
##### Changed
* Stop skipping deployment

##### Removed
* checkerframework version property

##### Added
* Jupiter dependency to `dependencyManagement`


### [0.0.5] - [2022-01-10][c-0.0.5]
##### Added
* [checkerframework-run-pom:0.0.0](checkerframework-run-pom/)

##### Removed
* Remove mentioning of `checkerframework-*` submodules from _dependency management._
They go to [checkerframework-run-pom](checkerframework-run-pom/pom.xml)

##### Added
* Fix version of `maven-dependency-plugin`



### [0.0.4] - 2022-01-10
The top parent of the library that includes distribution settings and group id.

Collection of following sub-modules and their parent:

* [checkerframework-stubs-nullness:0.0.0](checkerframework-stubs-nullness/)
* [checkerframework-stubs-purity:0.0.0](checkerframework-stubs-purity/)
* [checkerframework-stubs-units:0.0.0](checkerframework-stubs-units/)
* [checkerframework-units:0.0.0](checkerframework-units/)


## Modules

Also look at individual module changelogs:

* [checkerframework-run-pom](checkerframework-run-pom/CHANGELOG.md)
* [checkerframework-stubs-nullness](checkerframework-stubs-nullness/CHANGELOG.md)
* [checkerframework-stubs-purity](checkerframework-stubs-purity/CHANGELOG.md)
* [checkerframework-stubs-units](checkerframework-stubs-units/CHANGELOG.md)
* [checkerframework-units](checkerframework-units/CHANGELOG.md)







------------
Changelog file follows [this convention](https://keepachangelog.com/)

[The root CHANGELOG](/CHANGELOG.md)

[unreleased]: https://github.com/evoja/java-commons/compare/commons/0.0.7...master

[c-0.0.7]: https://github.com/evoja/java-commons/compare/commons/0.0.6...commons/0.0.7
[0.0.7]: https://github.com/evoja/java-commons/tree/commons/0.0.7

[c-0.0.6]: https://github.com/evoja/java-commons/compare/commons/0.0.5...commons/0.0.6
[0.0.6]: https://github.com/evoja/java-commons/tree/commons/0.0.6

[c-0.0.5]: https://github.com/evoja/java-commons/compare/commons/0.0.4...commons/0.0.5
[0.0.5]: https://github.com/evoja/java-commons/tree/commons/0.0.5

[0.0.4]: https://github.com/evoja/java-commons/tree/commons/0.0.4
