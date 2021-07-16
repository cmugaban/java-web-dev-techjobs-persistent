## Part 1: Test it with SQL
id(int, PK)
employer(varchar)
name(varchar)
skills(varchar)


## Part 2: Test it with SQL
SELECT name
FROM employer
WHERE location = "St. Louis City";



## Part 3: Test it with SQL
SET FOREIGN_KEY_CHECKS = 0
DROP TABLE job;
SET FOREIGN_KEY_CHECKS = 1

## Part 4: Test it with SQL

SELECT *
FROM skill
LEFT JOIN job_skills ON skill.id = job_skills.skills.id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;