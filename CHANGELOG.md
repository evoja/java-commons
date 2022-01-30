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
##### Added
* MIT License

#### Changed
* Upgrade `maven-compiler-plugin` dependency to `3.9.0`


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

* [checkerframework-stubs-nullness](checkerframework-stubs-nullness/CHANGELOG.md)
* [checkerframework-stubs-purity](checkerframework-stubs-purity/CHANGELOG.md)
* [checkerframework-stubs-units](checkerframework-stubs-units/CHANGELOG.md)
* [checkerframework-units](checkerframework-units/CHANGELOG.md)







------------
Changelog file follows [this convention](https://keepachangelog.com/)

[The root CHANGELOG](/CHANGELOG.md)

[unreleased]: https://github.com/evoja/java-commons/compare/commons/0.0.6...master

[c-0.0.6]: https://github.com/evoja/java-commons/compare/commons/0.0.5...commons/0.0.6
[0.0.6]: https://github.com/evoja/java-commons/tree/commons/0.0.6

[c-0.0.5]: https://github.com/evoja/java-commons/compare/commons/0.0.4...commons/0.0.5
[0.0.5]: https://github.com/evoja/java-commons/tree/commons/0.0.5

[0.0.4]: https://github.com/evoja/java-commons/tree/commons/0.0.4
