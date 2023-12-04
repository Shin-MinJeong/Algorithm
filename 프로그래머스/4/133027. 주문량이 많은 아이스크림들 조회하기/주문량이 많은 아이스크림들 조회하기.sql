SELECT FLAVOR
FROM (
        SELECT A.FLAVOR, SUM(A.TOTAL_ORDER + B.TOTAL_ORDER_SUM) AS RESULT
        FROM FIRST_HALF A
        ,(
            SELECT FLAVOR, SUM(TOTAL_ORDER) AS TOTAL_ORDER_SUM
            FROM JULY
            GROUP BY FLAVOR
        ) B 
        WHERE A.FLAVOR = B.FLAVOR
        GROUP BY A.FLAVOR
        ORDER BY RESULT DESC
)
WHERE ROWNUM <= 3;