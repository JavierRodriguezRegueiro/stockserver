# 📦 stockserver

## ⚠️ ⚠️ Work in progress 

## Description
Product stock server using DDD architecture with springboot and mongoDB


## API

| Request | Type | Parameters |
| ------------- | ------------- | ------------- |
| / find  | GET  | <ul><li>id (String): product id to find</li></ul> |
| / findAll  | GET  | no parameters requires |
| / create  | POST  | <ul><li>name (String): product name</li><li>stock (Number): product initial stock</li></ul> |
| / removeProduct  | DELETE  | <ul><li>id (String): product id to remove</li></ul> |