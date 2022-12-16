#!/usr/bin/env groovy

def call() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-creds', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t nirdeshkumar02/jenkins-java-app:jma-3 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push nirdeshkumar02/jenkins-java-app:jma-3'
    }
}

// import com.example.Docker

// def call(String imageName) {
//     return new Docker(this).buildDockerImage(imageName)
// }
