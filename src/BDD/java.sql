------------------------------------------------------------
--        Script Postgre 
------------------------------------------------------------

------------------------------------------------------------
-- Table: Statut
------------------------------------------------------------
CREATE TABLE Statut(
	Absent BOOL  NOT NULL ,
	login  VARCHAR (25)  ,
	CONSTRAINT prk_constraint_Statut PRIMARY KEY (Absent)
);


------------------------------------------------------------
-- Table: Users
------------------------------------------------------------
CREATE TABLE Users(
	login VARCHAR (25) NOT NULL ,
	mdp   VARCHAR (25)  ,
	CONSTRAINT prk_constraint_Users PRIMARY KEY (login)
);


------------------------------------------------------------
-- Table: Salon
------------------------------------------------------------
CREATE TABLE Salon(
	idSalon   SERIAL NOT NULL ,
	nom_Salon VARCHAR (25)  ,
	login     VARCHAR (25)  ,
	idMessage INT   ,
	idAdmin   INT   ,
	contenu   VARCHAR (250)  ,
	CONSTRAINT prk_constraint_Salon PRIMARY KEY (idSalon)
);


------------------------------------------------------------
-- Table: Message
------------------------------------------------------------
CREATE TABLE Message(
	idMessage     SERIAL NOT NULL ,
	date_Message  DATE   ,
	heure_Message TIMETZ   ,
	idAdmin       INT   ,
	contenu       VARCHAR (250)  ,
	login         VARCHAR (25)  ,
	login_Users   VARCHAR (25)  ,
	CONSTRAINT prk_constraint_Message PRIMARY KEY (idMessage)
);


------------------------------------------------------------
-- Table: Admin
------------------------------------------------------------
CREATE TABLE Admin(
	idAdmin   SERIAL NOT NULL ,
	idMessage INT   ,
	idSalon   INT   ,
	CONSTRAINT prk_constraint_Admin PRIMARY KEY (idAdmin)
) ;


------------------------------------------------------------
-- Table: Acceder
------------------------------------------------------------
CREATE TABLE Acceder(
	login   VARCHAR (25) NOT NULL ,
	idSalon INT  NOT NULL ,
	CONSTRAINT prk_constraint_Acceder PRIMARY KEY (login,idSalon)
);


------------------------------------------------------------
-- Table: Afficher
------------------------------------------------------------
CREATE TABLE Afficher(
	idSalon   INT  NOT NULL ,
	idMessage INT  NOT NULL ,
	CONSTRAINT prk_constraint_Afficher PRIMARY KEY (idSalon,idMessage)
);



ALTER TABLE Statut ADD CONSTRAINT FK_Statut_login FOREIGN KEY (login) REFERENCES Users(login);
ALTER TABLE Message ADD CONSTRAINT FK_Message_login FOREIGN KEY (login) REFERENCES Users(login);
ALTER TABLE Message ADD CONSTRAINT FK_Message_login_Users FOREIGN KEY (login_Users) REFERENCES Users(login);
ALTER TABLE Admin ADD CONSTRAINT FK_Admin_idMessage FOREIGN KEY (idMessage) REFERENCES Message(idMessage);
ALTER TABLE Admin ADD CONSTRAINT FK_Admin_idSalon FOREIGN KEY (idSalon) REFERENCES Salon(idSalon);
ALTER TABLE Acceder ADD CONSTRAINT FK_Acceder_login FOREIGN KEY (login) REFERENCES Users(login);
ALTER TABLE Acceder ADD CONSTRAINT FK_Acceder_idSalon FOREIGN KEY (idSalon) REFERENCES Salon(idSalon);
ALTER TABLE Afficher ADD CONSTRAINT FK_Afficher_idSalon FOREIGN KEY (idSalon) REFERENCES Salon(idSalon);
ALTER TABLE Afficher ADD CONSTRAINT FK_Afficher_idMessage FOREIGN KEY (idMessage) REFERENCES Message(idMessage);
