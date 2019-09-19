-- mysql workbench forward engineering

-- -----------------------------------------------------
-- schema dbrestavrante_in5bm2015396
-- -----------------------------------------------------
-- schema dbrestavrante_in5bm2015396
-- -----------------------------------------------------
create schema if not exists `dbrestaurante_in5bm2015396`;
-- -----------------------------------------------------
use `dbrestaurante_in5bm2015396` ;

-- -----------------------------------------------------
-- table `dbrestavrante_in5bm2015396`.`tipoclientes`
-- -----------------------------------------------------
create table if not exists `dbrestaurante_in5bm2015396`.`tipoclientes` (
  `idtipocliente` int not null auto_increment,
  `descripcion` varchar(45) not null,
  primary key (`idtipocliente`))
engine = innodb;


-- -----------------------------------------------------
-- table `dbrestaurante_in5bm2015396`.`clientes`
-- -----------------------------------------------------
create table if not exists `dbrestaurante_in5bm2015396`.`clientes` (
  `idclientes` int not null auto_increment,
  `nombre` varchar(45) not null,
  `apellido` varchar(45) not null,
  `direccion` varchar(45) not null,
  `nit` varchar(45) not null,
  `idtipocliente` int not null,
  primary key (`idclientes`),
  index `idtipocliente_idx` (`idtipocliente` asc) visible,
  constraint `idtipocliente`
    foreign key (`idtipocliente`)
    references `dbrestaurante_in5bm2015396`.`tipoclientes` (`idtipocliente`)
    on delete no action
    on update no action)
engine = innodb;


-- -----------------------------------------------------
-- table `dbrestaurante_in5bm2015396`.`areas`
-- -----------------------------------------------------
create table if not exists `dbrestaurante_in5bm2015396`.`areas` (
  `idarea` int not null auto_increment,
  `nombrearea` varchar(45) not null,
  `descripcionarea` varchar(45) not null,
  primary key (`idarea`))
engine = innodb;


-- -----------------------------------------------------
-- table `dbrestaurante_in5bm2015396`.`mesas`
-- -----------------------------------------------------
create table if not exists `dbrestaurante_in5bm2015396`.`mesas` (
  `idmesa` int not null auto_increment,
  `numeromaxpersonas` int not null,
  `descripcion` varchar(45) not null,
  `idarea` int not null,
  primary key (`idmesa`),
  index `idarea_idx` (`idarea` asc) visible,
  constraint `idarea`
    foreign key (`idarea`)
    references `dbrestaurante_in5bm2015396`.`areas` (`idarea`)
    on delete no action
    on update no action)
engine = innodb;


-- -----------------------------------------------------
-- table `dbrestaurante_in5bm2015396`.`camareros`
-- -----------------------------------------------------
create table if not exists `dbrestaurante_in5bm2015396`.`camareros` (
  `idcamarero` int not null auto_increment,
  `nombre` varchar(45) not null,
  `apellido` varchar(45) not null,
  `propina` int not null default ('totalventa'*0.08),
  primary key (`idcamarero`))
engine = innodb;


-- -----------------------------------------------------
-- table `dbrestaurante_in5bm2015396`.`facturas`
-- -----------------------------------------------------
create table if not exists `dbrestaurante_in5bm2015396`.`facturas` (
  `idfactura` int not null auto_increment,
  `idcliente` int not null,
  `idmesa` int not null,
  `idcamarero` int not null,
  `fechafactura` date not null,
  primary key (`idfactura`),
  index `idcliente_idx` (`idcliente` asc) visible,
  index `idmesa_idx` (`idmesa` asc) visible,
  index `idcamarero_idx` (`idcamarero` asc) visible,
  constraint `idcliente`
    foreign key (`idcliente`)
    references `dbrestaurante_in5bm2015396`.`clientes` (`idclientes`)
    on delete no action
    on update no action,
  constraint `idmesa`
    foreign key (`idmesa`)
    references `dbrestaurante_in5bm2015396`.`mesas` (`idmesa`)
    on delete no action
    on update no action,
  constraint `idcamarero`
    foreign key (`idcamarero`)
    references `dbrestaurante_in5bm2015396`.`camareros` (`idcamarero`)
    on delete no action
    on update no action)
engine = innodb;


-- -----------------------------------------------------
-- table `dbrestaurante_in5bm2015396`.`cocineros`
-- -----------------------------------------------------
create table if not exists `dbrestaurante_in5bm2015396`.`cocineros` (
  `idcocinero` int not null auto_increment,
  `nombre` varchar(45) not null,
  `apellido` varchar(45) not null,
  primary key (`idcocinero`))
engine = innodb;


-- -----------------------------------------------------
-- table `dbrestaurante_in5bm2015396`.`platillos`
-- -----------------------------------------------------
create table if not exists `dbrestaurante_in5bm2015396`.`platillos` (
  `idplatillo` int not null auto_increment,
  `descripcionplatillo` varchar(45) not null,
  `importe` double not null,
  primary key (`idplatillo`))
engine = innodb;


-- -----------------------------------------------------
-- table `dbrestaurante_in5bm2015396`.`detallefactura`
-- -----------------------------------------------------
create table if not exists `dbrestaurante_in5bm2015396`.`detallefactura` (
  `iddetallefactura` int not null auto_increment,
  `idcocinero` int not null,
  `idplatillo` int not null,
  `totalventa` double not null default ('cantidad'*'precioventa'),
  `cantidad` int not null,
  `precioventa` int not null,
  `idfactura` int not null,
  primary key (`iddetallefactura`),
  index `idcocinero_idx` (`idcocinero` asc) visible,
  index `idfactura_idx` (`idfactura` asc) visible,
  index `idplatillo_idx` (`idplatillo` asc) visible,
  constraint `idcocinero`
    foreign key (`idcocinero`)
    references `dbrestaurante_in5bm2015396`.`cocineros` (`idcocinero`)
    on delete no action
    on update no action,
  constraint `idfactura`
    foreign key (`idfactura`)
    references `dbrestaurante_in5bm2015396`.`facturas` (`idfactura`)
    on delete no action
    on update no action,
  constraint `idplatillo`
    foreign key (`idplatillo`)
    references `dbrestaurante_in5bm2015396`.`platillos` (`idplatillo`)
    on delete no action
    on update no action)
engine = innodb;

