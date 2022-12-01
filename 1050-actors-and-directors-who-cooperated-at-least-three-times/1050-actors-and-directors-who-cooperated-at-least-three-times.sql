SELECT actor_id,
    director_id
 FROM (SELECT COUNT(actor_id) sum_actor_id,
              COUNT(director_id) sum_director_id,
              actor_id,
              director_id
         FROM ActorDirector
     GROUP BY actor_id, director_id) A
WHERE A.sum_actor_id >= 3  
  AND A.sum_director_id >= 3 