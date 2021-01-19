pipeline{
  agent any
  stages{
    stage("build"){
      steps{
        sh "mvn install"
       }
    }
    stage("deploy"){
      steps{
        //sh "docker build -t docker_demo1 . &&docker container rm docker_demmo &&docker run --name docker_demmo -p 8081:8080 docker_demo1"
        sh "docker container rm docker_demmo_docker_compose -f &&docker-compose up -d"
      }
    }
  }
}
