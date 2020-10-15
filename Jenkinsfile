pipeline {
	agent any
	
	tools {
		maven 'Maven-3.6.3'
	}
	
	stages {
	
		stage('compile') {
			echo "---- clean compile ----"
			sh "mvn clean compile"
		}
		
		
	}
}