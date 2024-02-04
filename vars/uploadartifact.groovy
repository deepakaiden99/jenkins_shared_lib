def call() {
   rtUpload (
                serverId: 'jf-artifactory',
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