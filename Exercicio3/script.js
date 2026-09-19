
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
function q4_validar() {
    validarCampoCombobox("q4combo");
}
function q5_validar() {
    validarCampoCheckbox("q5check");
}
function q6_validar() {
    q6CampoCheckboxContagem("q6check1", "q6check2", "q6check3", "q6check4", "q6check5");
}
function q7_validar() {
    validarCampoRadio("q7radio");
}
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
function validarCampoNumericoInteiroPositivo(id) {
    /*testa se o elemento existe, não está vazio ou é não numerico*/
    if (!validarCampoNumerico(id)) {
        return false;
    }
    var valor = document.getElementById(id).value;
    /*testa se o numero é positivo*/
    if (valor <= 0) {
        alert("valor numérico negativo ou igual a 0")
        return false;
    }
    /*testa se o numero é inteiro*/
    //falta fazer
}

function validarCampoCombobox(id) {
    var elemento = document.getElementById(id);
    /*testa se o elemento existe*/
    if (elemento == null) {
        alert("O elemento não existe");
        return false;
    }
    var indice = document.getElementById(id).selectedIndex;
    /*testa se alguma opção foi selecionada*/
    if (indice == null || indice < 0) {
        alert("Nenhuma opção selecionada");
        return false;
    }
    return true;
}

function validarCampoCheckbox(id) {
    var elemento = document.getElementById(id);
    /*testa se o elemento existe*/
    if (elemento == null) {
        alert("O elemento não existe");
        return false;
    }
    /*testa se o checkbox foi selecionado*/
    if (!elemento.checked) {
        alert("O checkbox obrigatório não foi selecionado");
        return false;
    }
    return true;
}

function q6CampoCheckboxContagem(id1, id2, id3, id4, id5) {
    var el1 = document.getElementById(id1);
    var el2 = document.getElementById(id2);
    var el3 = document.getElementById(id3);
    var el4 = document.getElementById(id4);
    var el5 = document.getElementById(id5);

    /*testa se todos os eleemntos existem*/
    if (el1 == null || el2 == null || el3 == null || el4 == null || el5 == null) {
        alert("Algum dos elementos não existe");
        return false;
    }

    var contagem = 0;
    if (el1.checked) { contagem++; }
    if (el2.checked) { contagem++; }
    if (el3.checked) { contagem++; }
    if (el4.checked) { contagem++; }
    if (el5.checked) { contagem++; }

    alert("O numero de checkboxs selecionadas foi: " + contagem);

    return true;
}

function validarCampoRadio(nome) {
    var elementos = document.getElementsByName(nome);
    /*testa se o elemento existe e não é nulo*/
    if (elementos == null || elementos.length == 0) {
        alert("Não existem elementos");
        return false;
    }
    var selecionado = false;
    var opcao;
    /*verifica se algum elemento foi selecionado*/
    for (var i = 0; i < elementos.length; i++) {
        if (elementos[i].checked) {
            selecionado = true;
            opcao = i + 1;
            break;
        }
    }
    /*caso algum elemento tenha sido selecionado, diz qual foi*/
    if (selecionado == true) {
        alert("Opção selecionada: " + opcao)
        return true;
    }
    alert("Nenhuma opção selecionada");
    return false;
}