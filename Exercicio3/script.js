function q1_validar() {
    var elemento = document.getElementById("q1txt");
    if (elemento == null) {
        alert("O elemento a ser verificado não existe");
        return false;
    }
    if (elemento.value == null || elemento.value.length == 0) {
        alert("O campo de texto está vazio");
        return false;
    }
    return true;
}