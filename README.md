# Examen Spring Boot

Se realiza la respectiva creación de cada una de las entidades correspondientes Se crearon las 11 entidades Y se eligió Farmacy como entidad como respondiente para El CRUD.

#### Endpoints

##### GetAll

http://localhost:8080/farmacy/getAll

##### Create

http://localhost:8080/farmacy/create

##### Delete

http://localhost:8080/farmacy/delete/{id}

##### GetById

http://localhost:8080/farmacy/getById/{id}

##### Update

http://localhost:8080/farmacy/update/{id}

Informacion necesaria para la base de datos: 

```sql
INSERT INTO country(name) VALUES ('Colombia');
INSERT INTO region(name, country_id) VALUES ('Santander', 1);
INSERT INTO city(name, region_id) VALUES ('Bucaramanga', 1);
```

##### JSON CREATE

json ejemplo para la creacion de alguna farmacia

```json
{
    "name": "la rebaja",
    "address": "Carrera 5 #17-24",
    "lon": 8.1,
    "lat": 8.3,
    "logoFarmacy": "andjsajdha",
    "city_id": 1
  }
```

