use agroalimentaria;
select * from informacionespecifica;

#select * from informacionespecifica where TipoArt = "PF";

#select * from informacionespecifica where TipoArt = "PR";

#select * from informacionespecifica where TipoArt = 'PC';

#select Producto_idProducto, NroLote, FechaEnvasado, FechaVto from informacionespecifica where TipoArt = 'PF';
#select Paises_idPaises, Producto_idProducto, NroLote, FechaEnvasado, FechaVto ,CodOrganismo, TempRecomendada from informacionespecifica where TipoArt = 'PR';
#select * from informacionespecifica;
#INSERT INTO informacionespecifica (FechaVto,NroLote,TipoArt,FechaEnvasado,CodOrganismo,TempRecomendada,Paises_idPaises,Producto_idProducto)VALUES(?,?,?,?,?,?,?,?);

#select * from InformacionEspecifica;

#delete from informacionespecifica where NroLote = '';
select a.Nom, i.NroLote, i.FechaVto, i.TempRecomendada, i.CodOrganismo, i.FechaEnvasado, p.Nom
from informacionespecifica as i
inner join producto as a on i.Producto_idProducto = a.idProducto
inner join paises as p on i.Paises_idPaises = p.idPaises
where i.TipoArt = 'PR' and i.NroLote = 1025;

#select a.Nom, i.NroLote, i.FechaVto, i.TempRecomendada, i.CodOrganismo, i.FechaEnvasado, p.Nom from informacionespecifica as i inner join producto as a on i.Producto_idProducto = a.idProducto inner join paises as p on i.Paises_idPaises = p.idPaises where i.TipoArt = 'PR' and i.NroLote = '"+ +"';
#inner join significa que esta relacionada

#UPDATE informacionespecifica SET FechaVto = '"+ +"', FechaEnvasado = '"+ +"', CodOrganismo = '"+ +"', TempRecomendada = '"+ +"', Paises_idPaises = '"+ +"', Producto_idProducto = '"+ +"', WHERE NroLote = '"+ +"';

#UPDATE informacionespecifica SET FechaVto = '"+ this.getFechaVto() +"', FechaEnvasado = '"+ this.getFechaEnvasado() +"', CodOrganismo = '"+ this.getCodOrga() +"', TempRecomendada = '"+ this.getTempMant()+"', Paises_idPaises = '"+ this.getPaisOrigen() +"', Producto_idProducto = '"+ this.getCodProd()+"' WHERE NroLote = '"+ this.getNroLote()+"';

select NroLore, Producto_idProducto, FechaVto, now(), timestampdiff(day, now(), FechaVto) from informacionespecifica
where timestampdiff(day, now(), FechaVto) < 0