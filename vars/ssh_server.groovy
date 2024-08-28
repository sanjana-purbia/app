def call(Map config){
  sh  "chmod 0400 ${config.key}"
  sh "ssh -i ${config.key} -o StrictHostKeyChecking=no ${config.username}@${config.ip} 'NUMBER=${BUILD_NUMBER} docker-compose -f ./app/docker-compose.yml up -d' "
}
