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
	login_recu         VARCHAR (25)  ,
	idAdmin       INT   ,
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
ALTER TABLE Message ADD CONSTRAINT FK_Message_login_recu FOREIGN KEY (login_recu) REFERENCES Users(login);
ALTER TABLE Message ADD CONSTRAINT FK_Message_login_envoie FOREIGN KEY (login_envoi) REFERENCES Users(login);
ALTER TABLE Message ADD CONSTRAINT FK_Message_idAdmin FOREIGN KEY (idAdmin) REFERENCES Admin(idAdmin);
ALTER TABLE Message ADD CONSTRAINT FK_Message_idSalon FOREIGN KEY (idSalon) REFERENCES Salon(idSalon);
ALTER TABLE Acceder ADD CONSTRAINT FK_Acceder_login FOREIGN KEY (login) REFERENCES Users(login);
ALTER TABLE Acceder ADD CONSTRAINT FK_Acceder_idSalon FOREIGN KEY (idSalon) REFERENCES Salon(idSalon);
ALTER TABLE Admin ADD CONSTRAINT FK_Admin_login_admin FOREIGN KEY (login_admin) REFERENCES Users(login);

------------------------------------------------------------
-- INSERTION 
------------------------------------------------------------


INSERT INTO Users VALUES ('Jean-Pat','stri',TRUE);
INSERT INTO Users VALUES ('Jean-Mimi','stri',FALSE);

INSERT INTO Admin (login_admin) VALUES ('Jean-Mimi');

INSERT INTO Salon VALUES (1,'LES-TUEURS',1);
INSERT INTO Salon VALUES (2,'LES-VIOLENTS',1);

INSERT INTO Acceder VALUES ('Jean-Pat',1);
INSERT INTO Acceder VALUES ('Jean-Mimi',1);
INSERT INTO Acceder VALUES ('Jean-Mimi',2);

INSERT INTO Message VALUES (1,'15/02/1995','20:23:45','bonjour','Jean-Pat','Jean-Mimi',1,1);
INSERT INTO Message VALUES (2,'15/02/1995','20:26:12','bonjour','Jean-Mimi','Jean-Pat',1,1);
INSERT INTO Message VALUES (3,'15/02/2225','23:23:23','MERCI','Jean-Mimi','Jean-Pat',1,2);





