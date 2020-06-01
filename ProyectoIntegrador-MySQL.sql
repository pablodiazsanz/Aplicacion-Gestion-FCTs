-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 01-05-2020 a las 11:52:04
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ProyectoIntegrador`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Alumno`
--

CREATE TABLE `Alumno` (
  `expediente` int(15) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `apellido` varchar(15) NOT NULL,
  `dni` varchar(15) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `nacionalidad` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Alumno`
--

INSERT INTO `Alumno` (`expediente`, `nombre`, `apellido`, `dni`, `fecha_nacimiento`, `nacionalidad`) VALUES
(1, 'Pedro', 'Lopez', '47367Y', '2001-08-01', 'Español'),
(2, 'Miguel', 'Gracia', '47767Y', '2002-11-11', 'Español'),
(3, 'Fabiola', 'Gutierrez', '47577Y', '2003-11-11', 'Español'),
(4, 'Alberto', 'Jimenez', '45267Y', '2001-05-05', 'Español'),
(5, 'Jorge', 'Hernandez', '47123S', '2001-10-10', 'Español');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Centro`
--

CREATE TABLE `Centro` (
  `localidad` varchar(15) NOT NULL,
  `director` varchar(15) NOT NULL,
  `cod_centro` int(15) NOT NULL,
  `direccion` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Centro`
--

INSERT INTO `Centro` (`localidad`, `director`, `cod_centro`, `direccion`) VALUES
('Murcia', 'Jorge', 1, 'Calle mayor'),
('Madrid', 'Pablo', 2, 'Calle menor'),
('Valencia', 'Marta', 3, 'Calle Larga'),
('Teruel', 'Raul', 4, 'Calle corta'),
('Badajoz', 'Ana', 5, 'Calle grande');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Colabora`
--

CREATE TABLE `Colabora` (
  `centro_cod_centro` int(15) NOT NULL,
  `empresa_cif` varchar(15) NOT NULL,
  `anexo_1` varchar(15) NOT NULL,
  `numconv` int(15) NOT NULL,
  `fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Colabora`
--

INSERT INTO `Colabora` (`centro_cod_centro`, `empresa_cif`, `anexo_1`, `numconv`, `fecha`) VALUES
(1, '12ds23', '2020-04-29', 1, '2020-04-29'),
(2, '12ds24', '2020-04-29', 2, '2020-04-29'),
(3, '12ds25', '2020-04-29', 3, '2020-04-29'),
(4, '12ds26', '2020-04-29', 4, '2020-04-29'),
(5, '12ds27', '2020-04-29', 5, '2020-04-29');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Empresa`
--

CREATE TABLE `Empresa` (
  `direccion` varchar(15) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `cif` varchar(15) NOT NULL,
  `localidad` varchar(15) NOT NULL,
  `telefono` int(15) NOT NULL,
  `email` varchar(60) NOT NULL,
  `responsable_empresa` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Empresa`
--

INSERT INTO `Empresa` (`direccion`, `nombre`, `cif`, `localidad`, `telefono`, `email`, `responsable_empresa`) VALUES
('calle menor', 'HP enterprises', '12ds23', 'Murcia', 5656595, 'pedrito@gmail.com', 'Jose'),
('calle mayor', 'OrdenadoresMAR', '12ds24', 'Valencia', 7673423, 'mariana@gmail.com', 'Alvaro'),
('calle corta', 'Cisco', '12ds25', 'Soria', 7673489, 'juaniio@gmail.com', 'Ivan'),
('calle larga', 'Progralex SL', '12ds26', 'Salamanca', 7673895, 'alexitoo@gmail.com', 'Javier'),
('calle grande', 'ProReparacionesLS', '12ds27', 'Toledo', 7673444, 'lusandro@gmail.com', 'Sebastian');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Gestiona`
--

CREATE TABLE `Gestiona` (
  `grupo_cod_grupo` int(15) NOT NULL,
  `tutor_dni` varchar(15) NOT NULL,
  `anexo_2_2` varchar(15) NOT NULL,
  `tutor_cod_centro` int(15) NOT NULL,
  `año_academico` varchar(9) NOT NULL,
  `fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Gestiona`
--

INSERT INTO `Gestiona` (`grupo_cod_grupo`, `tutor_dni`, `anexo_2_2`, `tutor_cod_centro`, `año_academico`, `fecha`) VALUES
(1, '45112S', '2020-04-29', 1, '2015', '2015-02-15'),
(2, '45222Z', '2020-04-29', 2, '2016', '2015-02-15'),
(3, '47678S', '2020-04-29', 3, '2017', '2015-02-15'),
(4, '45543C', '2020-04-29', 4, '2018', '2015-02-15'),
(5, '45143S', '2020-04-29', 5, '2019', '2015-02-15');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Grupo`
--

CREATE TABLE `Grupo` (
  `cod_grupo` int(15) NOT NULL,
  `nom_grupo` varchar(15) NOT NULL,
  `clave_ciclo` varchar(15) NOT NULL,
  `nombre_ciclo` varchar(15) NOT NULL,
  `alumno_expediente` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Grupo`
--

INSERT INTO `Grupo` (`cod_grupo`, `nom_grupo`, `clave_ciclo`, `nombre_ciclo`, `alumno_expediente`) VALUES
(1, '457H', '3', 'DAM', 1),
(2, '468H', '4', 'DAW', 2),
(3, '470H', '5', 'ASIR', 3),
(4, '495H', '6', 'TAFAD', 4),
(5, '440H', '7', 'ENFERMERIA', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Pertenece`
--

CREATE TABLE `Pertenece` (
  `alumno_expediente` int(15) NOT NULL,
  `grupo_cod_grupo` int(15) NOT NULL,
  `año_academico` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Pertenece`
--

INSERT INTO `Pertenece` (`alumno_expediente`, `grupo_cod_grupo`, `año_academico`) VALUES
(1, 1, '2015'),
(2, 2, '2016'),
(3, 3, '2017'),
(4, 4, '2018'),
(5, 5, '2019');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Practica`
--

CREATE TABLE `Practica` (
  `empresa_cif` varchar(15) NOT NULL,
  `alumno_expediente` int(15) NOT NULL,
  `fecha_ini` date NOT NULL,
  `fecha_fin` date NOT NULL,
  `horario` varchar(5) NOT NULL,
  `tutore` varchar(15) NOT NULL,
  `anexo_2_1` varchar(15) NOT NULL,
  `anexo_3` varchar(15) NOT NULL,
  `anexo_7` varchar(15) NOT NULL,
  `anexo_8` varchar(15) NOT NULL,
  `año_academico` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Practica`
--

INSERT INTO `Practica` (`empresa_cif`, `alumno_expediente`, `fecha_ini`, `fecha_fin`, `horario`, `tutore`, `anexo_2_1`, `anexo_3`, `anexo_7`, `anexo_8`, `año_academico`) VALUES
('12ds23', 1, '2020-04-29', '2020-04-29', '8h', 'Jose', '2020-04-29', '2020-04-29', '2020-04-29', '2020-04-29', '2015'),
('12ds24', 2, '2020-04-29', '2020-04-29', '8h', 'Ivan', '2020-04-29', '2020-04-29', '2020-04-29', '2020-04-29', '2016'),
('12ds25', 3, '2020-04-29', '2020-04-29', '8h', 'Alvaro', '2020-04-29', '2020-04-29', '2020-04-29', '2020-04-29', '2017'),
('12ds26', 4, '2020-04-29', '2020-04-29', '8h', 'Javier', '2020-04-29', '2020-04-29', '2020-04-29', '2020-04-29', '2018'),
('12ds27', 5, '2020-04-29', '2020-04-29', '8h', 'Sebastian', '2020-04-29', '2020-04-29', '2020-04-29', '2020-04-29', '2019');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Tutor`
--

CREATE TABLE `Tutor` (
  `dni` varchar(15) NOT NULL,
  `apellido` varchar(15) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `centro_cod_centro` int(15) NOT NULL,
  `users_usr` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Tutor`
--

INSERT INTO `Tutor` (`dni`, `apellido`, `nombre`, `centro_cod_centro`, `users_usr`) VALUES
('45112S', 'Manzanero', 'Ana', 1, 'AnaM'),
('45143S', 'Perez', 'Juan Jose', 5, 'JuanjoP'),
('45222Z', 'Garcia', 'Ernesto', 2, 'ErnestoG'),
('45543C', 'Rodiguez', 'Raul', 4, 'RaulR'),
('47678S', 'Camacho', 'Pedro', 3, 'PedroC');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Users`
--

CREATE TABLE `Users` (
  `usr` varchar(15) NOT NULL,
  `pwd` varchar(35) NOT NULL,
  `rol` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Users`
--

INSERT INTO `Users` (`usr`, `pwd`, `rol`) VALUES
('AnaM', 'aplicacion2020', 'director'),
('ErnestoG', 'aplicacion2020', 'tutor'),
('JuanjoP', 'aplicacion2020', 'empresa'),
('PedroC', 'aplicacion2020', 'tutor'),
('RaulR', 'aplicacion2020', 'tutor');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Alumno`
--
ALTER TABLE `Alumno`
  ADD PRIMARY KEY (`expediente`);

--
-- Indices de la tabla `Centro`
--
ALTER TABLE `Centro`
  ADD PRIMARY KEY (`cod_centro`);

--
-- Indices de la tabla `Colabora`
--
ALTER TABLE `Colabora`
  ADD PRIMARY KEY (`centro_cod_centro`,`empresa_cif`),
  ADD KEY `colabora_empresa_fk` (`empresa_cif`);

--
-- Indices de la tabla `Empresa`
--
ALTER TABLE `Empresa`
  ADD PRIMARY KEY (`cif`);

--
-- Indices de la tabla `Gestiona`
--
ALTER TABLE `Gestiona`
  ADD PRIMARY KEY (`grupo_cod_grupo`,`tutor_dni`,`tutor_cod_centro`),
  ADD KEY `gestiona_tutor_fk` (`tutor_dni`,`tutor_cod_centro`);

--
-- Indices de la tabla `Grupo`
--
ALTER TABLE `Grupo`
  ADD PRIMARY KEY (`cod_grupo`),
  ADD UNIQUE KEY `grupo__idx` (`alumno_expediente`);

--
-- Indices de la tabla `Pertenece`
--
ALTER TABLE `Pertenece`
  ADD PRIMARY KEY (`alumno_expediente`,`grupo_cod_grupo`),
  ADD KEY `pertenece_grupo_fk` (`grupo_cod_grupo`);

--
-- Indices de la tabla `Practica`
--
ALTER TABLE `Practica`
  ADD PRIMARY KEY (`empresa_cif`,`alumno_expediente`),
  ADD KEY `practica_alumno_fk` (`alumno_expediente`);

--
-- Indices de la tabla `Tutor`
--
ALTER TABLE `Tutor`
  ADD PRIMARY KEY (`dni`,`centro_cod_centro`),
  ADD UNIQUE KEY `tutor__idx` (`users_usr`),
  ADD KEY `tutor_centro_fk` (`centro_cod_centro`);

--
-- Indices de la tabla `Users`
--
ALTER TABLE `Users`
  ADD PRIMARY KEY (`usr`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Colabora`
--
ALTER TABLE `Colabora`
  ADD CONSTRAINT `colabora_centro_fk` FOREIGN KEY (`centro_cod_centro`) REFERENCES `Centro` (`cod_centro`),
  ADD CONSTRAINT `colabora_empresa_fk` FOREIGN KEY (`empresa_cif`) REFERENCES `Empresa` (`cif`);

--
-- Filtros para la tabla `Gestiona`
--
ALTER TABLE `Gestiona`
  ADD CONSTRAINT `gestiona_grupo_fk` FOREIGN KEY (`grupo_cod_grupo`) REFERENCES `Grupo` (`cod_grupo`),
  ADD CONSTRAINT `gestiona_tutor_fk` FOREIGN KEY (`tutor_dni`,`tutor_cod_centro`) REFERENCES `Tutor` (`dni`, `centro_cod_centro`);

--
-- Filtros para la tabla `Pertenece`
--
ALTER TABLE `Pertenece`
  ADD CONSTRAINT `pertenece_alumno_fk` FOREIGN KEY (`alumno_expediente`) REFERENCES `Alumno` (`expediente`),
  ADD CONSTRAINT `pertenece_grupo_fk` FOREIGN KEY (`grupo_cod_grupo`) REFERENCES `Grupo` (`cod_grupo`);

--
-- Filtros para la tabla `Practica`
--
ALTER TABLE `Practica`
  ADD CONSTRAINT `practica_alumno_fk` FOREIGN KEY (`alumno_expediente`) REFERENCES `Alumno` (`expediente`),
  ADD CONSTRAINT `practica_empresa_fk` FOREIGN KEY (`empresa_cif`) REFERENCES `Empresa` (`cif`);

--
-- Filtros para la tabla `Tutor`
--
ALTER TABLE `Tutor`
  ADD CONSTRAINT `tutor_centro_fk` FOREIGN KEY (`centro_cod_centro`) REFERENCES `Centro` (`cod_centro`),
  ADD CONSTRAINT `tutor_users_fk` FOREIGN KEY (`users_usr`) REFERENCES `Users` (`usr`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

/* 
-- SELECTS

-- Muestra todos los alumnos
SELECT * FROM Alumno;

-- Muestra los alumnos que tiene un tutor
SELECT Alumno.*
FROM Alumno
LEFT JOIN Pertenece
ON expediente= Pertenece.alumno_expediente
LEFT JOIN Grupo 
ON Pertenece.grupo_cod_grupo = Grupo.cod_grupo
LEFT JOIN Gestiona 
ON Grupo.cod_grupo = Gestiona.grupo_cod_grupo
LEFT JOIN Tutor
ON Gestiona.tutor_dni = Tutor.dni
WHERE Tutor.users_usr=?;

-- Muestra todas las empresas
SELECT * FROM Empresa;

-- Muestra las empresas en las que van a realizar las prácticas los alumnos de cada tutor
SELECT Empresa.*
FROM Empresa
LEFT JOIN Colabora
ON Empresa.cif = Colabora.empresa_cif
LEFT JOIN Centro 
ON Colabora.centro_cod_centro=Centro.cod_centro 
LEFT JOIN Tutor
ON Centro.cod_centro = Tutor.centro_cod_centro
WHERE Tutor.users_usr=?;

-- Muestra todos los grupos
SELECT * FROM Grupo;

-- Muestra el grupo de cada tutor
SELECT Grupo.*
FROM Grupo
LEFT JOIN Gestiona
ON Grupo.cod_grupo = Gestiona.grupo_cod_grupo
LEFT JOIN Tutor
ON Gestiona.tutor_dni = Tutor.dni
WHERE Tutor.users_usr=?;

-- Muestra todos los tutores
SELECT * FROM Tutor;

-- Muestra el tutor para cada empresa
SELECT * FROM Tutor WHERE users_usr=?;



-- INSERTS, UPDATES Y DELETES

-- Modifica a los alumnos de director y tutor
UPDATE ProyectoIntegrador.Alumno SET " + eleccion + "=? WHERE expediente=?

-- Modifica a las empresas de director y tutor
UPDATE ProyectoIntegrador.Empresa SET " + eleccion + "=? WHERE cif=?

-- Elimina a las empresas de tutor y director
DELETE FROM ProyectoIntegrador.Empresa WHERE nombre=? AND cif=?

-- Elimina a los alumnos de tutor y director
DELETE FROM ProyectoIntegrador.Pertenece WHERE alumno_expediente=?
DELETE FROM ProyectoIntegrador.Alumno WHERE nombre=? AND expediente=?

-- Inserta a las empresas de tutor y director
INSERT INTO ProyectoIntegrador.Empresa (nombre, cif, direccion, localidad, telefono, email, responsable_empresa) VALUES (?, ?, ?, ?, ?, ?, ?)

-- Inserta a los alumnos de tutor y director
INSERT INTO ProyectoIntegrador.Pertenece (alumno_expediente, grupo_cod_grupo, año_academico) VALUES (?, ?, ?)
INSERT INTO ProyectoIntegrador.Alumno (expediente, nombre, apellido, dni, fecha_nacimiento, nacionalidad) VALUES (?, ?, ?, ?, ?, ?)



-- TABLAS DE LOS INFORMES

-- Alumnos por tutor

-- Tutores por ciclo

-- Alumnos por empresa

-- Alumnos en practicas por tutor

-- Informe general para gestion de las practicas

-- Informe que pide las aseguradoras


*/

