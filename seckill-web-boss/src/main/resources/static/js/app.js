require.config({
    baseUrl:'js/',
    paths : {
        "jquery" : ["https://cdn.bootcss.com/jquery/3.3.1/jquery.min","jquery.min"],
        "knockout" : ["https://cdn.bootcss.com/knockout/3.4.2/knockout-min"],
        "index" : "index"
    }
})

require(['jquery','knockout'],function($,ko){
    $(function () {

        $.post("/getValue",function (data) {
            var viewModel = {
                data:data,
                click:function () {
                    alert("aa")
                }
            };
            ko.applyBindings(viewModel);
            console.log(data)
        });


    });

});