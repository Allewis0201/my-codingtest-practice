-- 코드를 입력하세요
SELECT b.ANIMAL_ID, b.NAME
FROM ANIMAL_INS A
RIGHT JOIN ANIMAL_OUTS b
ON A.ANIMAL_ID = b.ANIMAL_ID
WHERE A.ANIMAL_ID IS NULL