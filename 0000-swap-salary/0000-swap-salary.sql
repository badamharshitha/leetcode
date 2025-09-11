# Write your MySQL query statement below
update salary 
set sex=CASE
    when sex='m' THEN 'f'
    else 'm'
    END;
