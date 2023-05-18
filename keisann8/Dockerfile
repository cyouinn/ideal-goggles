FROM mysql:latest

ENV MYSQL_ROOT_PASSWORD your_password

COPY ./mysql-scripts /docker-entrypoint-initdb.d/

EXPOSE 3306
