# Leetcode 178. Rank Scores
# https://leetcode.com/problems/rank-scores/description/


select score, (select count(*) from (select distinct Score s from scores) _ where s >= Score) Rank
from Scores
order by Score desc