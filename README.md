## insecure branch

### Go to insecure folder for more details.
```
cd insecure
```
### open H2 database
```
http://localhost:8000/h2-console/
```
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

### start the insecure application
```
mvn spring-boot:run
```

### visit this web link
```
http://localhost:8000
```

### Open postman to do CRUD operations
```
http://localhost:8000/book/ 
http://localhost:8000/book/{id}
```
