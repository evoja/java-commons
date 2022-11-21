# Evoja Java commons

### The root

	net.evoja.commons:commons | pom

It's the top parent for my POM modules:
* it defines _target_ and _source_ Java version and the source encoding (UTF-8).
* Declares common dependencies such as:
	* unit testing engine (junit-jupiter)
* Declares common plugins such as:
	* maven-dependency-plugin
	* maven-compiler-plugin
	* maven-surefire-plugin
	* maven-install-plugin
	* maven-deploy-plugin
	* Dependencies license checking: licensescan-maven-plugin
	* License reporting: license-maven-plugin

Intermediately inherited by:
* `checkerframework-run-pom`

Inherited by:
* `checkerframework-stubs-nullness`
* `checkerframework-stubs-purity`
* `checkerframework-stubs-units`



### checkerframework-run-pom

	net.evoja.commons:checkerframework-run-pom | pom | <- net.evoja.commons:commons

It is a common parent for my projects. The main purpose of it is configuring [the Checker Framework plugin](https://checkerframework.org/manual/):

* it specifies the version of the Checker Framework and declares it as a common dependency.
* in `dependencyManagement` it specifies versions of Checker Framework modules,
	which can be used by children.
* it provides distribution of `astub` type declaration by configuring `maven-dependency-plugin`.
* it sets up checkers by adding annotation processors to `maven-compiler-plugin` and configuring them.
* declares an alternative "purity-strict" profile that checks for Purity.
	These configs are made optional because they can produce too many warnings.

Intermediately inherited by:
* net.evoja.commons-priv:commons

Inherited by:
* checkerframework-units


### checkerframework-stubs-nullness

	net.evoja.commons:checkerframework-stubs-nullness | jar | <- net.evoja.commons:commons


This module declares _nullness_ annotations of some popular Java classes
and distributes is as `*.astub` files.

Currently, it only declares:

* `org.springframework.context.MessageSource`:
	* `getMessage(code, args, defaultMessage, locale)`
	* `getMessage(code, args, locale)`
	* `getMessage(resolvable, locale)`


### checkerframework-stubs-purity

	net.evoja.commons:checkerframework-stubs-purity | jar | <- net.evoja.commons:commons

This module declares _purity_ annotations of some popular Java classes
and distributes is as `*.astub` files.

Currently, it only declares:

* `java.lang.System.currentTimeMillis()`
* some methods of `java.util.Base64`, `java.util.Base64.Decoder`, `java.util.Base64.Encoder`
* some methods of `org.apache.commons.lang3.StringUtils`



### checkerframework-stubs-units

	net.evoja.commons:checkerframework-stubs-units | jar | <- net.evoja.commons:commons

This module declares _units_ (such as _ms_, _kg_, _km_, etc.) annotations of some popular Java classes
and distributes is as `*.astub` files.

Currently, it only declares:

* `java.lang.System.currentTimeMillis()`
