-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.9.1-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para quotes
CREATE DATABASE IF NOT EXISTS `quotes` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `quotes`;

-- Volcando estructura para tabla quotes.citas
CREATE TABLE IF NOT EXISTS `citas` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `fecha` datetime NOT NULL,
  PRIMARY KEY (`id`,`username`,`fecha`) USING BTREE,
  KEY `FK_usuario` (`username`),
  CONSTRAINT `FK_examen` FOREIGN KEY (`id`) REFERENCES `examenes` (`id`),
  CONSTRAINT `FK_usuario` FOREIGN KEY (`username`) REFERENCES `usuarios` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla quotes.citas: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `citas` DISABLE KEYS */;
/*!40000 ALTER TABLE `citas` ENABLE KEYS */;

-- Volcando estructura para tabla quotes.examenes
CREATE TABLE IF NOT EXISTS `examenes` (
  `id` int(5) NOT NULL,
  `cups` varchar(10) NOT NULL,
  `examen` varchar(100) DEFAULT NULL,
  `valor` decimal(20,6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla quotes.examenes: ~24 rows (aproximadamente)
/*!40000 ALTER TABLE `examenes` DISABLE KEYS */;
INSERT INTO `examenes` (`id`, `cups`, `examen`, `valor`) VALUES
	(1, '901001', 'ANTIBIOGRAMA (DISCO)', 25000.000000),
	(2, '902209', 'HEMOGRAMA TIPO III', 35000.000000),
	(3, '903813', 'CLORO', 25000.000000),
	(4, '903895', 'CREATININA', 25000.000000),
	(5, '906305', 'DENGUE DUO NS1', 45000.000000),
	(6, '903828', 'DESHIDROGENASA LACTICA', 35000.000000),
	(7, '902104', 'DIMERO D', 75000.000000),
	(8, '903839', 'GASES ARTERIALES', 105000.000000),
	(9, '903841', 'GLUCOSA', 25000.000000),
	(10, '906625', 'GONADOTROPINA CORIONICA SUBUNIDAD BETA', 80000.000000),
	(11, '911015', 'HEMOCLASIFICACION', 25000.000000),
	(12, '902213', 'HEMOGLOBINA', 25000.000000),
	(13, '903856', 'NITROGENO UREICO', 250009.000000),
	(14, '903859', 'POTASIO', 25000.000000),
	(15, '903864', 'SODIO', 25000.000000),
	(16, '902045', 'TIEMPO DE PROTROMBINA [PT]', 35000.000000),
	(17, '902049', 'TIEMPO DE TROMBOPLASTINA PARCIAL [TTP]', 35000.000000),
	(18, '903866', 'TRANSAMINASA GLUTAMICO-PIRUVICA', 45000.000000),
	(19, '903867', 'TRANSAMINASA GLUTAMINO OXALACETICA', 45000.000000),
	(20, '903437', 'TROPONINA I ULTRASENSIBLE', 65000.000000),
	(21, '907106', 'UROANALISIS', 35000.000000),
	(22, '906249', 'VIH 1 Y 2', 75000.000000),
	(23, '901107', 'GRAM DE ORINA', 65000.000000),
	(24, '906913', 'PROTEINA C REACTIVA', 105000.000000);
/*!40000 ALTER TABLE `examenes` ENABLE KEYS */;

-- Volcando estructura para tabla quotes.usuarios
CREATE TABLE IF NOT EXISTS `usuarios` (
  `username` varchar(50) NOT NULL DEFAULT '',
  `contrasena` varchar(100) DEFAULT NULL,
  `nombres` varchar(100) DEFAULT NULL,
  `apellidos` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `tel_fijo` varchar(10) DEFAULT NULL,
  `tel_movil` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla quotes.usuarios: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
