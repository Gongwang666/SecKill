<div class="row-content am-cf">
    <div class="row">
        <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
            <div class="widget am-cf">
                <div class="widget-head am-cf">
                    <div id="add_cat_alert" hidden="hidden" class="am-alert am-alert-success" data-am-alert>
                        <button type="button" class="am-close">&times;</button>
                        <p>添加成功</p>
                    </div>
                    <div class="widget-title  am-cf">添加分类</div>
                </div>
                <div class="widget-body  am-fr">
                    <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                        <!-- col start -->
                        <div class="am-u-md-6">
                            <div class="card-box">
                                <form id="add_cat_form" enctype="multipart/form-data" method="post" class="tpl-form-border-form tpl-form-border-br">

                                    <div class="am-form-group">
                                        <label for="user-phone" class="am-u-sm-3 am-form-label">
                                            父级分类:
                                        </label>
                                        <div class="am-u-sm-9">
                                            <div class="am-u-sm-9">
                                                <select id="my-select" name="catId" data-placeholder="Your Favorite Type of Bear" style="width:350px;" class="chosen-select-deselect" tabindex="9">

                                                <#list goodsCats as cat>
                                                    <#if cat.dataFlag == 1>
                                                        <option value="${cat.catId}">${cat.catName}</option>
                                                    <#else >
                                                        <option disabled value="${cat.catId}">${cat.catName}</option>
                                                    </#if>
                                                </#list>
                                                <#--<option value=""></option>

                                                <option selected disabled>Sloth Bear</option>
                                                <option disabled>Sun Bear</option>
                                                <option selected disabled>Paddington Bear</option>
                                                <option selected>Polar Bear</option>
                                                <option disabled>Spectacled Bear</option>-->
                                                </select>
                                            </div>
                                            <div class="am-u-sm-3"></div>
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="user-name" class="am-u-sm-3 am-form-label">
                                            分类名称:
                                        </label>
                                        <div class="am-u-sm-9">
                                            <div class="am-u-sm-9">
                                                <input type="text" name="catName" class="tpl-form-input" id="cat-name" placeholder="请输入分类名称"/>
                                            </div>
                                            <div class="am-u-sm-3"></div>
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="user-name" class="am-u-sm-3 am-form-label">
                                            是否显示:
                                        </label>
                                        <div class="am-u-sm-9 ">

                                            <div class="am-u-sm-9">
                                                <div class="am-u-sm-6">
                                                    <label class="am-radio-inline">
                                                        <input type="radio" name="isShow" value="1" data-am-ucheck> 是
                                                    </label>
                                                </div>

                                                <div class="am-u-sm-6">
                                                    <label class="am-radio-inline">
                                                        <input type="radio" name="isShow" value="0" data-am-ucheck> 否
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="am-u-sm-3"></div>

                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <div class="am-u-sm-12 ">

                                            <div class="am-u-sm-4">
                                            </div>
                                            <div class="am-u-sm-8">
                                                <button id="add_cat" type="button" class="am-btn am-btn-primary">提交</button>
                                            </div>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>
                        <!-- col end -->
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script>
    //下拉选项卡js代码
    $('#my-select').chosen({ width: '95%'});

    //$('#add_cat_alert').alert('close');
    //提交表单
    $('#add_cat').on('click',function () {
        var form = $('#add_cat_form');
        var parentId = $('#my-select').val();
        var catName = $('#cat-name').val();
        var isShow = $("input[name='isShow']:checked").val();

        if(catName == null || catName == ""){
            alert("分类名称不能为空！");
            return;
        }
        if(parentId == null || parentId == ""){
            alert("父级分类不能为空！");
            return;
        }
        if(isShow == null || isShow == ""){
            alert("是否显示不能为空！");
            return;
        }
        var allData = {
            catName:catName,
            parentId:parentId,
            isShow:isShow
        };
        $.ajax({
            url:'/addCat.do',
            contentType:"application/json;charset=utf-8",
            type:form.attr("method"), //GET
            async:true,    //或false,是否异步
            data:JSON.stringify(allData),
            timeout:5000,    //超时时间
            dataType:'json',    //返回的数据格式：json/xml/html/script/jsonp/text
            beforeSend:function(xhr){
                //console.log(xhr)
                console.log('发送前')
            },
            success:function(data,textStatus,jqXHR){
                console.log(data)
                $('#add_cat_alert').show();
                setTimeout("$('#content').load('/goods/cats/create')",1500);
                //console.log(textStatus)
                //console.log(jqXHR)
            },
            error:function(xhr,textStatus){
                console.log('错误')
                console.log(xhr)
                //console.log(textStatus)
            },
            complete:function(){
                console.log('结束');
            }
        })
    });
</script>