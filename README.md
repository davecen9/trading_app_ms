bank-service-api

current configurations:

port:localhost:8080


two lines needed to add to apigateway service application.properties
zuul.routes.bankservice.path=/api/bankservice/**
zuul.routes.bankservice.serviceId=BANK-SERVICE



vault:
set VAULT_TOKEN=00000000-0000-0000-0000-000000000000
set VAULT_ADDR=http://127.0.0.1:8200


$ vault kv put secret/tradingapp-config tradingapp-config.username=tradingapp tradingapp-config.password=tradingapp


database properties:


db_url=jdbc:mysql://database-mysql.ccxn7kxhpfp4.us-east-1.rds.amazonaws.com:3306/tradingappdb
db_username=tradingapp
db_password=tradingapp
db_driver=com.mysql.jdbc.Driver
