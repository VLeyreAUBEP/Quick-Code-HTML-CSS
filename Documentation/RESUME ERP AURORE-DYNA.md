# RESUME ERP:





## **-------------DEBUT TICKET FORM 21: DECOUVERTE AURORE--------------------------**

# 

## ERP AURORE:



### Création d'un utilisateur de l'ERP:





### Création de plusieurs comptes utilisateur avec rôles/statut/accréditations différents:



.Création d'un compte utilisateur avec nom, prénom et son propre mot de passe.



 	.Un compte utilisateur lors de sa création peut lui voir assigner plusieurs "rôles".

 	.En fonction des rôles assignés, accès possible sur le compte de plusieurs modules différents.

 

 		**Définition d'un rôle:**



 		.Ajout d'un rôle chez un utilisateur implique l'ajout de modules dans l'ERP de l'utilisateur



 		Définition d'un module:



 		.Un module contient différentes fonctionnalités qui dans l'ensemble s'inscrivent dans les différentes tâches de gestion d'entreprise



 		.Utilisateur peut avoir une ressource/ un employé/ une personne qui lui sont assignés.



 		**Définition d'une personne:**



 		.Une personne est un enregistrement dans le système ERP qui a une représentation globale, donc peut être un

 		 individu/employé/client/fournisseur/autre contact externe.



 		**Définition d'un employé:**



 		.Un employé vient spécifier la personne et est formellement lié à l'entreprise.



 		.En général, un employé peut avoir des spécificités sur sa paie, ses horaires et ses accès aux modules.



 		**Définition d'une ressource:**



 		.Une ressource corresponds à tout élément qui constitue au fonctionnement d'une entreprise.



 		.Elle peut être financière (capital, budget), physique (équipements, usines, stocks), humaine (collaborateur, personnel).





 	.Lors de la création d'une personne, remplir coordonnées personnelles puis coordonnées professionnelles.

 	 -> Pour coordonnées pro., choisir entre client/fournisseur (acheteur/vendeur du produit).



 	.Un employé ne peut être assigné à un utilisateur si une personne n'a pas été créée au préalable. (Par def, un employé est une personne).

 	 Lors de sa création, plusieurs critères différents à remplir, important de spécifier le statut de l'employé dans l'entreprise.

 	 Important aussi de spécifier si employé a un responsable qui lui est attitré.



 	.Si responsable, création du utilisateur Responsable qui a aussi ses propres rubriques Personne, Employé, Ressource.



 	.Besoin de création d'un utilisateur RH qui a lui aussi ses propres rubriques Personne, Employé, Ressource.



### Demande de congé:

 

 	.Si employé standard dans l'entreprise, employé peut faire une demande de congé qui va ensuite devoir être validée par le responsable qui lui est rattaché,

 	 puis enfin validé par un employé RH lié à la direction.



 	.Lors de la demande de congé, la ressource caractérisant l'employé doit être set-up pour avoir un compte timbrage. Pour ce faire,

 	 compte utilisateur doit avoir le rôle "**projet admin**" puis -> recherche avancée -> chercher la ressource caractérisant l'employé

 	 -> changer le compte timbrage (date de début, date de fin puis taux d'activité) pour définir les heures de travail de l'employé.



 	.Lorsque la demande de congé de l'employé est enregistrée puis envoyée et répond aux critères ci-dessus, celle-ci passe en

 	 attente de validation du responsable.



 	.Responsable choisit de valider/refuser/modifier/trouver un remplaçant pour la demande de congé



 	.Si responsable a validé la demande, RH doit à son tour prendre une décision donc valider/refuser/modifier/trouver un remplaçant.



 	.Si responsable et RH ont validé la demande, alors la demande de congé est complètement acceptée.





## **-------------------FIN TICKET FORM 21: DECOUVERTE AURORE -------------------------**



## **-----DEBUT TICKET FORM 23: ARTICLE/ENTREPRISE/CONTACT/OFFRES/COMMANDES -----------**





### Création d'un article, entreprise associée, contact de l'entreprise, offres, commandes:

### Manuel commercial:



 	.Dans un ERP, une feature importante utilisée fréquemment est la création de produits, plus précisément d'articles et la création

 	 d'adresses et clients (entreprise) pouvant être liés à ces produits.



 	.Besoin d'ajout de rôle en tant qu'utilisateur pour avoir accès à toutes les composantes permettant ces créations.



 	.Dans cette partie, on va travailler principalement dans le module **COMMERCIAL**.



#####  	Gestion des articles:



 	     		.Besoin du rôle **Commercial + Article** dans utilisateur pour avoir accès au module **COMMERCIAL** et à la section

 			 **Gestion des articles** ainsi qu'aux sous-sections **ACCES RAPIDE + GESTION DES PRODUITS**.

 

######  			Gestion des produits:

 					.Création d'un nouvel article sous **Gestion des articles --> Gestion des produits --> +Nouveau**

 					.Remplir toutes les rubriques indispensables pour la création d'un article.

 					.Un article est lié à une entreprise. Si l'Entreprise correspondante n'est pas déjà dans l'ERP,

 					 besoin de créer une nouvelle adresse à son nom.

 					.Plus précisément, donner nom entreprise, numéro article, désignation de l'article, devise, rabais

 					.Ajouter des positions de tarif, le prix HT en fonction de la quantité donnée est indiqué en prix unitaire.

 

######  			Gestion des catégories:

 					.Pour créer une catégorie et une famille, aller dans **Gestion des articles --> GESTION DES CATEGORIES**

 					.Création d'une catégorie pour venir préciser dans quel "catégorie" (classe générale) se trouve le produit

 					.Création d'une famille qui va venir préciser la catégorie et spécifier par exemple pour des

 					 "Machines d'intérieur" que l'article fait spécifiquement partie de la famille "Appareil électroménager".



#####  	Gestion des clients \& adresses:

 

 			.Besoin du rôle Entreprise dans utilisateur pour avoir accès au module **COMMERCIAL** et à la section

 			 **Gestion d'adresses** ainsi qu'aux sous-sections **ACCES RAPIDE**.

 

######  			Gestion des adresses:

 					.Création d'une nouvelle adresse sous **Gestion d'adresse --> ACCES RAPIDE --> +Nouveau**



 					.Sous Nom, recherche via outil intégré (tel.search.ch) d'un annuaire pour trouver toutes les

 					 coordonnées de la nouvelle entreprise.



 					.Remplir les autres rubriques indispensables à la création de la nouvelle entreprise,

 					 ici spécifier si il s'agit d'un nouveau client ou un nouveau fournisseur est important.



 					.En particulier, spécifier si il s'agit d'un fournisseur ou d'un client. En fonction du choix,

 					 remplissage technique (survoler mais pas rempli lors découverte) pour automatiser versement.



######  			Gestion des contacts:



 					.Création d'un contact lié à l'entreprise précédemment établie via **COMMERCIAL --> Contacts --> +Nouveau contact**.



 					.Remplir toutes les informations des données personnelles (ici contact fictif pour test démo) puis remplir données

 					 professionnelles en spécifiant si fournisseur/client/les deux et la profession du contact.



 					.Dans **Gestion d'adresse --> ACCES RAPIDE** et en cliquant sur l'entreprise précédemment établie, aller dans détails puis

 					 Contacts. Depuis là, il est possible de créer un nouveau contact via +Nouveau contact ou de lier un contact préexistant

 					 dans +Contact existant en cherchant avec nom/prénom le contact précédemment établi.



 					.Méthode depuis **COMMERCIAL --> Contacts --> +Nouveau contact**: création du contact dans la section Contacts

 					 pour ensuite aller dans **Gestion d'adresse --> ACCES RAPIDE**



 					.Toujours au même endroit, sous **Type contact**, sélectionner **Contact facturation** pour pouvoir lier le mail du contact

 					 lors d'une facturation.



 					.Dans la fiche des données du contact, sous **Méthode d'envoi des factures**, préciser **Factures par mail** pour rendre le contact

 					 éligible à la facturation.



 					.En créant contact directement dans Détails de l'adresse entreprise, spécification de l'entreprise rattachée directement dans

 					 la fiche de contact.



 					.Possible de rajouter compte bancaire dans **Détails** du contact sous **Compte(s) bancaire(s)** (Pas réalisé ici pour ne pas créer un compte fictif).

 

 

######  			Gestion des domaines:



 					.Domaine est une catégorisation plus générale d'une entreprise.



 					.Création d'un domaine via **COMMERCIAL --> Gestion d'adresses --> PREFERENCES --> Domaines --> +Nouveau**



 					.Donner un nom et un titre puis spécifier si client/fournisseur voire les deux.



 					.Lier la fiche d'une entreprise avec ce nouveau domaine.



 					.Recherche avancée d'une entreprise possible dans **RECHERCHE AVANCEE** via le domaine.



 

######  			Gestion des statuts entreprise/contact:

###### 

 					.Un statut vient spécifier dans quel état se trouve une entreprise/contact vis-à-vis de l'ERP/AUBEP

 					 (ex: en formation, en attente, client/fournisseur fidèle).



 					.Création d'un statut via **COMMERCIAL --> Gestion des statuts --> +Nouveau**, spécifier si il s'agit d'une personne ou pas.



 					.Dans fiche d'une entreprise ou contact, possibilité de rattacher le statut créer dans **Détails** sous Liste de statuts.

 					 En fonction de la spécification si personne ou pas, peut/ne pas trouver le statut dans la fiche associée.

 

######  			Supprimer / Archiver un client/entreprise:



 					.Tout comme pour un article, on peut archiver une entreprise en passant la rubrique **Inactif de Non à Oui**.



 					.Lors d'une recherche avancée de l'entreprise, si celle-ci est inactive, va seulement apparaître si spécifié dans la recherche

 					 sous **Inactif --> Oui**.

 

######  			Enregistrer et chercher des adresses par secteur:



 					.Tout comme le domaine, on peut rajouter un secteur **COMMERCIAL --> Gestion d'adresses --> PREFERENCES --> Secteur --> +Nouveau**

 					 et faire les même manip comme pour domaine.



######  			Solvabilité d'un client:



 					.Dans la fiche d'une entreprise, 3 états de **solvabilité** d'un client possible: vert/orange/rouge, en fonction de ses paiements

 					 (dans la démo test, on part du principe que état est vert).



 					.Etat orange apparaît si paiement est dépassé de 15 jours en moyenne.



 					.Etat rouge peut apparaître dans différents cas de figure (voir documentation Confluence sous **Manuels utilisateurs --> Manuel Commercial**

 					 --> Gestion des clients \& adresses --> Solvabilité d'un client\*\*).



#####  	Gestion des messages:

##### 

 			.Via les modules **ACHAT/COMMERCIAL/RH**, on peut accéder à la section Gestion des messages.



 			.Depuis cette section, possibilité d'envoyer un mail à l'utilisateur mais aussi à un contact ou autre. Pour ce faire, chercher l'adresse Email

 			 en cliquant sur le + pour plus de rubrique de recherche et une fois trouver **--> +Nouvea**u.



 			.On peut changer les configurations de l'email d'envoi dans **Gestion des messages --> PREFERENCES** seulement si le rôle **Direction** a été attitré à l'utilisateur.



 			.Dans **Gestion des messages --> TEXTES --> +Nouveau**, il est possible de créer du texte en format HTML qui viendra s'ajouter au mail créé.



 			.Pour un contact, si celui-ci a bientôt été lié à une entreprise et qu'il a une adresse email dans sa fiche de contact,

 			 il est possible de créer une signature propre pour les envois de mail à ce contact depuis **COMMERCIAL --> Gestion d'adresses**

 			 dans les **Détails** de l'entreprise sélectionnée et en cliquant sur le contact lié.



 

#####  	Gestion des offres:

 

 			.Création d'une offre via **COMMERCIAL --> Gestion des offres --> +Nouveau**.



 			.Ajouter le client (entreprise) préalablement établi pour ajouter automatiquement toutes les coordonnées puis ajouter une date de relance au cas où

 			 il n'y a pas eu de suite après l'envoi.



 			.Ajouter un article précédemment établi sous **Détails** de l'offre **--> Ajouter**.



 			.Une fois toutes les rubriques obligatoires remplies, passer l'offre en attente puis créer une activité.



 			.La création d'une activité se fait dans les **Détails --> Activités**. Spécifier la personne responsable, trouver un titre (exemple: Valider l'offre liée)

 			 et mettre une date de rappel pour que si responsable choisi est coordination, celle-ci doit avoir traité la demande jusqu'à la dite date.



 			.Après avoir rempli toutes les rubriques, enregistrer puis cliquer directement sur l'activité pour joindre un mail pour l'envoi.



 			.Passer l'offre du statut **en attente** à envoi si le responsable qui s'occupe d'établir l'offre est aussi celui qui l'envoi.



 			.Lorsque le statut est passer **en attente**, joindre tout type de documents lié à l'offre avec la **case** à coté de **Détails** et **drag and drop** les documents.



 			.Ceci fait, on peut alors passer à l'envoi par Mail sous **+Nouveau Mail** puis choisir le Mail lié au contact lié à l'entreprise (ici adresse Email AUBEP

 			pour éviter d'envoyer véritablement un mail à une entreprise existante pour une offre fictive). Puis, possible de changer la forme des mails avec

 			signature, entête etc + automatiser (pas fait ici).



 			.Après envoi du mail, si on part du principe que l'offre est acceptée par le client, passer l'offre du statut **Envoyée** au statut **Acceptée**.



 			.Après acceptation, il est possible de créer une commande depuis l'offre qui se retrouve à la section suivante "**Gestion des commandes**".





#####  	Gestion des commandes:



 			.Une commande peut soit être créée depuis **COMMERCIAL --> Gestion des commandes --> +Nouveau** puis ajouter de nouveau les informations du client ainsi que

 			l'article associés à l'offre de la section précédente puis enfin **enregistrer**.





 			.Il est possible aussi de créer la commande tout de suite après l'acception de l'offre dans la section Gestion des offres

 			sous l'offre précédemment établie. Il faut lors de la création, ajouter une commande sous **Détails** de la commande (précédemment pour l'offre c'était

 			**Détails** de l'offre).



 			.Comme pour les offres, une commande peut passer de l'**état en édition** à l'**état en attente** à l'**état confirmée**. L'**état confirmée** vient seulement après

 			avoir établi l'inventaire des commandes dans la liste des commandes.



 			.Finalement passer la commande en facture en appuyant sur "**+Livraison/facture**" puis **enregistrer**.



 			.Il est possible d'imprimer la facture en cliquant sur le **logo de l'imprimante**.



 





## **-------FIN TICKET FORM 23: ARTICLE/ENTREPRISE/CONTACT/OFFRES/COMMANDES----------**

## **-------------------DEBUT TICKET FORM 31-------------------------------------**

# 

## ERP DYNA:



### Paramétrage utilisateur:



 	.Comme pour ERP AURORE, ERP DYNA a une gestion des utilisateurs pour ajouter des rôles, changer de mot de passes, enlever/ajouter une double authentification etc..



 	.Pour y accéder aller sous **ADMINISTRATEUR GENERAL --> Gestion des contacts --> Chercher/Nouveau --> NomUtilisateur --> Modifier**.

 

### Création d'un article:



 	.Sous DYNA, lors de la création d'un article, plus de rubriques/détails/descriptions à remplir.



 	.Dans **Menu principal (à gauche) --> Articles --> Nouveau,** on peut venir créer un article avec un **numéro d'article** qui en général est lié à une catégorisation

 	(exemple PIO pour pignon ou TAS pour tasseau). Ces différentes catégorisations peuvent se retrouver en détail sous **Méthode --> Outil codification**.



 	.Pour que la création d'un article soit valide, rentrer **numéro d'article** en fct d'une catégorisation existente (p.x. TAS), son **Type**, son **Unité**, le **Type de composant**,

 	une **Désignation interne**, un **N° plan** (référence au plan de conception de la pièce), un **Indice** (un plan peut avoir indice selon sa version), une **Matière**, puis faire un

 	**enregistrement rapide**.

#####  	----------------ALERT - NE MARCHE PAS CHEZ MOI MEME APRES AVOIR AJOUTE DES ROLES-------------

 	.Une fois **enregistrement rapide** terminé, ajouter une image de la pièce ainsi qu'un plan de la pièce sous **Image** et sous **fichier lié (menu de l'article en bas)**.

 	On peut décider d'ajouter un plan de la pièce pour chaque étape de la gamme (une gamme est une transformation d'une pièce depuis l'étape brut 1 à l'étape du produit fini)



 	puis ajouter le plan de la pièce finale et l'identifier en tant que **plan fini** sous **Définir comme plan fini** (vient se rajouter automatiquement dans la fiche de l'article).



######  	**Création d'opérations:**



 		.Définir toutes les étapes de fabrication de la gamme de l'article dans DYNA. Venir préparer/créer toutes les opérations de production importante de l'article sous

 		**Menu principal --> Opération --> BILIOTHEQUE --> Nouveau/Chercher**. Exemple d'opération: Meulage/Brossage/Lavage/Satinage/Décolletage.



 		.Lors de la définition des opérations, spécifier la machine avec laquelle c'est fait. Pour ce faire, ajouter machine déjà existente ou créer une machine sous

 		**Ressources --> RECHERCHE RESSOURCE --> Chercher/ Nouvelle ressource**.



######  	**Création de gammes:**

 

 		.Une fois la création de différentes opérations terminée, on peut établir différentes gammes possibles qui peuvent être souvent réutilisées, appelées **Gammes standards**.

 

 		.Ces gammes peuvent être établies sous **METHODE --> Gammes standards**.

 

 		.On peut donc rouvrir l'article et ajouter une gamme standard préexistante en cliquant sur le bouton **Ajouter une gamme** en spécifiant l'état de la gamme sous **Etat** (p.ex.

 		Gamme article), puis un **Nom** en fonction de l'article (Pignon/Tisseau/Vis etc...). Une fois la gamme existante qui s'adapte bien à notre article a été trouvée, **Définir la**

 		**gamme sélectionnée**, puis on peut décider après **Validation** de changer la gamme si il y a des opérations inutiles en cliquant directement dessus. La gamme vient s'afficher

 		en haut à droite.



 		.Dans chacune des opérations, spécifications possibles dans rubrique (par exemple le Tmps cycle, Tmps de réglage (mise en train), le produit matière de départ) assez

 		technique qui viennent spécifier ce qu'il se passe dans chacune des ops.



######  	**Assemblage d'articles:**



 		.Un article peut être l'assemblage de deux composants (articles) préalablement créé. Exemple: création d'une pièce mobile à travers une gamme d'opération 1. Assemblage

 		automatique et 2. Contrôle final via deux pièces (articles) différentes renseignées sous le **menu de l'article --> Composants**.

 

 		.Logiquement, chaque composant a sa propre fiche article avec sa propre gamme d'opération et **eux même leur propre composant** (qui sont des articles).



 		.Chaque composant et composant de composant a sa propre gamme avec des spécifications de mise en train standard (temps d'utilisation possible pour l'article) et de temps

 		de cycle (très court généralement, temps de création du composant).



 		.Dans les détails de l'opération, en fonction du rôle de l'utilisateur, accès à plus ou moins de précision sur l'opération. Exemple: passer du rôle **METHODE** au rôle

 		**LOGISTIQUE** permet d'afficher en supplément sur la fiche de l'opération, les tarifs horaires: **Tarif horaire MT** (tarif/h pour régler la machine) et **Tarif horaire TC**

 		(tarif/h de l'utilisation de la machine).



######  	**Nomenclature/ Cas d'emploi:**



 		.Dans la fiche de la pièce assemblée, sous  **nomenclature** on peut voir toutes les pièces par niveau qui ont servi à la confection de cette pièce assemblée. On peut aussi

 		voir le stock disponible pour chacun de ces composants. Outil de simulation disponible (toujours sous **nomenclature**) en fonction de la quantité d'articles (pièce)

 		assemblés en appuyant sur **Recharger la liste et simuler le coût**. Permet d'avoir des informations sur les coût mais aussi le temps et les délais possibles.



 		.A l'inverse de **nomenclature**, **Cas d'emploi / mobile** vient renseigner dans quels articles assemblés vient se retrouver un composant.



######  	**Création d'OFs/Lots:**



 		.Une fois les articles et composants créés, on peut lancer la production sous **forme de lots** avec chacun une certaine quantité de pièce. Chaque lot peut se trouver à des

 		stades différents d'opération dans la gamme du composant/article. On peut donc retrouver les lots qui sont en **En stock** et les lots qui sont **En cours**.



 		.On peut donc créer un lot (de pignon par exemple) sous **En cours --> Créer OF/Lot**. N° de lot créé automatiquement avec le nom de l'article puis on vient spécifier la

 		**Qté initiale** (p. ex. 5000 pièces). **OF signifie Ordre de Fabrication**.



######  	**Etats d'un OF:**



 		.Un lot suit tout un schéma avec des stades différents. Le schéma classique est le suivant **(Nouvel OF --> En attente --> Prêt --> En externe --> En cours --> En stock**

 		**--> Livré)**.





 		.Un lot dans l'état **En attente** peut voir sa gamme être modifié car il n'est pas en état de production.



 		.Dans le **Menu du OF/Lot**, on retrouve les **Opérations de la gamme**, les **Documents liés**  de l'article assemblé, les **Articles nécessaires pour la gamme**



 		.Dans la **barre de modification du OF/Lot**, on peut passer le lot **En production**. L'état dans lequel sera le lot correspond à **Prêt**.



 		.En état **Prêt**, on peut dans le **Menu du OF/Lot**, sous **Opérations de la gamme** **--> Actions**, en **appuyant sur la flèche**: **planification** de chaque opération de la gamme ainsi que

 		leur **Délai** possible.



 		.De nouveau, en changeant le rôle de l'utilisateur de **METHODE** à **LOGISTIQUE**, on peut avoir accès à plus de détails du OF/Lot (Ex: **Fin d'OF**).



######  	**Gestion des ressources (machines):**



 		.Dans le **Menu du OF/Lot**, on peut choisir la machine avec laquelle on veut faire une des opérations sous **Ressource**. On peut même **en cliquant** à côté de **Ressource**,

 		afficher le planning de la pièce avec les différentes machines en parallèle et l'état dans lequel elles sont sur une certaine durée.



 		.**En cliquant** sur la **Ressource** de l'opération, on peut y voir la fiche avec par exemple la **planification automatique** (activation de la machine en fonction) et le

 		**mode de capacité** (capacité infinie: il va tout mettre à aujourd'hui - capacité finie: il va chercher une plage disponible).



######  	**Validation des états d'opérations de gamme:**



 		.En revenant sur le **Lot** et dans la **barre de modification du OF/lot**, on peut alors **Démarrer la gamme**, et les opérations vont se faire les unes après les autres.

 		La première opération de la gamme passe en état **En réglage** et en validant le réglage, il demande le temps de mise en train effectif qu'il a fallu réellement

 		ainsi que le temps de cycle réel pour la fabrication de la pièce (temps pour la régler).



 		.Ainsi, chaque opération a différents états qui peuvent venir être validé à la main.



 		.Dans l'état **En cours de contrôle** de l'opération, on peut venir voir si la pièce a rempli toutes les rubriques de contrôle préalablement établies ainsi que modifier la

 		quantité courante des pièces du lot si il y a eu de la casse lors de l'opération. On peut alors **accepter**.



 		.L'état de la première opération passe alors en état **Terminée** avec toutes les informations sur le début/fin/qui a validé de l'opération.



 		.Toutes les modifications de quantité sont stockées dans **historique** dans le **Menu du OF/Lot**.



 		.**Toutes ces différentes étapes/spécifications démontrent la traçabilité de l'ERP pour un article en production.**



######  	**Opération chez un sous-traitant:**



 		.Prochaine opération, on ne sait pas la faire (préalablement spécifié dans la gamme en faisant appel à un sous-traitant). Passer par l'intermédiaire du sous-traitant.

 		Cette fois, au lieu de **valider** l'état de l'opération, **envoie d'un bulletin de livraison** (en appuyant sur la petite camionnette) qui a été préalablement rempli.

 		On peut spécifier lors de la création du bulletin, le coup unitaire de l'opération. Pour lancer la livraison, appuyer sur **Lancer le bulletin de livraison**.



 		.Le lot passe alors en état **En externe**. Lorsque la pièce revient, on va pouvoir quittancer (valider) le retour avec toutes les précisions qui vont avec.

 		On retrouve aussi cela dans le tableau de bord **Gestion centrale (Logistique)** sous **Retour de sous-traitance attendu**. Comme on avait spécifié dans l'opération externe,

 		le temps que cela prend, on a dans la **fiche du bulletin de livraison**, un **délai de retour** qui est automatiquement rempli.



 		.Comme pour l'opération précédente, on peut passer l'état de l'opération dans l'état **En cours de contrôle**, ce qui permet d'avoir toutes une statistique sur le

 		sous-traitant en fonction de la qualité des opérations.



######  	**Quelques fonctionnalités/informations utiles:**



 		.Possible d'accepter/valider les différents états de chaque opération d'un OF/Lot via tablette via une application.



 		.Chose possible: si production d'une opération dure sur plusieurs jours, on peut venir spécifier le nombre de pièce créée pour chaque jour sous **Qté traitée**.



 		.Une fois les derniers états de la dernière opération validés, on a alors **fini un cycle de fabrication**.



 		.On aurait pu aussi valider les opérations en allant sur **la fiche suiveuse** et en **scannant les codes barres** liés à chaque opération.



 		.Pour des petites pièces, impression de petites étiquettes avec code barre.



 		.A la fin de la gamme de production, ajout du coût unitaire automatique du lot (combien vaut la pièce réellement après les opérations. Après chaque op, pièce gagne

 		valeur.) Exemple: Si il y avait eu plus de pièces cassées pdt les ops, les pièces restantes auraient gagné de la valeur.



######  	**Séparation d'un lot:**



 		.Cas de figure: si l'outil se casse pendant une opération et qu'il reste un certain nombre de pièce à produire, comment faire? Faire dans la **barre de modification du**

 		OF/lot une Séparation OF/Lot en venant spécifier la **Qté à séparer** (nombre de pièces qui sont bonnes). Cela vient séparer le lot après l'arrêt de production en deux pour



 		venir traiter les pièces qui sont déjà bonnes et leur appliquer les prochaines opérations (Nouveau lot avec une référence au lot d'origine) et voir le nombre de pièce

 		qu'il restait à produire sur le lot d'origine. Tout cela peut se retrouver dans l'**historique**.



######  	**Gestion du stock pour un article assemblé:**



 		.Pour le cas d'un lot de pièces assemblées, dans le **Menu du OF/Lot,** lors du début de l'opération d'assemblage, on vient modifier le stock dans **articles nécessaires pour**

 		**la gamme** soit **via le code barre** ou **à la main** (sur l'ERP en appuyant sur le bouton **Déduire du stock**) en le déduisant (**Déduire du stock** soit en faisant une **Réservation**.



 	.Tout vient de nouveau s'ajouter dans l'\*\*historique\*\* en le \*\*chargeant\*\*.









### Création d'une commande:



 		.Une commande se crée dans le **Menu principal --> + Nouvelle commande simple / + Nouvelle commande multiple** (en fonction de si le client a besoin d'une nomenclature ou

 		pas). Ajouter un **N° de commande client** ainsi qu'un **Client** dans la fiche de la commande. Cela va automatiquement remplir l'**Adresse de facturation**, l'**Adresse de**

 		**livraison** liée au client ainsi que le \*\*N° Confirmation de commande\*\*.



 		.Dans le **type de commande**, on a une différenciation entre les **commandes clients** et les **commandes de réclamation**/retours de pièce.



######  	**Articles de la commande:**



 		.On peut ensuite définir en bas de page les **Articles de la commande** en cherchant dans la **barre de recherche Accès rapide** et en ajoutant l'article assemblé préalablement

 		créé. On peut ensuite toujours décider de changer les **Qté néc.** de l'article, un **prix CHF** ainsi que de prévoir un **Délai** dans l'article de la commande ajouté. Lorsqu'on

 		estime que toute spécification est là, on passe par **Enregistrer**.



######  	**Délais et besoins:**



 		.A l'inverse de la démo Aurore, sur Dyna il n'y a pas de positionnement de prix mais plus des **Délais et besoins** qui viennent spécifier à côté de l'onglet **Articles**

 		**de la commande**, des nouvelles quantité **Qté** avec leur **Délai** associé. On lie ainsi une liste de délai à un article d'une commande.



 		.Au niveau de la programmation, à l'inverse d'AURORE pas d'héritage direct entre la commande et l'article, c'est une copie de l'article de référence (ERP unit).

 		Ainsi on peut avoir des configurations différentes dans la commande que dans l'article.



 		.On peut toujours ajouter des remarques (dans l'onglet sélectionneur) car parfois un client vient ajouter des précisions quant à un délai et cherche à le repousser.



######  	**Etats de la commande En cours:**



 		.Passer la commande à l'état **En cours**. On peut alors voir qu'il y a un **bouton de rafraichissement** qui vient s'ajouter dans l'article de commande à côté du

 		**N° d'articles**. Comme un article de commande est une copie de la classe article, il vient mettre à jour l'article de la commande si une nouvelle fonctionnalité

 		a été ajoutée dans la section article et que donc l'article de la commande est sur une ancienne version. On peut aussi charger des nouveaux composants ajouter à

 		l'article si nécessaire.



 		.Si on ne se rappelle plus des différents composants d'un article, on peut appuyer sur le bouton **Charger les composants** en fonction du **niveau de nomenclature**

 		choisi pour retrouver tout le visuel des composants à ce niveau. On peut aussi voir les **quantités des composants** mis-à-jour automatiquement en fonction des **Qtés** rentrées

 		pour l'article assemblé. On a aussi les informations des stocks des composants mis-à-jour automatiquement.



 		.Colonne de **Finition**: vient ajouter un stock d'un composant d'une autre couleur, donc un composant avec un style un peu différent. Utile si on est en rupture de stock du

 		composant choisi à la base.

 

 		.Colonne d'**Ebauche**: il s'agit d'une version plus primaire du composant pas totalement transformé qui peut servir de base à une multitude de composants et donc servir

 		pour ainsi dire de matière première.

 

######  	**Calculs prévisionnels automatiques des débuts/fins de productions:**



 		.Bouton **Afficher/Cacher détails** dans **Délais \& besoins**: vient faire un calcul automatique des différents débuts et fins de production de chaque article lié à des composants avec

 		eux aussi leurs différents débuts/fins de production, et ceci en prenant en compte les différentes commandes avec les différents délais qui ont été faits.

 		Ces calculs sont des préindications/prévisions avant même qu'on ait lancé la production et sont établis à travers les différentes informations des gammes.



 		.En fonction des calculs de dates annoncés, on peut voir si il est réalisable de tenir les délais établis au début de la commande.



 		.**Rubrique informative** sous forme de colonne à droite: calcul la nomenclature, planification, ressources, les manques au niveau des stocks, les manques en cours,

 		ce qui peut être utile si on a besoin d'avoir des informations supplémentaires directement au client.



######  	**Création d'un OF depuis l'article de commande:**



 		.Depuis l'article de commande, on peut aussi créer un lot/OF qui va se voir ajouter des délais automatiques en fonction des calculs prévisionnels précédents. Il est 			possible que les délais apparaissent en rouge si ils ne sont pas réalisable. On peut rechanger la quantité d'articles si nécessaire.



 		.On peut alors refaire le même cheminement que pour la section précédente "Création d'un article".



 		.Dans une OF, on peut venir spécifier le délai bloquant qui vient alerter si le délai de la fin de l'OF ne coïncide pas avec les délais de la chaine de commande.



######  	**Tableau des besoins:**

 

 		.Peut être atteignable soit par la **rubrique informative** à droite de la commande créée, soit depuis le module **Commandes --> TABLEAU DES BESOINS**.

 

 		.Le tableau des besoins est un récapitulatif visuel de la commande d'un article avec ses composants associés aussi affichés et un calendrier des stocks

 		en fonction des délais prévus et des dates de production.



 		.On pourrait par exemple décider de rajouter une certaine quantité d'un composant à travers le tableau des besoins si on se rend compte qu'on a encore du stock (voir si

 		c'est sous forme de réservation) et que c'est nécessaire pour respecter la quantité de production de pièce assemblée en fonction de son stock qui n'est pas suffisant.

 		Tout ceci en prenant en compte les délais de commande et les délais de productions des composants.



 		.Dans le cas où l'on se retrouve avec beaucoup de commandes qui ont elles-mêmes beaucoup de composants différents, les clients utilisent le tableau des besoins de manières

 		méthodiques en partant des nomenclatures de bas échelle avec leur stock et les délais de productions.



######  	**Carnet de commandes:**



 		.Le **carnet de commandes** est une forme de Tableau des Besoins et vient afficher les différentes commandes avec le chiffre d'affaire engendré si les délais sont bien respectés.



######  	**Suivie des délais**



 		.Vient afficher tous les différents articles en cours de production avec leur propre délai qui est soit encore valable (vert), soit il y a du retard (rouge).



 

### Gestion/visualisation des ressources/groupes de production:





######  	**Groupe de ressources:**



 		.Visualisation de toutes les ressources (dans notre cas des machines) qui sont triées par groupe. Peut être afficher selon un planning quotidien/hebdomadaire/mensuel.

 		Dans un planning, affichage de toutes les ressources (machines) qui sont peuvent être dans un état bien précis. Code couleur en fonction de son état: *Gris pour attente*,

 		*jaune pour réglage*, *orange pour en cours*, *bleu pour en Contrôle*, *rouge pour Externe*, *bleu clair pour terminé* et encore d'autres couleurs en fonction de l'*état du stock*...



 		.Peut **translater** la **planification** d'un état d'une machine à une autre si les deux **machines** peuvent faire la **même tâche**. Lors de la translation du planning(drag le planning),

 		indication en bleu clair des machines qui peuvent faire la même tâche/production. Cette translation est **seulement possible** si il a été **indiqué en amont dans l'opération** que

 		celle-ci peut prendre plusieurs ressources différentes pour faire la même production



 		.En cliquant spécifiquement sur l'une des barres du planning, on peut encore visualiser des détails rattachés à la ressource s'afficher.



 		.Replanification possible si on translate par exemple une ressource non pas selon d'autres machines à disposition (axe y) mais selon le calendrier (axe x), puis en cliquant sur la

 		ressource qui s'est faite chevauchée par une autre pour rentrer dans ses détails et pour cliquer sur l'**étoile** à côté de **planning**. Ainsi, recalcule de tout le planning selon les contraintes

 		imposées en amont.







######  	**Tableau de groupe:**



 		.Dans le **Menu principal --> Pilotage --> Suivis des opérations --> TABLEAU DE GROUPE**, visualisation possible d'un tableau de toutes les commandes en cours de tous les clients et de marquer où



 		sont les pièces rattachées à ces commandes dans le processus de production.



 		.Ce tableau est établi à l'aide de **groupes d'opération** qui sont construits dans **Menu principal --> Opérations --> GROUPE D'OPERATION**. On établit ainsi des groupes d'opération en assemblant

 		différentes ressources (machine) dans différents groupes (une machine peut se retrouver dans plusieurs groupes différents) et en libellant le groupe puis en lui rattachant une couleur 			d'identification.



 		.Ainsi en retournant dans les **suivis des opérations**, visualisation rapide des articles dans les groupes d'opérations différents pour chaque commande sans rentrer plus dans les détails.



 

### Calcul des besoins:



 		.Accès au calcul des besoins dans: **Menu principal --> Pilotage --> Calcul des besoins globaux**. **Calcul des besoins**: itérations sur toute la base de données pour aller calculer à tous les niveaux 		de nomenclatures: nos états de stocks, qu'est ce qu'il y a en cours, qu'est ce qu'il y a comme stocks dans les niveaux inférieurs et ressortir tout cela dans le tableau des besoins. Calcul assez 		long qui est en général planifié pendant la nuit dans des scripts.



 		.**Astuce**: en changeant l'url dans les calculs des besoins en **URL?ADMIN**, apparition des boutons **calculer les besoins** et **CBN attention (ignore limite 1 an)** qui calcul les besoins sur TOUTE la base 		de données.

 

 		.AURORE fait aussi un calcul des besoins mais qui n'est pas visualisé dans le temps alors que DYNA oui! Ainsi, on peut afficher le calcul des besoins en filtrant jusqu'à une certaine date et en

 		précisant l'échelle de temps (jours/mois/années).



 		.Affichage du **calcul des besoins** va donc afficher la **temporalité** selon l'axe x et une liste de différents/es **besoins/caractéristiques** d'un article placé au plus haut niveau de la nomenclature

 		selon l'axe y. Il y a donc les **Besoins bruts** qui sont la quantité d'un article prévu à une certaine date, les **OFs lancés** pour garantir la production des besoins, les **Stocks prévisionnels** pour 		indiquer le stock nécessaire en fonction de la quantité demandée et des OFs de prévu et **les Besoins nets** qui sont des stocks à produire si les **Stocks prévisionnels** ne sont pas suffisamment 			grand.



 		.Si les **conditions des besoins** ne sont pas remplies car le **Stock prévisionnel** et les **OFs lancés ne couvrent pas** la quantité d'articles (**Besoins bruts**) demandée --> **encadré rouge** du planning.



 		.**En cliquant** sur le **petit plus** à côté de l'article qui est placé au plus de la nomenclature --> affichage des calculs des besoins pour les composants se trouvant dans une nomenclature à plus bas

 		niveau.



 		.Si les **Besoins bruts** ne sont pas satisfaits (**encadré rouge**), les **Besoins nets** ont des **petits boutons** pour relancer des OFs en interne/des achats envers un sous-traitant pour s'approvisionner.





 		.Peut y avoir des confusions au niveau des Besoins bruts dans le calcul des besoins si mauvaises paramétrisations au niveau des articles/gamme/opération/commande/lot/composants

 		(paramétrisations pas très rigoureuses) en amont.

## 

 



 

 



 

