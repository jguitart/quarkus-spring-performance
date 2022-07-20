#!/bin/bash

docker run --rm --name spring-performance-db -d \
  -e MARIADB_ROOT_PASSWORD=root \
  -e MARIADB_USER=spring \
  -e MARIADB_PASSWORD=spring \
  -e MARIADB_DATABASE=spring \
  -p 3326:3306 \
  mariadb:latest