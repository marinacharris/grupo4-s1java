/*Obtener el listado de los identificadores (id) de los materiales de construcción
importados, incluyendo: sus nombres y precios (ordenados por nombre). Utilice los
siguientes alias: ID_MATERIALCONSTRUCCION como ID,
NOMBRE_MATERIAL como NOMBRE y PRECIO_UNIDAD como PRECIO.*/

select ID_MaterialConstruccion as ID, Nombre_Material as NOMBRE, Precio_Unidad as PRECIO
from MaterialConstruccion mc 
where Importado = 'Si'
order by nombre;

/*
 Se necesita conocer el listado de los proyectos, incluyendo la siguiente información:
id del proyecto, constructora, ciudad, clasificación, estrato y nombre completo del
líder de los proyectos que fueron financiados por el banco “Conavi”. Ordenados
desde el proyecto más reciente hasta el más antiguo, por nombre de la ciudad (de
forma ascendente) y por constructora. Para construir el listado mencionado, se debe
realizar un JOIN entre las tablas Proyecto y Tipo, Proyecto Líder. Utilice los
siguientes alias: ID_PROYECTO como ID y la unión del nombre + apellido del
líder como LIDER, el resto, queda en su forma natural.
 */

select ID_Proyecto as ID, Constructora, Ciudad, p.Clasificacion, Estrato, 
l.Nombre ||' '||l.Primer_Apellido ||' '||l.Segundo_Apellido as LIDER
from Proyecto p 
join Tipo t on (p.ID_Tipo = t.ID_Tipo)
join Lider l on (p.ID_Lider = l.ID_Lider)
where Banco_Vinculado = 'Conavi'
order by Fecha_Inicio desc, Ciudad, Constructora;


/*
Se desea conocer por cada ciudad y clasificación: el total de proyectos, la fecha del
proyecto más antiguo y la fecha del proyecto más reciente (ordenados por ciudad y
clasificación). No se deben incluir los proyectos tipo “Casa Campestre” ni
“Condominio”
*/

select Ciudad, Clasificacion, 
count(*) as TOTAL, min(Fecha_Inicio) as VIEJO, max(Fecha_Inicio) as RECIENTE
from Proyecto p 
where Clasificacion not in ('Casa Campestre', 'Condominio')
GROUP by Ciudad, Clasificacion 
ORDER BY Ciudad, Clasificacion;


/*
 Se debe presentar el total adeudado en cada proyecto (por las compras no pagadas a
los proveedores). Se debe agrupar los datos por el ID_proyecto y el valor total de la
deuda, siempre y cuando esta última sea superior a $50.000. Ordene los datos de
mayor a menor deuda.
 */

SELECT p.ID_Proyecto, sum(c.Cantidad*mc.Precio_Unidad) as VALOR
FROM Proyecto p 
join Compra c on (p.ID_Proyecto = c.ID_Proyecto)
join MaterialConstruccion mc on (c.ID_MaterialConstruccion =  mc.ID_MaterialConstruccion)
where c.Pagado = 'No'
GROUP  by p.ID_Proyecto 
HAVING VALOR > 50000
ORDER BY VALOR DESC;


/*
 Seleccione los 10 líderes que han realizado más compras en sus proyectos. Se debe
presentar el nombre completo del líder y el valor total de las compras realizadas.
Para limitar el número de registros, usar al final de la consulta la instrucción LIMIT
<numero>. 
 */

SELECT l.Nombre ||' '||l.Primer_Apellido ||' '||l.Segundo_Apellido as LIDER,
sum(c.Cantidad*mc.Precio_Unidad) as VALOR
from Lider l 
join Proyecto p on (l.ID_Lider = p.ID_Lider)
join Compra c on (p.ID_Proyecto = c.ID_Proyecto)
join MaterialConstruccion mc on (c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion)
GROUP by LIDER
order by VALOR desc 
limit 10;










