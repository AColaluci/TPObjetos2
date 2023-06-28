create database grupo5bdd;
use grupo5bdd; 
-- Script para agregar usuarios. 
insert into user values(1,null, 1,'$2a$10$yJ1YaUX0efFZV6IKYlQibeSq6tquR2dmtyeOqXgnOb2sGsYAHJrdq',NULL,'ADMIN');
insert into user_role values(1,null, 'ADMIN',null,1);

INSERT INTO dispositivo VALUES(1,1,"pruebadispos");
INSERT INTO dispositivo VALUES(2,0,"ejemplodispos1");
INSERT INTO dispositivo VALUES(3,1,"ejemplodispos2");
INSERT INTO dispositivo VALUES(4,0,"ejemplodispos3");
INSERT INTO dispositivo VALUES(5,0,"ejemplodispos4");
INSERT INTO dispositivo VALUES(6,1,"ejemplodispos5");
INSERT INTO dispositivo VALUES(7,1,"ejemplodispos6");
INSERT INTO dispositivo VALUES(8,1,"ejemplodispos7");
INSERT INTO dispositivo VALUES(9,0,"ejemplodispos8");
INSERT INTO dispositivo VALUES(10,1,"ejemplodispos9");
INSERT INTO dispositivo VALUES(11,1,"ejemplodispos10");

INSERT INTO sensor_luz VALUES ('2023-01-01 08:00:00', '2023-01-01 12:00:00', 1);
INSERT INTO sensor_luz VALUES ('2023-02-15 14:30:00', '2023-02-16 09:45:00', 2);
INSERT INTO sensor_luz VALUES ('2023-03-10 18:20:00', '2023-03-11 07:10:00', 3);
INSERT INTO sensor_luz VALUES ('2023-04-05 09:10:00', '2023-04-05 13:45:00', 4);
INSERT INTO sensor_luz VALUES ('2023-05-20 16:30:00', '2023-05-21 10:20:00', 5);
INSERT INTO sensor_proximidad VALUES ('2023-01-01 08:00:00', '2023-01-01 12:00:00', 0, 6);
INSERT INTO sensor_proximidad VALUES ('2023-02-15 14:30:00', '2023-02-16 09:45:00', 1, 7);
INSERT INTO sensor_proximidad VALUES ('2023-03-10 18:20:00', '2023-03-11 07:10:00', 0, 8);
INSERT INTO sensor_proximidad VALUES ('2023-04-05 09:10:00', '2023-04-05 13:45:00', 1, 9);
INSERT INTO sensor_proximidad  VALUES ('2023-05-20 16:30:00', '2023-05-21 10:20:00', 0, 10);

-- COMANDOS PARA TESTEAR, BUSCAR Y ELIMINAR CUALQUIER COSA SIN DRAMA.
SELECT * FROM sensor_luz sl INNER JOIN dispositivo d WHERE d.id_dispositivo=sl.id_dispositivo;
ALTER TABLE sensor_luz AUTO_INCREMENT = 1;
ALTER TABLE dispositivo AUTO_INCREMENT = 1;
ALTER TABLE sensor_proximidad AUTO_INCREMENT = 1;
DELETE FROM sensor_luz;
DELETE FROM dispositivo;
DELETE FROM sensor_proximidad;
SET SQL_SAFE_UPDATES = 0;
DELETE FROM user_role;
DELETE FROM user;
select * from user;
select * from user_role;


