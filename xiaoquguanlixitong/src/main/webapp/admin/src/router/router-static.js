import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import chat from '@/views/modules/chat/list'
    import dictionary from '@/views/modules/dictionary/list'
    import fangwuxinxi from '@/views/modules/fangwuxinxi/list'
    import guzhangweixiu from '@/views/modules/guzhangweixiu/list'
    import news from '@/views/modules/news/list'
    import ruzhudengji from '@/views/modules/ruzhudengji/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryChat from '@/views/modules/dictionaryChat/list'
    import dictionaryFangwuxinxi from '@/views/modules/dictionaryFangwuxinxi/list'
    import dictionaryGuzhangweixiu from '@/views/modules/dictionaryGuzhangweixiu/list'
    import dictionaryGuzhangweixiuYesno from '@/views/modules/dictionaryGuzhangweixiuYesno/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionaryRuzhudengji from '@/views/modules/dictionaryRuzhudengji/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryZhuangtai from '@/views/modules/dictionaryZhuangtai/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryChat',
        name: '数据类型',
        component: dictionaryChat
    }
    ,{
        path: '/dictionaryFangwuxinxi',
        name: '入住房屋类型',
        component: dictionaryFangwuxinxi
    }
    ,{
        path: '/dictionaryGuzhangweixiu',
        name: '设施类型',
        component: dictionaryGuzhangweixiu
    }
    ,{
        path: '/dictionaryGuzhangweixiuYesno',
        name: '审核状态',
        component: dictionaryGuzhangweixiuYesno
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionaryRuzhudengji',
        name: '入住房屋类型',
        component: dictionaryRuzhudengji
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryZhuangtai',
        name: '状态',
        component: dictionaryZhuangtai
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/chat',
        name: '投诉建议',
        component: chat
      }
    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/fangwuxinxi',
        name: '房屋信息',
        component: fangwuxinxi
      }
    ,{
        path: '/guzhangweixiu',
        name: '故障维修',
        component: guzhangweixiu
      }
    ,{
        path: '/news',
        name: '公告',
        component: news
      }
    ,{
        path: '/ruzhudengji',
        name: '入住登记',
        component: ruzhudengji
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
