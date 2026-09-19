
//Funções por questão

function q1_validar() {
    validarCampoTextoObrigatorio("q1txt");
}

function q2_validar() {
    validarCampoTextoTamanho("q2txt", 1, 10);
}
function q3_validar() {
    validarCampoNumericoInteiroPositivo("q3txt");
}
function q4_validar() { }
function q5_validar() { }
function q6_validar() { }
function q7_validar() { }
function q8_validar() { }

//Funções por tipo de verificação

function validarCampoTextoObrigatorio(id) {
    var el = document.getElementById(id);
    /* testa se o campo existe*/
    if (el == null) {
        alert("O elemento não existe");
        return false;
    }
    /* testa se o valor é vazio ou formado por apenas espaços em branco */
    if (el.value == null || el.value.length == 0 || (/^\s+$/.test(el.value))) {
        alert("O campo de texto está vazio");
        return false;
    }
    return true;
}

function validarCampoTextoTamanho(id, minimo, maximo) {
    /*testa se o elemento existe e não está vazio*/
    if (!validarCampoTextoObrigatorio(id)) {
        return false;
    }
    var valor = document.getElementById(id).value;
    /*testa se o elemento está com menos que o minimo necessario de caracteres*/
    if (valor.length < minimo) {
        alert("O campo de texto está com menos caracteres do que o minimo");
        return false;
    }
    /*testa se o elemento está com mais que o maximo permitido de caracteres*/
    if (valor.length > maximo) {
        alert("O campo de texto está com mais caracteres do que o máximo");
        return false;
    }
    return true;
}

function validarCampoNumerico(id) {
    /*testa se o elemento existe e não está vazio*/
    if (!validarCampoTextoObrigatorio(id)) {
        return false;
    }
    var valor = document.getElementById(id).value;
    /*testa se o elemento é não numerico*/
    if (isNaN(valor)) {
        alert("O campo de texto está com elementos não numericos");
        return false;
    }
    return true;
}
function validarCampoNumericoInteiroPositivo(id){
    /*testa se o elemento existe, não está vazio ou é não numerico*/
    if(!validarCampoNumerico(id)){
        return false;
    }
    var valor = document.getElementById(id).value;
    /*testa se o numero é positivo*/
    if(valor <= 0){
        alert("valor numérico negativo ou igual a 0")
        return false;
    }
    /*testa se o numero é inteiro*/
    //falta fazer
}