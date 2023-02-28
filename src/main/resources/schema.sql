CREATE TABLE Coches(
id SERIAL PRIMARY KEY,
carroceria TEXT,
combustible TEXT,
plazas INT,
precio TEXT )

CREATE TABLE Ciudad(
id SERIAL PRIMARY KEY,
rango INT, nombre TEXT )

CREATE TABLE Marca(
id SERIAL PRIMARY KEY,
modelo TEXT,
unidades INT)

CREATE TABLE Vendedor(
id SERIAL PRIMARY KEY,
profesional TEXT,
particular TEXT)