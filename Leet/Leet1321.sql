WITH daily AS (
    SELECT
        visited_on,
        SUM(amount) AS daily_amount
    FROM Customer
    GROUP BY visited_on
),

moving AS (
    SELECT
        visited_on,
        SUM(daily_amount) OVER (
            ORDER BY visited_on
            ROWS BETWEEN 6 PRECEDING AND CURRENT ROW
        ) AS amount
    FROM daily
)

SELECT
    visited_on,
    amount AS amount,
    ROUND(amount / 7, 2) AS average_amount
FROM moving
WHERE visited_on >= (
    SELECT DATE_ADD(MIN(visited_on), INTERVAL 6 DAY)
    FROM Customer
)
ORDER BY visited_on;
