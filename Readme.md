Jenkins Shared Library
===========================
Jenkins Shared Library is a way to integrate the common logic all over the pipelines just by giving refrence of shared library. 
It is an extension to pipeline and written in groovy.

1. Create a repository for jenkins shared library where you have common code.
2. Make It available to jenkins so that you can retreive it to multiple pipeline at locaton 
    `Jenkins UI -> Manage Jenkins -> Manage System ->  Global Pipeline Libraries`
3. Now Use Shared Library to Jenkinsfile by importing
    `@Library('name given during adding jenkins shared library to jenkins')`
