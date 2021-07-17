$(document).ready(() => {

    const saveService = () => {
        $('#guardar_servicio').on('click', function(){
            if(($('#cod_servicio').val() == '') || ($('#tiempo_estimado').val() == '') || ($('#cod_mantenimiento_serv').val() == '') ){
                alert('Diligencie los datos requeridos (*)')
            }else{
                datosServicio = {
                    codigo : $('#cod_servicio').val(),
                    tiempoEstimado : $('#tiempo_estimado').val(),
                    codigoMantenimiento : $('#cod_mantenimiento_serv').val()
                }
                $.ajax({
                    url: 'http://localhost:5050/index/service',
                    contentType: 'application/json',
                    type: 'POST',
                    data: JSON.stringify(datosServicio),
                    dataType: 'json',
                    success:(data)=>{
                        location = 'http://127.0.0.1:5500/lista.html'
                    }
                })
            }
        })
    }

    const saveMaintenance = () => {
        $('#guardar_mantenimiento').on('click', function(){
            if(($('#documento').val() == '') || ($('#fecha').val() == '') || ($('#cod_mantenimiento').val() == '') || ($('#tipo_documento').val() == '')){
                alert('Diligencie los datos requeridos (*)')
            }else{
                datosMantenimiento = {
                    codigo : $('#cod_mantenimiento').val(),
                    estado : $('#estado_mantenimiento').val(),
                    fecha : $('#fecha').val(),
                    mecTipoDocumento : $('#tipo_documento').val(),
                    mecDocumento : $('#documento').val()
                }
                $.ajax({
                    url: 'http://localhost:5050/index/maintenance',
                    contentType: 'application/json',
                    type: 'POST',
                    data: JSON.stringify(datosMantenimiento),
                    dataType: 'json',
                    success:(data)=>{
                        location = 'http://127.0.0.1:5500/lista.html'
                    }
                })
            }
        })
    }

    const document = () => {
        $.ajax({
            url: 'http://localhost:5050/index/free',
            type: 'GET',
            dataType: 'json',
            success: (res) => {
                let data = `<option selected>Seleccione...</option>`
                console.log(res);
                res.forEach(element => {
                    data += `<option value="${element.mechanicalPK.documento}">${element.mechanicalPK.documento}</option>`
                });
                $('#documento').html(data)
            }
        })
    }

    const list = () => {
        $.ajax({
            url: 'http://localhost:5050/index/mechanical',
            type: 'GET',
            dataType: 'json',
            success: (res) => {
                let data = ''
                res.forEach(element => {
                    let tipoDocumento = (element.mechanical.mechanicalPK.tipoDocumento = 1 ? "Cedula de ciudadania" : "Cedula de extranjeria")
                    data += `<tr>
                    <td>${element.mechanical.primerNombre}</td>
                    <td>${element.mechanical.primerApellido}</td>
                    <td>${tipoDocumento}</td>
                    <td>${element.mechanical.mechanicalPK.documento}</td>
                    <td>${element.mechanical.celular}</td>
                    <td>${element.mechanical.direccion}</td>
                    <td>${element.mechanical.email}</td>
                    <td>${element.tiempoTotal} Horas</td>
                    </tr>`
                });
                $('#tablebody').html(data)
            }
        })

    }

    list();
    document();
    saveMaintenance();
    saveService();
})