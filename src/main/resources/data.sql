INSERT INTO CATALOG_CATEGORY VALUES 
    (1,'Oficios Generales','Oficios Generales',1),
    (2,'Cuidado Personal','Cuidado Personal',1),
    (3,'Automotriz','Automotriz',1),
    (4,'Cuidado de Mascota','Cuidado de Mascota',1),
    (5,'Limpieza','Limpieza',1),
    (6,'Deportes','Deportes',1),
    (7,'Eventos','Eventos',1),
    (8,'Otros','Otros',1);

INSERT INTO CATALOG_EMPLEO VALUES 
    (1,'Carpinteros',1,'Carpinteros',1),
    (2,'Plomero',1,'Plomero',1),
    (3,'Electricista',1,'Electricista',1),
    (4,'Aire Acondicionado/Refrigedadores',1,'Aire Acondicionado/Refrigedadores',1),
    (5,'Calentador Solar',1,'Calentador Solar',1),
    (6,'Albanil',1,'Albanil',1),
    (7,'Pintor',1,'Pintor',1),
    (8,'Jardinero',1,'Jardinero',1),
    (9,'Estilista',2,'Estilista',1),
    (10,'Pedicurisca/Podologo',2,'Pedicurisca/Podologo',1),
    (11,'SPA',2,'SPA',1),
    (12,'Mecanico',3,'Mecanico',1),
    (13,'Mecanico Electrico',3,'Mecanico Electrico',1),
    (14,'Llantero',3,'Llantero',1),
    (15,'Limpieza de Automovil',3,'Limpieza de Automovil',1),
    (16,'Veterinario',4,'Veterinario',1),
    (17,'Estetica para mascota',4,'Estetica para mascota',1),
    (18,'Limpieza negocios',5,'Limpieza negocios',1),
    (19,'Ayuda Domestica',5,'Ayuda Domestica',1),
    (20,'Limpieza de Automovil',5,'Limpieza de Automovil',1),
    (21,'Instructor en alguna diciplina',6,'Instructor en alguna diciplina',1),
    (22,'Meseros',7,'Meseros',1),
    (23,'Cocinero',7,'Cocinero',1),
    (24,'Entretenimiento',7,'Entretenimiento',1),
    (25,'Sastreria',8,'Sastreria',1),
    (26,'Asitente Admistrativa',8,'Asitente Admistrativa',1),
    (27,'Apoyo a Eduacion en Casa',8,'Apoyo a Eduacion en Casa',1),
    (28,'Guaderia en Casa',8,'Guaderia en Casa',1);

INSERT INTO CATALOG_SKILL VALUES 
    (1,'Muebles','Muebles',1,1),
    (2,'Closets','Closets',1,1),
    (3,'Cocina','Cocina',1,1),
    (4,'General','General',2,1),
    (5,'Lampara','Lampara',3,1),
    (6,'Television','Television',3,1),
    (7,'Red Electrica','Red Electrica',3,1),
    (8,'Electrodomesticos','Electrodomesticos',3,1),
    (9,'Otros/Varios','Otros/Varios',3,1),
    (10,'Construccion','Construccion',6,1),
    (11,'Mantenimiento','Mantenimiento',6,1),
    (12,'Remodelaciones','Remodelaciones',6,1),
    (13,'Exterior','Exterior',7,1),
    (14,'Interior','Interior',7,1),
    (15,'impermeabilizante','impermeabilizante',7,1),
    (16,'Cortar Cesped','Cortar Cesped',8,1),
    (17,'Plantas/Arboles','Plantas/Arboles',8,1),
    (18,'Corte Cabello','Corte Cabello',9,1),
    (19,'Gelish','Gelish',9,1),
    (20,'Tinte','Tinte',9,1),
    (21,'Otros','Otros',9,1),
    (22,'Uñas','Uñas',10,1),
    (23,'Pies','Pies',10,1),
    (24,'Otros/Varios','Otros/Varios',10,1),
    (25,'Masajes de Presion','Masajes de Presion',11,1),
    (26,'Cuidado Facial','Cuidado Facial',11,1),
    (27,'Otros/Varios','Otros/Varios',11,1);

INSERT INTO PROVIDER VALUES(1,12, 'Gegrorio','M','Gonzales', '/images/profile/1');
INSERT INTO SKILL_PROVIDER values(1,1);
INSERT INTO PROVIDER VALUES(2,18, 'Sagrario', 'M', 'Manrique', '/images/profile/2');
INSERT INTO SKILL_PROVIDER values(1,2);
INSERT INTO SKILL_PROVIDER values(2,2);
INSERT INTO SKILL_PROVIDER values(3,2);
INSERT INTO PROVIDER VALUES(3,21, 'Maria Eugenia', 'F', 'Tirado', '/images/profile/3');
INSERT INTO SKILL_PROVIDER values(4,3);
INSERT INTO PROVIDER VALUES(4,34, 'Maria Araceli', 'F', 'Carreras', '/images/profile/4');
INSERT INTO SKILL_PROVIDER values(5,4);
INSERT INTO SKILL_PROVIDER values(6,4);
INSERT INTO SKILL_PROVIDER values(7,4);
INSERT INTO SKILL_PROVIDER values(8,4);
INSERT INTO SKILL_PROVIDER values(9,4);
INSERT INTO PROVIDER VALUES(5,24, 'Francisco Xavier', 'M', 'Mejias', '/images/profile/5');
INSERT INTO SKILL_PROVIDER values(10,5);
INSERT INTO SKILL_PROVIDER values(11,5);
INSERT INTO SKILL_PROVIDER values(12,5);
INSERT INTO PROVIDER VALUES(6,22, 'Ines Maria', 'F', 'Valle', '/images/profile/6');
INSERT INTO SKILL_PROVIDER values(13,6);
INSERT INTO SKILL_PROVIDER values(14,6);
INSERT INTO SKILL_PROVIDER values(15,6);
INSERT INTO PROVIDER VALUES(7,35, 'Marcela', 'F', 'Tenar', '/images/profile/7');
INSERT INTO SKILL_PROVIDER values(16,7);
INSERT INTO SKILL_PROVIDER values(17,7);
INSERT INTO PROVIDER VALUES(8,23, 'Reyes', 'F', 'Cardenas', '/images/profile/8');
INSERT INTO SKILL_PROVIDER values(18,8);
INSERT INTO SKILL_PROVIDER values(19,8);
INSERT INTO SKILL_PROVIDER values(20,8);
INSERT INTO SKILL_PROVIDER values(21,8);
INSERT INTO PROVIDER VALUES(9,19, 'Maria', 'F', 'Reyes De-La-Fuente', '/images/profile/9');
INSERT INTO SKILL_PROVIDER values(22,9);
INSERT INTO SKILL_PROVIDER values(23,9);
INSERT INTO SKILL_PROVIDER values(24,9);
INSERT INTO PROVIDER VALUES(10,41, 'Carlos Antonio', 'M', 'Piñeiro', '/images/profile/10');
INSERT INTO SKILL_PROVIDER values(25,10);
INSERT INTO SKILL_PROVIDER values(26,9);
INSERT INTO SKILL_PROVIDER values(27,9);

