$(document).ready( () => {
    const save = () => {
        $('#guardar').on('click', function(){
            if(($('#primer_nombre').val() == '') || ($('#primer_apellido').val() == '') || ($('#tipo_documento').val() == '') || ($('#documento').val() == '') || ($('#celular').val() == '') || ($('#direccion').val() == '') || ($('#email').val() == '') || ($('#estado').val() == '')){
                alert('Diligencie los datos requeridos (*)')
            }else{
                datosMecanico = {
                    primerNombre : $('#primer_nombre').val(),
                    segundoNombre : $('#segundo_nombre').val(),
                    primerApellido : $('#primer_apellido').val(),
                    segundoApellido : $('#segundo_apellido').val(),
                    tipoDocumento : $('#tipo_documento').val(),
                    documento : $('#documento').val(),
                    celular : $('#celular').val(),
                    direccion : $('#direccion').val(),
                    email : $('#email').val(),
                    estado : $('#estado').val()
                }
                $.ajax({
                    url: 'http://localhost:5050/index/mechanical',
                    contentType: 'application/json',
                    type: 'POST',
                    data: JSON.stringify(datosMecanico),
                    dataType: 'json',
                    success:(data)=>{
    
                    }
                })
            }
        })
    }
    const list = () =>{
        $('#listado').on('click', function(){
            location= 'http://127.0.0.1:5500/lista.html'
        })
    }
    list(); 
    save();
})