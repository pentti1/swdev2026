README.md
# Käynnistys

## 1. Build
mvn clean package

## 2. Käynnistä
docker-compose up --build

## 3. Testaa
GET http://localhost:8080/api/students
POST http://localhost:8080/api/students


Testiesimerkki
curl -X POST http://localhost:8080/api/students \
  -H "Content-Type: application/json" \
  -d '{"name":"Matti"}'