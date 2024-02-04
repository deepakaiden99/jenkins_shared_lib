def call() {
   rtUpload (
                serverId: 'artifactory',
                spec: '''{
                      "files": [
                        {
                          "pattern": "*.jar",
                           "target": "java-web-app/"
                        }
                    ]
                }'''
              )
         }