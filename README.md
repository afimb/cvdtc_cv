# CVDTC_CV [![Build Status](https://travis-ci.org/afimb/cvdtc_cv.png)](http://travis-ci.org/afimb/cvdtc_cv?branch=master)
CVDTC_CV is a java project for Validate and convert public transport (PT) data upon different formats: Neptune, NeTEx, GTFS and provides 2 main services:

* convert PT data files between Neptune, NeTEx and GTFS formats
* Validate PT data files from Neptune, NeTEx and GTFS formats

The Conversion and Validation services are provided as Web Services and performed asynchronously.

The CVDTC Web Service API is specified here :
* [Interface Specification Document](./doc/interface/Chouette-API serveur IEV-1.0.pdf)
* inputs and outputs data structures [Jobs](./doc/interface/Jobs.xsd), [Reports](./doc/interface/Reports.xsd)

CVDTC_CV is used by [cvdtc ](https://github.com/afimb/cvdtc), a specific web application to give it's fonctionnality open.

Format documentations are available for:
* Neptune
 * [www.normes-donnees-tc.org](http://www.normes-donnees-tc.org/format-dechange/donnees-theoriques/neptune/)
* NeTEx (experimental local agreement)
 * [www.normes-donnees-tc.org](http://www.normes-donnees-tc.org/format-dechange/donnees-theoriques/netex/)
* GTFS
 * [General Transit Feed Specification Reference](https://developers.google.com/transit/gtfs/reference)
 * [www.normes-donnees-tc.org](http://www.normes-donnees-tc.org/format-dechange/donnees-theoriques/gtfs-correspondance-avec-neptune-et-autres-normes/)

The CVDTC_CV java project is split into modules :

* cvdtc-cv : **REST server (ear)**
* cvdtc.dongle.dao : mock to invalidate database access for chouette exchange modules
* cvdtc.user.checker : implementation for user control

The CVDTC_CV java project uses chouette modules :

* mobi.chouette.common : common classes and interfaces
* mobi.chouette.dao.iev : Dao implementation for iev persistence (EJB)
* mobi.chouette.exchange : Common classes, interfaces and commands for data exchange 
* mobi.chouette.exchange.gtfs : Specific commands for GTFS data exchange and validation 
* mobi.chouette.exchange.neptune : Specific commands for Neptune data exchange and validation 
* mobi.chouette.exchange.netex : Specific commands for NeTEx data exchange 
* mobi.chouette.exchange.validator : Specific commands for common data validation 
* mobi.chouette.exchange.converter : Specific commands for Conversion 
* mobi.chouette.model : JPA entities modelisation for public transport model
* mobi.chouette.model.iev : JPA entities modelisation for iev jobs
* mobi.chouette.persistence.hibernate : Hibernate specific tools
* mobi.chouette.service : Job and tasks managment
* mobi.chouette.ws : REST API implementation

For more information see the [Architecture Documentation](http://www.chouette.mobi/developpeurs/) , in French.

## Release Notes

The CVDTC_CV release notes (in French) can be found in [CHANGELOG](./CHANGELOG.md) file 

## Requirements
 
This code has been run and tested on [Travis](http://travis-ci.org/afimb/cvdtc_cv?branch=master) with : 
* oraclejdk7
* oraclejdk8
* openjdk7
* openjdk8
* postgres 9.3 + postgis 2.1
* wildfly 8.2.0

## Chouette External Dependencies

CVDTC_CV requires Postgresql V9.3 or above

On Debian/Ubuntu/Kubuntu OS : 
```sh
sudo apt-get install postgresql-9.3
sudo apt-get install openjdk-7-jdk 
```

For installation from sources : 
```sh
sudo apt-get install git
sudo add-apt-repository ppa:natecarlson/maven3
sudo apt-get update 
sudo apt-get install maven3
sudo ln -s /usr/share/maven3/bin/mvn /usr/bin/mvn
```
if ```apt-get update``` fails, modify file :
/etc/apt/sources.list.d/natecarlson-maven3-trusty.list
and replace ```trusty``` by ```precise``` 

## Installation

### Prerequisite
 
[Create Postgres user and databases ](./doc/install/postgresql.md) 


### Installation from sources

Get git repository :
```sh
git clone -b V1_0 git://github.com/afimb/cvdtc_cv
cd cvdtc_cv
```

Test :

```sh
mvn test -DskipWildfly
```

Deployment :

change the data storage directory (USER_HOME by default) :
copy properties file [cvdtc.properties](./doc/cvdtc.properties) in /etc/chouette/cvdtc/ directory
change property ```cvdtc.directory``` value to desired directory
change property ```cvdtc.started.jobs.max``` value to limit parallel jobs processing (default = 5)
change property ```cvdtc.copy.by.import.max``` value to limit parallel single line import by import job (default = 5)

[Install and configure Wildfly](./doc/install/wildfly.md) 

deploy ear (wildfly must be running)
```sh
mvn -DskipTests install
```

### Installation from the binaries
download cvdtc_cv.x.y.z.zip from [maven repository](http://maven.chouette.mobi/mobi/chouette/cvdtc_cv)

change the data storage directory (USER_HOME by default)
copy the properties file [cvdtc.properties](./doc/cvdtc.properties) into /etc/chouette/cvdtc/ directory
change the ```cvdtc.directory``` value to the desired directory
change the ```cvdtc.started.jobs.max``` value in order to limit the max number of parallel jobs (default = 5)

[Install and configure Wildfly](./doc/install/wildfly.md) 


in the wildfly installation repository :
```sh
bin/jboss-cli.sh --connect --command="deploy (path to ...)/cvdtc.ear"
```

## More Information
 
An exhaustive technical documentation in French is avalailable [here](http://www.chouette.mobi/developpeurs/)


## License
 
cvdtc_cv is licensed under the CeCILL-B license, a copy of which can be found in the [LICENSE](./LICENSE.md) file.

 
## Support
 
Users looking for support should file an issue on the GitHub [issue tracking page](../../issues), or file a [pull request](../../pulls) if you have a fix available.
