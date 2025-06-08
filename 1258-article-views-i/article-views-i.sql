# Write your MySQL query statement below
select distinct v1.author_id as id
from views v1, views v2
where v1.article_id =v2.article_id and v2.author_id = v1.viewer_id
order by v1.author_id 
