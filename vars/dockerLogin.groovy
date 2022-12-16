#!/usr/bin/env groovy

// Using Class to pass the value. Docker.groovy from src/com/example is the file from which we are refrencing. 

import com.example.Docker

def call() {
    return new Docker(this).dockerLogin()
}
