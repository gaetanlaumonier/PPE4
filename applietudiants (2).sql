-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Jeu 14 Avril 2016 à 09:44
-- Version du serveur :  5.6.20-log
-- Version de PHP :  5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `applietudiants`
--

-- --------------------------------------------------------

--
-- Structure de la table `cv_centre_interet`
--

CREATE TABLE IF NOT EXISTS `cv_centre_interet` (
`id_centre_interet` int(11) NOT NULL,
  `id_utilisateur` varchar(200) NOT NULL,
  `libelle_centre_interet` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `cv_experience_prof`
--

CREATE TABLE IF NOT EXISTS `cv_experience_prof` (
`id_experience_prof` int(11) NOT NULL,
  `id_utilisateur` varchar(200) NOT NULL,
  `libelle_experience_prof` text NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `cv_experience_prof`
--

INSERT INTO `cv_experience_prof` (`id_experience_prof`, `id_utilisateur`, `libelle_experience_prof`) VALUES
(1, 'mathou', 'test test '),
(2, 'mathou', 'test test test'),
(3, 'mathou', 'blbilbl');

-- --------------------------------------------------------

--
-- Structure de la table `cv_formation`
--

CREATE TABLE IF NOT EXISTS `cv_formation` (
`id_formation` int(11) NOT NULL,
  `id_utilisateur` varchar(200) NOT NULL,
  `libelle_formation` text NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `cv_formation`
--

INSERT INTO `cv_formation` (`id_formation`, `id_utilisateur`, `libelle_formation`) VALUES
(1, 'mathou', 'gahprzhzh');

-- --------------------------------------------------------

--
-- Structure de la table `cv_informatique`
--

CREATE TABLE IF NOT EXISTS `cv_informatique` (
`id_informatique` int(11) NOT NULL,
  `id_utilisateur` varchar(200) NOT NULL,
  `libelle_informatique` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `cv_langue`
--

CREATE TABLE IF NOT EXISTS `cv_langue` (
`id_langue` int(11) NOT NULL,
  `id_utilisateur` varchar(200) NOT NULL,
  `libelle_langue` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `cv_photo`
--

CREATE TABLE IF NOT EXISTS `cv_photo` (
`id_cv_photo` int(11) NOT NULL,
  `id_utilisateur` varchar(200) NOT NULL,
  `photo` varchar(200) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=38 ;

--
-- Contenu de la table `cv_photo`
--



-- --------------------------------------------------------

--
-- Structure de la table `cv_titre`
--

CREATE TABLE IF NOT EXISTS `cv_titre` (
`id_titre` int(11) NOT NULL,
  `id_utilisateur` varchar(200) DEFAULT NULL,
  `libelle_titre` text NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `cv_titre`
--

INSERT INTO `cv_titre` (`id_titre`, `id_utilisateur`, `libelle_titre`) VALUES
(1, 'mathou', 'Cv présentation ');

--
-- Déclencheurs `cv_titre`
--


-- --------------------------------------------------------

--
-- Structure de la table `cv_titre_supprimes`
--

CREATE TABLE IF NOT EXISTS `cv_titre_supprimes` (
`id_titre` int(11) NOT NULL,
  `id_utilisateur` varchar(200) DEFAULT NULL,
  `libelle_titre` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `mots_cles`
--

CREATE TABLE IF NOT EXISTS `mots_cles` (
`id_mot_cle` int(11) NOT NULL,
  `libelle_mot_clé` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `mot_cle_stage`
--

CREATE TABLE IF NOT EXISTS `mot_cle_stage` (
  `id_mot_cle` int(11) NOT NULL,
  `id_entreprise` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `mot_cle_utilisateur`
--

CREATE TABLE IF NOT EXISTS `mot_cle_utilisateur` (
  `id_mot_cle` int(11) NOT NULL,
  `id_utilisateur` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `stats`
--

CREATE TABLE IF NOT EXISTS `stats` (
  `nom_table` varchar(255) NOT NULL,
  `nombre_tuples` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `stats`
--

INSERT INTO `stats` (`nom_table`, `nombre_tuples`) VALUES
('utilisateurs', 1);

-- --------------------------------------------------------

--
-- Structure de la table `utilisateurs`
--

CREATE TABLE IF NOT EXISTS `utilisateurs` (
  `identifiant` varchar(255) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `date_de_naissance` varchar(50) NOT NULL,
  `adresse_rue` varchar(50) DEFAULT NULL,
  `adresse_cp` varchar(5) DEFAULT NULL,
  `adresse_ville` varchar(50) DEFAULT NULL,
  `tel_personnel` varchar(15) DEFAULT NULL,
  `tel_professionnel` varchar(15) DEFAULT NULL,
  `mail` varchar(100) DEFAULT NULL,
  `site_web` varchar(100) DEFAULT NULL,
  `annee_entree_promotion` varchar(4) DEFAULT NULL,
  `annee_sortie_promotion` varchar(4) DEFAULT NULL,
  `password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `utilisateurs`
--

INSERT INTO `utilisateurs` (`identifiant`, `nom`, `prenom`, `date_de_naissance`, `adresse_rue`, `adresse_cp`, `adresse_ville`, `tel_personnel`, `tel_professionnel`, `mail`, `site_web`, `annee_entree_promotion`, `annee_sortie_promotion`, `password`) VALUES
('mathou', 'Seigle', 'Mathis', '15/07/1996', '25 route de la vallée', '86180', 'Buxerolles', '0642456956', '0642456956', 'seigle.mathis@gmail.com', 'test', '', '', 'f71dbe52628a3f83a77ab494817525c6');

--
-- Déclencheurs `utilisateurs`
--


--
-- Index pour les tables exportées
--

--
-- Index pour la table `cv_centre_interet`
--
ALTER TABLE `cv_centre_interet`
 ADD PRIMARY KEY (`id_centre_interet`), ADD KEY `index_id_utilisateur` (`id_utilisateur`);

--
-- Index pour la table `cv_experience_prof`
--
ALTER TABLE `cv_experience_prof`
 ADD PRIMARY KEY (`id_experience_prof`), ADD KEY `index_id_utilisateurExp` (`id_utilisateur`);

--
-- Index pour la table `cv_formation`
--
ALTER TABLE `cv_formation`
 ADD PRIMARY KEY (`id_formation`), ADD KEY `index_id_utilisateur` (`id_utilisateur`);

--
-- Index pour la table `cv_informatique`
--
ALTER TABLE `cv_informatique`
 ADD PRIMARY KEY (`id_informatique`), ADD KEY `index_id_utilisateur` (`id_utilisateur`) COMMENT 'index sur l''id utilisateur';

--
-- Index pour la table `cv_langue`
--
ALTER TABLE `cv_langue`
 ADD PRIMARY KEY (`id_langue`), ADD KEY `index_id_utilisateur` (`id_utilisateur`);

--
-- Index pour la table `cv_photo`
--
ALTER TABLE `cv_photo`
 ADD PRIMARY KEY (`id_cv_photo`), ADD KEY `fk_photoIdUser` (`id_utilisateur`);

--
-- Index pour la table `cv_titre`
--
ALTER TABLE `cv_titre`
 ADD PRIMARY KEY (`id_titre`), ADD KEY `index_id_utilisateur` (`id_utilisateur`);

--
-- Index pour la table `cv_titre_supprimes`
--
ALTER TABLE `cv_titre_supprimes`
 ADD PRIMARY KEY (`id_titre`), ADD KEY `index_id_utilisateur` (`id_utilisateur`);

--
-- Index pour la table `mots_cles`
--
ALTER TABLE `mots_cles`
 ADD PRIMARY KEY (`id_mot_cle`);

--
-- Index pour la table `mot_cle_stage`
--
ALTER TABLE `mot_cle_stage`
 ADD PRIMARY KEY (`id_mot_cle`,`id_entreprise`);

--
-- Index pour la table `mot_cle_utilisateur`
--
ALTER TABLE `mot_cle_utilisateur`
 ADD PRIMARY KEY (`id_mot_cle`,`id_utilisateur`);

--
-- Index pour la table `stats`
--
ALTER TABLE `stats`
 ADD PRIMARY KEY (`nom_table`);

--
-- Index pour la table `utilisateurs`
--
ALTER TABLE `utilisateurs`
 ADD PRIMARY KEY (`identifiant`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `cv_centre_interet`
--
ALTER TABLE `cv_centre_interet`
MODIFY `id_centre_interet` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `cv_experience_prof`
--
ALTER TABLE `cv_experience_prof`
MODIFY `id_experience_prof` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT pour la table `cv_formation`
--
ALTER TABLE `cv_formation`
MODIFY `id_formation` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `cv_informatique`
--
ALTER TABLE `cv_informatique`
MODIFY `id_informatique` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `cv_langue`
--
ALTER TABLE `cv_langue`
MODIFY `id_langue` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `cv_photo`
--
ALTER TABLE `cv_photo`
MODIFY `id_cv_photo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=38;
--
-- AUTO_INCREMENT pour la table `cv_titre`
--
ALTER TABLE `cv_titre`
MODIFY `id_titre` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `cv_titre_supprimes`
--
ALTER TABLE `cv_titre_supprimes`
MODIFY `id_titre` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `mots_cles`
--
ALTER TABLE `mots_cles`
MODIFY `id_mot_cle` int(11) NOT NULL AUTO_INCREMENT;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `cv_centre_interet`
--
ALTER TABLE `cv_centre_interet`
ADD CONSTRAINT `cv_centre_interet_ibfk_1` FOREIGN KEY (`id_utilisateur`) REFERENCES `utilisateurs` (`identifiant`);

--
-- Contraintes pour la table `cv_experience_prof`
--
ALTER TABLE `cv_experience_prof`
ADD CONSTRAINT `cv_experience_prof_ibfk_1` FOREIGN KEY (`id_utilisateur`) REFERENCES `utilisateurs` (`identifiant`);

--
-- Contraintes pour la table `cv_formation`
--
ALTER TABLE `cv_formation`
ADD CONSTRAINT `cv_formation_ibfk_1` FOREIGN KEY (`id_utilisateur`) REFERENCES `utilisateurs` (`identifiant`);

--
-- Contraintes pour la table `cv_informatique`
--
ALTER TABLE `cv_informatique`
ADD CONSTRAINT `cv_informatique_ibfk_1` FOREIGN KEY (`id_utilisateur`) REFERENCES `utilisateurs` (`identifiant`);

--
-- Contraintes pour la table `cv_langue`
--
ALTER TABLE `cv_langue`
ADD CONSTRAINT `cv_langue_ibfk_1` FOREIGN KEY (`id_utilisateur`) REFERENCES `utilisateurs` (`identifiant`);

--
-- Contraintes pour la table `cv_photo`
--
ALTER TABLE `cv_photo`
ADD CONSTRAINT `cv_photo_ibfk_1` FOREIGN KEY (`id_utilisateur`) REFERENCES `utilisateurs` (`identifiant`);

--
-- Contraintes pour la table `cv_titre`
--
ALTER TABLE `cv_titre`
ADD CONSTRAINT `fk_id_utilisateur_cv_titre` FOREIGN KEY (`id_utilisateur`) REFERENCES `utilisateurs` (`identifiant`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `cv_titre_supprimes`
--
ALTER TABLE `cv_titre_supprimes`
ADD CONSTRAINT `cv_titre_supprimes_ibfk_1` FOREIGN KEY (`id_utilisateur`) REFERENCES `utilisateurs` (`identifiant`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
