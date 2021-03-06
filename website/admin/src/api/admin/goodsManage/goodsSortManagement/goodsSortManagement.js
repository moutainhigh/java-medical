import service from '@/util/request.js'

// 商品分类查询
export function getGoodsSortList (data) {
  return service({
    url: `/api/admin/goods/sort/list`,
    method: 'post',
    data: data
  })
}
// 商品分类普通列表查询
export function getGoodsSortSelectList () {
  return service({
    url: `/api/admin/goods/sort/select/list`,
    method: 'get'
  })
}
// 商品分类删除
export function deleteGoodsSort (sortId) {
  return service({
    url: `/api/admin/goods/sort/delete/${sortId}`,
    method: 'get'
  })
}
// 商品分类新增
export function addGoodsSort (data) {
  return service({
    url: `/api/admin/goods/sort/add`,
    method: 'post',
    data: data
  })
}
// 推荐商品新增
export function addRecommendGoodsSort (data) {
  return service({
    url: `/api/admin/goods/sort/recommend/add`,
    method: 'post',
    data: data
  })
}
// 推荐商品修改
export function updateRecommendGoodsSort (data) {
  return service({
    url: `/api/admin/goods/sort/recommend/update`,
    method: 'post',
    data: data
  })
}
// 商品分类详情查询
export function getGoodsRecommendSort (sortId) {
  return service({
    url: `/api/admin/goods/sort/recommend/get/${sortId}`,
    method: 'get'
  })
}
// 商品分类修改
export function updateGoodsSort (data) {
  return service({
    url: `/api/admin/goods/sort/update`,
    method: 'post',
    data: data
  })
}
// 商品分类详情查询
export function getGoodsSort (sortId) {
  return service({
    url: `/api/admin/goods/sort/get/${sortId}`,
    method: 'get'
  })
}
// 设置推荐分类配置
export function setRecommendSortConfig (data) {
  return service({
    url: `/api/admin/goods/sort/setConfig`,
    method: 'post',
    data: data
  })
}
// 获取推荐分类配置
export function getRecommendSortConfig () {
  return service({
    url: `/api/admin/goods/sort/getConfig`,
    method: 'get'
  })
}

// 科室分页查询
export function getDepartmentList (data) {
  return service({
    url: `/api/admin/doctor/department/list`,
    method: 'post',
    data: data
  })
}
// 科室批量查询
export function getBatchDepartmentList (data) {
  return service({
    url: `/api/admin/doctor/department/child/list`,
    method: 'post',
    data: data
  })
}

// 科室删除
export function deletedepartment (departmentId) {
  return service({
    url: `/api/admin/doctor/department/delete/${departmentId}`,
    method: 'get'
  })
}
// 科室新增
export function adddepartment (data) {
  return service({
    url: `/api/admin/doctor/department/add`,
    method: 'post',
    data: data
  })
}

// 科室修改
export function updatedepartment (data) {
  return service({
    url: `/api/admin/doctor/department/update`,
    method: 'post',
    data: data
  })
}
// 科室详情查询
export function getdepartment (departmentId) {
  return service({
    url: `/api/admin/doctor/department/update/${departmentId}`,
    method: 'get'
  })
}
