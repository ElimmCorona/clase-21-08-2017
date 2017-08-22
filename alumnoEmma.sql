drop database if exists alumno;
create database alumno;
use alumno;

create table persona(
	idPersona int not null primary key,
	nombre nvarchar(100) not null,
    aPat nvarchar(100) not null,
    aMat nvarchar(100) not null,
    escuela nvarchar(100) not null);
    
    drop procedure if exists spGuardaPersona;
	delimiter **
create procedure spGuardaPersona(in nom nvarchar(100), in apellidoPat nvarchar(100), in apellidoMat nvarchar(100), in escuelita nvarchar(100))
begin
declare existeId int;
declare IdPer int;
declare msj nvarchar(100);

set existeId = (select ifnull(max(idPersona), 0) from persona);

if (existeId = 0) then

		set IdPer = (select ifnull(max(idpersona), 0) + 1 from persona);

		insert into persona (idpersona, nombre, aPat, aMat, escuela)
					values(IdPer, nom, apellidoPat, apellidoMat, escuelita);
		
        set msj = 'Guardado';
		

else

	set msj = 'ya existe';
    
end if;

select msj;

end; **
delimiter ;

select * from persona;