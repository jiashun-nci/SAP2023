## secure branch


## Development

Before you can build this project, you must install and configure the following dependencies on your machine:

```
npm install
```

We use npm scripts and [Webpack][] as our build system.

Run the following command to start

```
cd secure
./mvnw
```
Open web broswer
```
http://localhost:8080
```

## Production
## Run Secure Application with docker:(require docker & docker-compose preinstalled)
### pull prebuild image
```
docker pull jiashundoc/library:latest
```   

### download app.yml for docker-compose
```
wget https://raw.githubusercontent.com/jiashun-nci/SAP2023/secure/app.yml
```
### run application with docker-compose
```
docker-compose -f ./app.yml up
```
Open web broswer
```
http://localhost:8080
```

visit http://loclahost:8080

