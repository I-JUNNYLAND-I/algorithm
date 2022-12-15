WITH logs_lag_lead AS (
    SELECT
        id,
        num,
        LAG(num) OVER (ORDER BY id) AS lag_num,
        LEAD(num) OVER (ORDER BY id) AS lead_num
    FROM Logs)

SELECT DISTINCT(num) AS 'ConsecutiveNums'
FROM logs_lag_lead
WHERE num = lag_num AND num = lead_num;