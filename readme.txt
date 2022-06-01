export GRAALVM_HOME=/mnt/data1/software/graal/graalvm-ce-java17-22.0.0.2
export JAVA_HOME=/usr/lib/jvm/java-1.17.0-openjdk-amd64

./mvnw clean package -Pnative

$JAVA_HOME/bin/java -jar target/demo-0.0.1-SNAPSHOT-exec.jar
./target/demo


org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'demoApplication':
  Unsatisfied dependency expressed through field 'inner2'; nested exception is org.springframework.beans.factory.BeanCreationException:
  Error creating bean with name 'demo2Configuration.Demo2InnerConfiguration': Instantiation of supplied bean failed;
  nested exception is java.lang.IllegalArgumentException: Constructor with parameter types [com.example.demo.Demo1Configuration$Inner1]
  cannot be found on com.example.demo.Demo2Configuration$Demo2InnerConfiguration


  {
    "name": "com.example.demo.Demo2Configuration$Demo2InnerConfiguration",
    "queriedMethods": [
      {
        "name": "<init>",
        "parameterTypes": [
          "com.example.demo.Demo1Configuration.Inner1"
        ]
      },
      {
        "name": "inner2",
        "parameterTypes": [ ]
      }
    ]
  },
