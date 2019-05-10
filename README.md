# Backend Developer Interview Questions
### A  REST, or rather RESTful application
* Watching movies is a good way to spend some recreational time and you would like to develop a small service where you and your friends can register themselves and review various movies and series that you have watched.
1. Spring boot 2
2. Java 8
3. PostgreSQL database
4. Maven 3

## set up the dabase as showb below
### user PSQL tool 
* create user movies_user with password 'movies_pass';
* alter role movies_user with createdb;
* create database moviesdb; 
* grant all privileges on database moviesdb to movies_user; 
* alter database moviesdb owner to movies_user;
