node('master'){
stage('initialize'){
checkout scm
}
stage('compile'){
sh '''
mvn compile
'''
}
stage('unittest'){
sh'''
mvn test
'''
}
stage('reports'){
cucumber fileIncludePattern: '**/*.json', jsonReportDirectory: 'E:\\Cucumber_Naveen\\cucumber\\target\\cucumber-reports', sortingMethod: 'ALPHABETICAL'
}
}