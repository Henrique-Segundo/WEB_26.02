
//Funções por questão

function q1_validar() {
    validarCampoTextoObrigatorio("q1txt");
}

function q2_validar() { }
function q3_validar() { }
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