# 📦 stockserver

## ⚠️ ⚠️ Work in progress 

## Description
Product stock server using DDD architecture with springboot and mongoDB


## API

| Request | Type | Parameters |
| ------------- | ------------- | ------------- |
| /api/product/find  | GET  | <ul><li>id (String): product id to find</li></ul> |
| /api/product/findAll  | GET  | no parameters requires |
| /api/product/create  | POST  | <ul><li>name (String): product name</li><li>stock (Number): product initial stock</li></ul> |
| /api/product/remove  | DELETE  | <ul><li>id (String): product id to remove</li></ul> |