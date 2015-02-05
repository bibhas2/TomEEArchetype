This is an archetype to quickly create a JavaEE web project for TomEE.

##Install the Archetype
```
git clone https://github.com/bibhas2/TomEEArchetype.git
cd TomEEArchetype
mvn install
```

##Generate a New Pink Based Web Project

```
mvn archetype:generate -DarchetypeArtifactId=tomee-archetype \
  -DarchetypeGroupId=com.mobiarch \
  -DarchetypeVersion=1.0 \
  -DgroupId=com.mycompany.app \
  -DartifactId=MyWeb
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
