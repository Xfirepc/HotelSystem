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


$('.edit-client').click(() => {
    let valID = $('.edit-client');
    let values = $(valID.attr("data") + ' td')
    let tr = $(valID.attr("data"))
    console.log(values)
    let str = `<tr>`
    for(let i = 0; i < values.length - 1; i++){
        let td = $(values[i])
        str += `<td><input class="form-control form-control-line" value="${td.html()}" name="${td.attr("field")}"/></td>`
    }
    str += `<td><button class="btn btn-success btn-sm update-client"><i class="fa fa-check"></i></button></td>`
    str += `</tr>`
    tr.after(str)
    tr.hide()
})