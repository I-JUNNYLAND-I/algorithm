# Write your MySQL query statement below
SELECT
    id,
    CASE WHEN id%2!=0 THEN COALESCE(A.nextStudent, A.student)
        WHEN id%2=0 THEN COALESCE(A.prevStudent, A.student)
    END AS student
FROM
(
    SELECT
        id,
        student,
        LAG(student) OVER(ORDER BY id) prevStudent,
        LEAD(student) OVER(ORDER BY id) nextStudent
    FROM Seat
) A;