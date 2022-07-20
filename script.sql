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
	codigo integer primary key, -- clave primaria que se declara con integer se autoincrementa 
	titulo text,
	autor text not null default 'desconocido', 
	editorial text,
	precio real,
	cantidad integer default 0
	--primary key (codigo)descripcion
 );

insert into libros (titulo, precio) values ('Algoritmos',500);
insert into libros (titulo,autor,editorial,precio,cantidad)
  values('El aleph','Borges','Planeta',15,100);
 insert into libros (titulo,autor,editorial,precio,cantidad)
  values('Martin Fierro','Jose Hernandez','Emece',22.20,200);

 select * from libros;

-- columnas calculadas
select * from articulos;
select descripcion, precio, cantidad, precio*cantidad as VALOR_TOT
from articulos;
select descripcion ||'-'||precio||'-'||cantidad as DESCRIPCION_GEN
from articulos;

-- order by
select * from articulos order by cantidad;
select * from articulos order by cantidad desc, descripcion;

insert into libros (titulo,autor,editorial,precio,cantidad)
  values('Antologia poetica','Borges','Planeta',40,150);
 insert into libros (titulo,autor,editorial,precio,cantidad)
  values('Aprenda PHP','Mario Molina','Emece',18.20,200);
 insert into libros (titulo,autor,editorial,precio,cantidad)
  values('Cervantes y el quijote','Borges','Paidos',36.40,100);
 insert into libros (titulo,autor,editorial,precio,cantidad)
  values('Manual de PHP', 'J.C. Paez', 'Paidos',30.80,100);
 insert into libros (titulo,autor,editorial,precio,cantidad)
  values('Harry Potter y la piedra filosofal','J.K. Rowling','Paidos',45.00,500);
 insert into libros (titulo,autor,editorial,precio,cantidad)
  values('Harry Potter y la camara secreta','J.K. Rowling','Paidos',46.00,300);
 insert into libros (titulo,autor,editorial,precio,cantidad)
  values('Alicia en el pais de las maravillas','Lewis Carroll','Paidos',null,50);

select * from libros;
select codigo, titulo, autor, editorial from libros order by editorial, titulo;
select codigo, titulo from libros order by 2;

--between, rango con límites incluidos
select *
from libros
where precio >= 0 and precio<=30;

select *
from Libros
where precio BETWEEN 0 and 30;

--IN
select *
from libros
where autor ='Borges' or autor = 'Mario Molina' or autor ='Jose Hernandez';

select *
from libros
where autor in ('Borges', 'Mario Molina','Jose Hernandez');

select *
from libros
where autor not in('Borges', 'Mario Molina', 'Jose Hernandez');

--is null, is not null
select * from libros where editorial is null;
select * from libros where editorial is not null;

--like y not like, compara cadenas o subcadenas
select * from libros where titulo like '%Potter%';
select * from libros where autor like 'B%';

--funciones agregadas: count, sum, max, min, avg
select * from libros;
select count(*) from libros;
select count(editorial) from libros; -- count no cuenta los valores null
select sum(cantidad) from libros;
select count(*) from libros where editorial = 'Planeta';

--group by

select editorial, count(*)
from libros
group by editorial;

select autor, count(*)
from libros
group by autor;

-- having, es como un where perose puede aplicar a las funciones agregadas
select autor, count(*)
from libros
group by autor 
having COUNT(*)>1; 

--join
drop table libros;
create table libros(
	codigo integer primary key,
	titulo text,
	autor text, 
	precio real,
	codigoeditorial integer,
	foreign key (codigoeditorial) references editoriales(codigo)
);
create table editoriales(
	codigo integer primary key,
	nombre text
);
insert into editoriales(nombre) values('Planeta');
 insert into editoriales(nombre) values('Emece');
 insert into editoriales(nombre) values('Siglo XXI');

insert into libros (titulo, autor, codigoeditorial, precio)
  values('El aleph', 'Borges', 2, 34);
 insert into libros (titulo, autor, codigoeditorial, precio)
  values('Antología poética', 'Borges', 1, 39.50);
 insert into libros (titulo, autor, codigoeditorial, precio)
  values('Java en 10 minutos', 'Mario Molina', 1, 50.50);
 insert into libros (titulo, autor, codigoeditorial, precio)
  values('Alicia en el pais de las maravillas', 'Lewis Carroll', 2, 19.90);
 insert into libros (titulo, autor, codigoeditorial, precio)
  values('Martin Fierro', 'Jose Hernandez', 2, 25.90);
 insert into libros (titulo, autor, codigoeditorial, precio)
  values('Martin Fierro', 'Jose Hernandez', 3, 16.80);
 

--JOIN
select *
from libros 
join editoriales on (libros.codigoeditorial=editoriales.codigo);

select l.codigo, titulo, autor, nombre
from libros l 
join editoriales e  on (l.codigoeditorial = e.codigo);








