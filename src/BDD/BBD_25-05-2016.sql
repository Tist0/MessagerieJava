/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Author:  jerome
 * Created: 11 mai 2016
 */
 
 ------------------------------------------------------------
--        Script Postgre 
------------------------------------------------------------



------------------------------------------------------------
-- Table: User
------------------------------------------------------------
CREATE TABLE Users(
	login  VARCHAR (25) NOT NULL ,
	mdp    VARCHAR (25)  ,
	statut BOOL   ,
	CONSTRAINT prk_constraint_User PRIMARY KEY (login)
);


------------------------------------------------------------
-- Table: Salon
------------------------------------------------------------
CREATE TABLE Salon(
	idSalon   SERIAL NOT NULL ,
	nom_Salon VARCHAR (25)  ,
        description_salon VARCHAR (50)  ,
	idAdmin   INT   ,
	CONSTRAINT prk_constraint_Salon PRIMARY KEY (idSalon)
);


------------------------------------------------------------
-- Table: Message
------------------------------------------------------------
CREATE TABLE Message(
	idMessage     SERIAL NOT NULL ,
	date_Message  DATE   ,
	heure_Message TIMETZ   ,
	contenu       VARCHAR (250)  ,
	login_envoi         VARCHAR (25)  ,
	idSalon       INT   ,
	CONSTRAINT prk_constraint_Message PRIMARY KEY (idMessage)
);


------------------------------------------------------------
-- Table: Admin
------------------------------------------------------------
CREATE TABLE Admin(
	idAdmin SERIAL NOT NULL ,
	login_admin   VARCHAR (25)  ,
	CONSTRAINT prk_constraint_Admin PRIMARY KEY (idAdmin)
);


------------------------------------------------------------
-- Table: Acceder
------------------------------------------------------------
CREATE TABLE Acceder(
	login   VARCHAR (25) NOT NULL ,
	idSalon INT  NOT NULL ,
	CONSTRAINT prk_constraint_Acceder PRIMARY KEY (login,idSalon)
);



ALTER TABLE Salon ADD CONSTRAINT FK_Salon_idAdmin FOREIGN KEY (idAdmin) REFERENCES Admin(idAdmin);
ALTER TABLE Message ADD CONSTRAINT FK_Message_login_envoie FOREIGN KEY (login_envoi) REFERENCES Users(login);
ALTER TABLE Message ADD CONSTRAINT FK_Message_idSalon FOREIGN KEY (idSalon) REFERENCES Salon(idSalon);
ALTER TABLE Acceder ADD CONSTRAINT FK_Acceder_login FOREIGN KEY (login) REFERENCES Users(login);
ALTER TABLE Acceder ADD CONSTRAINT FK_Acceder_idSalon FOREIGN KEY (idSalon) REFERENCES Salon(idSalon);
ALTER TABLE Admin ADD CONSTRAINT FK_Admin_login_admin FOREIGN KEY (login_admin) REFERENCES Users(login);

------------------------------------------------------------
-- INSERTION 
------------------------------------------------------------


INSERT INTO Users VALUES ('Jean-Pat','stri',TRUE);
INSERT INTO Users VALUES ('Jean-Mimi','stri',FALSE);

INSERT INTO Admin(login_admin) VALUES ('Jean-Mimi');

INSERT INTO Salon VALUES (1,'LES-TUEURS','Salon des tueurs',1);
INSERT INTO Salon VALUES (2,'LES-VIOLENTS','Salon des violents',1);

INSERT INTO Acceder(login,idSalon) VALUES ('Jean-Pat',1);
INSERT INTO Acceder(login,idSalon) VALUES ('Jean-Mimi',1);
INSERT INTO Acceder(login,idSalon) VALUES ('Jean-Mimi',2);

INSERT INTO Message(date_Message,heure_Message,contenu,login_envoi,idSalon ) VALUES ('15/02/1995','20:23:45','bonjour','Jean-Pat',1);
INSERT INTO Message(date_Message,heure_Message,contenu,login_envoi,idSalon ) VALUES ('15/02/1995','20:26:12','bonjour','Jean-Mimi',1);
INSERT INTO Message(date_Message,heure_Message,contenu,login_envoi,idSalon ) VALUES ('15/02/2225','23:23:23','MERCI','Jean-Mimi',2);



-----------------------------------------------------
--Les SELECTS Exemple:
-----------------------------------------------------

-- affiche tout les utilisateurs
SELECT login from users;

-- affiche tout les utilisateurs et leur etat
SELECT login, statut from users;

-- Affiche les personnes inactives dans le salon LES TUEURS
SELECT login, statut,nom_salon from users,salon WHERE nom_salon='LES-TUEURS' AND statut ='f';

-- La table Envoie de tout les messages écrit par Jean-Pat
SELECT contenu,login_envoi from message where login_envoi='Jean-Pat' ;

-- Affiche le nom de tout les salon
SELECT nom_salon from salon;

-- Affiche les Logins de tout les utilisateurs du salon : LES TUEURS
SELECT nom_salon, login from salon, users where nom_salon='LES-TUEURS' ;

-- AFFICHE les message du salon LES TUEURS, avec heure et date ainsi que la personne qui a envoyé le message
SELECT contenu,heure_message,date_message, login_envoi, nom_salon FROM message, salon WHERE nom_salon='LES-TUEURS';

-- Administrateur des messages :
SELECT idmessage,login_admin from message, admin;






