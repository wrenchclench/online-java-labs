package mysql.labs;

/**
 * MySQL Exercise 1:
 *
 *      1.) Import the sakila-db schema and data using the MySQLWorkbench
 *      2.) Execute the following queries and paste the results to make sure the data is imported correctly:
 *          a. SELECT * FROM sakila.actor;
 *          b. SELECT * FROM sakila.actor WHERE first_name = "JULIA";
 *      3.) Write and execute several other select statements with various WHERE clauses
 *      4.) Use a join query to select all actors in the film of your choice
 *      5.) Use a join query to select all the films in the category of your choice that was released before 2006
 *      6.) Create a backup dump file using MySQLWorkbench.
 *
 */



/** JB HOMEWORK

 1 - complete
 2- complete
 3 - SELECT*FROM sakila.film WHERE length = 61;
 4- SELECT first_name,last_name
 FROM actor

 JOIN film_actor

 ON actor.actor_id = film_actor.actor_id
 WHERE film_id = 23;

 5 - SELECT title FROM film
 JOIN film_category
 ON film.film_id = film_category.film_id
 WHERE category_id = 8 AND release_year < 2006;

 6- complete

 **/