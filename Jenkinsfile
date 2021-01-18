pipeline{
  agent any
  stages{
    stage("build"){
      sh "mvn install"
    }
    stage("deploy"){
      sh "docker build -t docker_demo1 . &&docker container rm docker_demmo &&docker run --name docker_demmo -p 8081:8080 docker_demo1"
    }
  }
}
