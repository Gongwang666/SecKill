<div class="am-modal am-modal-prompt" tabindex="-1" id="my-prompt">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">新增分类</div>
        <div class="am-modal-bd">
            <div class="row">
                <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                    <div class="widget am-cf">

                        <div class="widget-body am-fr">

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

                            </form>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <div class="am-modal-footer">
            <span class="am-modal-btn" data-am-modal-cancel>取消</span>
            <span class="am-modal-btn" data-am-modal-confirm>提交</span>
        </div>
    </div>
</div>