# SAP2023
## main branch

## docker commands.
### 1. provide a command that will create a docker network.
```
docker network create mysql
```
### 2. Provide a command that will run a mysql:latest docker image with the name of db with a root password=my-secret-password.
```
docker run --name db --network mysql -e MYSQL_ROOT_PASSWORD=my-secret-password -d mysql:latest

```
### 3. Provide a command that will run the docker image phpmyadmin/phpmyadmin on the network previously created mapping a port of your choice to port 80 of the container
```
docker run --name phpmyadmin --network mysql -p 3001:80 -d phpmyadmin/phpmyadmin

```