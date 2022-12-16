#!/usr/bin/env groovy

//  Using Parameterized Value, Taking Image name from Jenkinsfile

def call(String imageName) {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-creds', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "docker build -t $imageName ."
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push $imageName"
    }
}


// Used HardCoded Value

// def call() {
//     echo "building the docker image..."
//     withCredentials([usernamePassword(credentialsId: 'docker-creds', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
//         sh 'docker build -t nirdeshkumar02/jenkins-java-app:jma-3 .'
//         sh "echo $PASS | docker login -u $USER --password-stdin"
//         sh 'docker push nirdeshkumar02/jenkins-java-app:jma-3'
//     }
// }
