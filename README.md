# Evoja Java commos

### The root

|artifact| packaging |
|---|---|
|net.evoja.commons:commons | pom |

It's the top parent for my POM modules.

It defines _target_ and _source_ Java version and the souce encoding (UTF-8).

It declares GitHub maven repositories for distribution.

Declares common dependencies such as:
* unit testing engine (junit-jupiter)

Declares common plugins such as:
* maven-dependency-plugin
* maven-compiler-plugin
* maven-surefire-plugin
* maven-install-plugin
* maven-deploy-plugin
* Dependencies license checking: licensescan-maven-plugin
* License reporting: license-maven-plugin

Inherited by:
* checkerframework-run-pom

Used by:
* checkerframework-stubs-nullness
* checkerframework-stubs-purity
* checkerframework-stubs-units



### checkerframework-run-pom

|artifact| packaging | parent |
|---|---|---|
|net.evoja.commons:checkerframework-run-pom | pom | net.evoja.commons:commons |

It is a common parent for my projects.
The main purpose of it is configuring [the Checker Framework plugin](https://checkerframework.org/manual/).

It specifies the version of the Checker Framework and declares it as a common dependency.

In `dependencyManagement` it specifies versions of Checker Framework modules,
which can be used by children.

It provides distribution of `astub` type declaration by configuring `maven-dependency-plugin`.

It sets up checkers by adding annotation processors to `maven-compiler-plugin` and configuring them.

Declares an alternative "purity-strict" profile that checks for Purity.
These configs are made optional because they can produce too many warnings.

Inherited by:
*

Used by:
* checkerframework-units


### checkerframework-stubs-nullness
|artifact| packaging | parent |
|---|---|---|
|net.evoja.commons:checkerframework-stubs-nullness | jar | net.evoja.commons:commons |


This module declares _nullness_ annotations of some popular Java classes
and distributes is as `*.astub` files.

Currently, it only declares:

* `org.springframework.context.MessageSource`:
	* `getMessage(code, args, defaultMessage, locale)`
	* `getMessage(code, args, locale)`
	* `getMessage(resolvable, locale)`

Used by:
*

### checkerframework-stubs-purity

|artifact| packaging | parent |
|---|---|---|
|net.evoja.commons:checkerframework-stubs-purity | jar | net.evoja.commons:commons |

This module declares _purity_ annotations of some popular Java classes
and distributes is as `*.astub` files.

Currently, it only declares:

* `java.lang.System.currentTimeMillis()`
* some methods of `java.util.Base64`, `java.util.Base64.Decoder`, `java.util.Base64.Encoder`
* some methods of `org.apache.commons.lang3.StringUtils`

Used by:
*


### checkerframework-stubs-units

|artifact| packaging | parent |
|---|---|---|
|net.evoja.commons:checkerframework-stubs-units | jar | net.evoja.commons:commons |

This module declares _units_ (such as _ms_, _kg_, _km_, etc.) annotations of some popular Java classes
and distributes is as `*.astub` files.

Currently, it only declares:

* `java.lang.System.currentTimeMillis()`

Used by:
*


### checkerframework-units

|artifact| packaging | parent |
|---|---|---|
|net.evoja.commons:checkerframework-units | jar | net.evoja.commons:checkerframework-run-pom |
