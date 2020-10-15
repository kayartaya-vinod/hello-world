pipeline {
	agent any
	
	tools {
		maven 'Maven-3.6.3'
	}
	
	stages {
	
		stage('compile') {
			steps {
			    echo "---- clean compile ----"
           		sh "mvn clean compile"
            }
		}
		
		stage('Unit tests') {
            steps {
                echo "---- execute unit tests ----"
                sh "mvn test org.jacoco:jacoco-maven-plugin:report"
                junit 'target/surefire-reports/*.xml'
                jacoco execPattern: 'target/jacoco.exec'
            }
        }

        stage('Package') {
            steps {
                echo "---- packaging project ----"
                sh "mvn package -DskipTests"
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
	}
}