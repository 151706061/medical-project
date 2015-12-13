var userTypeStore = Ext.create('Ext.data.ArrayStore', {
    // store configs
    storeId: 'userTypeStore',
    // reader configs
    fields: [
       'code',
       'value'
    ],
    data:[
          [1,'普通用户'],
          [6,'主检医师'],
          [7,'主任医师'],
          [5,'秘书'],
          [2,'医师']
    ]
});

Ext.define('MedicalProject.view.AddUserWin', {
    extend: 'Ext.window.Window',

    id:'addUserWin',
    modal: true,
    width: 550,
    autoScroll: true,
    layout: {
        type: 'fit'
    },
    title: '新建用户',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    id:'addUserWinForm',
                    autoScroll: true,
                    bodyPadding: 10,
                    title: '',
                    items: [
                        {
                            xtype: 'textfield',
                            name:'userName',
                            allowBlank:false,
                            anchor: '100%',
                            fieldLabel: '姓名'
                        },
                        {
                            xtype: 'textfield',
                            name:'mobile',
                            allowBlank:false,
                            anchor: '100%',
                            fieldLabel: '电话'
                        },
                        {
                            xtype: 'textfield',
                            name:'email',
                            allowBlank:false,
                            anchor: '100%',
                            fieldLabel: '邮箱'
                        },
                        {
                            xtype: 'textfield',
                            name:'password',
                            allowBlank:false,
                            anchor: '100%',
                            fieldLabel: '密码'
                        },
                        {
                        	xtype: 'combo',
                        	name:'userType',
                        	fieldLabel: '用户类型',
                            queryMode: 'local',
                            displayField: 'value',
                            valueField: 'code',
                            anchor: '100%',
                        	store:userTypeStore
                        },
                        {
                            xtype: 'container',
                            margin: '',
                            layout: {
                                align: 'middle',
                                pack: 'center',
                                padding: '10px 0 0 0',
                                type: 'hbox'
                            },
                            items: [
                                {
                                    xtype: 'button',
                                    id:'adUserWin-createBtn',
                                    width: 92,
                                    text: '创建'
                                },
                                {
                                    xtype: 'button',
                                    id:'adUserWin-cancelBtn',
                                    margin: '0 0 0 10px',
                                    width: 92,
                                    text: '取消'
                                }
                            ]
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
        
        me.bindEvent();
        
        //me.init();
    },
    bindEvent:function(){
    	var me = this;
    	
    	Ext.getCmp('adUserWin-createBtn').on('click',function(){
    		var addUserWinForm = Ext.getCmp('addUserWinForm');
    		if( addUserWinForm.isValid() ){
    			addUserWinForm.submit({
    				url:appContext + '/admin/userManage/addUser.do',
    				method:'POST',
    				success:function(){
    					me.hideMe();
    					me.onUserCreated();
    				}
    			});
    		}
    		
    	});
    	
    	Ext.getCmp('adUserWin-cancelBtn').on('click',function(){
    		me.hideMe();
    	});
    	
    },
    init:function(){
    	var me = this;
//    	/me.initMap();
    },
    hideMe:function(){
    	var addUserWin = Ext.getCmp('addUserWin');
    	if( addUserWin ){
    		Ext.getCmp('addUserWinForm').getForm().reset();
    		addUserWin.hide();
    	}
    }

});