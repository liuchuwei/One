<template>
  <el-aside :class="{ 'FoldBar': $store.state.isCollapsed, 'ExpandBar': !$store.state.isCollapsed }">

    <el-scrollbar>

      <el-menu class="siderbar-menu" :collapse="$store.state.isCollapsed">

        <div :class="{ 'FoldLogo': $store.state.isCollapsed, 'ExpandLogo': !$store.state.isCollapsed }">
          <img src="@/assets/images/cells.jpg"/>
          <h1>Weig9</h1>
        </div>

        <el-sub-menu index="1">
          <!--            1.首页-->
          <template #title>
            <el-icon><house></house></el-icon>首页
          </template>
          <el-menu-item index="1-1">仪表盘</el-menu-item>
          <el-menu-item index="1-2">学习教程</el-menu-item>
          <el-menu-item index="1-3">视频教程</el-menu-item>
        </el-sub-menu>

        <!--          2.商品-->
        <el-sub-menu index="2">
          <template #title>
            <el-icon><shopping-cart></shopping-cart></el-icon>商品
          </template>
          <el-menu-item index="2-1">商品列表</el-menu-item>
          <el-menu-item index="2-2">添加商品</el-menu-item>
          <el-menu-item index="2-3">商品分类</el-menu-item>
          <el-menu-item index="2-4">商品类型</el-menu-item>
          <el-menu-item index="2-5">品牌管理</el-menu-item>
        </el-sub-menu>

        <!--          3.订单-->
        <el-sub-menu index="3">
          <template #title>
            <el-icon><Tickets></Tickets></el-icon>订单
          </template>
          <el-menu-item index="3-1">订单列表</el-menu-item>
          <el-menu-item index="3-2">订单设置</el-menu-item>
          <el-menu-item index="3-3">退货申请处理</el-menu-item>
          <el-menu-item index="3-4">退货原因设置</el-menu-item>
        </el-sub-menu>

        <!--          4.营销-->
        <el-sub-menu index="4">
          <template #title>
            <el-icon><share></share></el-icon>营销
          </template>
          <el-menu-item index="4-1">秒杀活动列表</el-menu-item>
          <el-menu-item index="4-2">优惠券列表</el-menu-item>
          <el-menu-item index="4-3">品牌推荐</el-menu-item>
          <el-menu-item index="4-4">新品推荐</el-menu-item>
          <el-menu-item index="4-5">人气推荐</el-menu-item>
          <el-menu-item index="4-6">专题推荐</el-menu-item>
          <el-menu-item index="4-7">广告列表</el-menu-item>
        </el-sub-menu>

        <!--          5.权限-->
        <el-sub-menu index="5">
          <template #title>
            <el-icon><Lock></Lock></el-icon>权限
          </template>
          <el-menu-item index="5-1">用户列表</el-menu-item>
          <el-menu-item index="5-2">角色列表</el-menu-item>
          <el-menu-item index="5-3">菜单列表</el-menu-item>
          <el-menu-item index="5-4">资源列表</el-menu-item>
        </el-sub-menu>

      </el-menu>
    </el-scrollbar>
  </el-aside>
</template>

<script>
  export default {
    data() {
      return {
      }
    }
  }
</script>

<style scoped>

.FoldBar{
  width: 45px;
}

.ExpandBar{
  width: 200px;
}

.ExpandLogo{
  display: flex;
  img{
    width: 48px;
    height: 48px;
    margin-left: 32px;
  }
}

.FoldLogo{
  display: flex;
  img{
    width: 48px;
    height: 48px;
    margin-left: 10px;
  }
}
</style>