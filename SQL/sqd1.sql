-- CREATE DATABASE moktan;
-- USE moktan;
-- CREATE TABLE family (
-- 	mem_id INT PRIMARY KEY,
-- 	f_name VARCHAR(50),
--     l_name VARCHAR(50),
--     p_num VARCHAR(50),
--     b_day DATETIME
-- );

-- ALTER TABLE family ADD age INT;

-- SELECT * FROM family;

SELECT current_user, current_database(), version();