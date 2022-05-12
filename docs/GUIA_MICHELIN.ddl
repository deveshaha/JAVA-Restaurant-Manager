CREATE TABLE RESTAURANTES (
	ID	INTEGER PRIMARY KEY AUTOINCREMENT,
	NOMBRE	TEXT NOT NULL UNIQUE,	
	REGION	TEXT NOT NULL,
	CIUDAD	TEXT NOT NULL,
	DISTINCION	INTEGER NOT NULL,
	DIRECCION	TEXT,
	PRECIO_MIN	REAL,
	PRECIO_MAX	REAL,
	COCINA	TEXT,
	TELEFONO	TEXT,	
	WEB	TEXT
);


INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Bardal', 'Andalucía', 'Ronda', 2, 'José Aparicio 1, Ronda, 29400, Spain', 95, 110, 'Creativa', '+34 951 48 98 28', 'www.restaurantebardal.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Noor', 'Andalucía', 'Córdoba', 2, 'Pablo Ruiz Picasso 6, Córdoba, 14014, Spain', 95, 170, 'Creativa', '+34 957 96 40 55', 'www.noorrestaurant.es');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Skina', 'Andalucía', 'Marbella', 2, 'Aduar 12, Marbella, 29601, Spain', 121, 198, 'Moderna', '+34 952 76 52 77', 'www.restauranteskina.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Aponiente', 'Andalucía', 'El Puerto de Santa María', 3, 'Francisco Cossi Ochoa (Molino de Mareas El Caño), El Puerto de Santa María, 11500, Spain', 195, 225, 'Creativa', '+34 956 85 18 70', 'www.aponiente.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Casa Marcial', 'Asturias', 'Arriondas', 2, 'La Salgar, Norte : 4 km, La Salgar, 33549, Spain', 90, 180, 'Creativa', '+34 985 84 09 91', 'www.casamarcial.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Zaranda', 'Islas Baleares', 'Es Capdellà', 2, 'Carretera Ma 1032, km 1,7, es Capdellà, 07196, Spain', 140, 185, 'Creativa', '+34 971 13 86 27', 'www.zaranda.es');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Cenador de Amós', 'Cantabria', 'Villaverde de Pontones', 3, 'Plaza del Sol 15, Villaverde de Pontones, 39793, Spain', 89, 160, 'Moderna', '+34 942 50 82 43', 'www.cenadordeamos.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Annua', 'Cantabria', 'San Vicente de la Barquera', 2, 'Paseo de la Barquera, San Vicente de la Barquera, 39540, Spain', 155, 225, 'Creativa', '+34 942 71 50 50', 'www.annuagastro.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Maralba', 'Castilla - La Mancha', 'Almansa', 2, 'Violeta Parra 5, Almansa, 02640, Spain', 58, 90, 'Creativa', '+34 967 31 23 26', 'www.maralbarestaurante.es');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Angle', 'Cataluña', 'Barcelona', 2, 'Aragó 214, Barcelona, 08011, Spain', 90, 115, 'Moderna', '+34 932 16 77 77', 'www.anglebarcelona.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('ABaC', 'Cataluña', 'Barcelona', 3, 'Avenida del Tibidabo 1, Barcelona, 08022, Spain', 190, 210, 'Creativa', '+34 933 19 66 00', 'www.abacrestaurant.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Lasarte', 'Cataluña', 'Barcelona', 3, 'Mallorca 259, Barcelona, 08008, Spain', 130, 245, 'Creativa', '+34 934 45 32 42', 'www.restaurantlasarte.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('El Celler de Can Roca', 'Cataluña', 'Girona', 3, 'Can Sunyer 48, Girona, 17007, Spain', 160, 215, 'Creativa', '+34 972 22 21 57', 'www.cellercanroca.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Cocina de Hermanos Torres', 'Cataluña', 'Barcelona', '2 ', 'Taquígraf Serra 20, Barcelona, 08029, Spain', 90, 170, 'Creativa', '+34 934 10 00 20', 'www.cocinahermanostorres.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Disfrutar', 'Cataluña', 'Barcelona', '2 ', 'Villarroel 163, Barcelona, 08036, Spain', 155, 195, 'Creativa', '+34 933 48 68 96', 'www.disfrutarbarcelona.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Enoteca', 'Cataluña', 'Barcelona', 2, 'Marina 19, Barcelona, 08005, Spain', 90, 190, 'Moderna', '+34 934 83 81 08', 'www.enotecapacoperez.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Moments', 'Cataluña', 'Barcelona', 2, 'Passeig de Gràcia 38-40, Barcelona, 08007, Spain', 79, 189, 'Creativa', '+34 931 51 87 81', 'www.mandarinoriental.es');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Miramar', 'Cataluña', 'Llançà', 2, 'Passeig Marítim 7, Llançà, 17490, Spain', 100, 190, 'Creativa', '+34 972 38 01 32', 'www.restaurantmiramar.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Les Cols', 'Cataluña', 'Olot', 2, 'Mas Les Cols, Avenida Les Cols 2, Olot, 17800, Spain', 115, NULL, 'Creativa', '+34 972 26 92 09', 'www.lescols.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Atrio', 'Extremadura', 'Cáceres', 2, 'Plaza San Mateo 1, Cáceres, 10003, Spain', 120, 175, 'Creativa', '+34 927 24 29 28', 'www.restauranteatrio.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('DiverXO', 'Madrid', 'Madrid', 3, 'Padre Damián 23, Tetuán, 28036, Spain', 250, NULL, 'Creativa', '+34 915 70 07 66', 'www.diverxo.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Coque', 'Madrid', 'Madrid', '2 ', 'Marqués de Riscal 11, Chamberí, 28010, Spain', 195, 310, 'Creativa', '+34 916 04 02 02', 'www.restaurantecoque.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('DSTAgE', 'Madrid', 'Madrid', 2, 'Regueros 8, Madrid, 28004, Spain', 145, 170, 'Creativa', '+34 917 02 15 86', 'www.dstageconcept.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Ramón Freixa Madrid', 'Madrid', 'Madrid', 2, 'Claudio Coello 67, Retiro, 28001, Spain', 100, 180, 'Creativa', '+34 917 81 82 62', 'www.ramonfreixamadrid.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Santceloni', 'Madrid', 'Madrid', 2, 'Paseo de la Castellana 57, Chamberí, 28046, Spain', 90, 363, 'Creativa', '+34 912 10 88 40', 'www.restaurantesantceloni.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Paco Roncero', 'Madrid', 'Madrid', 2, 'Alcalá 15, Madrid, 28014, Spain', 100, 185, 'Creativa', '+34 915 32 12 75', 'www.pacoroncero.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Cabaña Buenavista', 'Murcia', 'El Palmar', 2, 'Urbanización Buenavista, El Palmar, 30120, Spain', 80, 140, 'Creativa', '+34 968 88 90 06', 'www.cabanabuenavista.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('El Molino de Urdániz', 'Navarra', 'Urdaitz', 2, 'Carretera N 135, Suroeste : 0,5 km, Urdaitz/Urdániz, 31698, Spain', 90, 120, 'Creativa', '+34 948 30 41 09', 'www.elmolinourdaniz.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Akelarre', 'País Vasco', 'Donostia-San Sebastián', 3, 'Paseo del Padre Orcolaga 56 (Barrio de Igueldo), 7,5 km, Donostia-San Sebastián, 20008, Spain', 230, NULL, 'Creativa', '+34 943 31 12 09', 'www.akelarre.net');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Arzak', 'País Vasco', 'Donostia-San Sebastián', 3, 'Avenida Alcalde José Elosegi 273 (Alto de Miracruz), Donostia-San Sebastián, 20015, Spain', 180, 250, 'Creativa', '+34 943 27 84 65', 'www.arzak.es');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Azurmendi', 'País Vasco', 'Larrabetzu', 3, 'Legina Auzoa, Larrabetzu, 48195, Spain', 220, NULL, 'Creativa', '+34 944 55 83 59', 'www.azurmendi.biz');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Martín Berasategui', 'País Vasco', 'Lasarte-Oria', 3, 'Loidi 4, Lasarte, 20160, Spain', 180, 275, 'Creativa', '+34 943 36 64 71', 'www.martinberasategui.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Mugaritz', 'País Vasco', 'Errenteria', 2, 'Aldura Aldea 20-Otzazulueta Baserria, Errenteria, 20100, Spain', 220, NULL, 'Creativa', '+34 943 52 24 55', 'www.mugaritz.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('El Portal', 'La Rioja', 'Ezcaray', 2, 'Padre José García 19, Ezcaray, 26280, Spain', 89, 150, 'Creativa', '+34 941 35 40 47', 'www.echaurren.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('El Poblet', 'Comunidad Valenciana', 'Valencia', 2, 'Correos 8-1º, Valencia, 46002, Spain', 62, 125, 'Creativa', '+34 961 11 11 06', 'www.elpobletrestaurante.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Quique Dacosta', 'Comunidad Valenciana', ' Dénia', 3, 'Rascassa 1 (Urbanización El Poblet), Noroeste : 3 km, Dénia, 03700, Spain', 210, NULL, 'Creativa', '+34 965 78 41 79', 'www.quiquedacosta.es');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('Ricard Camarena', 'Comunidad Valenciana', 'València', 2, 'Avenida de Burjassot 54 (Bombas Gens Centre d’Art), Valencia, 46009, Spain', 68, 155, 'Moderna', '+34 963 35 54 18', 'www.ricardcamarenarestaurant.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('L’Escaleta', 'Comunidad Valenciana', 'Cocentaina', 2, 'Pujada Estació del Nord 205, Cocentaina, 03824, Spain', 50, 125, 'Creativa', '+34 965 59 21 00', 'www.lescaleta.com');
INSERT INTO RESTAURANTES
(NOMBRE, REGION, CIUDAD, DISTINCION, DIRECCION, PRECIO_MIN, PRECIO_MAX, COCINA, TELEFONO, WEB) 
VALUES ('BonAmb', 'Comunidad Valenciana', 'Xàbia', 2, 'Carretera de Benitachell 100, Jávea/Xàbia, 03730, Spain', 70, 135, 'Creativa', '+34 965 08 44 40', 'www.bonamb.com');
