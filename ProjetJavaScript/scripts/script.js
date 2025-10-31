/*********************************************************************************
 * 
 * Ce fichier contient toutes les fonctions nécessaires au fonctionnement du jeu. 
 * 
 *********************************************************************************/


function afficherResultat (score, nbMotsProposes) {
    // console.log("Votre score est de " + score + " sur " + nbMotsProposes);
    let contenuZoneScore = String(score + " / " + nbMotsProposes);

    let zoneScore = document.querySelector(".zoneScore span");
    zoneScore.textContent = contenuZoneScore;
}

function mettreAJourInterface(listeProposition) {
    console.log("Nouvelle liste :", listeProposition);
    // Autres traitements
}

function afficherProposition (motAffiche) {
    let wordDisplay = document.querySelector(".zoneProposition");
    wordDisplay.innerText = motAffiche;
}

function lancerJeu () {
    let score = Number(0);

    let buttonValidation = document.getElementById("btnValiderMot");
    let inputWriting = document.getElementById("inputEcriture");
    let i = Number(0);
    afficherResultat (score, i);

    afficherProposition (listeMots[i]);
    buttonValidation.addEventListener("click", () => {

        if (inputWriting.value == listeMots[i]){
            score++; 
        } 

        i++;
        afficherResultat (score, i);
        inputWriting.value = "";

        if (listeMots[i] == undefined) {
            afficherProposition ("Le jeu est fini");
            buttonValidation.disabled = true;
        }else{
            afficherProposition (listeMots[i]);
        }
    });
}

