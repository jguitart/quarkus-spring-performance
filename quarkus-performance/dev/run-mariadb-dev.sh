#!/bin/bash

docker run --rm --name quarkus-performance-db -d \
  -e MARIADB_ROOT_PASSWORD=root \
  -e MARIADB_USER=quarkus \
  -e MARIADB_PASSWORD=quarkus \
  -e MARIADB_DATABASE=quarkus \
  -p 3316:3306 \
  mariadb:latest