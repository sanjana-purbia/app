def call(Map config){
  sh  ' chmod 0400 task.pem'
  sh 'ssh -i task.pem -o StrictHostKeyChecking=no ${config.username}@${config.ip} "NUMBER=${BUILD_NUMBER} docker-compose -f ./app/docker-compose.yml up -d" '
}
