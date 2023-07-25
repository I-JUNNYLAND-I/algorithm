SELECT
    e.name
FROM
    employee e
WHERE
    id IN (
        SELECT
            t.managerId
        FROM
            employee t
        GROUP BY
            t.managerId
        HAVING COUNT(*) >= 5
    );