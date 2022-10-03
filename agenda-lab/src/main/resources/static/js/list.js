
var editando = false;

function transformarEnEditable(nodo) {

    //El nodo recibido es SPAN

    if (editando == false) {

        var nodoTd = nodo.parentNode; //Nodo TD
        var nodoTr = nodoTd.parentNode; //Nodo TR

        var nodoContenedorForm = document.getElementById('contenedorForm'); //Nodo DIV
        var nodosEnTr = nodoTr.getElementsByTagName('td');

        var cups = nodosEnTr[0].textContent; 
        var examen = nodosEnTr[1].textContent;
        var seccion = nodosEnTr[2].textContent; 
        var valor = nodosEnTr[3].textContent;
        var descripcion = nodosEnTr[4].textContent; 
        

        var nuevoCodigoHtml = '<td>' + cups + '</td>' +
                              '<td><input type="text" name="examen" id="examen" value="' + examen + '" size="15"</td>' +
                              '<td><input type="text" name="seccion" id="seccion" value="' + seccion + '" size="15"</td>' +
                              '<td><input type="text" name="valor" id="valor" value="' + valor + '" size="5"</td>' +
                              '<td><textarea type="text" name="descripcion" id="descripcion" rows="2" cols="70">'+ descripcion +'</textarea></td>'+ 
                              '<td>' + 
                                 '<form name = "formulario" method="get" onsubmit="capturarEnvio()" onreset="anular()">' +
                                     '<input class="boton" type = "submit" value="Aceptar">'+ 
                                     '<input class="boton" type="reset" value="Cancelar">'+
                                 '</form>'
                              '</td>';

        nodoTr.innerHTML = nuevoCodigoHtml;
        editando = "true";
    }
    else {
        alert('Solo se puede editar una línea. Recargue la página para poder editar otra');
    }
}

function capturarEnvio() {

    var nodoContenedorForm = document.getElementById('contenedorForm'); //Nodo DIV

    nodoContenedorForm.innerHTML = '<form name = "formulario"  method="get" onsubmit="capturarEnvio()" onreset="anular()">' +
                                         '<input type="hidden" name="cups" value="' + document.querySelector('#cups').value + '">' +
                                         '<input type="hidden" name="examen" value="' + document.querySelector('#examen').value + '">' +
                                         '<input type="hidden" name="seccion" value="' + document.querySelector('#seccion').value + '">' +
                                         '<input type="hidden" name="valor" value="' + document.querySelector('#valor').value + '">' +
                                         '<input type="hidden" name="descripcion" value="' + document.querySelector('#descripcion').value + '">' +
                                         '<input class="boton" type = "submit" value="Aceptar">' +
                                         '<input class="boton" type="reset" value="Cancelar">'+
                                     '</form>';
    document.formulario.submit();
}

function anular() {

    window.location.reload();

}



