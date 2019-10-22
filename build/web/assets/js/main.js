/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$('.btn-register').click(() => {
    let formControl = $('.name-input')    
    if(formControl.hasClass('hide')){
        showElement(formControl)
    }else{
        if (formControl.children('input').val() != ''){
            $('#init-form').attr('action', 'Register')
            $('#init-form').submit()
        }
        else
            alert('Ingresa tu nombre')
    }
})

function showElement(el) {
    el.removeClass('hide')
    el.show()
}


function showForm(formId, action = 'UpdateUser'){
    let values = $(formId + ' td')
    const id = formId.replace("#", "form-")
    let str = `<form id="${id}" action="${action}" method="POST">`
        str += `<input type="hidden" value="${$(values[0]).html()}" name="where">`
    for(let i = 0; i < values.length - 1; i++){
        let td = $(values[i])
        str += `<input class="input-fixed form-control form-control-line" value="${td.html()}" name="${td.attr("field")}"/>`
    }
    if(action != 'UpdateUser')
           str += `<input type="hidden" value="${$(values[0]).html()}" name="r_codigo"/>`
    str += `<button onClick="$('#${id}').submit()" style="float: right;" class="btn btn-success btn-sm"><i class="fa fa-check"></i> Guardar</button>`
    str += `</form>`
    $('.content-edit').html(str)
    $('.content-edit').show(500)
}