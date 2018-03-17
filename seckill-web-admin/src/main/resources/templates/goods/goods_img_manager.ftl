<div id="upload-img" title="上传图片" hidden="hidden">
    <div class="am-g">
        <form id="uploadForm" class="am-form am-form-horizontal" enctype="multipart/form-data">
            <div class="am-form-group">
                <label>文件</label>
                <input type="file" name="file">
                <input type="text" value="${goodsID}" name="goodsID">
            </div>
        </form>
    </div>

</div>
<div class="row-content am-cf">
    <div class="row">
        <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
            <div class="widget am-cf">

                <div class="widget-head am-cf">
                    <div class="widget-head am-cf">
                        <div class="widget-title  am-cf">商品图片</div>
                    </div>
                    <#--表头新增保存按钮栏-->
                    <div class="am-u-sm-12 am-u-md-6 am-u-lg-6">
                        <div class="am-form-group">
                            <div class="am-btn-toolbar">
                                <div class="am-btn-group am-btn-group-xs">
                                    <button id="add-img-btn" type="button"
                                            class="am-btn am-btn-default am-btn-success"><span
                                            class="am-icon-plus"></span> 新增
                                    </button>
                                    <button type="button" class="am-btn am-btn-default am-btn-danger"><span
                                            class="am-icon-trash-o"></span> 删除
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="widget-body am-fr">
                    <ul data-am-widget="gallery" class="am-gallery am-avg-sm-3 am-avg-md-3 am-avg-lg-4 am-gallery-default" data-am-gallery="{ pureview: true }">
                        <li>
                            <div class="am-gallery-item">
                                <a href="javascript:;" class="">
                                    <img src="http://s.amazeui.org/media/i/demos/bing-1.jpg" alt="远方 有一个地方 那里种有我们的梦想"/>
                                    <h3 class="am-gallery-title">远方 有一个地方 那里种有我们的梦想</h3>
                                    <div class="am-gallery-desc">2375-09-26</div>
                                </a>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    $(function() {
        $('#add-img-btn').on('click',function () {
            $( "#upload-img" ).dialog({
                height : "300",        //高度
                width : "600",        //宽度
                modal : true,
                buttons:{
                    "上传":function(){
                        $('#uploadForm').ajaxSubmit({
                            success: function (data) {
                                console.log(data)
                                alert(data.msg)
                            },
                            error: function (error) {
                                console.log(error)
                                alert("上传失败!")
                            },
                            url: '/goods/goodsInfo/uploadFile.do', /*设置post提交到的页面*/
                            type: "post", /*设置表单以post方法提交*/
                            dataType: "json" /*设置返回值类型为文本*/
                        });
                    },
                    "取消":function(){
                        console.log('取消上传!')
                        $(this).dialog('close');
                    }
                }
            });
        });
    });

</script>