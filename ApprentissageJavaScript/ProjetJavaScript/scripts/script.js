/*********************************************************************************
 * 
 * Ce fichier contient toutes les fonctions nécessaires au fonctionnement du jeu. 
 * 
 *********************************************************************************/

/**
 * Cette fonction affiche dans la console le score de l'utilisateur
 * @param {number} score : le score de l'utilisateur
 * @param {number} nbMotsProposes : le nombre de mots proposés à l'utilisateur
 */
function afficherResultat (score, nbMotsProposes) {
    let contenuZoneScore = String(score + " / " + nbMotsProposes);

    let zoneScore = document.querySelector(".zoneScore span");
    zoneScore.textContent = contenuZoneScore;

    // Autre façon d'écrire
    /*
    Récupération de la zone dans laquelle on va écrire le score
    let spanScore = document.querySelector(".zoneScore span")
    Ecriture du texte
    let affichageScore = `${score} / ${nbMotsProposes}` 
    On place le texte à l'intérieur du span. 
    spanScore.innerText = affichageScore
    */
}

function mettreAJourInterface(listeProposition) {
    console.log("Nouvelle liste :", listeProposition);
    // Autres traitements
}

/**
 * Cette fonction affiche une proposition, que le joueur devra recopier, 
 * dans la zone "zoneProposition"
 * @param {string} proposition : la proposition à afficher
 */
function afficherProposition (motAffiche) {
    let wordDisplay = document.querySelector(".zoneProposition");
    wordDisplay.innerText = motAffiche;
}

/**
 * Cette fonction construit et affiche l'email. 
 * @param {string} nom : le nom du joueur
 * @param {string} email : l'email de la personne avec qui il veut partager son score
 * @param {string} score : le score. 
 */
function afficherEmail (nom, email, score) {
    let mailto = `mailto:${email}?subject=Partage du score Azertype&body=Salut, je suis ${nom} et je viens de réaliser le score ${score} sur le site d'Azertype !`
    location.href = mailto
}

/**
 * Cette fonction vérifie la validité du nom de l'utilisateur.
 * @param {string} nom : le nom du joueur
 */
function validerNom (nom) {
    if(nom.length < 2){
        throw new Error("Le nom \"" + nom + "\" est trop court");
    }
}

/**
 * Cette fonction vérifie la validité de l'email rentrée par l'utilisateur.
 * @param {string} email : l'email de la personne avec qui il veut partager son score
 */
function validerEmail (email) {
    let regex = new RegExp("[a-z0-9._-]+@[a-z0-9._-]+\\.[a-z0-9._-]+");
    if (!regex.test(email)) {
        throw new Error("L'e-mail \"" + email + "\" n'est pas valide");
    }
}

function afficherMessageErreur (messageErreur) {
    let spanErreurMessage = document.getElementById("erreurMessage");

    if (!spanErreurMessage) {
        let divPopUp = document.querySelector(".popup");
        spanErreurMessage = document.createElement("span");
        spanErreurMessage.id = "erreurMessage";
        divPopUp.append(spanErreurMessage);
    }
    spanErreurMessage.innerText = messageErreur;
}

function gererFormulaire (scoreEmail) {
    try {
        let nom = document.getElementById("nom");
        let email = document.getElementById("email");

        const sujet = nom.value;
        const message = email.value;

        validerNom(sujet);
        validerEmail(message);
        afficherMessageErreur("");
        afficherEmail(sujet, message, scoreEmail);
 
    }catch(erreur) {
        afficherMessageErreur(erreur.message);
    }
}

function lancerJeu () {
    // Initialisations
    initAddEventListenerPopup();
    let score = Number(0);
    let i = Number(0);
    let listeProposition = listeMots;

    let buttonValidation = document.getElementById("btnValiderMot");
    let inputWriting = document.getElementById("inputEcriture");

    afficherProposition (listeProposition[i]);

    // Gestion de l'événement click sur le bouton "valider"
    buttonValidation.addEventListener("click", () => {

        if (inputWriting.value == listeProposition[i]){
            score++; 
        } 

        i++;
        afficherResultat (score, i);
        inputWriting.value = "";

        if (listeProposition[i] == undefined) {
            afficherProposition ("Le jeu est fini");
            buttonValidation.disabled = true;
        }else{
            afficherProposition (listeProposition[i]);
        }
    });

    // Gestion de l'événement change sur les boutons radios.
    let listeRadios = document.querySelectorAll(".optionSource input");
    for (let x = Number(0); x < listeRadios.length; x++) {
        listeRadios[x].addEventListener("change", (event) => {
            if (event.target.value == "1") {
                listeProposition = listeMots;

            }else {
                listeProposition = listePhrases;
            }
            afficherProposition(listeProposition[i]);
        })
    }

    // Gestion de l'évènement submit sur le formulaire de partage.
    let form = document.querySelector("form");
    form.addEventListener("submit", (event) => {
        // On empêche le comportement par défaut
        event.preventDefault();
        let scoreEmail = score + " / " + i;
        gererFormulaire (scoreEmail);
        
    })
    afficherResultat (score, i);
}

