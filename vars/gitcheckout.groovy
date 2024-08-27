def call() {
 sh 'checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'github', url: 'https://github.com/sanjana-purbia/app.git']])'
}
