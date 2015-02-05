This is an archetype to quickly create a JavaEE web project for TomEE.

##Features
- The generated project has a single dependency for the whole Java EE 6 web profile API. This covers, web, EJB, JAX-RS etc.
- Certain XML files are added to WEB-INF for JAX-RS to work correctly in Tomee.

The generated WAR file is fairly standard compliant and you should be 
deploy it to any Java EE 6 web container.

##Install the Archetype
```
git clone https://github.com/bibhas2/TomEEArchetype.git
cd TomEEArchetype
mvn install
```

##Generate a New Web Project

```
mvn -B archetype:generate -DarchetypeArtifactId=tomee-archetype \
  -DarchetypeGroupId=com.mobiarch \
  -DarchetypeVersion=1.0 \
  -DgroupId=com.mycompany.app \
  -DartifactId=MyWeb
  -Dversion=1.0
```

The generated project is ready to run. Let's say that the artifact ID (or project name) is MyWeb. 
Then:

```
cd MyWeb
mvn package
```

Deploy target/MyWeb.war in TomEE or JBoss. Then test the URL:

```
curl http://localhost:8080/MyWeb/hello
```
