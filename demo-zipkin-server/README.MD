## RABBIT 异步收集
set RABBIT_ADDRESSES=localhost
java -jar zipkin.jar

## es存储 java -jar zipkin.jar  --STORAGE_TYPE=elasticsearch --DES_HOSTS=http://localhost:9200

set RABBIT_ADDRESSES=localhost
set STORAGE_TYPE=elasticsearch 
ES_HOSTS=http://localhost:9200
java -jar zipkin.jar 
