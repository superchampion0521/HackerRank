/*
Enter your query here.
*/
SET @TEMP:=21; 
SELECT REPEAT('* ', @TEMP:= @TEMP - 1) 
FROM INFORMATION_SCHEMA.TABLES;
