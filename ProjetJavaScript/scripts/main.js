/*********************************************************************************
 * 
 * Point d'entrée, c'est lui qui intialise le jeu et lance la boucle de jeu. 
 * 
 *********************************************************************************/

lancerJeu ();
let inputWriting = document.getElementById("inputEcriture");
console.log(inputWriting);
let buttonValidation = document.getElementById("btnValiderMot");
console.log(buttonValidation);
let wordDisplay = document.querySelector(".zoneProposition");
console.log(wordDisplay);
let scoreDisplay = document.querySelector(".zoneScore span");
console.log(scoreDisplay);
let buttonRadio = document.querySelectorAll(".optionSource input");
console.log(buttonRadio);