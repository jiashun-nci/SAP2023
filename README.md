## insecure branch (Requires Java 11 )

### Go to insecure folder for more details.
```
cd insecure
```
### start the insecure application if in Windows system
```
mvn spring-boot:run   
```
### start the insecure application if in Linux system
```
./mvnw spring-boot:run   
```

### visit this web link
```
http://localhost:8000
```
### open H2 database
```
http://localhost:8000/h2-console/
```
![image](https://user-images.githubusercontent.com/73401615/227599859-c9ff1f64-3cc9-45ed-86af-e6a4a8b42493.png)

### Insert data by these sql query
```
DROP TABLE IF EXISTS BOOK;
CREATE TABLE BOOK(
id INT AUTO_INCREMENT  PRIMARY KEY,
isbn VARCHAR(13),
name VARCHAR(50),
publishyear VARCHAR(4)
);
```

```
INSERT INTO book (isbn, name) VALUES ('123456333', 'Psalms');
INSERT INTO book (isbn, name) VALUES ('123458888', 'Matthew');
INSERT INTO book (isbn, name) VALUES ('123454444', 'John');
```



### Open postman to do CRUD operations
```
http://localhost:8000/book/ 
http://localhost:8000/book/{id}
```
