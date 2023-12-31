SELECT I.ANIMAL_ID
     , I.ANIMAL_TYPE
     , I.NAME
FROM
(   SELECT ANIMAL_ID
         , ANIMAL_TYPE
         , NAME
    FROM ANIMAL_INS 
    WHERE SEX_UPON_INTAKE = 'Intact Male' OR SEX_UPON_INTAKE = 'Intact Female'
) I
, ANIMAL_OUTS O
WHERE I.ANIMAL_ID = O.ANIMAL_ID
  AND (O.SEX_UPON_OUTCOME = 'Neutered Male' OR O.SEX_UPON_OUTCOME = 'Spayed Female')

