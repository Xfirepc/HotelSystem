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
            $('#init-form').attr('action', 'register')
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