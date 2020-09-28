-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  lun. 28 sep. 2020 à 16:12
-- Version du serveur :  10.4.10-MariaDB
-- Version de PHP :  7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `english`
--

-- --------------------------------------------------------

--
-- Structure de la table `prépositionmouvement`
--

DROP TABLE IF EXISTS `prépositionmouvement`;
CREATE TABLE IF NOT EXISTS `prépositionmouvement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `préposition` varchar(100) DEFAULT NULL,
  `indication` varchar(100) DEFAULT NULL,
  `exemples` varchar(100) DEFAULT NULL,
  `exemplesFR` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `prépositionmouvement`
--

INSERT INTO `prépositionmouvement` (`id`, `préposition`, `indication`, `exemples`, `exemplesFR`) VALUES
(1, 'on', 'montée', 'get on (the plane)', 'monter dans'),
(2, 'off', 'sortie, retrait', 'get off (the bus), wipe off (the dirt)', 'decendre, enlever'),
(3, 'up', 'vers le haut', 'run up (the stairs)', 'monter en courant'),
(4, 'down', 'vers le bas', 'walk down (the street)', 'descendre à pied'),
(5, 'away', 'éloignement', 'put away, walk away', 'ranger, s éloigner'),
(6, 'to', 'direction', 'go to', 'aller vers, à'),
(7, 'at', 'direction', 'shout at (someone), throw (something) at', 'crier sur, jeter sur / vers'),
(8, 'along', 'le long de', 'run along (the river)', 'courir le long de'),
(9, 'beside, next to', 'à côté de', 'sit beside (someone)', 'être assis à coté de'),
(10, 'into', 'entrée, vers l intérieur', 'walk into (the room)', 'entrer dans'),
(11, 'out of, from', 'sortie, vers l extérieur', 'walk out (of the office), remove from (the shelf)', 'sortir de, retirer de'),
(12, 'across, through', 'traversée', 'swim across (the lake), walk throught (the door)', 'traverser à la nage, franchir'),
(13, 'past', 'd\'épassement d\'un point fixe', 'go past (the school)', 'passer devant');

-- --------------------------------------------------------

--
-- Structure de la table `vocabulaire`
--

DROP TABLE IF EXISTS `vocabulaire`;
CREATE TABLE IF NOT EXISTS `vocabulaire` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'primary key',
  `word` text DEFAULT NULL,
  `mot` text DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `vocabulaire`
--

INSERT INTO `vocabulaire` (`id`, `word`, `mot`) VALUES
(1, 'since', 'depuis'),
(2, 'begin', 'comencer, débuter'),
(3, 'cleaning', 'nettoyer'),
(4, 'putting on', 'mettre, enfiler'),
(5, 'hanging', 'suspendre, accrocher'),
(6, 'folding', 'plier'),
(7, 'putting away', 'ranger'),
(8, 'picking up', 'ramasser'),
(9, 'tying', 'nouer, attacher'),
(10, 'posting', 'poster'),
(11, 'wrapping', 'emballer (cadeau)'),
(12, 'sweeping', 'balayer'),
(13, 'cooking', 'cuisiner'),
(14, 'carrying', 'porter'),
(15, 'rubbish', 'déchet'),
(16, 'tile', 'carrelage, tuile'),
(19, 'cupboard', 'placard'),
(20, 'painting', 'peindre'),
(21, 'post office', 'bureau de poste'),
(22, 'DIY', 'bricolage');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
