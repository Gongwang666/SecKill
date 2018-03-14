<div class="row-content am-cf">
    <div class="row">
        <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
            <div class="widget am-cf">
                <div class="widget-head am-cf">
                    <div id="add_cat_alert" hidden="hidden" class="am-alert am-alert-success" data-am-alert>
                        <button type="button" class="am-close">&times;</button>
                        <p>添加成功</p>
                    </div>
                    <div class="widget-title  am-cf">添加商品</div>
                </div>
                <div class="widget-body  am-fr">
                    <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                        <!-- col start -->
                        <div class="am-u-md-6">
                            <div class="card-box">
                                <form id="add_res_form" enctype="multipart/form-data" method="post" class="tpl-form-border-form tpl-form-border-br">


                                    <div class="am-form-group">
                                        <label for="goods-name" class="am-u-sm-3 am-form-label">
                                            商品名称:
                                        </label>
                                        <div class="am-u-sm-9">
                                            <div class="am-u-sm-9">
                                                <input id="goods_name" type="text" class="tpl-form-input" placeholder="请输入商品名称"/>
                                            </div>
                                            <div class="am-u-sm-3"></div>
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="goods-mk-price" class="am-u-sm-3 am-form-label">
                                            商品市场价:
                                        </label>
                                        <div class="am-u-sm-9">
                                            <div class="am-u-sm-9">
                                                <input id="goods_mk_price" type="text" class="tpl-form-input" placeholder="请输入商品市场价"/>
                                            </div>
                                            <div class="am-u-sm-3"></div>
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="goods-shop-price" class="am-u-sm-3 am-form-label">
                                            商品市场价:
                                        </label>
                                        <div class="am-u-sm-9">
                                            <div class="am-u-sm-9">
                                                <input id="goods_shop_price" type="text" class="tpl-form-input" placeholder="请输入商品门店价"/>
                                            </div>
                                            <div class="am-u-sm-3"></div>
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="goods-catid" class="am-u-sm-3 am-form-label">
                                            最后一级分类路径:
                                        </label>
                                        <div class="am-u-sm-9">
                                            <div class="am-u-sm-9">
                                                <input id="goods_catid" type="text" class="tpl-form-input" placeholder="请输入最后一级分类路径"/>
                                            </div>
                                            <div class="am-u-sm-3"></div>
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="goods-catid-path" class="am-u-sm-3 am-form-label">
                                            商品分类路径:
                                        </label>
                                        <div class="am-u-sm-9">
                                            <div class="am-u-sm-9">
                                                <input id="goods_catid_path" type="text" class="tpl-form-input" placeholder="请输入分类路径"/>
                                            </div>
                                            <div class="am-u-sm-3"></div>
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="goods-warn-stock" class="am-u-sm-3 am-form-label">
                                            预警库存:
                                        </label>
                                        <div class="am-u-sm-9">
                                            <div class="am-u-sm-9">
                                                <input id="goods_warn_stock" type="text" class="tpl-form-input" placeholder="请输入预警库存"/>
                                            </div>
                                            <div class="am-u-sm-3"></div>
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="goods-stock" class="am-u-sm-3 am-form-label">
                                            预警库存:
                                        </label>
                                        <div class="am-u-sm-9">
                                            <div class="am-u-sm-9">
                                                <input id="goods_stock" type="text" class="tpl-form-input" placeholder="请输入总库存"/>
                                            </div>
                                            <div class="am-u-sm-3"></div>
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="goods-tips" class="am-u-sm-3 am-form-label">
                                            促销信息:
                                        </label>
                                        <div class="am-u-sm-9">
                                            <div class="am-u-sm-12">
                                                <textarea id="goods_tips" class="" rows="5"></textarea>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="goods-desc" class="am-u-sm-3 am-form-label">
                                            商品描述:
                                        </label>
                                        <div class="am-u-sm-9">
                                            <div class="am-u-sm-12">
                                                <textarea id="goods_desc" class="" rows="5"></textarea>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="is-sale" class="am-u-sm-3 am-form-label">
                                            是否上架:
                                        </label>
                                        <div class="am-u-sm-9 ">

                                            <div class="am-u-sm-9">
                                                <div class="am-u-sm-6">
                                                    <label class="am-radio-inline">
                                                        <input type="radio" name="isSale" value="1" data-am-ucheck> 是
                                                    </label>
                                                </div>

                                                <div class="am-u-sm-6">
                                                    <label class="am-radio-inline">
                                                        <input type="radio" checked="checked" name="isSale" value="0" data-am-ucheck> 否
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="am-u-sm-3"></div>

                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="is-best" class="am-u-sm-3 am-form-label">
                                            是否精品:
                                        </label>
                                        <div class="am-u-sm-9 ">

                                            <div class="am-u-sm-9">
                                                <div class="am-u-sm-6">
                                                    <label class="am-radio-inline">
                                                        <input type="radio" name="isBest" value="1" data-am-ucheck> 是
                                                    </label>
                                                </div>

                                                <div class="am-u-sm-6">
                                                    <label class="am-radio-inline">
                                                        <input type="radio" checked="checked" name="isBest" value="0" data-am-ucheck> 否
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="am-u-sm-3"></div>

                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="is-hot" class="am-u-sm-3 am-form-label">
                                            是否热销:
                                        </label>
                                        <div class="am-u-sm-9 ">

                                            <div class="am-u-sm-9">
                                                <div class="am-u-sm-6">
                                                    <label class="am-radio-inline">
                                                        <input type="radio" name="isHot" value="1" data-am-ucheck> 是
                                                    </label>
                                                </div>

                                                <div class="am-u-sm-6">
                                                    <label class="am-radio-inline">
                                                        <input type="radio" checked="checked" name="isHot" value="0" data-am-ucheck> 否
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="am-u-sm-3"></div>

                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="is-new" class="am-u-sm-3 am-form-label">
                                            是否新品:
                                        </label>
                                        <div class="am-u-sm-9 ">

                                            <div class="am-u-sm-9">
                                                <div class="am-u-sm-6">
                                                    <label class="am-radio-inline">
                                                        <input type="radio" name="isNew" value="1" data-am-ucheck> 是
                                                    </label>
                                                </div>

                                                <div class="am-u-sm-6">
                                                    <label class="am-radio-inline">
                                                        <input type="radio" checked="checked" name="isNew" value="0" data-am-ucheck> 否
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
                                                <button id="add_res" type="button" class="am-btn am-btn-primary">提交</button>
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
    $('#res_parent_select').chosen({ width: '95%'});
    $('#res_type_select').chosen({ width: '95%'});

    $('#add_res').on('click',function () {
        var form = $('#add_res_form');
        var resParentId = $('#res_parent_select').val();
        var resName = $('#res_name').val();
        var resType = $('#res_type_select').val();
        var resUrl = $('#res_url').val();
        var allParents = $('#all_parents').val();
        var resPermission = $('#res_permission').val();
        var isShow = $("input[name='isShow']:checked").val();
        //var isShow = $("input[name='isShow']:checked").val();
        if(resName == null || resName == ""){
            alert("资源名称不能为空！");
            return;
        }
        if(resUrl == null || resUrl == ""){
            alert("资源不能为空！");
            return;
        }
        if(allParents == null || allParents == ""){
            alert("所有父类资源不能为空！");
            return;
        }
        if(resPermission == null || resPermission == ""){
            alert("权限不能为空！");
            return;
        }

        var allData = {
                        resName:resName,
                        resType:resType,
                        resUrl:resUrl,
                        parentId:resParentId,
                        parentIds:allParents,
                        permission:resPermission,
                        available:isShow
                        };
        $.ajax({
            url:'/resource/create.do',
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
                //$('#add_cat_alert').show();
                setTimeout("$('#content').load('/resource/create')",1500);
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