create table Usuarios(
	nombre text, 	
	clave text
);
insert into Usuarios (nombre, clave) values ('Juan', 'Ju2589');

insert into Usuarios values ('Ana', 'AA2255');
insert into Usuarios (nombre) values ('Sofía');

create table articulos(
  codigo integer,
  nombre varchar(50),
  descripcion text,
  precio real,
  cantidad integer
 );
 insert into articulos (codigo, nombre, descripcion, precio,cantidad)
  values (1,'impresora','Epson Stylus C45',400.80,20);
 insert into articulos (codigo, nombre, descripcion, precio,cantidad)
  values (2,'impresora','Epson Stylus C85',500,30);
 insert into articulos (codigo, nombre, descripcion, precio,cantidad)
  values (3,'monitor','Samsung 14',800,10);
 insert into articulos (codigo, nombre, descripcion, precio,cantidad)
  values (4,'teclado','ingles Biswal',100,50);
 insert into articulos values (5,'teclado','español Biswal',90,50);

--select, sirve par leer o seleccionar un conjunto de registros
select * from articulos;
select nombre, precio from articulos;

--where
select * from articulos where nombre = 'impresora'; 
-- operadores relacionales >, <, >=, <=, =, <>
select * from articulos where nombre <> 'impresora';
select * from articulos where cantidad<30;

-- operadores lógicos: and, or, NOT 
select * from articulos where nombre = 'impresora' and cantidad >20;

--delete, borra una o mas registros
select rowid, codigo, nombre, cantidad from articulos; 
--rowid es un campo que se crea automaticamente, de forma autoincremental de
--tipo integer
select * from Usuarios;
delete from Usuarios where nombre = 'Ana';
select rowid, nombre, clave from Usuarios;
delete from Usuarios where rowid = 5;
delete from Usuarios where rowid>4;

select * from articulos;
select rowid, codigo, nombre from articulos;
delete from articulos where rowid = 6 or rowid = 7;
delete from Usuarios; --borra todos los registros de la tabla
--drop
drop table Usuarios; -- borra la tabla usuarios

--update, actualiza uno o mas campos de una tabla
update articulos set cantidad = 50 where codigo = 1;
update articulos set cantidad = cantidad +10 where codigo =3;
update articulos set precio = precio*1.1;

--valores null, por defecto una tabla acepta null en los campos de los registros
create table medicamentos (
	codigo integer not null,
	nombre text not null,
	laboratorio text,
	precio real,
	cantidad integer not null	
); 

insert into medicamentos (codigo,nombre,laboratorio,precio,cantidad)
  values(1,'Sertal gotas',null,null,100); 
insert into medicamentos (codigo,nombre,laboratorio,precio,cantidad)
  values(2,'Sertal compuesto',null,8.90,150);
insert into medicamentos (codigo,nombre,laboratorio,precio,cantidad)
  values(3,'Buscapina','Roche',null,200);
insert into medicamentos values (4, 'Acetaminofén', 'MK',5000,12);
insert into medicamentos (codigo, nombre, cantidad) values (5,'Ibuprofeno',250);
--insert into medicamentos (nombre, cantidad) values ('Fluconazol', 40);
-- esto no se puede por la restriccion de not null
select * from medicamentos;

drop table medicamentos;
create table medicamentos (
	codigo integer not null primary key unique, --cuando la clave primara es de tipo entero se autoincrementa automaticamente
	nombre text not null,
	laboratorio text,
	precio real,
	cantidad integer not null	
);

insert into medicamentos (nombre,laboratorio,precio,cantidad)
  values('Sertal gotas',null,null,100); 
insert into medicamentos (nombre,laboratorio,precio,cantidad)
  values('Sertal compuesto',null,8.90,150);
insert into medicamentos (nombre,laboratorio,precio,cantidad)
  values('Buscapina','Roche',null,200);
insert into medicamentos (nombre, laboratorio, precio, cantidad) 
values ('Acetaminofén', 'MK',5000,12);
insert into medicamentos (codigo,nombre, laboratorio, precio, cantidad)
 values (5,'Fluconzol','MK', 4500, 40);

select * from medicamentos;

--default
create table libros(
	codigo integer primary key,
	titulo text,
	autor text not null default 'desconocido', 
	editorial text,
	precio real,
	cantidad integer default 0
 );

insert into libros (titulo, precio) values ('Algoritmos',500);
insert into libros (titulo,autor,editorial,precio,cantidad)
  values('El aleph','Borges','Planeta',15,100);
 insert into libros (titulo,autor,editorial,precio,cantidad)
  values('Martin Fierro','Jose Hernandez','Emece',22.20,200);

 select * from libros;





