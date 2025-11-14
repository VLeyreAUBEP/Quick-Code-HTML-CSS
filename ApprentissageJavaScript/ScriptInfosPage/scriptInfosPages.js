// $(function(){ 'use strict'; const $today = new Date() let $body = $("body"); let box = `<div><ul><li><strong>Date et heure de l'incident : </strong>${today.getDate()}.${(today.getMonth())+1}.${today.getFullYear()}</li> <li><strong>Gravité du bug : </strong>Bloquant / Critique / pas urgent</li><li><strong>Url de l'ERP : </strong>${location.href}</li></ul></div>`;body.innerHTML = box; Object.assign(box.style, {    position:'fixed', top:'20px', right:'20px',    background:'#333',%20color:'#fff',%20padding:'10px%2015px',%20%20%20%20borderRadius:'8px',%20fontFamily:'sans-serif',%20zIndex:9999,%20%20%20%20boxShadow:'0%202px%2010px%20rgba(0,0,0,0.3)'%20%20});})
const today = new Date();
const month = today.getMonth();
const test = today.getDate();
const test2 = today.getFullYear();
const time1 = today.getTime();
console.log(today);
console.log(month);
console.log(test);
console.log(test2);
console.log(time1);
const url = new URL(location.href);
console.log(url);
console.log(url.href);
const urlRoadwork = "https://aubep-srv-roadwork.aubeperp.ch:8443/roadwork/cockpit_Action.do";
const indexRoadwork = urlRoadwork.indexOf("roadwork", urlRoadwork.indexOf("roadwork") + 1);
console.log(urlRoadwork.indexOf("roadwork"));
const urlRoadworkCut = urlRoadwork.slice(0, indexRoadwork + "roadwork".length);
console.log(urlRoadworkCut);
console.log(url.pathname.indexOf("/") + 1);
const cheminCourt = url.pathname.split('/').slice(0,2).join('/');
console.log(cheminCourt);

//Pop-up info ERP
javascript:(function(){ /* Initialisation des variables infos de la page ERP */ const box = document.createElement('div'); const today = new Date(); const day = String(today.getDate()).padStart(2, '0'); const month = String(today.getMonth() + 1).padStart(2, '0'); const year  = today.getFullYear(); const hour = String(today.getHours()).padStart(2, '0'); const min  = String(today.getMinutes()).padStart(2, '0'); const sec  = String(today.getSeconds()).padStart(2, '0'); const lienPage = new URL(location.href); const hrefPage = lienPage.href; /* Traitement des infos en fct de la plateforme choisie */ const eleCoRoadAurore = document.querySelectorAll(".header__title span"); const eleCoDyna = document.querySelectorAll(".head_path_info"); const boolRoadwork = eleCoRoadAurore.length != 0; const boolDyna = eleCoDyna.length != 0; const boolAurore = eleCoRoadAurore.length != 0; const slash4 = hrefPage.indexOf("/", hrefPage.indexOf("/", hrefPage.indexOf("/", hrefPage.indexOf("/") + 1) + 1) + 1); const segments = (boolRoadwork || boolDyna || boolAurore ? hrefPage.slice(0, slash4) : location.href); const elementRoadwork = boolRoadwork ? document.getElementById('bottomDivBuildInfo') : null; const elementDynaContainer = document.querySelector("#bottomDiv"); const elementDyna = elementDynaContainer ? elementDynaContainer.querySelector("td") : null; const elementAurore = boolAurore ? document.getElementById('bottomDivBuildInfo') : null; const versionERP = (elementRoadwork && elementRoadwork.textContent.trim()) || (elementAurore && elementAurore.textContent.trim()) || (elementDyna && elementDyna.textContent.trim()) || "Version non trouvée"; let cockpit = ""; if (boolRoadwork || boolAurore) { const eleCoPrinRoadAurore = document.querySelector(".liens_menu_selected"); cockpit = (eleCoRoadAurore.length != 0 ? eleCoRoadAurore.length <= 4 ? eleCoRoadAurore[0].textContent.trim().split(/\s+/).slice(0, 3).join(' ') == "Tableau de bord" ? eleCoPrinRoadAurore?.textContent ?? "Cockpit non trouvé" : eleCoRoadAurore[0].textContent + (eleCoPrinRoadAurore ? " ➔ " + eleCoPrinRoadAurore.textContent : "") : eleCoRoadAurore[0].textContent + "  ⮞  " + eleCoRoadAurore[1].textContent : "Cockpit non trouvé"); } else if (boolDyna) {const eleCoPrinDyna = document.querySelector(".liens_menu_selected"); let path = ""; for (let i = 0; i < eleCoDyna.length; i++) { const innerTd = eleCoDyna[i].querySelector("td"); if (innerTd && innerTd.textContent.trim() !== "") { path += (i == eleCoDyna.length - 1 ? innerTd.textContent.trim() : innerTd.textContent.trim() + "   ⮞   "); } } cockpit = (path != "" ? eleCoPrinDyna ? path + " ➔ " + eleCoPrinDyna.textContent : path : "Cockpit non trouvé"); } else { cockpit = "Cockpit non trouvé"; } /* CSS de la box (pop-up) */ Object.assign(box.style, { position: 'fixed', top: '50%', left: '50%', transform: 'translate(-50%, -50%)', background: '#2C3E50', color: '#ECF0F1', padding: '24px 28px', borderRadius: '12px', fontFamily: '"Segoe UI", Roboto, Helvetica, Arial, sans-serif', fontWeight: '400', zIndex: 9999, boxShadow: '0 12px 28px rgba(0, 0, 0, 0.25)', maxWidth: '550px', width: '90%', border: '1px solid #1A2B3C', lineHeight: '1.5' }); document.body.appendChild(box); /* Bouton fermer */ const closeBtn = document.createElement('span'); closeBtn.textContent = '✖'; Object.assign(closeBtn.style, { position: 'absolute', top: '10px', right: '14px', cursor: 'pointer', color: '#999', fontSize: '18px', fontWeight: 'bold', transition: 'color 0.2s ease' }); closeBtn.addEventListener('mouseenter', () => closeBtn.style.color = '#000'); closeBtn.addEventListener('mouseleave', () => closeBtn.style.color = '#999'); closeBtn.addEventListener('click', () => box.remove()); box.appendChild(closeBtn); /* Liste ul */ let ul = document.createElement('ul'); Object.assign(ul.style, { listStyle: 'none', paddingLeft: '0', marginTop: '10px' }); box.appendChild(ul); /* Fonction création li flex */ function createLi(label, value) { const li = document.createElement('li'); li.style.display = 'flex'; li.style.justifyContent = 'space-between'; li.style.marginBottom = '14px'; li.style.fontSize = '14px'; const spanLabel = document.createElement('span'); spanLabel.innerHTML = `<strong>${label}</strong>`; spanLabel.style.flex = '0 0 190px'; spanLabel.style.marginRight = '12px'; spanLabel.style.textAlign = 'right'; const spanValue = document.createElement('span'); spanValue.innerHTML = value; spanValue.style.flex = '1'; spanValue.style.textAlign = 'left'; li.appendChild(spanLabel); li.appendChild(spanValue); return li; } /* Ajout des li */ ul.appendChild(createLi("Date et heure de l'incident :", `<span style="color:#e67e22;">${day}.${month}.${year} - ${hour}:${min}:${sec}</span>`)); ul.appendChild(createLi("Gravité du bug :", `<label for="bloquant" style="margin-right:10px;"><input type="radio" name="gravite" value="bloquant" id="bloquant" checked> Bloquant</label> <label for="critique" style="margin-right:10px;"><input type="radio" name="gravite" value="critique" id="critique"> Critique</label> <label for="pasUrgent"><input type="radio" name="gravite" value="pasUrgent" id="pasUrgent"> Pas urgent</label>`)); ul.appendChild(createLi("URL de l'ERP :", `<a href=${segments} target="_blank" style="color:#0078d7; text-decoration:none; word-break:break-all; overflow-wrap:break-word;">${segments}</a>`)); ul.appendChild(createLi("Version de l'ERP :", versionERP)); ul.appendChild(createLi("Cockpit :", cockpit)); /* Bouton copier et fermer */ const btn = document.createElement('button'); btn.textContent = 'Copier et fermer'; Object.assign(btn.style, { display: 'block', margin: '18px auto 0', padding: '10px 20px', background: '#0078d7', color: '#fff', border: 'none', borderRadius: '6px', cursor: 'pointer', fontWeight: '600', fontSize: '14px', letterSpacing: '0.3px', transition: 'background 0.2s ease, transform 0.1s ease' }); btn.onmouseenter = () => btn.style.background = '#005fa3'; btn.onmouseleave = () => btn.style.background = '#0078d7'; btn.onmousedown = () => btn.style.transform = 'scale(0.97)'; btn.onmouseup = () => btn.style.transform = 'scale(1)'; btn.addEventListener('click', async () => { try { const graviteInput = document.querySelector('input[name="gravite"]:checked'); const graviteLabel = graviteInput ? document.querySelector(`label[for="${graviteInput.id}"]`) : null; let text = ""; ul.querySelectorAll("li").forEach(li => { if (li.querySelector("input")) { const graviteText = (graviteLabel ? graviteLabel.textContent.trim() : 'Non défini'); text += `Gravité du bug : ${graviteText}\n`; } else {const label = li.querySelector('span:first-child').textContent.trim(); const value = li.querySelector('span:last-child').textContent.trim(); text += `${label} ${value}\n`;} }); await navigator.clipboard.writeText(text); btn.textContent = '✅ Copié !'; setTimeout(() => box.remove(), 800); } catch (err) { alert('Erreur lors de la copie : ' + err); } }); box.appendChild(btn); /* Dragging */ let isDragging = false, offsetX = 0, offsetY = 0; box.addEventListener('mousedown', e => { if (e.target === closeBtn || e.target === btn) return; isDragging = true; const rect = box.getBoundingClientRect(); offsetX = e.clientX - rect.left; offsetY = e.clientY - rect.top; box.style.transition = 'none'; box.style.cursor = 'grabbing'; }); document.addEventListener('mousemove', e => { if (!isDragging) return; box.style.left = `${e.clientX - offsetX}px`; box.style.top = `${e.clientY - offsetY}px`; box.style.transform = `none`; }); document.addEventListener('mouseup', () => { if (isDragging) { isDragging = false; box.style.transition = ''; box.style.cursor = 'default'; } }); })();

//Pop-up marrant
//javascript:(function(){const box = document.createElement('div'); const today = new Date(); const day = today.getDate(); const month = today.getMonth() + 1; const year = today.getFullYear(); const lienPage = location.href; const elementERP = document.getElementById('bottomDivBuildInfo'); const versionERP = (elementERP ? elementERP.textContent.trim().split(/\s+/)[0] : 'Version non trouvée'); const eleCo = document.querySelector(".liens_menu_selected");  const cockpit = (eleCo ? eleCo.textContent : 'Cockpit non trouvé'); Object.assign(box.style,{ position:'fixed', top:'50%',left:'50%', transform:'translate(-50%,-50%)', background:'#0ea0baff', color: '#000000ff', padding:'20px 30px',borderRadius:'8px', fontFamily:'sans-serif',  fontWeight: 'normal', zIndex:9999, boxShadow:'0 2px 10px rgba(0,0,0,0.3)', maxWidth: '450px', overflowWrap: 'break-word'}); document.body.appendChild(box); let ul = document.createElement('ul'); Object.assign(ul.style, {listStyle : 'disc', paddingLeft : '20px'}); box.appendChild(ul);  ul.innerHTML += `<li><strong style = "font-weight:bold;">Date et heure de l\'incident</strong> : <span style = "color:orange;">${day}.${month}.${year}</span></li>`; ul.innerHTML += `<li><strong style = "font-weight:bold;">Gravité du bug</strong> : Bloquant / Critique / pas urgent</li>`; ul.innerHTML += `<li><strong style = "font-weight:bold;">URL de l'ERP</strong> : ${lienPage}</li>`; ul.innerHTML += `<li><strong style = "font-weight:bold;">Version de l'ERP</strong> : ${versionERP}</li>`; ul.innerHTML += `<li><strong style = "font-weight:bold;">Cockpit</strong> : ${cockpit}</li>`;  ul.querySelectorAll('li').forEach(li => li.style.marginBottom = '15px'); const btn = document.createElement('button'); btn.textContent = 'Copier et fermer 🎵'; Object.assign(btn.style, {display: 'block', margin: '15px auto 0', padding: '8px 16px', background: '#ffffff', color: '#000', border: 'none', borderRadius: '5px', cursor: 'pointer', fontWeight: 'bold'}); btn.onmouseenter = () => btn.style.background = '#ddd'; btn.onmouseleave = () => btn.style.background = '#fff'; btn.addEventListener('click', async () => { try { const text = ul.innerText; await navigator.clipboard.writeText(text); btn.textContent = '✅ Copié ! 🎶'; window.open('https://www.youtube.com/watch?v=6RUIeX6UCT8&list=RD6RUIeX6UCT8&start_radio=1', '_blank'); setTimeout(() => box.remove(), 800);} catch (err) { alert('Erreur lors de la copie : ' + err);}}); box.appendChild(btn);})(); 

javascript:(function() {
  /* Initialisation des variables infos de la page ERP */
  const box = document.createElement('div');
  const today = new Date();
  
  const day = String(today.getDate()).padStart(2, '0'); 
  const month = String(today.getMonth() + 1).padStart(2, '0'); 
  const year  = today.getFullYear(); 
  const hour = String(today.getHours()).padStart(2, '0'); 
  const min  = String(today.getMinutes()).padStart(2, '0'); 
  const sec  = String(today.getSeconds()).padStart(2, '0');

  const lienPage = new URL(location.href);
  const hrefPage = lienPage.href;

  /* Traitement des infos en fct de la plateforme choisie */
  const eleCoRoadAurore = document.querySelectorAll(".header__title span");
  const eleCoDyna = document.querySelectorAll(".head_path_info");

  const boolRoadwork = eleCoRoadAurore.length != 0;
  const boolDyna = eleCoRoadAurore.length != 0;
  const boolAurore = eleCoDyna.length != 0;

  const slash4 = hrefPage.indexOf("/", hrefPage.indexOf("/", hrefPage.indexOf("/", hrefPage.indexOf("/") + 1) + 1) + 1);
  const segments = (boolRoadwork || boolDyna || boolAurore ? hrefPage.slice(0, slash4) : location.href);

  const elementRoadwork = boolRoadwork ? document.getElementById('bottomDivBuildInfo') : null;
  const elementDynaContainer = document.querySelector("#bottomDiv");
  const elementDyna = elementDynaContainer ? elementDynaContainer.querySelector("td") : null;
  const elementAurore = boolAurore ? document.getElementById('bottomDivBuildInfo') : null;

  const versionERP =
    (elementRoadwork && elementRoadwork.textContent.trim()) ||
    (elementAurore && elementAurore.textContent.trim()) ||
    (elementDyna && elementDyna.textContent.trim()) ||
    "Version non trouvée";

  let cockpit = "";

  if (boolRoadwork || boolAurore) {
    const eleCoPrinRoadAurore = document.querySelector(".liens_menu_selected");
    console.log("Je suis rentré dans la cond roadwork");
    cockpit = (
      eleCoRoadAurore.length != 0
        ? eleCoRoadAurore.length <= 4
          ? eleCoRoadAurore[0].textContent.trim().split(/\s+/).slice(0, 3).join(' ') == "Tableau de bord"
            ? eleCoPrinRoadAurore?.textContent ?? "Cockpit non trouvé"
            : eleCoRoadAurore[0].textContent + (eleCoPrinRoadAurore ? " ➔ " + eleCoPrinRoadAurore.textContent : "")
          : eleCoRoadAurore[0].textContent + "  ⮞  " + eleCoRoadAurore[1].textContent
        : "Cockpit non trouvé"
    );
  } else if (boolDyna) {
    const eleCoPrinDyna = document.querySelector(".liens_menu_selected");
    let path = "";

    for (let i = 0; i < eleCoDyna.length; i++) {
      const innerTd = eleCoDyna[i].querySelector("td"); // premier <td> descendant
      if (innerTd && innerTd.textContent.trim() !== "") {
        path += (i == eleCoDyna.length - 1
          ? innerTd.textContent.trim()
          : innerTd.textContent.trim() + "   ⮞   ");
      }
    }

    cockpit = (
      path != ""
        ? eleCoPrinDyna
          ? path + " ➔ " + eleCoPrinDyna.textContent
          : path
        : "Cockpit non trouvé"
    );
  } else {
    cockpit = "Cockpit non trouvé";
  }

  /* CSS de la box (pop-up) */
  Object.assign(box.style, {
    position: 'fixed',
    top: '50%',
    left: '50%',
    transform: 'translate(-50%, -50%)',
    background: '#2C3E50',
    color: '#ECF0F1',
    padding: '24px 28px',
    borderRadius: '12px',
    fontFamily: '"Segoe UI", Roboto, Helvetica, Arial, sans-serif',
    fontWeight: '400',
    zIndex: 9999,
    boxShadow: '0 12px 28px rgba(0, 0, 0, 0.25)',
    maxWidth: '460px',
    width: '90%',
    border: '1px solid #1A2B3C',
    lineHeight: '1.5'
  });
  document.body.appendChild(box);

  /* Initialisation et CSS du bouton "fermer" */
  const closeBtn = document.createElement('span');
  closeBtn.textContent = '✖';
  Object.assign(closeBtn.style, {
    position: 'absolute',
    top: '10px',
    right: '14px',
    cursor: 'pointer',
    color: '#999',
    fontSize: '18px',
    fontWeight: 'bold',
    transition: 'color 0.2s ease'
  });
  closeBtn.addEventListener('mouseenter', () => closeBtn.style.color = '#000');
  closeBtn.addEventListener('mouseleave', () => closeBtn.style.color = '#999');
  closeBtn.addEventListener('click', () => box.remove());
  box.appendChild(closeBtn);

  /* Initialisation et CSS de la liste */
  let ul = document.createElement('ul');
  Object.assign(ul.style, {
    listStyle: 'none',
    paddingLeft: '0',
    marginTop: '10px'
  });
  box.appendChild(ul);

  /* Fonction pour créer un display flex avec labels et infos ERP */
  function createLi(label, value) {
    const li = document.createElement('li');
    li.style.display = 'flex';
    li.style.justifyContent = 'space-between';
    li.style.marginBottom = '14px';
    li.style.fontSize = '14px';

    const spanLabel = document.createElement('span');
    spanLabel.innerHTML = `<strong>${label}</strong>`;
    spanLabel.style.flex = '0 0 150px';
    spanLabel.style.marginRight = '12px';
    spanLabel.style.textAlign = 'right';

    const spanValue = document.createElement('span');
    spanValue.innerHTML = value;
    spanValue.style.flex = '1';
    spanValue.style.textAlign = 'left';

    li.appendChild(spanLabel);
    li.appendChild(spanValue);
    return li;
  }

  /* Ajout des entrées li personnalisées */
  ul.appendChild(createLi("Date et heure de l'incident :", `<span style="color:#e67e22;">${day}.${month}.${year} - ${hour}:${min}:${sec}</span>`));
  ul.appendChild(createLi("Gravité du bug :", `
    <label for="bloquant" style="margin-right:10px;"><input type="radio" name="gravite" value="bloquant" id="bloquant" checked> Bloquant</label>
    <label for="critique" style="margin-right:10px;"><input type="radio" name="gravite" value="critique" id="critique"> Critique</label>
    <label for="pasUrgent"><input type="radio" name="gravite" value="pasUrgent" id="pasUrgent"> Pas urgent</label>
  `));
  ul.appendChild(createLi("URL de l'ERP :", `<a href=${segments} target="_blank" style="color:#0078d7; text-decoration:none; word-break:break-all; overflow-wrap:break-word;">${segments}</a>`));
  ul.appendChild(createLi("Version de l'ERP :", versionERP));
  ul.appendChild(createLi("Cockpit :", cockpit));

  /* Initialisation et CSS du bouton "Copier et fermer" */
  const btn = document.createElement('button');
  btn.textContent = 'Copier et fermer';
  Object.assign(btn.style, {
    display: 'block',
    margin: '18px auto 0',
    padding: '10px 20px',
    background: '#0078d7',
    color: '#fff',
    border: 'none',
    borderRadius: '6px',
    cursor: 'pointer',
    fontWeight: '600',
    fontSize: '14px',
    letterSpacing: '0.3px',
    transition: 'background 0.2s ease, transform 0.1s ease'
  });
  btn.onmouseenter = () => btn.style.background = '#005fa3';
  btn.onmouseleave = () => btn.style.background = '#0078d7';
  btn.onmousedown = () => btn.style.transform = 'scale(0.97)';
  btn.onmouseup = () => btn.style.transform = 'scale(1)';

  btn.addEventListener('click', async () => {
    try {
      const graviteInput = document.querySelector('input[name="gravite"]:checked');
      const graviteLabel = graviteInput ? document.querySelector(`label[for="${graviteInput.id}"]`) : null;
      let text = "";
      ul.querySelectorAll("li").forEach(li => {
        if (li.querySelector("input")) {
          const graviteText = (graviteLabel ? graviteLabel.textContent.trim() : 'Non défini');
          text += `Gravité du bug : ${graviteText}\n`;
        } else {
          const label = li.querySelector('span:first-child').textContent.trim(); 
          const value = li.querySelector('span:last-child').textContent.trim(); 
          text += `${label} ${value}\n`;
        }
      });
      await navigator.clipboard.writeText(text);
      btn.textContent = '✅ Copié !';
      setTimeout(() => box.remove(), 800);
    } catch (err) {
      alert('Erreur lors de la copie : ' + err);
    }
  });
  box.appendChild(btn);

  /* Dragging de la box */
  let isDragging = false, offsetX = 0, offsetY = 0;
  box.addEventListener('mousedown', e => {
    if (e.target === closeBtn || e.target === btn) return;
    isDragging = true;
    const rect = box.getBoundingClientRect();
    offsetX = e.clientX - rect.left;
    offsetY = e.clientY - rect.top;
    box.style.transition = 'none';
    box.style.cursor = 'grabbing';
  });
  document.addEventListener('mousemove', e => {
    if (!isDragging) return;
    box.style.left = `${e.clientX - offsetX}px`;
    box.style.top = `${e.clientY - offsetY}px`;
    box.style.transform = `none`;
  });
  document.addEventListener('mouseup', () => {
    if (isDragging) {
      isDragging = false;
      box.style.transition = '';
      box.style.cursor = 'default';
    }
  });
})();